package Clase5;
import java.time.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import Clase5.Persona;
import Clase5.Producto;
import Clase5.Carrito;
import java.util.ArrayList;

/**
 * clase5-ej1
 */

public class Clase5 {
    public static void main(String[] args) {
        try {
            File archivo = new File("C:\\Users\\Willy\\Desktop\\PracticaJava\\modulo1\\Clase5\\productos.txt");
            Scanner scanner = new Scanner(archivo);

            int costoTotal = 0;
            int i = -1;
            String matriz[][] = new String[3][3];
            
            while (scanner.hasNextLine()) {
                i++;
                String linea = scanner.nextLine();
                String[] productos = linea.split(",");
           
                String nombreProducto = productos[0];
                String precioProducto = productos[1];
                String cantidadProducto = productos[2];

              //  *************MATRIZ************
              //  npmbre prod - precio - cantidad        

                matriz[i][0] = nombreProducto;
                matriz[i][1] = precioProducto;
                matriz[i][2] = cantidadProducto;
                }
                Producto producto1 = new Producto(matriz[0][0], i,Float.parseFloat(matriz[0][1]));
                Producto producto2 = new Producto(matriz[1][0], i, Float.parseFloat(matriz[1][1]));
                Producto producto3 = new Producto(matriz[2][0], i, Float.parseFloat(matriz[2][1]));
                Persona persona1 = new Persona("Luis", "Perez", "20/08/1990");
                Carrito carrito1 = new Carrito(persona1, producto1, producto2, producto3, "01/02/2023", Integer.parseInt(matriz[0][2]), Integer.parseInt(matriz[1][2]), Integer.parseInt(matriz[2][2]));

                System.out.println("Cantidad  precioUnitario  Producto" );
                System.out.println("========================================");
                System.out.println("   " + matriz[0][2] + "          " + matriz[0][1] + "         " + matriz[0][0]);
                System.out.println("   " + matriz[1][2] + "          " + matriz[1][1] + "         " + matriz[1][0]);
                System.out.println("   " + matriz[2][2] + "          " + matriz[2][1] + "        " + matriz[2][0]);
                System.out.println("========================================");
                System.out.println("Costo total: " + carrito1.costoFinal(1) +" pesos"); 
                System.out.println("========================================");
                scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo abrir el archivo");
            e.printStackTrace();
        }
    };
}

    

 

  

    





    






    
