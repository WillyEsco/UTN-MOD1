package Clase8;

import java.util.List;
import java.time.LocalDateTime;
public class Carrito {
        private List<ItemCarrito> items;
        private LocalDateTime fechaDeCompra;

    public Carrito(List<ItemCarrito>items, LocalDateTime fechaDeCompra) {
        this.items = items;
        this.fechaDeCompra = fechaDeCompra;
    };

    public float costoTotal()  { // sin descuento
        float total = 0; 
        for (ItemCarrito item : items) {
            total += item.calcularPrecio();   
        }
        return total;
        // java le pregunta a desc de que tipo es y ejecuta el metodo correspondiente
    }       
  // le agrego un parametro al metodo costo final

  
    public float costoFinal(Descuento desc) throws DescuentoException{ // polimosfismo
        float total = costoTotal(); 
        float costoFinal = desc.valorFinal(total);
       //  switch  case segun costoFinal
        
        if (costoFinal <= 0) {
            throw new DescuentoException("El descuento no puede ser igual o mayor al total");
        }else{
            return costoFinal;
        }
        
        // java le pregunta a desc de que tipo es y ejecuta el metodo correspondiente
    }       
    
    // setters y getters
 
    public List<ItemCarrito> getItems() {
        return items;
    }
    public void setItems(List<ItemCarrito> items) {
        this.items = items;
    }
    public LocalDateTime getFechaCompra() {
        return fechaDeCompra;
    }
    public void setFechaCompra(LocalDateTime fechaDeCompra) {
        this.fechaDeCompra = fechaDeCompra;
    }
    public void agregarItem(ItemCarrito item) {
        items.add(item);
    }
    public void eliminarItem(ItemCarrito item) {
        items.remove(item);
    }
    public void eliminarItem(int index) {
        items.remove(index);
    }
    public void vaciarCarrito() {
        items.clear();
    }
    public void mostrarItems() {
        for (ItemCarrito item : items) {
            System.out.println(item);
        }
    }
   
    public boolean agregoProd (int codigo, int cantidad) {
        for (ItemCarrito item : this.items) {
            if (item.producto.getCodigo() == codigo) {
                item.setCantidad(item.getCantidad() + cantidad);
                return true;
            }
        }
        return false;
    }
}

 

 
       
    
