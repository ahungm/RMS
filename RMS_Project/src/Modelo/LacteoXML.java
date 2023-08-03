
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

public class LacteoXML{
    
    private Element root;
    private String fileLocation = "src//ArchivosXML//Lacteo.xml";

    public LacteoXML(){
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
    
    private Element LacteoElement(Lacteo l){
        Element Lacteos = new Element("Lacteos");
        Element cantidad = new Element("cantidad");
        cantidad.setText(Double.toString(l.getCantidad()));
        Element dia = new Element("dia");
        dia.setText(Integer.toString(l.getDia()));
        Element mes = new Element("mes");
        mes.setText(Integer.toString(l.getMes()));
        Element anio = new Element("anio");
        anio.setText(Integer.toString(l.getAnio()));
        Element unidad = new Element("unidad");
        unidad.setText(l.getUnidad());
        Element nombre = new Element("nombre");
        nombre.setText(l.getNombre());

        
        Lacteos.addContent(cantidad);
        Lacteos.addContent(dia);
        Lacteos.addContent(mes);
        Lacteos.addContent(anio);
        Lacteos.addContent(unidad);
        Lacteos.addContent(nombre);


        return Lacteos;
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
    
    public boolean agregarLacteo(Lacteo l){
        root.addContent(LacteoElement((Lacteo) l));
        boolean resultado = updateDocument();
        return resultado;
    }
    
    private Lacteo LacteoToObject(Element element) throws ParseException{
 
        Lacteo l = new Lacteo(Integer.parseInt(element.getChildText("dia")),Integer.parseInt(element.getChildText("mes")),Integer.parseInt(element.getChildText("anio")),Double.parseDouble(element.getChildText("cantidad")),
                              element.getChildText("nombre"), element.getChildText("unidad"));
        return l;
    }
    
     public boolean verificarLacteo(String nombre){
       Element aux = new Element("Lacteos");
        List lacteo = this.root.getChildren("Lacteos");
        while(aux != null){
           aux = LacteoXML.buscar(lacteo,nombre);
           if(aux != null){
               return true;
           }
        }
        return false; 
    }
     
    public boolean actualizarLacteo(Lacteo l){
        boolean resultado = false;
        Element aux = new Element("Lacteos");
        List lacteoXML = this.root.getChildren("Lacteos");
        while(aux != null){
            aux = LacteoXML.buscar(lacteoXML, l.getNombre());
            if( aux != null){
                lacteoXML.remove(aux);
                resultado = updateDocument();
            }
        }
        agregarLacteo(l);
        return resultado;
    }
    
    public Lacteo obtenerLacteo(String nombre){
        Element aux = new Element("Lacteos");
        List lacteoXML = this.root.getChildren("Lacteos");
        while(aux != null){
            aux = LacteoXML.buscar(lacteoXML, nombre);
            if( aux != null){
                try{
                   return LacteoToObject(aux);
               }catch(ParseException ex){
                   System.out.println(ex.getMessage());
               }
            }
        }
        return null;
    }
    
    public boolean eliminarLacteo(String nombre){
        boolean resultado = false;
        Element aux = new Element("Lacteos");
        List lacteoXML = this.root.getChildren("Lacteos");
        while(aux != null){
            aux = LacteoXML.buscar(lacteoXML, nombre);
            if( aux != null){
                lacteoXML.remove(aux);
                resultado = updateDocument();
            }
        }
        return resultado;
    }
    
    public LinkedList<Lacteo> listaLacteos(){
        LinkedList<Lacteo> resultado = new LinkedList();
        for(Object it : root.getChildren()){            
            Element xmlElem = (Element) it;
            try {
                resultado.add(LacteoToObject(xmlElem));
            }catch (ParseException ex){
            System.out.println(ex.getMessage());
            }
        }
        return resultado;
    }
    
}
