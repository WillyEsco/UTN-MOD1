package com.clase15;

import java.time.LocalDate;
import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Setter
@Getter
@NoArgsConstructor

public class Ofertas {
    private Producto producto;
    private Descuento descuento;
    private String fechaDesde;
    private String fechaHasta;

    public Ofertas(Producto producto, Descuento descuento, String fechaDesde, String fechaHasta) {
        this.producto = producto;
        this.descuento = descuento;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
    }

}
