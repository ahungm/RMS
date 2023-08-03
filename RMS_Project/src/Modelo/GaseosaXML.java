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

public class  GaseosaXML{
    
    private Element root;
    private String fileLocation = "src//ArchivosXML//Gaseosa.xml";

    public  GaseosaXML(){
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
    
    private Element  GaseosaElement(Gaseosa g){
        Element gaseosa = new Element("Gaseosa");
        Element cantidad = new Element("cantidad");
        cantidad.setText(Double.toString(g.getCantidad()));
        Element dia = new Element("dia");
        dia.setText(Integer.toString(g.getDia()));
        Element mes = new Element("mes");
        mes.setText(Integer.toString(g.getMes()));
        Element anio = new Element("anio");
        anio.setText(Integer.toString(g.getAnio()));
        Element unidad = new Element("unidad");
        unidad.setText(g.getUnidad());
        Element nombre = new Element("nombre");
        nombre.setText(g.getNombre());

        
        gaseosa.addContent(cantidad);
        gaseosa.addContent(dia);
        gaseosa.addContent(mes);
        gaseosa.addContent(anio);
        gaseosa.addContent(unidad);
        gaseosa.addContent(nombre);


        return gaseosa;
    }
    
    public static Element buscar(List raiz,String nombre){
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
    
    public boolean agregarGaseosa(Gaseosa g){
        root.addContent(GaseosaElement((Gaseosa) g));
        boolean resultado = updateDocument();
        return resultado;
    }
    
    private Gaseosa GaseosaToObject(Element element) throws ParseException{
        Gaseosa g = new Gaseosa(Integer.parseInt(element.getChildText("dia")),Integer.parseInt(element.getChildText("mes")),Integer.parseInt(element.getChildText("anio")),Double.parseDouble(element.getChildText("cantidad")),
                              element.getChildText("nombre"), element.getChildText("unidad"));
        return g;
    }
    
     public boolean verificarGaseosa(String nombre){
       Element aux = new Element("Gaseosa");
        List gaseosa = this.root.getChildren("Gaseosa");
        while(aux != null){
           aux = GaseosaXML.buscar(gaseosa,nombre);
           if(aux != null){
               return true;
           }
        }
        return false; 
    }
     
    public boolean actualizarGaseosa(Gaseosa g){
        boolean resultado = false;
        Element aux = new Element("Gaseosa");
        List gaseosa = this.root.getChildren("Gaseosa");
        while(aux != null){
            aux = GaseosaXML.buscar(gaseosa, g.getNombre());
            if( aux != null){
                gaseosa.remove(aux);
                resultado = updateDocument();
            }
        }
        agregarGaseosa(g);
        return resultado;
    }
    
    public boolean eliminarGaseosa(String nombre){
        boolean resultado = false;
        Element aux = new Element("Gaseosa");
        List gaseosaXML = this.root.getChildren("Gaseosa");
        while(aux != null){
            aux = GaseosaXML.buscar(gaseosaXML, nombre);
            if( aux != null){
                gaseosaXML.remove(aux);
                resultado = updateDocument();
            }
        }
        return resultado;
    }
    
    public Gaseosa obtenerGaseosa(String nombre){
        Element aux = new Element("Gaseosa");
        List gaseosaXML = this.root.getChildren("Gaseosa");
        while(aux != null){
            aux = GaseosaXML.buscar(gaseosaXML, nombre);
            if( aux != null){
                try{
                   return GaseosaToObject(aux);
               }catch(ParseException ex){
                   System.out.println(ex.getMessage());
               }
            }
        }
        return null;
    }
    
    
    public LinkedList<Gaseosa> listaGaseosa(){
        LinkedList<Gaseosa> resultado = new LinkedList();
        for(Object it : root.getChildren()){            
            Element xmlElem = (Element) it;
            try {
                resultado.add(GaseosaToObject(xmlElem));
            }catch (ParseException ex){
            System.out.println(ex.getMessage());
            }
        }
        return resultado;
    }
    
}
