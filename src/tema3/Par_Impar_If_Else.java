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
public class Par_Impar_If_Else {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un valor numerico: " );
        int iC = sc.nextInt();
        
        if(iC %2==0){
            System.out.println(iC+" es Par");
        }else{
            System.out.println(iC+" es Impar");
        }
    }
    
}
