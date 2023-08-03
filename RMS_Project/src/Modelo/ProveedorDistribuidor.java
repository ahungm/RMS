
package Modelo;

 

public class ProveedorDistribuidor {
    
    PoDXML podXML = new PoDXML();
    
    String nombre,tipoProductoVenta,tipoVendedor;

    public ProveedorDistribuidor(String nombre, String tipoProductoVenta, String tipoVendedor) {
        this.nombre = nombre;
        this.tipoProductoVenta = tipoProductoVenta;
        this.tipoVendedor = tipoVendedor;
    }
   
    
    public ProveedorDistribuidor() {
    }
    
    
    public PoDXML getPodXML() {
        return podXML;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoProductoVenta() {
        return tipoProductoVenta;
    }

    public void setTipoProductoVenta(String tipoProductoVenta) {
        this.tipoProductoVenta = tipoProductoVenta;
    }

    public String getTipoVendedor() {
        return tipoVendedor;
    }

    public void setTipoVendedor(String tipoVendedor) {
        this.tipoVendedor = tipoVendedor;
    }
    
    public double generarPrecio(String tipoProducto,String unidad,int cantidad){
        double precio = 0;
        if ((unidad.equalsIgnoreCase("Kg")) || (unidad.equalsIgnoreCase("L"))){
           switch(tipoProducto){
                case "Gaseosa":
                   precio = cantidad*13.5;
                break;
                case "Carne":
                    precio = cantidad*6.7;
                break;
                case "Harina y derivado":
                   precio = cantidad*8.5;
                break;
                case "Aceite":
                    precio = cantidad*4.3;
                break;
                case "Condimento":
                   precio = cantidad*2.5;
                break;
                case "Lacteo":
                    precio = cantidad*8.1;
                break; 
                case "Legumbre":
                    precio = cantidad*3.5;
                break;
           } 
          
        }
     return precio;
    }
    
    

}