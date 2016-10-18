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
public class TresCifras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         /**
        * A2.11. Programas secuenciales en Java
        * Realiza un programa Java que lea un número entero de 3 cifras y muestre por 
        * separado las cifras del número. Recuerda que la división entre enteros da como
        * resultado la parte entera de la división (sin decimales). Si por ejemplo N = 123 
        * la operación N/10 da como resultado 12 y no 12.3.
        * Recuerda que el operador % obtiene el resto de la división.
         */
        
         Scanner teclado = new Scanner (System.in);
        System.out.println("Introduzca un numero de 3 cifras");
        int valor = teclado.nextInt();
        
        System.out.println("Las centenas son " + (valor/100));
        System.out.println("Las decenas son " + (((valor - (valor/100)*100) - (valor% 10))/10));
        System.out.println("Las unidades son " + (valor% 10));

    }
    
}
