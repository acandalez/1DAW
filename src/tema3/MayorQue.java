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
public class MayorQue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int iA, iB, iC;
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Introduzca el numero A: ");
        iA = sc.nextInt(); 
        System.out.print("Introduzca el numero B: ");
        iB = sc.nextInt(); 
        System.out.print("Introduzca el numero C: ");
        iC = sc.nextInt(); 
        
        
       
        
        if(iA>=iB && iA>=iC){
            System.out.println(iA+" es el mayor de los tres");
            
        }else{
           // System.out.println("A no es el mayor");
        }
        if(iB>=iA && iB>=iC){
            System.out.println(+iB+" es el mayor de los tres");
        }else{
           // System.out.println("B no es el mayor");
        }
        if(iC>=iA && iC>=iB){
            System.out.println(iC+" es el mayor de los tres");
        }else{
           // System.out.println("C no es el mayor");
        }
        if(iA==iB || iA==iC || iB==iA || iB==iC || iC==iA || iC==iB){
           // System.out.println("Los numeros introducidos deben de ser distintos");
        }
        
        else {
            System.out.println("Distinto");
        }  
        
    }
    
}
