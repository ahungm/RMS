/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gadv1
 */
public class Condimento extends Ingredientes {
    
    
    DecimalFormat numeroF = new DecimalFormat("#.000");
    Random r = new Random();
    
    Calendar fecha = new GregorianCalendar();
    int anioA = fecha.get(Calendar.YEAR);
    int diaA = fecha.get(Calendar.DATE);
    int mesA = fecha.get(Calendar.MONTH)+1;
    
    public Condimento(int dia, int mes, int anio, double cantidad, String nombre, String unidad) {
        super(dia, mes, anio, cantidad, nombre, unidad);
    }


    
    public void llenarTablaCondimento(LinkedList<Condimento> l, JTable tabla,CondimentoXML coXML){

        if(!l.isEmpty()){
          DefaultTableModel model = (DefaultTableModel)tabla.getModel();
          Object[] row;
            for(int i = 0; i < l.size() ; i++){
                if(l.get(i).verificarVencido(l.get(i).getDia(), diaA, l.get(i).getMes(), mesA, l.get(i).getAnio(), anioA)){
                   l.get(i).setCantidad(0);
                   coXML.actualizarCondimento(l.get(i));
                   row = new Object[5];
                   row[0] = l.get(i).getNombre(); 
                   row[1] = "Condimento";
                   row[2] = l.get(i).getUnidad();
                   row[3] = 0; 
                   row[4] = "Vencido";
                   model.addRow(row);
                }
                else{
                   row = new Object[5];
                   row[0] = l.get(i).getNombre(); 
                   row[1] = "Condimento";
                   row[2] = l.get(i).getUnidad();
                   row[3] = numeroF.format(l.get(i).getCantidad()); 
                   row[4] = l.get(i).getDia()+"/"+l.get(i).getMes()+"/"+l.get(i).getAnio();
                   model.addRow(row); 
                }
            }
       }
       else{
           JOptionPane.showMessageDialog(null, "No se ha registrado ningun producto de este tipo");

       }

    } 
    
     public Condimento generarFecha(Condimento co){
        co.setDia(diaA + r.nextInt(10)+1);
        co.setMes(mesA + r.nextInt(6)+1);
        co.setAnio(anioA+ r.nextInt(3)+1);
        return co;
    }
    
    
}
