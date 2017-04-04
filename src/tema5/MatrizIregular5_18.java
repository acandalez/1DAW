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
public class MatrizIregular5_18 {
    private Scanner sc = new Scanner(System.in);
    private int[][] matriz;
    public void cargar(){
        matriz = new int[5][];
        for(int i = 0; i < 5; i++){
            matriz[i]=new int[i+1];
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println("Ingrese el numero de componentes para fila "+(i+1)+ ","+(j+1));
                matriz[i][j]=sc.nextInt(); 
            }
            
        }
    }
    public void imprimir(){
        for(int i = 0; i<matriz.length; i++){
            System.out.print("\n");
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j]+" ");
            }
        }
    }
}
