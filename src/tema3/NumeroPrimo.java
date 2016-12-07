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
public class NumeroPrimo {

    public static void main(String[] args) {

        int i = 0,n,acumulador=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        n=sc.nextInt();
        //Creamos un bucle for
        while(++i<(n+1)){
            if(n%i==0){
                acumulador++;
            }
        }
        if(acumulador!=2){
            System.out.println("No es primo ya que su division es exacta");
        }else{
            System.out.println("Es un numero primo");
        }
        
    }
    
}
