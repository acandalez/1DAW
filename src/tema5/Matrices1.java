/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

/**
 *
 * @author 1daw
 */
public class Matrices1 {
    
    private int [][] matriz;
    
    public void cargar(){
        int f = 4, c = 4;
        matriz = new int [f][c];
        for(int i = 0; i  < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
               
            }
        }
    }
    @Override
    public String toString(){
        String str = "x";
        for(int i = 0; i < matriz.length; i++){
            str = (matriz [i][i] + "");
        }
        return str;
    }
    
}
