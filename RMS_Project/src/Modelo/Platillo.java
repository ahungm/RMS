/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author gadv1
 */
public class Platillo { 
    
    String nombre,tipoPlatillo;
    double precio;
    int cantidadIngredientes,vecesSolicitado;

    public Platillo(String nombre, double precio, int cantidadIngredientes, int vecesSolicitado,String tipoPlatillo) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadIngredientes = cantidadIngredientes;
        this.vecesSolicitado = vecesSolicitado;
        this.tipoPlatillo = tipoPlatillo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadIngredientes() {
        return cantidadIngredientes;
    }

    public void setCantidadIngredientes(int cantidadIngredientes) {
        this.cantidadIngredientes = cantidadIngredientes;
    }

    public int getVecesSolicitado() {
        return vecesSolicitado;
    }

    public void setVecesSolicitado(int vecesSolicitado) {
        this.vecesSolicitado = vecesSolicitado;
    }

    public String getTipoPlatillo() {
        return tipoPlatillo;
    }

    public void setTipoPlatillo(String tipoPlatillo) {
        this.tipoPlatillo = tipoPlatillo;
    }

    
    
    
    
}
