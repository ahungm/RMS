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

public class  AceiteXML{
    
    private Element root;
    private String fileLocation = "src//ArchivosXML//Aceite.xml";

    public  AceiteXML(){
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
    
    private Element  AceiteElement(Aceites a){
        Element aceite = new Element("Aceites");
        Element cantidad = new Element("cantidad");
        cantidad.setText(Double.toString(a.getCantidad()));
        Element dia = new Element("dia");
        dia.setText(Integer.toString(a.getDia()));
        Element mes = new Element("mes");
        mes.setText(Integer.toString(a.getMes()));
        Element anio = new Element("anio");
        anio.setText(Integer.toString(a.getAnio()));
        Element unidad = new Element("unidad");
        unidad.setText(a.getUnidad());
        Element nombre = new Element("nombre");
        nombre.setText(a.getNombre());
 
        
        aceite.addContent(cantidad);
        aceite.addContent(dia);
        aceite.addContent(mes);
        aceite.addContent(anio);
        aceite.addContent(unidad);
        aceite.addContent(nombre);

        return aceite;
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
            //jOptionPane
            System.out.println("error: " + e.getMessage());
            return false;
        }
    }
    
    public boolean agregarAceite(Aceites a){
        root.addContent(AceiteElement((Aceites) a));
        boolean resultado = updateDocument();
        return resultado;
    }
    
    private Aceites AceiteToObject(Element element) throws ParseException{
        Aceites a = new Aceites(Integer.parseInt(element.getChildText("dia")),Integer.parseInt(element.getChildText("mes")),Integer.parseInt(element.getChildText("anio")),Double.parseDouble(element.getChildText("cantidad")),
                              element.getChildText("nombre"), element.getChildText("unidad"));
        return a;
    }
    
     public boolean verificarAceite(String nombre){
       Element aux = new Element("Aceites");
        List aceite = this.root.getChildren("Aceites");
        while(aux != null){
           aux = AceiteXML.buscar(aceite,nombre);
           if(aux != null){
               return true;
           }
        }
        return false; 
    }
     
    public boolean eliminarAceite(String nombre){
        boolean resultado = false;
        Element aux = new Element("Aceites");
        List aceiteXML = this.root.getChildren("Aceites");
        while(aux != null){
            aux = AceiteXML.buscar(aceiteXML, nombre);
            if( aux != null){
                aceiteXML.remove(aux);
                resultado = updateDocument();
            }
        }
        return resultado;
    }
    
    public Aceites obtenerAceite(String nombre){
        Element aux = new Element("Aceites");
        List aceiteXML = this.root.getChildren("Aceites");
        while(aux != null){
            aux = AceiteXML.buscar(aceiteXML, nombre);
            if( aux != null){
                try{
                   return AceiteToObject(aux);
               }catch(ParseException ex){
                   System.out.println(ex.getMessage());
               }
            }
        }
        return null;
    }
     
     
    public boolean actualizarAceite(Aceites a){
        boolean resultado = false;
        Element aux = new Element("Aceites");
        List aceite = this.root.getChildren("Aceites");
        while(aux != null){
            aux = AceiteXML.buscar(aceite, a.getNombre());
            if( aux != null){
                aceite.remove(aux);
                resultado = updateDocument();
            }
        }
        agregarAceite(a);
        return resultado;
    }
    
    public LinkedList<Aceites> listaAceites(){
        LinkedList<Aceites> resultado = new LinkedList();
        for(Object it : root.getChildren()){            
            Element xmlElem = (Element) it;
            try {
                resultado.add(AceiteToObject(xmlElem));
            }catch (ParseException ex){
            System.out.println(ex.getMessage());
            }
        }
        return resultado;
    }
    
}
