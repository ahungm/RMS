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

public class  LegumbreXML{
    
    private Element root;
    private String fileLocation = "src//ArchivosXML//Legumbre.xml";

    public  LegumbreXML(){
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
    
    private Element  LegumbreElement(Legumbre l){
        Element legumbre = new Element("Legumbre");
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

        
        legumbre.addContent(cantidad);
        legumbre.addContent(dia);
        legumbre.addContent(mes);
        legumbre.addContent(anio);
        legumbre.addContent(unidad);
        legumbre.addContent(nombre);


        return legumbre;
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
    
    public boolean agregarLegumbre(Legumbre l){
        root.addContent(LegumbreElement((Legumbre) l));
        boolean resultado = updateDocument();
        return resultado;
    }
    
    private Legumbre LegumbreToObject(Element element) throws ParseException{

        Legumbre l = new Legumbre(Integer.parseInt(element.getChildText("dia")),Integer.parseInt(element.getChildText("mes")),Integer.parseInt(element.getChildText("anio")),Double.parseDouble(element.getChildText("cantidad")),
                              element.getChildText("nombre"), element.getChildText("unidad"));
        return l;
    }
    
     public boolean verificarLegumbre(String nombre){
       Element aux = new Element("Legumbre");
        List legumbre = this.root.getChildren("Legumbre");
        while(aux != null){
           aux = LegumbreXML.buscar(legumbre,nombre);
           if(aux != null){
               return true;
           }
        }
        return false; 
    }
     
    public boolean actualizarLegumbre(Legumbre l){
        boolean resultado = false;
        Element aux = new Element("Legumbre");
        List legumbre = this.root.getChildren("Legumbre");
        while(aux != null){
            aux = LegumbreXML.buscar(legumbre, l.getNombre());
            if( aux != null){
                legumbre.remove(aux);
                resultado = updateDocument();
            }
        }
        agregarLegumbre(l);
        return resultado;
    }
    
    public Legumbre obtenerLegumbre(String nombre){
        Element aux = new Element("Legumbre");
        List legumbreXML = this.root.getChildren("Legumbre");
        while(aux != null){
            aux = LegumbreXML.buscar(legumbreXML, nombre);
            if( aux != null){
                try{
                   return LegumbreToObject(aux);
               }catch(ParseException ex){
                   System.out.println(ex.getMessage());
               }
            }
        }
        return null;
    }
    
    public boolean eliminarLegumbre(String nombre){
        boolean resultado = false;
        Element aux = new Element("Legumbre");
        List legumbreXML = this.root.getChildren("Legumbre");
        while(aux != null){
            aux = LegumbreXML.buscar(legumbreXML, nombre);
            if( aux != null){
                legumbreXML.remove(aux);
                resultado = updateDocument();
            }
        }
        return resultado;
    }
    
    public LinkedList<Legumbre> listaLegumbre(){
        LinkedList<Legumbre> resultado = new LinkedList();
        for(Object it : root.getChildren()){            
            Element xmlElem = (Element) it;
            try {
                resultado.add(LegumbreToObject(xmlElem));
            }catch (ParseException ex){
            System.out.println(ex.getMessage());
            }
        }
        return resultado;
    }
    
}
