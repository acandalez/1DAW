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
public class DivisionReales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dividendo, divisor;
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Introduzca el dividendo: ");
        dividendo = sc.nextInt(); 
        System.out.print("Introduzca el divisor: ");
        divisor = sc.nextInt(); 
        
        double operacion = (double) dividendo/divisor;
        //he casteado para que admitiera decimales el resultado
        if(divisor==0)
           System.out.println("No se puede dividir por cero");    
        else{
            System.out.println(dividendo + " / " + divisor + " = " + operacion);   
            
        }
    }
    
}
