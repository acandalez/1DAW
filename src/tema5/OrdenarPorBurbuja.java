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
public class OrdenarPorBurbuja {

    public static int [] ordenar(int [] A){
        int aux, j = 0;
        
        for(int i = 1; i < A.length ; i++){
            for(j = 0; j < (A.length -i); j++){
                if(A[j] > A[j+1]){
                    aux = A[j];
                    A[j] = A [j+1];
                    A[j+1] = aux;
                }
            }
        }
        return A;
    }
    
}
