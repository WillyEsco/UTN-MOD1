package Clase7;

import java.sql.Date;

public abstract class  Descuento {
    private Date fechaInicio, fechaFin;
    private boolean activo;

    public Descuento(Date fechaInicio, Date fechaFin, boolean activo) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.activo = activo;
    }
}
