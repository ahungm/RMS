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

public class  PlatillosXML{
    
    private Element root;
    private String fileLocation = "src//ArchivosXML//Platillos.xml";

    public  PlatillosXML(){
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
    
    private Element  PlatilloElement(Platillo a){
 
        Element platillo = new Element("Platillo");
        Element nombre = new Element("nombre");
        nombre.setText(a.getNombre());
        Element tipoPlatillo = new Element("tipoPlatillo");
        tipoPlatillo.setText(a.getTipoPlatillo());
        Element precio = new Element("precio");
        precio.setText(Double.toString(a.getPrecio()));
        Element cantidadIngredientes = new Element("cantidad");
        cantidadIngredientes.setText(Integer.toString(a.getCantidadIngredientes()));
        Element vecesSolicitado = new Element("solicitado");
        vecesSolicitado.setText(Integer.toString(a.getVecesSolicitado()));
        
 
        
        platillo.addContent(nombre);
        platillo.addContent(precio);
        platillo.addContent(cantidadIngredientes);
        platillo.addContent(vecesSolicitado);
        platillo.addContent(tipoPlatillo);


        return platillo;
    }
    
    private static Element buscar(List raiz,String nombre){
        Iterator i = raiz.iterator();
        while(i.hasNext()){
            Element f = (Element) i.next();
            if(nombre.equalsIgnoreCase(f.getChild("nombre").getText())){
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
    
    public boolean agregarPlatillo(Platillo a){
        root.addContent(PlatilloElement((Platillo) a));
        boolean resultado = updateDocument();
        return resultado;
    }
    
    private Platillo PlatilloToObject(Element element) throws ParseException{
        Platillo a = new Platillo(element.getChildText("nombre"),Double.parseDouble(element.getChildText("precio")),Integer.parseInt(element.getChildText("cantidad")),Integer.parseInt(element.getChildText("solicitado")),element.getChildText("tipoPlatillo"));
        return a;
    }
    
     public boolean verificarPlatillo(String nombre){
       Element aux = new Element("Platillo");
        List platillo = this.root.getChildren("Platillo");
        while(aux != null){
           aux = PlatillosXML.buscar(platillo,nombre);
           if(aux != null){
               return true;
           }
        }
        return false; 
    }
     
    public boolean eliminarPlatillo(String nombre){
        boolean resultado = false;
        Element aux = new Element("Platillo");
        List platilloXML = this.root.getChildren("Platillo");
        while(aux != null){
            aux = PlatillosXML.buscar(platilloXML, nombre);
            if( aux != null){
                platilloXML.remove(aux);
                resultado = updateDocument();
            }
        }
        return resultado;
    }
    
    public Platillo obtenerPlatillo(String nombre){
        Element aux = new Element("Platillo");
        List platilloXML = this.root.getChildren("Platillo");
        while(aux != null){
            aux = PlatillosXML.buscar(platilloXML, nombre);
            if( aux != null){
                try{
                   return PlatilloToObject(aux);
               }catch(ParseException ex){
                   System.out.println(ex.getMessage());
               }
            }
        }
        return null;
    }
     
     
    public boolean actualizarPlatillo(Platillo a){
        boolean resultado = false;
        Element aux = new Element("Platillo");
        List platillo = this.root.getChildren("Platillo");
        while(aux != null){
            aux = PlatillosXML.buscar(platillo, a.getNombre());
            if( aux != null){
                platillo.remove(aux);
                resultado = updateDocument();
            }
        }
        agregarPlatillo(a);
        return resultado;
    }
    
    public LinkedList<Platillo> listaPlatillo(){
        LinkedList<Platillo> resultado = new LinkedList();
        for(Object it : root.getChildren()){            
            Element xmlElem = (Element) it;
            try {
                resultado.add(PlatilloToObject(xmlElem));
            }catch (ParseException ex){
            System.out.println(ex.getMessage());
            }
        }
        return resultado;
    }
    
}

