package com.clase15;
// lombok
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class Descuento {
    private String tipo;
    private double cantidad;
    private int tope; 

    public Descuento(String tipo, double cantidad, int tope) {
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.tope = tope;
    }

    public Descuento() {
    }



}
