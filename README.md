# **Practicas - ARGENTINA PROGRAMA 4.0**

------

# **Clase 9**

## Configuración de Software  

La práctica tendrá la finalidad de conocer los comandos básicos de Maven y, además, investigar y comprender la funcionalidad brindada por la biblioteca de Lombok. Es importante destacar que Lombok tiene una integración directa con el IDE IntelliJ, no así con Eclipse u otros. En caso de estar utilizando Eclipse puede leer este link, o en el caso de NetBeans este  este  link: [https://projectlombok.org/setup/netbeans]()

1. Crear un proyecto nuevo mediante Maven.
2. Agregar la dependencia necesaria para utilizar  Lombok 
3. Crear un programa Java que pida por consola el nombre, apellido y fecha de nacimiento de una persona. Estos datos deben ser guardados en una instancia de una clase Persona utilizando los setters generados por Lombok. https://projectlombok.org/setup/maven
   **IMPORTANTE**: el programa debe permitir cargar varias personas y también debe ofrecer la posibilidad de listar a todas las personas por pantalla (utilizar los getters generados por Lombok).
4. Generar un archivo “jar” del proyecto implementado. Ejecutarlo desde la terminal del Sistema Operativo.

------

# **Clase 8**

## Excepciones y Colecciones

1. Modifique el ejercicio del carrito de la clase 5-7, para tener una cantidad ilimitada de ítems. Verifique que cuando lea un archivo pueda leer items de cualquier tamaño

2. Agregue excepciones a los descuentos:

   **a.** que no se pueda aplicar un descuento a un carrito de precio 0

   **b.** que el resultado del descuento no de un monto negativo

   **c.** Si ocurre alguna de esas 2 situaciones, mostrar por pantalla el error, en lugar 
   del resultado del carrito

3. Realice algún test para probar la funcionalidad de las 2 excepciones planteadas

------

# **Clase 7**

## Herencia en Java

------

# **Clase 6**

## Testing  

------

# **Case 5**

## Introducción a la programación OO  

------

# **Clase 4**

## Programas y Archivos  

------

# **Clase 3**

## Array y String  

------

# Clase 1

## Introducción a Algoritmos y Java

1. Vamos a practicar operaciones básicas con números

2. a. Utilizando la sentencia while, imprima todos los números entre 2 variables “a” y “b”. Su código puede arrancar (por ejemplo): int numeroInicio = 5; int numeroFin = 14;
   // Se deberían mostrar los números: 5,6,7,8,9,10,11,12,13,14

   b. A lo anterior, solo muestre los números pares

   c. A lo anterior, con una variable extra, elija si se deben mostrar los números pares o impares

   d. Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden

3. Dado el siguiente texto, vamos a atacar el siguiente problema: “determinar si una persona pertenece al segmento de ingresos altos”. Del i al iii, la idea es hacerlo en papel y lápiz y sólo implementar el cuarto. 

   “Son hogares que declaran reunir alguna de las siguientes condiciones, considerando a todas y todos los convivientes:  

   ● Ingresos mensuales totales del hogar equivalentes o superiores a $489.083  (3,5 canastas básicas para un hogar tipo 2 según el INDEC).
   ● Tener 3 o más vehículos con una antigüedad menor a 5 años.
   ● Tener 3 o más inmuebles.
   ● Poseer una embarcación, una aeronave de lujo o ser titular de activos societarios que demuestren capacidad económica plena.” 
   Tomado de https://www.argentina.gob.ar/subsidios el 07/12/2022

4. a. Lea atentamente el texto, primero que nada piense cuáles son las variables de entrada.

   b. Ordene las entradas y salidas como vimos en la tabla del ejemplo Monotributo en clase, también puede consultar este link

   c. Piense en un arbol de decision, tambien como se vio en clase si puede resolver el problema, dadas las entradas

   d. Finalmente, vea si puede resolver el problema utilizando código Java. Por 

   ejemplo si estuviésemos intentando resolver el ejemplo de monotributo tendríamos el código que se muestra más abajo, y cambiando las variables  
   */pueden cambiar estas variables para ir probando/* 
   ***float ingresos = 299000;*** 
   ***int superficie = 20;*** 
   ***int energia = 900;*** 
   ***/*****************/*** 
   **if ( (ingresos <= 748382.07) && ( superficie <= 30) && (energia <= 3330) ) **

   {***System.out.println("Categoría A");***
    ***} else***
   *** if((ingresos <= 1112459.83) && (superficie <= 45) && (energia <= 5000) )*** 

   ***{ System.out.println("Categoría B" ); }*** 

## Clase 2

## Git y Github

1. Si aún no lo hizo, cree una cuenta en Github (o Gitlab si prefiere), e instale y configure el cliente de GIT que va a utilizar (colocando su nombre y dirección de correo electrónico), por ejemplo GitHub Desktop.

2. Cree un repositorio remoto nuevo, sin ningún archivo y clonelo  localmente.

3. Localmente, agregue un archivo txt, con un texto cualquiera, haga su primer commit y verifique que NO esté en el repositorio remoto. ¿Por qué no está?

4. Ahora haga el  push correspondiente y verifique que si esté 

5. Modifique el archivo desde la interfaz web de Github, verifique que dicho cambio NO está aplicado localmente ¿Por qué no está?

6. Ahora ejecute el comando correspondiente para traer los cambios y verifique que son visibles.

7. Vuelva a modificar el archivo desde la interfaz web de Github, y antes de hacer el  pull modifique algo DISTINTO en su copia local y haga un  commit  de dichos cambios.

8. Ahora pruebe hacer un push de sus cambios. ¿Qué sucedió? ¿ cómo puede proseguir?

9. Arregle el problema.

   

En este punto, recomendamos, aunque no es obligatorio, que dentro de un repositorio (por ejemplo el que creó recién), tengan una carpeta por clase (dictada teórica) del curso, y dentro de cada clase tengan un proyecto con los ejercicios con los que se va avanzando. Puede arrancar subiendo los que realizó en la clase 1. Para no tener problemas, también recomendamos que en la raíz del proyecto tenga un archivo .gitignore (notar el punto “.” al principio del nombre del archivo) para evitar versionar cosas que no corresponden. Puede descargarlo/copiarlo de este link y se agrega al proyecto como cualquier otro archivo, solo que cumple la función vista en clase.

## 

## 

## 

## 

## 



