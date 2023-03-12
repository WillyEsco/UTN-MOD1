
import java.io.File;
import java.io.Path;
import java.util.Scanner;
public class clase4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del archivo: ");
        String archivo = sc.nextLine();
        try {
            String linea = Files.readAllLines(Paths.get(archivo));
            String [] cadena = linea.split(",");
            int nro1 = Integer.parseInt(cadena[0]);
            int nro2 = Integer.parseInt(cadena[1]);
            char op = cadena[3].charAt(0);
            if (op == 'S') {
                int suma = nro1 + nro2;
                System.out.println("La suma es: " + suma);
          } else {
                int mult = nro1 * nro2;
                System.out.println("La multiplicacion es: " + mult);
            } 

        } catch (Exception e) {
            System.out.println("***** E R R O R  C O N  P A R A M *****"); 
        } 
    }

  
    
}
/* public static void main(String[] args) {
        
        String archivo = "C:\\Users\\Willy\\Desktop\\PracticaJava\\modulo1\\param.txt" ;
        try {
            String linea = Files.readAllLines(Paths.get("archivo");    
            String [] cadena = linea.split(",") ;
            int nro1 = Integer.parseInt(cadena[0]);
            int nro2 = Integer.parseInt(cadena[1]);
            char op = cadena[3].charAt(0);
            if (op == 'S') {
                int suma = nro1 + nro2;
                System.out.println("La suma es: " + suma);
          } else {
                int mult = nro1 * nro2;
                System.out.println("La multiplicacion es: " + mult);
            } 

        } catch (Exception e) {
            System.out.println("***** E R R O R  C O N  P A R A M *****"); 
        } 
    */

