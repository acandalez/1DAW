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
public class CorreccionDado {
    
    public static void dado(){
    
        int [] nlados = {0,0,0,0,0,0};
        
        for(int i = 0; i < 6000; i++){
            int tiradas = (int) (Math.random()*6);
            nlados[tiradas]++;//con esto guardamos e incrementamos
        }
        for(int i = 0; i < nlados.length; i++){//con esto imprimimos el resultado
        System.out.println("El numero "+(i+1)+" a sañido cada "+nlados[i]+" veces");
        System.out.println("El porcentaje es "+nlados[i]*100/6000+"%");
    }
}
    
}
