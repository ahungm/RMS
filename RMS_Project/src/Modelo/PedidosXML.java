
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


public class PedidosXML {
    
    private Element root;
    private String fileLocation = "src//ArchivosXML//Pedidos.xml";

    public  PedidosXML(){
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
    
    private Element  PedidoElement(Pedidos a){
 
        Element pedido = new Element("Pedido");
        Element nombrePlatillo = new Element("nombrePlatillo");
        nombrePlatillo.setText(a.getNombrePlatillo());
        Element numeroMesa = new Element("mesa");
        numeroMesa.setText(String.valueOf(a.getMesa()));
        Element precio = new Element("precio");
        precio.setText(Double.toString(a.getPrecio()));
        Element nombreMesero = new Element("mesero");
        nombreMesero.setText(a.getNombreMesero());
        Element codigoMesero = new Element("codigoMesero");
        codigoMesero.setText(String.valueOf(a.getCodigoMesero()));
        
 
        
        pedido.addContent(nombrePlatillo);
        pedido.addContent(precio);
        pedido.addContent(numeroMesa);
        pedido.addContent(nombreMesero);
        pedido.addContent(codigoMesero);


        return pedido;
    }
    
    private static Element buscar(List raiz,String nombre){
        Iterator i = raiz.iterator();
        while(i.hasNext()){
            Element f = (Element) i.next();
            if(nombre.equalsIgnoreCase(f.getChild("nombrePlatillo").getText())){
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
    
    public boolean agregarPedido(Pedidos a){
        root.addContent(PedidoElement((Pedidos) a));
        boolean resultado = updateDocument();
        return resultado;
    }
    
    private Pedidos PedidoToObject(Element element) throws ParseException{
        Pedidos a = new Pedidos(Double.parseDouble(element.getChildText("precio")),Integer.parseInt(element.getChildText("mesa")),element.getChildText("nombrePlatillo"),element.getChildText("mesero"),Integer.parseInt(element.getChildText("codigoMesero")));
        return a;
    }
     
    
    public Pedidos obtenerPedido(String nombre){
        Element aux = new Element("Pedido");
        List pedidoXML = this.root.getChildren("Pedido");
        while(aux != null){
            aux = PedidosXML.buscar(pedidoXML, nombre);
            if( aux != null){
                try{
                   return PedidoToObject(aux);
               }catch(ParseException ex){
                   System.out.println(ex.getMessage());
               }
            }
        }
        return null;
    }
    
    
    public boolean eliminarPedido(String nombre){
        boolean resultado = false;
        Element aux = new Element("Pedido");
        List pedidoXML = this.root.getChildren("Pedido");
        while(aux != null){
            aux = PedidosXML.buscar(pedidoXML, nombre);
            if( aux != null){
                pedidoXML.remove(aux);
                resultado = updateDocument();
            }
        }
        return resultado;
    }
    
    
    
    
    public LinkedList<Pedidos> listaPedidos(){
        LinkedList<Pedidos> resultado = new LinkedList();
        for(Object it : root.getChildren()){            
            Element xmlElem = (Element) it;
            try {
                resultado.add(PedidoToObject(xmlElem));
            }catch (ParseException ex){
            System.out.println(ex.getMessage());
            }
        }
        return resultado;
    }
    
    
}
