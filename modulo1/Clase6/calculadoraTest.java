package Clase6;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculadoraTest {
@Test
void sumaTest() {
    double result = suma(7,3)
            assertEquals(result,10)
}
@Test
void restaTest() {
    double result = resta(7,3)
    assertEquals(result,10)
}	
@Test
void multiplicacionTest() {
    double result = multiplicacion(7,3)
    assertEquals(result,21)
}	
@Test
void divisionTest() {
    double result = division(8,2)
    assertEquals(result,4)
}
}