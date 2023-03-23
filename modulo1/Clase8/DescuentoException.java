package Clase8;

public class DescuentoException extends Exception {
    private final String mensaje;
    public DescuentoException(String mensaje) {
        this.mensaje = mensaje;
}
    public String getMessage() {
        return mensaje;
    }
    

}
