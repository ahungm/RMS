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

public class  HarinayDerivadosXML{
    
    private Element root;
    private String fileLocation = "src//ArchivosXML//HarinayDerivados.xml";

    public  HarinayDerivadosXML(){
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
    
    private Element  HyDElement(HarinayDerivado h){
        Element HyD = new Element("HarinasDerivados");
        Element cantidad = new Element("cantidad");
        cantidad.setText(Double.toString(h.getCantidad()));
        Element dia = new Element("dia");
        dia.setText(Integer.toString(h.getDia()));
        Element mes = new Element("mes");
        mes.setText(Integer.toString(h.getMes()));
        Element anio = new Element("anio");
        anio.setText(Integer.toString(h.getAnio()));
        Element unidad = new Element("unidad");
        unidad.setText(h.getUnidad());
        Element nombre = new Element("nombre");
        nombre.setText(h.getNombre());

        
        HyD.addContent(cantidad);
        HyD.addContent(dia);
        HyD.addContent(mes);
        HyD.addContent(anio);
        HyD.addContent(unidad);
        HyD.addContent(nombre);


        return HyD;
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
    
    public boolean agregarHarina(HarinayDerivado h){
        root.addContent(HyDElement((HarinayDerivado) h));
        boolean resultado = updateDocument();
        return resultado;
    }
    
    private HarinayDerivado HarinaToObject(Element element) throws ParseException{
 
        HarinayDerivado h = new HarinayDerivado(Integer.parseInt(element.getChildText("dia")),Integer.parseInt(element.getChildText("mes")),Integer.parseInt(element.getChildText("anio")),Double.parseDouble(element.getChildText("cantidad")),
                              element.getChildText("nombre"), element.getChildText("unidad"));
        return h;
    }
    
     public boolean verificarHarina(String nombre){
        System.out.println(nombre);
        Element aux = new Element("HarinasDerivados");
        List harina = this.root.getChildren("HarinasDerivados");
        while(aux != null){
           aux = HarinayDerivadosXML.buscar(harina,nombre);
           if(aux != null){
               return true;
           }
        }
        return false; 
    }
     
    public boolean actualizarHarina(HarinayDerivado h){
        boolean resultado = false;
        Element aux = new Element("HarinasDerivados");
        List harina = this.root.getChildren("HarinasDerivados");
        while(aux != null){
            aux = HarinayDerivadosXML.buscar(harina, h.getNombre());
            if( aux != null){
                harina.remove(aux);
                resultado = updateDocument();
            }
        }
        agregarHarina(h);
        return resultado;
    }
    
    public boolean eliminarHarina(String nombre){
        boolean resultado = false;
        Element aux = new Element("HarinasDerivados");
        List harinaXML = this.root.getChildren("HarinasDerivados");
        while(aux != null){
            aux = HarinayDerivadosXML.buscar(harinaXML, nombre);
            if( aux != null){
                harinaXML.remove(aux);
                resultado = updateDocument();
            }
        }
        return resultado;
    }
    
    public HarinayDerivado obtenerHarina(String nombre){
        Element aux = new Element("HarinasDerivados");
        List harinaXML = this.root.getChildren("HarinasDerivados");
        while(aux != null){
            aux = HarinayDerivadosXML.buscar(harinaXML, nombre);
            if( aux != null){
                try{
                   return HarinaToObject(aux);
               }catch(ParseException ex){
                   System.out.println(ex.getMessage());
               }
            }
        }
        return null;
    }
    
    public LinkedList<HarinayDerivado> listaHarina(){
        LinkedList<HarinayDerivado> resultado = new LinkedList();
        for(Object it : root.getChildren()){            
            Element xmlElem = (Element) it;
            try {
                resultado.add(HarinaToObject(xmlElem));
            }catch (ParseException ex){
            System.out.println(ex.getMessage());
            }
        }
        return resultado;
    }
    
}



