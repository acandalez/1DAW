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
public class Main {

    
  
   
    public static void main(String[] args) {
        //==================================
        /*CorreccionDado cd = new CorreccionDado();
        cd.dado();*/
       //===================================
        /* Busqueda busqueda = new Busqueda();
        int [] vector = {1,2,3,4,5,6,7,8};
        busqueda.buscando(vector);*/
       //===================================
       OrdenarPorBurbuja burbuja = new OrdenarPorBurbuja();
       int [] vector = {4,3,2,1};
       burbuja.ordenar(vector);
       for(int i = 0; i < vector.length; i++){
           System.out.println(vector[i]+"");
       }
       
    }
    
}
