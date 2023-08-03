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

/**
 *
 * @author gadv1
 */
public class GananciasPerdidasXML {
    
    private Element root;
    private String fileLocation = "src//ArchivosXML//GananciaPerdida.xml";

    public  GananciasPerdidasXML(){
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
    
    private Element  GananciasPerdidasElement(GananciasPerdidas g){
        Element gp = new Element("GananciasPerdidas");
        Element monto = new Element("monto");
        monto.setText(Double.toString(g.getMonto()));
        Element tipoPerdida = new Element("tipoGananciaPerdida");
        tipoPerdida.setText(g.getTipoGananciaOPerdida());
        Element fecha = new Element("fecha");
        fecha.setText(g.getFecha());
        Element nombre = new Element("nombre");
        nombre.setText(g.getNombre());
        

        
        gp.addContent(monto);
        gp.addContent(tipoPerdida);
        gp.addContent(fecha);
        gp.addContent(nombre);
        


        return gp;
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
    
    public boolean agregarGananciaPerdida(GananciasPerdidas g){
        root.addContent(GananciasPerdidasElement((GananciasPerdidas) g));
        boolean resultado = updateDocument();
        return resultado;
    }
    
    private GananciasPerdidas GananciaPerdidaToObject(Element element) throws ParseException{
        GananciasPerdidas g = new GananciasPerdidas(Double.parseDouble(element.getChildText("monto")),element.getChildText("tipoGananciaPerdida"),element.getChildText("fecha"),element.getChildText("nombre"));
        return g;
    }
    
     

    public LinkedList<GananciasPerdidas> listaGP(){
        LinkedList<GananciasPerdidas> resultado = new LinkedList();
        for(Object it : root.getChildren()){            
            Element xmlElem = (Element) it;
            try {
                resultado.add(GananciaPerdidaToObject(xmlElem));
            }catch (ParseException ex){
            System.out.println(ex.getMessage());
            }
        }
        return resultado;
    }
    
    
    
}
