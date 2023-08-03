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

public class CarneXML{
    
    private Element root;
    private String fileLocation = "src//ArchivosXML//Carne.xml";

    public CarneXML(){
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
    
    private Element CarneElement(Carne c){
        Element carnes = new Element("Carnes");
        Element cantidad = new Element("cantidad");
        cantidad.setText(Double.toString(c.getCantidad()));
        Element dia = new Element("dia");
        dia.setText(Integer.toString(c.getDia()));
        Element mes = new Element("mes");
        mes.setText(Integer.toString(c.getMes()));
        Element anio = new Element("anio");
        anio.setText(Integer.toString(c.getAnio()));
        Element unidad = new Element("unidad");
        unidad.setText(c.getUnidad());
        Element nombre = new Element("nombre");
        nombre.setText(c.getNombre());

        
        carnes.addContent(cantidad);
        carnes.addContent(dia);
        carnes.addContent(mes);
        carnes.addContent(anio);
        carnes.addContent(unidad);
        carnes.addContent(nombre);

        return carnes;
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
    
    public boolean agregarCarne(Carne c){
        root.addContent(CarneElement((Carne) c));
        boolean resultado = updateDocument();
        return resultado;
    }
    
    private Carne CarneToObject(Element element) throws ParseException{
        Carne c = new Carne(Integer.parseInt(element.getChildText("dia")),Integer.parseInt(element.getChildText("mes")),Integer.parseInt(element.getChildText("anio")),Double.parseDouble(element.getChildText("cantidad")),
                              element.getChildText("nombre"), element.getChildText("unidad"));
        return c;
    }
    
     public boolean verificarCarne(String nombre){
       Element aux = new Element("Carnes");
        List carne = this.root.getChildren("Carnes");
        while(aux != null){
           aux = CarneXML.buscar(carne,nombre);
           if(aux != null){
               return true;
           }
        }
        return false; 
    }
     
    public boolean actualizarCarne(Carne c){
        boolean resultado = false;
        Element aux = new Element("Carnes");
        List carne = this.root.getChildren("Carnes");
        while(aux != null){
            aux = CarneXML.buscar(carne, c.getNombre());
            if( aux != null){
                carne.remove(aux);
                resultado = updateDocument();
            }
        }
        agregarCarne(c);
        return resultado;
    }
    
    public boolean eliminarCarne(String nombre){
        boolean resultado = false;
        Element aux = new Element("Carnes");
        List carneXML = this.root.getChildren("Carnes");
        while(aux != null){
            aux = CarneXML.buscar(carneXML, nombre);
            if( aux != null){
                carneXML.remove(aux);
                resultado = updateDocument();
            }
        }
        return resultado;
    }
    
    public Carne obtenerCarne(String nombre){
        Element aux = new Element("Carnes");
        List carneXML = this.root.getChildren("Carnes");
        while(aux != null){
            aux = CarneXML.buscar(carneXML, nombre);
            if( aux != null){
                try{
                   return CarneToObject(aux);
               }catch(ParseException ex){
                   System.out.println(ex.getMessage());
               }
            }
        }
        return null;
    }
    
    public LinkedList<Carne> listaCarne(){
        LinkedList<Carne> resultado = new LinkedList();
        for(Object it : root.getChildren()){            
            Element xmlElem = (Element) it;
            try {
                resultado.add(CarneToObject(xmlElem));
            }catch (ParseException ex){
            System.out.println(ex.getMessage());
            }
        }
        return resultado;
    }
    
}


