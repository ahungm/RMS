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

public class PoDXML {
    private Element root;
    private String fileLocation = "src//ArchivosXML//PoDXML.xml";

    public PoDXML() {
        try {
            SAXBuilder builder = new SAXBuilder(false); 
            Document doc = builder.build(fileLocation);
            root = doc.getRootElement();
        } catch (JDOMException ex) {
            System.out.println("No se pudo iniciar la operacion por: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("No se pudo iniciar la operacion por: " + ex.getMessage());
        }
    }
    
    private Element PoDElement(ProveedorDistribuidor p){
        Element pod = new Element("ProDist");
        Element nombre = new Element("nombre");
        nombre.setText(p.getNombre());
        Element tipoProducto = new Element("TipoP");
        tipoProducto.setText(p.getTipoProductoVenta());
        Element tipoPoD = new Element("TipoV");
        tipoPoD.setText(p.getTipoVendedor());
        
        pod.addContent(nombre);
        pod.addContent(tipoProducto);
        pod.addContent(tipoPoD);

        return pod;
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
    
    public static Element buscar(List raiz,String dato,String tipo){
        Iterator i = raiz.iterator();
        while(i.hasNext()){
            Element f = (Element) i.next();
            if(dato.equals(f.getChild("nombre").getText()) && tipo.equalsIgnoreCase(f.getChildText("TipoV"))){
                return f;
            }
        }
        return null;
    }
    
    
    public boolean agregarPoD(ProveedorDistribuidor p){
        root.addContent(PoDElement((ProveedorDistribuidor) p));
        boolean resultado = updateDocument();
        return resultado;
    }
    
    private ProveedorDistribuidor PoDToObject(Element element) throws ParseException{
        ProveedorDistribuidor p = new ProveedorDistribuidor(element.getChildText("nombre"),element.getChildText("TipoP"),element.getChildText("TipoV"));
        return p;
    }
    
    public boolean verificarExiste (String nombre,String tipo){
        Element aux = new Element("ProDist");
        List pod = this.root.getChildren("ProDist");
        while(aux != null){
           aux = PoDXML.buscar(pod, nombre,tipo);
           if(aux != null){
               return true;
           }
        }
        return false;
    }
    
    
    public LinkedList<ProveedorDistribuidor> todosLosProveedores(){
        LinkedList<ProveedorDistribuidor> resultado = new LinkedList();
        for(Object it : root.getChildren()){
            Element xmlElem = (Element) it;
            try {
                resultado.add(PoDToObject(xmlElem));
            }catch (ParseException ex){
            System.out.println(ex.getMessage());
            }
        }
        return resultado;
    }
    
}
