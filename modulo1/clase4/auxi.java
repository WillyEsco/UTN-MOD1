public class auc {
    System.out.println("***** Ejercicio 1.a *****"); 
    String archivo = "C:\\Users\\Willy\\Desktop\\PracticaJava\\modulo1\\param.txt" ;
    try {
        String linea = Files.readAllLines(Paths.get("archivo" );    
        String [] cadena = linea.split(",") ;
        int nro1 = Integer.parseInt(cadena[0]);
        int nro2 = Integer.parseInt(cadena[1]);
        int nro3 = Integer.parseInt(cadena[2]);
        char orden = cadena[3].charAt(0);
        ordenar3nros(nro1, nro2, nro3, orden);
    } catch (Exception e) {
        System.out.println("***** E R R O R  C O N  A R C H I V O *****"); 
    }
}
