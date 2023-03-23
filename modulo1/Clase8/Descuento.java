package Clase8;


public abstract class  Descuento {
private float valor;

// no tiene constructor porque es abstracta
// pero si quiero lo pongo
public Descuento(float valor) {
    this.valor = valor;
}

public float getValorDesc() {
    return valor;
}
public void setValorDesc(float valor) {
    this.valor = valor;
}

public abstract float valorFinal(float valorInicial); // descuento aplicado al valor inicial
// Metodo abstracto, quien me herede tendrá que implementarlo
// ...

}
