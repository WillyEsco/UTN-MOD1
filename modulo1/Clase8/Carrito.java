package Clase8;

import java.util.List;

public class Carrito {

        private List<ItemCarrito> items;
        private String fechaDeCompra;


    public Carrito(List<ItemCarrito>items, String fechaDeCompra) {
        this.items = items;
        this.fechaDeCompra = fechaDeCompra;
    };

    public float costoTotal() { // sin descuento
        float total = 0; 

        for (ItemCarrito item : items) {
            total += item.calcularPrecio();   
        }

        return total;
        // java le pregunta a desc de que tipo es y ejecuta el metodo correspondiente
    }       
  // le agrego un parametro al metodo costo final
    public float costoFinal(Descuento desc) { // polimosfismo
        float total = costoTotal(); 
        return desc.valorFinal(total);
        // java le pregunta a desc de que tipo es y ejecuta el metodo correspondiente
    }       
    
    // setters y getters
 
    public List<ItemCarrito> getItems() {
        return items;
    }
    public void setItems(List<ItemCarrito> items) {
        this.items = items;
    }
    public String getFechaDeCompra() {
        return fechaDeCompra;
    }
    public void setFechaDeCompra(String fechaDeCompra) {
        this.fechaDeCompra = fechaDeCompra;
    }


}

 

 
       
    
