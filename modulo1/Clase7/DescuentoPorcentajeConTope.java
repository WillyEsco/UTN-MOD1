package Clase7;
import java.sql.Date;

public class DescuentoPorcentajeConTope extends Descuento {
    private float porcentaje;
    private float tope;

    public DescuentoPorcentajeConTope(float porcentaje, float tope, Date fechaInicio, Date fechaFin, boolean activo) {
        super(fechaInicio, fechaFin, activo);
        this.porcentaje = porcentaje;
        this.tope = tope;
    }
    public float aplicarDescuento(float precio) {
        float descuento = 0;
        if (precio * porcentaje / 100 > tope) {
            descuento = tope;
        } else {
            descuento = precio * porcentaje / 100;
        }
        return descuento;
    }
    public float getPorcentaje() {
        return porcentaje;
    }
    public void setPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }
    public float getTope() {
        return tope;
    }
    public void setTope(float tope) {
        this.tope = tope;
    }
}
