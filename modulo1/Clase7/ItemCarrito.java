package Clase7;

public class ItemCarrito {
    public Producto producto;
    public int cantidad;

 public ItemCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }
    // setters y getters
    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public float calcularPrecio() {
        return producto.getPrecio() * cantidad;
    }
}
