/*
El ejercicio esta realizado de las tres formas posibles.
 */
package tema3.practicaobligatoria;

import java.util.Scanner;

/**
 *Realizar un programa que acumule (sume) valores ingresados por teclado hasta ingresar 
 *el 9999 (no sumar dicho valor, indica que ha finalizado la carga). Imprimir el valor 
 *acumulado e informar si dicho valor es cero, mayor a cero o menor a cero.
 *
 * *@author Alexander Acanda
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
       
        int n=0, i = 0, suma = 0, total;
        Scanner sc = new Scanner(System.in);
       
        /*
        
       //Forma 1.
        do{
            System.out.print("Ingresar numero: ");
            n=sc.nextInt();
           if(n!=9999){
            suma=suma+n;}

            
        }while(n!=9999);
        
        */
        
        
        /*
        //Forma 2.
        while (n!=9999){
            System.out.print("Ingresar numero: ");
            n=sc.nextInt();
           if(n!=9999){
            suma=suma+n;}
        }
        */
        
        //Forma 3
        for (i=0; n!=9999; i++){
            System.out.print("Ingresar numero: ");
            n=sc.nextInt();
           if(n!=9999){
            suma=suma+n;}
        }
        
        
        total=suma;
         if(suma>0){
            System.out.println("la suma es mayor a 0 : " + suma);
        }
         else 
            if(suma==0){
                System.out.println("la suma es igual a 0");
            }
            else {
                System.out.println("la suma es inferior a 0 : " +suma);
            }
            
        
        
    }}
        
        
        
        
    

