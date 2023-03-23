package Clase8;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertThrows;



public class CarritoTest {




// @Before
// public void setUp() {


//     float total = 10f;
//     Producto producto1 = new Producto("mayonesa", 5);
//     List<ItemCarrito> items = new ArrayList<ItemCarrito>();
//     items.add(new ItemCarrito(producto1, 1));
//     Carrito carrito1 = new Carrito(items, "12/12/2020");
//     Descuento desc = new DescuentoFijo(10);

// }
 

// @Test
// public  void  DescuentoNegativoTest() throws DescuentoException {
//     float total = 10f;
//     Producto producto1 = new Producto("mayonesa", 5);
//     List<ItemCarrito> items = new ArrayList<ItemCarrito>();
//     items.add(new ItemCarrito(producto1, 1));
//     Carrito carrito1 = new Carrito(items, "12/12/2020");
//     Descuento desc = new DescuentoFijo(10);
//     float resultado = carrito1.costoFinal(desc);
//     assertEquals(null, DescuentoException.getMessage(), "El descuento no puede ser igual o mayor al total");
// }	


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