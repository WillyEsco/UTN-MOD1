package Clase5;

public class Carrito {
        private Persona persona;
        private Producto producto1;
        private Producto producto2;
        private Producto producto3;
        private int cant1, cant2, cant3;
        private String fechaDeCompra;
    public Carrito(Persona persona, Producto producto1, Producto producto2, Producto producto3, String fechaDeCompra, int cant1, int cant2, int cant3) {
        this.persona = persona;
        this.producto1 = producto1;
        this.producto2 = producto2;
        this.producto3 = producto3;
        this.cant1 = cant1;
        this.cant2 = cant2;
        this.cant3 = cant3;
        this.fechaDeCompra = fechaDeCompra;
    }
    public float costoFinal(int cantCuotas) {
        float total = 0; 

        total = (producto1.costoFinal(cantCuotas) * cant1 ) + (producto2.costoFinal(cantCuotas)* cant2)  + (producto3.costoFinal(cantCuotas) * cant3);

        return total;
    }                
}

 

 
       
    
