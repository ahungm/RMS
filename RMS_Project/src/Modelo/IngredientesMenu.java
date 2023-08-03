
package Modelo;


public class IngredientesMenu {
    
    String nombre,tipo,platillo,unidadPeso;
    int cantidad,vecesSolicitado;

    public IngredientesMenu(String nombre, String tipo, String platillo, int cantidad,String unidadPeso) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.platillo = platillo;
        this.cantidad = cantidad;
        this.vecesSolicitado = 0;
        this.unidadPeso = unidadPeso; 
    }

    public String getUnidadPeso() {
        return unidadPeso;
    }

    public void setUnidadPeso(String unidadPeso) {
        this.unidadPeso = unidadPeso;
    }

    
    
    public int getVecesSolicitado() {
        return vecesSolicitado;
    }

    public void setVecesSolicitado(int vecesSolicitado) {
        this.vecesSolicitado = vecesSolicitado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlatillo() {
        return platillo;
    }

    public void setPlatillo(String platillo) {
        this.platillo = platillo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}
