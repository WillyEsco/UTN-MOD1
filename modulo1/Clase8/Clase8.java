package Clase8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;

import Clase7.DescuentoPorcentajeConTope;

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
                // Descuento desFijo = new DescuentoFijo(montoFijo);
                // Descuento desPorcentaje = new DescuentoPorcentaje(porcentaje);
                // Descuento desPorcentajeTope = new DescuentoPorcentajeconTope(porcen,tope);
                
                // pedir por pantalla el tipo de dexcuento
                Scanner sc = new Scanner(System.in);

// elija el tipo de descuento 
// fijo: 1. 
// por porcentaje: 2 
// o por porcentaje con tope: 3
                 //  Clean console 
                System.out.print("\033[H\033[2J");
                System.out.flush();

                System.out.println("Elija el tipo de descuento: ");
                System.out.println("1. Descuento fijo");
                System.out.println("2. Descuento por porcentaje");
                System.out.println("3. Descuento por porcentaje con tope");
                int opcion = sc.nextInt();
                Descuento desc = null;
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el monto Fijo: ");
                        float montoFijo = sc.nextFloat();
                        desc = new DescuentoFijo(montoFijo);
                        break;
                    case 2:
                        System.out.println("Ingrese el porcentaje: ");
                        System.out.println("(ej: para 20% ingresar 20)");
                        float porcentaje = sc.nextFloat();
                        desc = new DescuentoPorcentaje(porcentaje);
                        break;
                    case 3:
                        System.out.println("Ingrese el porcentaje: ");
                        float porcen = sc.nextFloat();
                        System.out.println("Ingrese el tope: ");
                        float tope = sc.nextFloat();               
                        desc = new DescuentoPorcentajeconTope(porcen,tope);
                        break;
                    default:
                        System.out.println("Opcion invalida");
                        break;
                }

                System.out.println("========================================");
                System.out.println("============= F A C T U R A ============");
                System.out.println("========================================");
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
                try { 
                    System.out.println("Costo final: " + carrito1.costoFinal(desc) +" pesos"+ " c/desc"); 
                    System.out.println("========================================");
                }   catch (Exception e) {
                    System.out.println("No se pudo aplicar el descuento");
                    System.out.println("==================================================");
                    System.out.println(" " + e.getMessage());
                    System.out.println("==================================================");
                }         
                sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo abrir el archivo");
            e.printStackTrace();
        }
    };


}

    

 

  

    





    






    
