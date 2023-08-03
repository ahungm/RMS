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
public class GerenteXML {
     private Element root;
    private String fileLocation = "src//ArchivosXML//Gerente.xml";

    public  GerenteXML(){
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
    
    private Element  GerenteElement(Gerente a){
        Element gerente = new Element("Gerente");
        Element usuario = new Element("usuario");
        usuario.setText(a.getNombre());
        Element password = new Element("password");
        password.setText(a.getPassword());
        
        
        gerente.addContent(usuario);
        gerente.addContent(password);

        return gerente;
    }
    
    private static Element buscar(List raiz,String nombre,String password){
        Iterator i = raiz.iterator();
        while(i.hasNext()){
            Element f = (Element) i.next();
            if(nombre.equalsIgnoreCase(f.getChild("usuario").getText()) && password.equalsIgnoreCase(f.getChild("password").getText())){
                return f;
            }
        }
        return null;
    }
    
    private static Element buscar(List raiz,String nombre){
        Iterator i = raiz.iterator();
        while(i.hasNext()){
            Element f = (Element) i.next();
            if(nombre.equalsIgnoreCase(f.getChild("usuario").getText())){
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
    
    public boolean agregarGerente(Gerente g){
        root.addContent(GerenteElement((Gerente) g));
        boolean resultado = updateDocument();
        return resultado;
    }
    
    private Gerente GerenteToObject(Element element) throws ParseException{
        Gerente a = new Gerente(element.getChildText("usuario"),element.getChildText("password"));
        return a;
    }
    
    public boolean verificarGerente(String nombre,String password){
       Element aux = new Element("Gerente");
        List gerente = this.root.getChildren("Gerente");
        while(aux != null){
           aux = GerenteXML.buscar(gerente,nombre,password);
           if(aux != null){
               return true;
           }
        }
        return false; 
    }
     
     public boolean verificarGerente(String nombre){
       Element aux = new Element("Gerente");
        List gerente = this.root.getChildren("Gerente");
        while(aux != null){
           aux = GerenteXML.buscar(gerente,nombre);
           if(aux != null){
               return true;
           }
        }
        return false; 
    }
    
    public boolean actualizarGerente(Gerente g,String nombre){
        boolean resultado = false;
        Element aux = new Element("Gerente");
        List gerenteXML = this.root.getChildren("Gerente");
        while(aux != null){
            aux = GerenteXML.buscar(gerenteXML,nombre);
            if( aux != null){
                gerenteXML.remove(aux);
                resultado = updateDocument();
            }
        }
        agregarGerente(g);
        return resultado;
    }
     
    public Gerente obtenerGerente(String nombre){
        Element aux = new Element("Gerente");
        List gerenteXML = this.root.getChildren("Gerente");
        while(aux != null){
            aux = GerenteXML.buscar(gerenteXML,nombre);
            if( aux != null){
                try{
                   return GerenteToObject(aux);
               }catch(ParseException ex){
                   System.out.println(ex.getMessage());
               }
            }
        }
        return null;
    }
     
}
