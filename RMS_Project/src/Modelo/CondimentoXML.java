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

public class CondimentoXML{
    
    private Element root;
    private String fileLocation = "src//ArchivosXML//Condimento.xml";

    public CondimentoXML(){
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
    
    private Element CondimentoElement(Condimento c){
        Element condimento = new Element("Condimentos");
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

        
        condimento.addContent(cantidad);
        condimento.addContent(dia);
        condimento.addContent(mes);
        condimento.addContent(anio);
        condimento.addContent(unidad);
        condimento.addContent(nombre);

        return condimento;
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
    
    public boolean agregarCondimento(Condimento c){
        root.addContent(CondimentoElement((Condimento) c));
        boolean resultado = updateDocument();
        return resultado;
    }
    
    private Condimento CondimentoToObject(Element element) throws ParseException{
        Condimento c = new Condimento(Integer.parseInt(element.getChildText("dia")),Integer.parseInt(element.getChildText("mes")),Integer.parseInt(element.getChildText("anio")),Double.parseDouble(element.getChildText("cantidad")),
                              element.getChildText("nombre"), element.getChildText("unidad"));
        return c;
    }
    
     public boolean eliminarCondimento(String nombre){
        boolean resultado = false;
        Element aux = new Element("Condimentos");
        List condimentoXML = this.root.getChildren("Condimentos");
        while(aux != null){
            aux = CondimentoXML.buscar(condimentoXML, nombre);
            if( aux != null){
                condimentoXML.remove(aux);
                resultado = updateDocument();
            }
        }
        return resultado;
    }
    
    public Condimento obtenerCondimento(String nombre){
        Element aux = new Element("Condimentos");
        List condimentoXML = this.root.getChildren("Condimentos");
        while(aux != null){
            aux = CondimentoXML.buscar(condimentoXML, nombre);
            if( aux != null){
                try{
                   return CondimentoToObject(aux);
               }catch(ParseException ex){
                   System.out.println(ex.getMessage());
               }
            }
        }
        return null;
    }
    
    
     public boolean verificarCondimento(String nombre){
       Element aux = new Element("Condimentos");
        List condimento = this.root.getChildren("Condimentos");
        while(aux != null){
           aux = CondimentoXML.buscar(condimento,nombre);
           if(aux != null){
               return true;
           }
        }
        return false; 
    }
     
    public boolean actualizarCondimento(Condimento c){
        boolean resultado = false;
        Element aux = new Element("Condimentos");
        List condimento = this.root.getChildren("Condimentos");
        while(aux != null){
            aux = CondimentoXML.buscar(condimento, c.getNombre());
            if( aux != null){
                condimento.remove(aux);
                resultado = updateDocument();
            }
        }
        agregarCondimento(c);
        return resultado;
    }
    
    public LinkedList<Condimento> listaCondimento(){
        LinkedList<Condimento> resultado = new LinkedList();
        for(Object it : root.getChildren()){            
            Element xmlElem = (Element) it;
            try {
                resultado.add(CondimentoToObject(xmlElem));
            }catch (ParseException ex){
            System.out.println(ex.getMessage());
            }
        }
        return resultado;
    }
    
}

