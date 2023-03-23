package Clase8;


public class DescuentoFijo extends Descuento {
  // por heredar heredo el atriburo de Descuento, que es valor
   
    public DescuentoFijo(float valor) {
        super(valor);
    }
    @Override
    public float valorFinal(float valorInicial) {
        return valorInicial - super.getValorDesc();
    }

    // setter 
    public void setValorDesc(float valor) {
        super.setValorDesc(valor);
    }
    // getter
    public float getValorDesc() {
        return super.getValorDesc();
    }

}

