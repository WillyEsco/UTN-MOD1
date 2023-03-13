import java.nio.file.Files;
import java.nio.file.Paths;

public class Clase4_2 {
    public static void main(String[] args) {
       // leer archivo
        String archivo = "C:\\Users\\Willy\\Desktop\\PracticaJava\\modulo1\\Clase4\\param.txt";        
                        
        try {
            String linea = Files.readAllLines(Paths.get(archivo)).get(0);
            String [] cadena = linea.split(",");
            int nro1 = Integer.parseInt(cadena[0]);
            int nro2 = Integer.parseInt(cadena[1]);
            char op = cadena[2].charAt(0);
            if (op == 'S') {
                int suma = nro1 + nro2;
                System.out.println("La suma es: " + suma);
                } else {
                int mult = nro1 * nro2;
                System.out.println("La multiplicacion es: " + mult);
            } 
        } catch (Exception e) {
            System.out.println("***** E R R O R  C O N  P A R A M *****"); 
            System.out.println(e);
        }
    }
}
