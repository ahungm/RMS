
package Modelo;

//Nota clase abstracta

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Ingredientes {
    int dia, mes , anio;
    double cantidad;
    String nombre,unidad;

    public Ingredientes(int dia, int mes, int anio, double cantidad, String nombre,String unidad) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.unidad = unidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public boolean verificarVencido(int diaP,int diaA,int mesP,int mesA,int anioP,int anioA){
        boolean b = false;
        if(anioP < anioA){
            b = true;
        }
        else{
            if(mesP < mesA && anioP == anioA){
                b = true;
            }
            else{
                if (diaP < diaA && mesA == mesP && anioP == anioA){
                    b = true;
                }
            }
        }
    return b;
    }

}
