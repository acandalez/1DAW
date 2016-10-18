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
public class NRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, nRandom;
        System.out.println("Introduzca un numero cualquiera");
        numero = sc.nextInt();
        nRandom = (int) ((int) 1+Math.floor(numero*Math.random()));
        System.out.println("El numero random resultante es el " + nRandom);
    }
    
}
