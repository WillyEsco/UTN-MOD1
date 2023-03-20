package Clase7;

public class Persona {
        private String nombre;
        private String apellido;
        private String fechaNacimiento;

        public Persona(String nombre, String apellido, String fechaNacimiento) {     
            this.nombre = nombre;
            this.apellido = apellido;
            this.fechaNacimiento = fechaNacimiento;
        } 
        public int edad() {
            int edad = 0;
            String [] fecha = fechaNacimiento.split("/");
            int dia = Integer.parseInt(fecha[0]);
            int mes = Integer.parseInt(fecha[1]);
            int anio = Integer.parseInt(fecha[2]);
            int anioActual = 2023;
            edad = anioActual - anio;
            if (mes > 8) {
                edad = edad - 1;
            } else if (mes == 8) {
                if (dia > 20) {
                    edad = edad - 1;
                }
            }
            return edad;
        }
}

