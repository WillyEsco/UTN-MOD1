package Clase7;

public class Carrito {
        private Persona persona;
        private ItemCarrito[] items;
        private String fechaDeCompra;


    public Carrito(Persona persona, ItemCarrito[] items, String fechaDeCompra, int cant1, int cant2, int cant3, char tipoDesc) {
        this.persona = persona;
        this.items = items;
        this.fechaDeCompra = fechaDeCompra;
    };


    public float costoFinal(int cantCuotas) {
        float total = 0; 
        for (int i = 0; i < items.length; i++) {
            total = total + items[i].calcularPrecio();
        }

        return total;
    }       
    
    // setters y getters
    public Persona getPersona() {
        return persona;
    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }   
    public ItemCarrito[] getItems() {
        return items;
    }
    public void setItems(ItemCarrito[] items) {
        this.items = items;
    }
    public String getFechaDeCompra() {
        return fechaDeCompra;
    }
    public void setFechaDeCompra(String fechaDeCompra) {
        this.fechaDeCompra = fechaDeCompra;
    }


}

 

 
       
    
