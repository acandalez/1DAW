/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

import java.util.Scanner;

/**
 *
 * @author acand
 */
public class Suma10Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double n, i=0, suma=0, promedio;
        Scanner sc = new Scanner(System.in);
        while(++i<=10){
            System.out.print(i+". Ingresar numero: ");
            n=sc.nextInt();
            suma=suma+n;
        }
        promedio=suma/10;
        System.out.println("La suma de todos los numeros es: "+suma);
        System.out.println("El promedio de los numeros ingresados es: "+promedio);
    }
    
}
