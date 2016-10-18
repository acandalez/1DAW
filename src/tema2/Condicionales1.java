/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

import java.util.Scanner;

/**
 *
 * @author acand
 */
public class Condicionales1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           /**
         * Realiza un programa en Java que pida al usuario de tipo entero.
         * A continuación muestra un mensaje indicando si el valor de dicha 
         * variable es positivo o negativo, si es par o impar, si es múltiplo 
         * de 5, si es múltiplo de 10 y si es mayor o menor que 100. 
         * Consideraremos el 0 como positivo. Utiliza el operador condicional 
         * ( ? : ) dentro del println para resolverlo.
         */
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un valor numerico: " );
        int iC = sc.nextInt(); //otra forma de declarar las variables
        /*Declaramos una Cadena para guardar las condiciones*/
        String sCondicion1, sCondicion2, sCondicion3, sCondicion4, sCondicion5;
        sCondicion1 = (iC %2 == 0)? "Es par" : "Es Impar";
        sCondicion2 = (iC >=0)? "Es positivo":"Es negativo";
        sCondicion3 = (iC % 5 == 0)? "Es multiplo de 5" : "No es multiplo de 5";
        sCondicion4 = (iC % 10 == 0)? "Es multiplo de 10" : "No es multiplo de 10";
        sCondicion5 = (iC > 100)? "Es mayor que 100" :  "Es menor que 100";
        
        System.out.println("El numero " + iC +" ," + sCondicion1 +" ,"
                + sCondicion2 +" ," + sCondicion3 +" ," + sCondicion4 +" ," 
                + sCondicion5 +" .");
        

    }
    
}
