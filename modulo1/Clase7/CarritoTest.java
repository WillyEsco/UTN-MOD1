
package Clase7;

import Clase7.Carrito;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class CarritoTest {
public Carrito carrito;
public ItemCarrito item1;
public ItemCarrito item2;
public Producto producto1;
public Producto producto2;
public Persona persona;
public DescuentoPorcentajeConTope descuento1;
public DescuentoPorcentajeConTope descuento2;


@Before
public void setUp() {
    producto1 = new Producto("Coca Cola",1 ,100);
    producto2 = new Producto("Pepsi", 2 ,110);
    item1 = new ItemCarrito(producto1, 2);
    item2 = new ItemCarrito(producto2, 3);
    ItemCarrito[] items = {item1, item2};
    persona = new Persona("Juanete", "Perez Gil", "12/02/1978");
    carrito = new Carrito(persona, items, "2020-10-10", 2, 3, 4, 'F');
    descuento1 = new DescuentoPorcentajeConTope(10, 100, null, null, true);
    descuento2 = new DescuentoPorcentajeConTope(10, 500, null, null, true);
}


public void DescuentoFijoTest() {
    double result = carrito.aplicarDescuento('%', 10);
    assertEquals(result, result, 396);
}
@Test
public void DescuentoPorcentajeTest() {
    double result = carrito.aplicarDescuento('F', 10);
    assertEquals(result, result, 430);
}
@Test
public  void  DescuentoPorcentajeConTopeTest1() {
    float resultado = descuento1.aplicarDescuento(100);
    assertEquals(resultado, resultado, 90);
}	
@Test
public  void  DescuentoPorcentajeConTopeTest2() {
    float resultado = descuento1.aplicarDescuento(1500);
    assertEquals(resultado, resultado, 1350);
    }
}