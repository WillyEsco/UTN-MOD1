import java.util.Scanner;


public class clase4_1c {
   
    public static void main(String[] args) {
     

        System.out.println("***** Ejercicio 1.c *****"); 
       
        if (args.length != 0) {
            int nro1 = Integer.parseInt(args[0]);
            int nro2 = Integer.parseInt(args[1]);
            int nro3 = Integer.parseInt(args[2]);
            char orden = args[3].charAt(0); 
            ordenar3nros(nro1, nro2, nro3, orden);
        } else {
            Scanner escaner = new Scanner(System.in);
            System.out.println("Ingrese el primer número");
            int nro1 = escaner.nextInt();
            System.out.println("Ingrese el segundo número");
            int nro2 = escaner.nextInt();
            System.out.println("Ingrese el tercer número");
            int nro3 = escaner.nextInt();
            System.out.println("Ingrese si quiere ver los números en orden ascendente (A) o descendente (ingrese D)");
            char orden = escaner.next().charAt(0);
            ordenar3nros(nro1, nro2, nro3, orden);
        }
 

    }

    public static void ordenar3nros(int a, int b, int c, char orden) {
        int[] vector = new int[3];
        if (orden == 'A') {
            if (a < b && a < c) {
                vector[0] = a;
                if (b < c) {
                    vector[1] = b;
                    vector[2] = c;
                } else {
                    vector[1] = c;
                    vector[2] = b;
                }
            } else if (b < a && b < c) {
                vector[0] = b;
                if (a < c) {
                    vector[1] = a;
                    vector[2] = c;
                } else {
                    vector[1] = c;
                    vector[2] = a;
                }
            } else {
                vector[0] = c;
                if (a < b) {
                    vector[1] = a;
                    vector[2] = b;
                } else {
                    vector[1] = b;
                    vector[2] = a;
                }
            }
        } else {
            if (a > b && a > c) {
                vector[0] = a;
                if (b > c) {
                    vector[1] = b;
                    vector[2] = c;
                } else {
                    vector[1] = c;
                    vector[2] = b;
                }
            } else if (b > a && b > c) {
                vector[0] = b;
                if (a > c) {
                    vector[1] = a;
                    vector[2] = c;
                } else {
                    vector[1] = c;
                    vector[2] = a;
                }
            } else {
                vector[0] = c;
                if (a > b) {
                    vector[1] = a;
                    vector[2] = b;
                } else {
                    vector[1] = b;
                    vector[2] = a;
                }
               
            }
            
        }
        System.out.println("El orden " + orden + " es: " + vector[0] + " " + vector[1] + " " + vector[2] );
    }

}

