
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;


public class clase4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del archivo de entrada: ");
        // C:\\Users\\Willy\\Desktop\\PracticaJava\\modulo1\\clase4\\input.cvs
        String archivoINPUT = sc.nextLine();
        System.out.println("Ingrese el nombre del archivo de salida: ");
        // C:\\Users\\Willy\\Desktop\\PracticaJava\\modulo1\\clase4\\output.txt
        String archivoOUTPUT = sc.nextLine();

        String lineaOUT = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(archivoINPUT));
            String linea = br.readLine(); 
            String [] cadena = linea.split(",");
            String payload = cadena[0];
            int despl = Integer.parseInt(cadena[1]);
            char op = ' ';
            // pedir por consola el argumento C o D para saber si para codificar o decodificar
            System.out.println("Ingrese C para codificar o D para decodificar: ");
            op = sc.nextLine().charAt(0);
            
            if (op == 'C') {
                lineaOUT = codificar(payload,despl);
                } else {
                lineaOUT = decodificar(payload,despl);
            } 
            br.close();    
            sc.close();     
            try {
                File archivo = new File(archivoOUTPUT);
                FileWriter fw = new FileWriter(archivo);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter salida = new PrintWriter(bw);
                salida.println(lineaOUT);
                salida.close();
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
    return cadenaCodificada.toString();   
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
    return cadenaDecodificada.toString();
}
}
