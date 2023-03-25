package Clase8;


import static org.junit.Assert.assertTrue;
import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertThrows;



public class CarritoTest {

@Test
public void exceptionTesting() {
    Exception exception = assertThrows(DescuentoException.class, () -> {
        throw new DescuentoException("El descuento no puede ser igual o mayor al total");
    });

    String expectedMessage = "El descuento no puede ser igual o mayor al total";
    String actualMessage = exception.getMessage();

    assertTrue(actualMessage.contains(expectedMessage));
    
}
}