import Clase3.Clase3;
public class Clase4_1a {
   
    public static void main(String[] args) {
        System.out.println("***** Ejercicio 1.a *****");
   
        if (args.length != 0) {
            int nro1 = Integer.parseInt(args[0]);
            int nro2 = Integer.parseInt(args[1]);
            int nro3 = Integer.parseInt(args[2]);
            String orden = args[3];
            ordenar3nros(nro1, nro2, nro3, orden);
        } else {
            System.out.println("***** E R R O R:  S I N  P A R A M E T R O S *****");
            System.out.println("***** hardcode en main nros: 33,27,10; orden: Ascendente *****");
            System.out.println("**************************************************************");
            System.out.println("Resultado:");
            ordenar3nros(33, 27, 10, "ascendente");
        }   System.out.println("**************************************************************");

    }

 
    public static void ordenar3nros(int a, int b, int c, String orden) {
        int[] vector = new int[3];
        if (orden == "ascendente") {
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

