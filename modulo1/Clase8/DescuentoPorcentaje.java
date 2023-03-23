package Clase8;


public class DescuentoPorcentaje extends Descuento {

  // por heredar heredo el atriburo de Descuento, que es valor
   
  public DescuentoPorcentaje(float valor) {
    super(valor);
}
@Override
public float valorFinal(float valorInicial) {
    return valorInicial - (valorInicial * super.getValorDesc() / 100);
}

}
