package Clase8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Clase8 {
    public static void main(String[] args) {
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
                items.add(new ItemCarrito(new Producto(nombreProducto, precioProducto), cantidadProducto));
                }
                scanner.close();

                Carrito carrito1 = new Carrito(items, "12/12/2020");
                Persona persona1  = new Persona("Leopoldo", "Luque", carrito1);
 
                
                // polimorfismo de descuento
                // Determino nos valores de descuento fijo y porcentaje
                Descuento desFijo = new DescuentoFijo(70);
                Descuento desPorcentaje = new DescuentoPorcentaje(0.30f);

                // pedir por pantalla el tipo de dexcuento
                Scanner sc = new Scanner(System.in);
                System.out.println("Ingrese el tipo de descuento: Fijo(F) / Porcentaje(P):");
                String tipoDescuento = sc.nextLine();
                Descuento desc = null;
                if (tipoDescuento.equals("F")) {
                    desc = desFijo;
                } else if (tipoDescuento.equals("P")) {
                    desc = desPorcentaje;
                } else {
                    System.out.println("No se ingreso un tipo de descuento valido");
                }

                System.out.println("========================================");
                System.out.println("============= F A C T U R A ============");

                System.out.println("Nombre: " + persona1.getNombre());
                System.out.println("Apellido: " + persona1.getApellido());
                System.out.println("Fecha de compra: " + carrito1.getFechaDeCompra());

                System.out.println("========================================");
                System.out.println(" Cant     precio Unit     Producto" );
                System.out.println("========================================");
                for (ItemCarrito item : items) {
                    System.out.println("  " + item.getCantidad() + "         " + item.producto.getPrecio() + " $     " + item.producto.getNombre());
                }

                System.out.println("========================================");
                System.out.println("Costo total: " + carrito1.costoTotal() +" pesos");              
                System.out.println("Costo final: " + carrito1.costoFinal(desc) +" pesos"+ " c/desc"); 
                System.out.println("========================================");
             
                sc.close();
                  
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo abrir el archivo");
            e.printStackTrace();
        }
    };


}

    

 

  

    





    






    
