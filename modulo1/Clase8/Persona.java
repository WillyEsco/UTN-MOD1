package Clase8;

public class Persona {
        private String nombre;
        private String apellido;
        private Carrito carrito;

        public Persona(String nombre, String apellido, Carrito carrito) {     
            this.nombre = nombre;
            this.apellido = apellido;
            this.carrito = carrito;
        } 

        //setters y getters
        public Carrito getCarrito() {
            return carrito;
        }
        public void setCarrito(Carrito carrito) {
            this.carrito = carrito;
        }


        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getApellido() {
            return apellido;
        }
        public void setApellido(String apellido) {
            this.apellido = apellido;
        }
        public float costoFinal() {
            return carrito.costoFinal();
        }
        public float aplicarDescuento(char tipoDesc, int desc) {
            return carrito.aplicarDescuento(tipoDesc, desc);
        }

        
}

