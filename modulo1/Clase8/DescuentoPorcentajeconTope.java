package Clase8;

public class DescuentoPorcentajeconTope extends DescuentoPorcentaje {
    // por heredar heredo el atriburo de Descuento, que es valor
    // lo que necesito nuevo:
    private float tope;

    public DescuentoPorcentajeconTope(float valor, float tope) {
        super(valor);
        this.tope = tope;
    }

    @Override
    public float valorFinal(float valorInicial) {
        if (valorInicial * super.getValorDesc() > tope) {
            return valorInicial - tope;
        }
        return valorInicial - (valorInicial * super.getValorDesc());
    }

    public float getTope() {
     return tope;
    }
    public void setTope(float tope) {
     this.tope = tope;
    }

// Todo estos 3 metodos ya los tiene la clase padre:
// public float getValorDesc() {
// public void setValorDesc(float valor) {
// public float valorFinal(float valorInicial) {

}
