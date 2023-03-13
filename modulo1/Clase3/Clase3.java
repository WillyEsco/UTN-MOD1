package Clase3;

public class Clase3 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 1 - parte a ");
        buscoRepeEnCadena("Hola mundo", 'o');
        System.out.println(" \n");
        System.out.println("Ejercicio 1 - parte b");
        ordenar3nros(12, 2, 13, "ascendente");
        ordenar3nros(21, 112, 33, "descendente");
        System.out.println(" \n");
        System.out.println("Ejercicio 1 - parte c");
        sumarNrosMayoresA(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5);
        System.out.println(" \n");
        System.out.println("Ejercicio 2");
        codificar( "hola que tal", 1);
        decodificar( "ipmbarvfaubm", 1);
        
        codificar( "hola que tal", 2);
        decodificar( "jqncbswgbvcn", 2);
        System.out.println(" \n");
    }
    public static void buscoRepeEnCadena(String cadena, char letra) {

        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra) {
                contador++;
            }
        }
        System.out.println("La letra " + letra + " aparece " + contador + " veces en la cadena \n");
    }

   public static void ordenar3nros(int a, int b, int c, String orden) {

    int[] vector = new int[3];
    if (orden.equals("ascendente")) {
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

public static void sumarNrosMayoresA(int[] vector, int x) {
    int suma = 0;
    for (int i = 0; i < vector.length; i++) {
        if (vector[i] > x) {
            suma += vector[i];
        }
    }
    System.out.println("La suma de los numeros mayores a " + x + " es: " + suma + " \n");
}

public static void codificar(String cadena, int desplazamiento) {
    char[] abecedario = "abcdefghijklmnñopqrstuvwxyz ".toCharArray();
    char[] cadenaChar = cadena.toCharArray();
    char[] cadenaCodificada = new char[cadenaChar.length];
    for (int i = 0; i < cadenaChar.length; i++) {
        for (int j = 0; j < abecedario.length; j++) {
            if (cadenaChar[i] == abecedario[j]) {
                if (j + desplazamiento < abecedario.length) {
                    cadenaCodificada[i] = abecedario[j + desplazamiento];
                } else {
                    cadenaCodificada[i] = abecedario[j + desplazamiento - abecedario.length];
                }
            }
        }
    }
    System.out.println("La cadena codificada es: " + String.valueOf(cadenaCodificada) + " Con desplazamiento: "+ desplazamiento);
}
public static void decodificar(String cadena, int desplazamiento) {
    char[] abecedario = "abcdefghijklmnñopqrstuvwxyz ".toCharArray();
    char[] cadenaChar = cadena.toCharArray();

    char[] cadenaDecodificada = new char[cadenaChar.length];

    for (int i = 0; i < cadenaChar.length; i++) {
        for (int j = 0; j < abecedario.length; j++) {
          
            if (cadenaChar[i] == abecedario[j]) {

                if ((j - desplazamiento ) >= 0) {
                    cadenaDecodificada[i] = abecedario[j - desplazamiento];
                } else {
                    System.out.println(abecedario[abecedario.length - 1  ]);
                    cadenaDecodificada[i] = abecedario[abecedario.length - 1  ];
                }
            }
        }
    }
    System.out.println("La cadena decodificada es: " + String.valueOf(cadenaDecodificada) + " Con desplazamiento: "+ desplazamiento);
}
}
