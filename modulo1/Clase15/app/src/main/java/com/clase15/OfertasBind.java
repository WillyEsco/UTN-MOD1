package com.clase15;
import java.time.LocalDate;
import java.util.Date;
import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;
 // DoubleConverter


//Lombok
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@Setter
@Getter
@NoArgsConstructor  
//producto-nombre;peso;medida;precio;descuento-tipo;cantidad;tope;fechaDesde;fechaHasta
public class OfertasBind {
    @CsvBindByPosition(position = 0) 
    private String producto;    
    @CsvBindByPosition(position = 1) 
    private int peso; 
    @CsvBindByPosition(position = 2) 
    private String medida; 
    @CsvBindByPosition(position = 3)
    private double precio;
    @CsvBindByPosition(position = 4)
    private String tipo_descuento;
    @CsvBindByPosition(position = 5)
    private double cantidad;
    @CsvBindByPosition(position = 6)
    private int tope;
    @CsvBindByPosition(position = 7)
    private String fechaDesde; 
    @CsvBindByPosition(position = 8)
    private String fechaHasta;

    public OfertasBind(String producto, int peso, String medida, double precio, String tipo_descuento, double cantidad, int tope, String fechaDesde, String fechaHasta) {
        this.producto = producto;
        this.peso = peso;
        this.medida = medida;
        this.precio = precio;
        this.tipo_descuento = tipo_descuento;
        this.cantidad = cantidad;
        this.tope = tope;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
    }

}