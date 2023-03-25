package Clase8;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class prueba {
    
public void main (String[] args){

    try {
        List<ItemCarrito> items = new ArrayList<ItemCarrito>();

        File archivo = new File("C:\\Users\\Willy\\Desktop\\PracticaJava\\modulo1\\Clase8\\productos.txt");
        Scanner scanner = new Scanner(archivo);
        
        while (scanner.hasNextLine()) {

            String linea = scanner.nextLine();
            String[] productos = linea.split(",");
            String nombreProducto = productos[0];
            float precioProducto = Float.parseFloat(productos[1]);
            int cantidadProducto = Integer.parseInt(productos[2]);  
            int codigo = Integer.parseInt(productos[3]);     
            items.add(new ItemCarrito(new Producto(nombreProducto, precioProducto, codigo ), cantidadProducto));
            }
            scanner.close();
            // tomo la fecha y hora actual del sistema y lo dejo en una variable

            LocalDateTime fechaCompra = LocalDateTime.now();
            Carrito carrito1 = new Carrito(items, fechaCompra);
            Persona persona1  = new Persona("Leopoldo", "Luque", carrito1);

            
            // pedir por pantalla el tipo de dexcuento
            Scanner sc = new Scanner(System.in);

            //  Clean console 
            System.out.print("\033[H\033[2J");
            System.out.flush();

        
            sc.close();
    } catch (FileNotFoundException e) {
        System.out.println("No se pudo abrir el archivo");
        e.printStackTrace();
    }
};


}
