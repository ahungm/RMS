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


public class IngredientesMenuXML {
    
    private Element root;
    private String fileLocation = "src//ArchivosXML//IngredientesMenu.xml";

    public IngredientesMenuXML(){
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
    
    private Element IgMenuElement(IngredientesMenu l){
        Element ingredientes = new Element("Ingredientes");
        Element nombre = new Element("nombre");
        nombre.setText(l.getNombre());
        Element cantidad = new Element("cantidad");
        cantidad.setText(Integer.toString(l.getCantidad()));
        Element tipo = new Element("tipo");
        tipo.setText(l.getTipo());
        Element platillo = new Element("platillo");
        platillo.setText(l.getPlatillo());

        
        ingredientes.addContent(nombre);
        ingredientes.addContent(cantidad);
        ingredientes.addContent(tipo);
        ingredientes.addContent(platillo);


        return ingredientes;
    }
    
    private static Element buscar(List raiz,String platillo){
        Iterator i = raiz.iterator();
        while(i.hasNext()){
            Element f = (Element) i.next();
            if(platillo.equalsIgnoreCase(f.getChild("platillo").getText())){
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
    
    public boolean agregarIngrediente(IngredientesMenu l){
        root.addContent(IgMenuElement((IngredientesMenu) l));
        boolean resultado = updateDocument();
        return resultado;
    }
    
    private IngredientesMenu IngredientesgMenuToObject(Element element) throws ParseException{
 
        IngredientesMenu l = new IngredientesMenu(element.getChildText("nombre"),element.getChildText("tipo"),element.getChildText("platillo"),Integer.parseInt(element.getChildText("cantidad")),element.getChildText("unidad"));
        return l;
    }
    
    public boolean eliminarIngrediente(String platillo){
        boolean resultado = false;
        Element aux = new Element("Ingredientes");
        List ingredientesXML = this.root.getChildren("Ingredientes");
        while(aux != null){
            aux = IngredientesMenuXML.buscar(ingredientesXML, platillo);
            if( aux != null){
                ingredientesXML.remove(aux);
                resultado = updateDocument();
            }
        }
        return resultado;
    }
    
    
    public LinkedList<IngredientesMenu> listaIngredientesMenu(String platillo){
        LinkedList<IngredientesMenu> resultado = new LinkedList();
        for(Object it : root.getChildren()){            
            Element xmlElem = (Element) it;
            if(xmlElem.getChildText("platillo").equalsIgnoreCase(platillo)){
               try {
                resultado.add(IngredientesgMenuToObject(xmlElem));
               }catch (ParseException ex){
                System.out.println(ex.getMessage());
               }
            }
        }
        return resultado;
    }
    
}
