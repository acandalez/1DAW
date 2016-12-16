/*
 * Programa en java qye pida al usuario 10 números enteros y los guarde en un array.
 * Despues recorred el array para ir mostrando por pantalla cada uno de los números 
 *   guardados.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author 1daw
 */
public class Ejemplo_Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] aN =  new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < aN.length; i++){
            System.out.println("Escribe numeros: ");
            aN[i] = sc.nextInt();
            
        }
        for(int i = 0 ; i < aN.length; i++){
        
            System.out.print(aN[i]);
            
        }
    
    }
    
}
