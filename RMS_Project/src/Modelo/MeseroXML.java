/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

/**
 *
 * @author gadv1
 */
public class MeseroXML {
     private Element root;
    private String fileLocation = "src//ArchivosXML//Mesero.xml";

    public  MeseroXML(){
        try {
            SAXBuilder builder = new SAXBuilder(false); //parse que maneja el XMl
            Document doc = builder.build(fileLocation);
            root = doc.getRootElement();
        } catch (JDOMException ex) {
            System.out.println("No se pudo iniciar la operacion por: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("No se pudo iniciar la operacion por: " + ex.getMessage());
        }
        
    }
    
    private Element  MeseroElement(Mesero m){
        Element mesero = new Element("Mesero");
        Element codigo = new Element("codigo");
        codigo.setText(Integer.toString(m.getCodigo()));
        Element edad = new Element("edad");
        edad.setText(Integer.toString(m.getEdad()));
        Element telefono = new Element("telefono");
        telefono.setText(Integer.toString(m.getTelefono()));
        Element nombre = new Element("nombre");
        nombre.setText(m.getNombre());
        Element apellido = new Element("apellido");
        apellido.setText(m.getApellido());
        Element genero = new Element("genero");
        genero.setText(m.getGenero());
        Element numMesa = new Element("mesa");
        numMesa.setText(Integer.toString(m.getNumMesa()));

        mesero.addContent(codigo);
        mesero.addContent(edad);
        mesero.addContent(telefono);
        mesero.addContent(nombre);
        mesero.addContent(apellido);
        mesero.addContent(genero);
        mesero.addContent(numMesa);
  
        return mesero;
    }
    
    private static Element buscar(List raiz,String codigo){
        Iterator i = raiz.iterator();
        while(i.hasNext()){
            Element f = (Element) i.next();
            if(codigo.equalsIgnoreCase(f.getChild("codigo").getText())){
                return f;
            }
        }
        return null;
    }
    
     private static Element buscarMesa(List raiz,String mesa){
        Iterator i = raiz.iterator();
        while(i.hasNext()){
            Element f = (Element) i.next();
            if(mesa.equalsIgnoreCase(f.getChild("mesa").getText())){
                return f;
            }
        }
        return null;
    }
    
    private boolean updateDocument() {
        try {
            XMLOutputter out = new XMLOutputter(org.jdom.output.Format.getPrettyFormat());
            FileOutputStream file = new FileOutputStream(fileLocation); 
            out.output(root, file);
            file.flush();
            file.close();
            return true;
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
            return false;
        }
    }
    
    public boolean agregarMesero(Mesero m){
        root.addContent(MeseroElement((Mesero) m));
        boolean resultado = updateDocument();
        return resultado;
    }
    
    private Mesero MeseroToObject(Element element) throws ParseException{

        Mesero m = new Mesero(element.getChildText("nombre"),element.getChildText("apellido"),element.getChildText("genero"),Integer.parseInt(element.getChildText("codigo")),Integer.parseInt(element.getChildText("edad")),
                              Integer.parseInt(element.getChildText("telefono")),Integer.parseInt(element.getChildText("mesa")));
        return m;
    }
    
    public boolean verificarNumeroMesa(String numMesa){
       Element aux = new Element("Mesero");
        List mesero = this.root.getChildren("Mesero");
        while(aux != null){
           aux = MeseroXML.buscarMesa(mesero,numMesa);
           if(aux != null){
               return true;
           }
        }
        return false; 
    }
    
    public Mesero obtenerMesero(String codigo){
        Element aux = new Element("Mesero");
        List meseroXML = this.root.getChildren("Mesero");
        while(aux != null){
            aux = MeseroXML.buscar(meseroXML, codigo);
            if( aux != null){
                try{
                   return MeseroToObject(aux);
               }catch(ParseException ex){
                   System.out.println(ex.getMessage());
               }
            }
        }
        return null;
    }
    
    public boolean actualizarMesero(Mesero m){
        boolean resultado = false;
        Element aux = new Element("Mesero");
        List meseroXML = this.root.getChildren("Mesero");
        while(aux != null){
            aux = MeseroXML.buscar(meseroXML, String.valueOf(m.getCodigo()));
            if( aux != null){
                meseroXML.remove(aux);
                resultado = updateDocument();
            }
        }
        agregarMesero(m);
        return resultado;
    }
    
    public boolean verificarMesero(String codigo){
       Element aux = new Element("Mesero");
        List mesero = this.root.getChildren("Mesero");
        while(aux != null){
           aux = MeseroXML.buscar(mesero,codigo);
           if(aux != null){
               return true;
           }
        }
        return false; 
    }
    
   
    
    /*public boolean eliminarMesero(String codigo,String nombre,String apellido){
        boolean resultado = false;
        Element aux = new Element("Mesero");
        List meseroXML = this.root.getChildren("Mesero");
        while(aux != null){
            aux = MeseroXML.buscar(meseroXML, codigo,nombre,apellido);
            if( aux != null){
                meseroXML.remove(aux);
                resultado = updateDocument();
            }
        }
        return resultado;
    }*/
    
    public boolean eliminarMesero(String codigo){
        boolean resultado = false;
        Element aux = new Element("Mesero");
        List meseroXML = this.root.getChildren("Mesero");
        while(aux != null){
            aux = MeseroXML.buscar(meseroXML, codigo);
            if( aux != null){
                meseroXML.remove(aux);
                resultado = updateDocument();
            }
        }
        return resultado;
    }
    
    public LinkedList<Mesero> listaMesero(){
        LinkedList<Mesero> resultado = new LinkedList();
        for(Object it : root.getChildren()){            
            Element xmlElem = (Element) it;
            try {
                resultado.add(MeseroToObject(xmlElem));
            }catch (ParseException ex){
            System.out.println(ex.getMessage());
            }
        }
        return resultado;
    }
    
}


