/*
 *Implementar un programa Java que pida por teclado las alturas de N alumnos de 
una clase y las guarde en un ArrayList de tipo Double. A continuación el programa 
calculará cuantos alumnos hay más altos que la media y cuantos más bajos.
Para resolverlo vamos a utilizar 4 métodos además del método main:
Método numeroAlumnos(): este método pide por teclado el número de alumnos de la 
clase y devuelve dicho número al programa principal.
Método leerAlturas(): pide por teclado las alturas de los N alumnos y las almacena 
en el ArrayList. Este método recibe como parámetros el ArrayList inicialmente vacío
y el número de alumnos a leer.
Método calcularMedias(): calcula y devuelve la media de los alumnos de la clase.
Este método recibe como parámetro el ArrayList con las alturas de todos los alumnos.
Método mostrarResultados(): muestra por pantalla todas las alturas y calcula y 
muestra el número de alumnos con altura superior e inferior a la media. Recibe 
como parámetros el ArrayList con las alturas de todos los alumnos y la media 
calculada anteriormente.
 */
package tema8.A82;

import java.util.ArrayList;

/**
 *
 * @author 1daw
 */
public class Alturas {
    private int n;
    private ArrayList<Double> listaH = new ArrayList<Double>(n);

    public Alturas(int n) {
        this.n = n;
    }
    
    
}
