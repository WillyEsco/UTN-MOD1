# **Prácticas - ARGENTINA PROGRAMA 4.0** 
------

# **Clase 10**

## **Configuración de Software**  

La práctica tendrá la finalidad de conocer los comandos básicos de Maven y, además, investigar y comprender la funcionalidad brindada por la biblioteca de Lombok. Es importante destacar que Lombok tiene una integración directa con el IDE IntelliJ, no así con Eclipse u otros. En caso de estar utilizando Eclipse puede leer este link, o en el caso de NetBeans este  este  link: [https://projectlombok.org/setup/netbeans]()

1. Crear un proyecto nuevo mediante Maven.
2. Agregar la dependencia necesaria para utilizar  Lombok 
3. Crear un programa Java que pida por consola el nombre, apellido y fecha de nacimiento de una persona. Estos datos deben ser guardados en una instancia de una clase Persona utilizando los setters generados por Lombok. https://projectlombok.org/setup/maven
   **IMPORTANTE**: el programa debe permitir cargar varias personas y también debe ofrecer la posibilidad de listar a todas las personas por pantalla (utilizar los getters generados por Lombok).
4. Generar un archivo “jar” del proyecto implementado. Ejecutarlo desde la terminal del Sistema Operativo.

------

# **Clase 8 y 9**

## **Excepciones y Colecciones**

1. Modifique el ejercicio del carrito de la clase 5-7, para tener una cantidad ilimitada de ítems. Verifique que cuando lea un archivo pueda leer items de cualquier tamaño

2. Agregue excepciones a los descuentos:

   **a.** que no se pueda aplicar un descuento a un carrito de precio 0

   **b.** que el resultado del descuento no de un monto negativo

   **c.** Si ocurre alguna de esas 2 situaciones, mostrar por pantalla el error, en lugar 
   del resultado del carrito

3. Realice algún test para probar la funcionalidad de las 2 excepciones planteadas

------

# **Clase 7**

## **Herencia en Java**

1. Al programa del carrito de la Clase 5, agregue un parámetro que indique si hay un descuento fijo o % y ponga el valor del mismo.
2. Agregue un nuevo descuento %, pero que tenga un tope Fijo en una nueva clase DescuentoPorcentajeConTope
3. Cree 2 o 3 Tests para el método “precio” del carrito, y para los 3 descuentos DescuentoFijo, DescuentoPorcentaje y DescuentoPorcentajeConTope
4. Suba el nuevo código a GIT


------

# **Clase 6**

## **Testing**  

Implemente una clase “**Calculadora**”  que tenga cuatro métodos, uno por cada operación aritmética básica (suma, resta, multiplicación y división), respetando las siguientes firmas: 

- double sumar(double unNumero, double otroNumero); 
- double restar(double unNumero, double otroNumero);
- double multiplicar(double unNumero, double otroNumero);
- double dividir(double unNumero, double otroNumero);

Luego de haber implementado la Calculadora, realice los siguientes casos de prueba:

1. El resultado de multiplicar 80 por 3 da 240
2. El resultado de sumar 150 y 180, dividido por 3, da 110
3. El resultado de restar 90 y 50, multiplicado por 15, no da 605.
4. El resultado de sumar 70 y 40, multiplicado por 25, no da 2700.

Cuando termine, suba el nuevo código a GIT

------

# **Case 5**

## **Introducción a la programación OO**  

1. Implemente usted mismo el ejemplo visto en clase de “carrito de compras”: una clase Producto (que pueda tener hasta 3 items), otra ItemCarrito, otra Carrito y otra Descuento, con 2 subclases.

2. En un programa main, lea de un archivo, por ejemplo separado por Tabs o comas, una lista de items, arme los objetos correspondientes y con el método de carrito “precio”, retorne el resultado. 

   Por ejemplo: cant precioUnitario producto

   ```
      
      1, 40, jabón en polvo
      3, 10, esponjas
      2, 100, chocolates
   
      carrito.precio() == 270
      
   ```
   
3. Suba el proyecto / ejercicios a GIT

------

# **Clase 4**

## **Programas y Archivos**  

1. Tomando los Ejercicios de la clase anterior
   - haga un main, donde por parámetro ponga 3 números y una letra que represente ascendente o descendente y los muestre ordenados por tal criterio
   - haga lo mismo, pero solicitando los parámetros de a uno por consola
   - lo mismo, pero usando los parámetros si hay alguno (como en a) y haciendo (b) si no detecta ninguno. Vea si con una función puede evitar repetir código.

2. Haga una main donde por parámetro envíe la ruta de un archivo. Ese archivo debe contener números. El programa debe escribir por consola la suma de esos números
   - Al programa anterior agréguele un parámetro para que la operación pueda ser suma o multiplicación. 

3. Tome el ejercicio B de la clase 3 y que por parámetro se pueda elegir si es una codificación o decodificación, el valor del desplazo, y 2 archivos, uno para la entrada y otro para la salida. Que por pantalla solo indique si terminó o no correctamente, los resultados deben estar en el archivo de salida

4. Suba el proyecto / ejercicios a GIT


------

# **Clase 3**

## **Array y String** 


1. Utilizando solo tipos primitivos, String (solo usar método length), vectores, iteraciones simples y condicionales, genere una clase por ejercicio que posea los siguienes métodos:

   a. Dado un String y una letra, que cuente la cantidad de apariciones de la letra en el String
   b. Dados 3 números y un orden (ascendente o decreciente) que ordene los mismos y los retorne en un vector de 3
   c. dado un vector de números, y un número X, que sume todos los números > X y retorne el resultado

2.  Genere una clase que tenga los métodos para realizar la codificación y decodificación de un string, dado un número de desplazamiento. 

      ```

         // Por ejemplo, con desplazo de 1:

         “hola que tal” -> “ipmbarvfaubm” 
         h -> i
         o -> p

        // con desplazo de 2

        “hola que tal” -> “jqncbswgbvcn” 
        h -> j
        o -> q

      ```

      En el ejemplo estoy usando este abecedario: "abcdefghijklmnñopqrstuvwxyz"

      Para este ejercicio puede usar todos los métodos de String, tanto de instancia (por ejemplo length) como de clase, por ejemplo 
      ```
      String.valueOf(arr) // donde arr es un char[]. 
      ```

      Tenga a mano los javadocs del mismo: https://docs.oracle.com/javase/8/docs/api/java/lang/String.html

Si tiene alguna duda de alguna parte que no vimos en clase, esta referencia es muy útil https://www.w3schools.com/java/default.asp


------

#  **Clase 2**

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

------

#  **Clase 1**

## **Introducción a Algoritmos y Java**

1. Vamos a practicar operaciones básicas con números

2. a. Utilizando la sentencia while, imprima todos los números entre 2 variables “a” y “b”. Su código puede arrancar (por ejemplo): 

```
   
   int numeroInicio = 5; 
   int numeroFin = 14;
   // Se deberían mostrar los números: 5,6,7,8,9,10,11,12,13,14

```

   b. A lo anterior, solo muestre los números pares.

   c. A lo anterior, con una variable extra, elija si se deben mostrar los números     pares o impares.

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
   
   
   
    ```*/pueden cambiar estas variables para ir probando/* 
      float ingresos = 299000; 
      int superficie = 20;
      int energia = 900;
   /*****************/ 
      if ((ingresos <= 748382.07) && ( superficie <= 30) && (energia <= 3330)) {
         System.out.println("Categoría A");
      } else
        if((ingresos <= 1112459.83) && (superficie <= 45) && (energia <= 5000) ) { 
         System.out.println("Categoría B" ); 
      } 
    ```

------
<p align="right">
  <img  src="./modulo1/lib/logo.jpg" width="10%" height="10%" />
</p>
