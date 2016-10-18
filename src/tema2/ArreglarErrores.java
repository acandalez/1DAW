package tema2;

import java.util.Scanner;

/**
 *
 * @author acand
 */
public class ArreglarErrores {
    /**
      A2.7. Uso de cadenas de caracteres
       * A continuación se muestra el código fuente de un programa que hace lo siguiente:
       * Le pide al usuario la cantidad de artículos iguales que se van a comprar
       * Le pregunta el el nombre del artículo y el precio de una unidad
       * Muestra por pantalla el precio total sumándole el iva
       * Sin embargo, nuestro programador a cometido algunos fallos y el programa no funciona correctamente.
       * Se pide:
        *Enumerar los errores que presenta el programa explicando por qué son errores
        *Subir un fichero html con la solución correcta al problema
     * @param args
      */
     public static void main(String[] args) {
     final double IVA = 0.21;
     Scanner teclado = new Scanner(System.in);
     String articulo;
     int cantidad;
     double precio, total;
     System.out.println("Ingrese la cantidad de articulos: ");
     cantidad = teclado.nextInt();
     System.out.println("Ingrese el nombre del articulo: ");
     articulo = teclado.nextLine();
    //Agregamos un salto de linea para el intro.
     teclado.nextLine();
     
     System.out.println("Ingrese el precio del articulo:");
     precio = teclado.nextDouble();
     
     //System.out.println("Ingrese el valor del IVA");
     //El IVA es una constante con lo que no se puede modificar
     //IVA = teclado.nextDouble();
    
     total = cantidad * precio * (1+IVA);
     System.out.println("El precio total es = " + total);
        
    }}
    

