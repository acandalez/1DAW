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
public class NSuerte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        int dia, mes, año, suerte, suma, cifra1, cifra2, cifra3, cifra4;
        System.out.println("Introduzca fecha de nacimiento");
        System.out.print("día: ");
        dia = sc.nextInt();
        System.out.print("mes: ");
        mes = sc.nextInt();
        System.out.print("año: ");
        año = sc.nextInt();
        suma = dia + mes + año;
        cifra1 = suma/1000;      //obtiene la primera cifra
        cifra2 = suma/100%10;  //obtiene la segunda cifra
        cifra3 = suma/10%10;   //obtiene la tercera cifra
        cifra4 = suma%10;        //obtiene la última cifra
        suerte = cifra1 + cifra2 + cifra3 + cifra4;
        System.out.println("Su número de la suerte es: " + suerte);
    }
    
}
