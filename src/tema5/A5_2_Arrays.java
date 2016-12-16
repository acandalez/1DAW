/*
 *Realizar un programa Java que guarda en un array 10 números enteros que se 
leen por teclado. A continuación se recorre el array y calcula cuántos números
son positivos, cuántos negativos y cuántos ceros.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author 1daw
 */
public class A5_2_Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[] aN =  new int[10];
        int cero = 0, positivo = 0, negativo = 0, valorqueintroducimos = 0;
         Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < aN.length; i++){
            System.out.println("Escribe numeros: ");
            valorqueintroducimos = sc.nextInt();
            aN[i] = valorqueintroducimos;
            
            if(valorqueintroducimos==0){
                cero++;
            }else if(valorqueintroducimos>0){
                positivo++;
            }else{
                negativo++;
            }
            ;   
        }
        System.out.println("Positivos: "+positivo+ ", Negativos: "+negativo+" Igual a cero: "+cero);
        
    }
    
}
