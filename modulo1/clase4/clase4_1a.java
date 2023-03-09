
public class clase4_1a {
   
    public static void main(String[] args) {
        System.out.println("***** Ejercicio 1.a *****");
   
        if (args.length != 0) {
            int nro1 = Integer.parseInt(args[0]);
            int nro2 = Integer.parseInt(args[1]);
            int nro3 = Integer.parseInt(args[2]);
            char orden = args[3].charAt(0);
            ordenar3nros(nro1, nro2, nro3, orden);
        } else {
            System.out.println("***** E R R O R:  S I N  P A R A M E T R O S *****");
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

