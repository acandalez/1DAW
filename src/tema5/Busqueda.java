/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author 1daw
 */
public class Busqueda {

    public Busqueda() {
    }
    /* Creando la funcion buscando, la cual le indica al usuario que introduzca un
    numero para buscarlo en una array */
    public static void buscando(int [] array){
       
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Introduzca un numero; ");
        n = sc.nextInt();
        for(int i = 0; i < array.length; i++){
            if(n==array[i]){
                System.out.println("Esta en la posición "+(i+1));
                break;//cuando lo encuentre se salga del for
            }else if(i == array.length-1){
                System.out.println("Numero no encontrado");
            }
        }
    }
   
    
}
