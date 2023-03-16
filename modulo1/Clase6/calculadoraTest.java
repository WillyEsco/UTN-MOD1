package Clase6;

import Clase6.Calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class calculadoraTest {
@Test
public void sumaTest() {
    double result = Calculadora.suma(7,3);
            assertEquals(result, result, 10);
}
@Test
public void restaTest() {
    double result = Calculadora.resta(7,3);
    assertEquals(result, result, 4);
}	
@Test
public void multiplicacionTest() {
    double result = Calculadora.multiplicacion(7,3);
    assertEquals(result, result, 21);
}	
@Test
public void divisionTest() {
    double result = Calculadora.division(8,2);
    assertEquals(result, result, 4);
}
}