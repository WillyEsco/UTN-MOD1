package Clase7;

public class Producto {
    private String nombre;
    private int codigo;
    private float  precio;   

    public Producto(String nombre, int codigo, float precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    } 
    public float costoFinal(int cantCuotas){ //método con un parámetro}
        float precioFinal = 0;
        if (cantCuotas == 1) {
            precioFinal = precio;
        } else if (cantCuotas == 3) {
            precioFinal = precio * 1.05f;
        } else if (cantCuotas == 6) {
            precioFinal = precio * 1.10f;
        } else if (cantCuotas == 12) {
            precioFinal = precio * 1.15f;
        } else {
            System.out.println("La cantidad de cuotas no es válida");
        }
        return precioFinal;       
    }
    //setters y getters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    

}