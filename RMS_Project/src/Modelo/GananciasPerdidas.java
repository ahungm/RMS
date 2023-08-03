/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class GananciasPerdidas {
    
    double monto;
    String tipoGananciaOPerdida,fecha,nombre;

    public GananciasPerdidas(double monto, String tipoGananciaOPerdida, String fecha,String nombre) {
        this.monto = monto;
        this.tipoGananciaOPerdida = tipoGananciaOPerdida;
        this.fecha = fecha;
        this.nombre = nombre;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getTipoGananciaOPerdida() {
        return tipoGananciaOPerdida;
    }

    public void setTipoGananciaOPerdida(String tipoGananciaOPerdida) {
        this.tipoGananciaOPerdida = tipoGananciaOPerdida;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
    
    
}
