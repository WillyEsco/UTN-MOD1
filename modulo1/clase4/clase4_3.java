
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.util.List;

 

public class Clase4_3 {
    public static void main(String[] args) {
        String archivoINPUT = "C:\\Users\\Willy\\Desktop\\PracticaJava\\modulo1\\Clase4\\input.cvs";        
        String archivoOUTPUT = "C:\\Users\\Willy\\Desktop\\PracticaJava\\modulo1\\Clase4\\output.txt";
        try {
          //  List <String> linea = Files.readAllLines(Paths.get(archivoINPUT));
         // final List<String> linea = Files.readAllLines(Paths.get(archivoINPUT), StandardCharsets.UTF_8);
                String linea = Files.readAllLines(Paths.get(archivoINPUT)).get(0);
                String [] cadena = linea.split(",");
                String payload = cadena[0];
                int despl = Integer.parseInt(cadena[1]);
                String op = cadena[2];
                String lineaOUT = "";
               // System.out.println(op);
            if (op.equals("codificar")) {
                lineaOUT =  codificar(payload,despl);
                } else {
                    if (op.equals("decodificar") ){
                        lineaOUT = decodificar(payload,despl);
                    } else {
                        System.out.println("***** E R R O R   D E   O P C I O N *****"); 
                    }
            
                }
            //  BufferedReader br = new BufferedReader(new FileReader(archivoINPUT));
            //  String linea = br.readLine(); 
            
        /* System.out.println(op);
           System.out.println(payload);
           System.out.println(despl);   */
            if (op.equals("codificar")) {
                lineaOUT =  codificar(payload,despl);
                } else {
                    if (op.equals("decodificar") ){
                        lineaOUT = decodificar(payload,despl);
                    } else {
                        System.out.println("***** E R R O R   D E   O P C I O N *****"); 
                    }
            } 
          //  System.out.println(lineaOUT+" "+payload);
           
            try {
                Files.writeString(Paths.get(archivoOUTPUT),lineaOUT, StandardCharsets.UTF_8 );
            } catch (FileNotFoundException e) {
                System.out.println("***** E R R O R   D E   S A L I D A  *****"); 
            }
        } catch (Exception e) {
            System.out.println("***** E R R O R   D E   E N T R A D A *****"); 
        }   
    }

    public static String codificar(String cadena, int desplazamiento) {
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
       //System.out.println("La cadena codificada es: " + String.valueOf(cadenaCodificada) + " Con desplazamiento: "+ desplazamiento);
        return String.valueOf(cadenaCodificada);
    }
    public static String decodificar(String cadena, int desplazamiento) {
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
        // System.out.println("La cadena decodificada es: " + String.valueOf(cadenaDecodificada) + " Con desplazamiento: "+ desplazamiento);
        return String.valueOf(cadenaDecodificada);
     }

}  