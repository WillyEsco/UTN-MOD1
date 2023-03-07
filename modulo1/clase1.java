 
	import java.util.Scanner;

public class clase1 {

	public static void main(String[] args) {
		// Ejercicio 1 ------------------------------------------------------------------------------------------------
		int a = 5;
		int b = 10;	
		System.out.println("***** Ejercicio 1 *****");	
		System.out.println("***** Ejercicio 1.a *****");
	
		while (a <= b) {
		System.out.println(a);
		a++; }
		//---------------------
		System.out.println("***** Ejercicio 1.b *****");
		// b. A lo anterior, solo muestre los números pares
		a = 5;
		b = 10;
		while (a <= b) {
		   if (a % 2 == 0) {
		       System.out.println(a);
		   }
		a++;
		}
	//---------------------------------------
		System.out.println("***** Ejercicio 1.c *****");	

		a = 5;
		b = 10;		 
		
		Scanner escaner = new Scanner(System.in);
		System.out.println("elija si se deben mostrar los números pares (ingrese 0) o impares (ingrese 1)");
		int c = escaner.nextInt();
		while ( ! ( c == 0 || c ==1 ) ) {
			System.out.println("elija si se deben mostrar los números pares (ingrese 0) o impares (ingrese 1)");
			c = escaner.nextInt();		
		}
		   while (a < b) {
		       if (c == 0) {
		           if (a % 2 == 0) {
		               System.out.println(a);
		           }
		       } else {
		           if (a % 2 != 0) {
		               System.out.println(a);
		           }
		       }   
		   a++;
		   }		
		   
			System.out.println("***** Ejercicio 1.d *****");	
			a = 5;
			b = 10;		  
			for (int z = b; z >= a; z--) {
			 if (z % 2 == 0) {
			       System.out.println(z);
			 } 
			}  	
		// Ejercicio 2 ------------------------------------------------------------------------------------------------
			float Ingresos_mensuales_totales = 0;
			int vehiculos = 0;
			int inmuebles = 0;
			int embarcacion = 0;
			int aeronave = 0;
			int activos_societarios = 0;
			 
			System.out.println("***** Ejercicio 2 *****");
			System.out.println("***** Determinar pertenencia Ingresos Altos *****");
			System.out.println("ingrese los ingresos mensuales totales del hogar:");	
			//equivalentes o superiores a $489.083

			Ingresos_mensuales_totales = escaner.nextFloat();
			System.out.println("ingrese la cantidad de vehiculos con una antiguedad menor a 5 años");
			vehiculos = escaner.nextInt();
			System.out.println("ingrese la cantidad de inmuebles");
			inmuebles = escaner.nextInt();
			System.out.println("ingrese 1 si posee una embarcacion, 0 sino");
			embarcacion = escaner.nextInt();
			System.out.println("ingrese 1 si posee una aeronave de lujo, 0 sino");
			aeronave = escaner.nextInt();
			System.out.println("ingrese 1 si es titular de activos societarios que demuestren capacidad económica plena, 0 sino");
			activos_societarios = escaner.nextInt();

			if ( (Ingresos_mensuales_totales >= 489083) ||
					( vehiculos >= 3) || 
					(inmuebles >= 3) ||
					(embarcacion == 1) ||
					(aeronave == 1) ||
					(activos_societarios == 1) ) {
				System.out.println("Pertenece al segmento de ingresos altos");
			} else {
				System.out.println("No pertenece al segmento de ingresos altos");
			}
			 escaner.close();
			System.out.println("***** Final Práctica Clase1*****");
	}
}
