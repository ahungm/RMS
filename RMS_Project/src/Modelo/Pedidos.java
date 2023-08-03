
package Modelo;


public class Pedidos {
    int mesa,codigoMesero;
    double precio;
    String nombrePlatillo,nombreMesero;

    public Pedidos(double precio, int mesa, String nombrePlatillo, String nombreMesero, int codigoMesero) {
        this.precio = precio;
        this.mesa = mesa;
        this.nombrePlatillo = nombrePlatillo;
        this.nombreMesero = nombreMesero;
        this.codigoMesero = codigoMesero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public String getNombrePlatillo() {
        return nombrePlatillo;
    }

    public void setNombrePlatillo(String nombrePlatillo) {
        this.nombrePlatillo = nombrePlatillo;
    }

    public String getNombreMesero() {
        return nombreMesero;
    }

    public void setNombreMesero(String nombreMesero) {
        this.nombreMesero = nombreMesero;
    }

    public int getCodigoMesero() {
        return codigoMesero;
    }

    public void setCodigoMesero(int codigoMesero) {
        this.codigoMesero = codigoMesero;
    }

   
    
    
    
    
}
