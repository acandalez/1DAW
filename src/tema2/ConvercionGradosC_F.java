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
public class ConvercionGradosC_F {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /** 
         A2.9. Programas secuenciales en Java
        Realiza un programa que lea una cantidad de grados centígrados y la pase
        * a grados Fahrenheit. La fórmula correspondiente para pasar de grados 
        * centígrados a fahrenheit es:
        F = 32 + ( 9 * C / 5)
         */
        double dGradosC;
        double dGradosF;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce los grados centigrados: " );
        /*indicamos double por que lo que vamos a ingresar esta asignado con
        esa clase.*/
        dGradosC = sc.nextDouble();
        dGradosF = 32 + (9 * dGradosC/5);
        System.out.println(dGradosC +"ºC es igual a " + dGradosF + "ºF");
        System.out.println("El calculo realizado es base 32 por 9 "
                + "menos grados centigrados partido 5");

    }
    
}
