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
public class EdadesDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO terminar ejercicio.
    	 Scanner sc = new Scanner(System.in);
    	 int  edad, i = 0, suma = 0;
    	 double promedio;
    	 
    	 do{
    		 System.out.println("ingrese edades");
        	 edad=sc.nextInt();
        	 suma=suma+edad;
        	 i++;
        	 promedio=suma%edad;
        	 
        	 
        	 
    	 }while(promedio>=25);
    	 
    	 System.out.println(promedio);
    }
    
}
