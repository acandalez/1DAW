/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author acand
 */
public class AnioBisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int iAnio=0; 
       Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un año  : ");
        iAnio = sc.nextInt();
        
        //Forma con formula
        //Si año / 4 es igual a 0 y (año / 100 es distinto de 0 Ó año entre 400 es igual a 0)
        if ((iAnio % 4 == 0) && ((iAnio % 100 != 0) || (iAnio % 400 == 0))){
	System.out.println("El año es bisiesto");
        }else{
	System.out.println("El año no es bisiesto");
        }
        
       /* 
        //Usando la clase GregorianCalendar y el metodo isLeapYear.
        GregorianCalendar calendario = new GregorianCalendar();
        
 
        if (calendario.isLeapYear(iAnio)){
                System.out.println("El año es bisiesto");
        }else{
                System.out.println("El año no es bisiesto");
    }*/
    }
}
