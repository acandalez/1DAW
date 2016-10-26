/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 *
 * @author acand
 */
public class Multiplos8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v=8, m=0, i=0;
        while(m<=500){
            m=v*++i;
            System.out.println("Multiplos de 8 hasta 500: "+m);
            
        }
        System.out.println("fin del programa");
    }
    
}
