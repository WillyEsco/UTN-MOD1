package com.clase15;

// lombok
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class Producto {

    private String nombre;    
    private int peso; 
    private String medida; 
    private double precio;

    public Producto(String nombre, int peso, String medida, double precio) {
        this.nombre = nombre;
        this.peso = peso;
        this.medida = medida;
        this.precio = precio;
    }

    public Producto() {
    }







}
