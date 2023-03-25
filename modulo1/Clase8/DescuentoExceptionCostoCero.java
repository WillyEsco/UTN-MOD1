package Clase8;

public class DescuentoExceptionCostoCero extends Exception {
    private final String mensaje;
    public DescuentoExceptionCostoCero(String mensaje) {
        this.mensaje = mensaje;
}
    public String getMessage() {
        return mensaje;
    }
    

}
