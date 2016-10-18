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
public class HoraCorrecta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int iH, iM, iS;
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Introduzca una hora en formato 24h: ");
        iH = sc.nextInt(); 
        System.out.print("Introduzca un minuto del 0 al 59: ");
        iM = sc.nextInt(); 
        System.out.print("Introduzca un segundo del 0 al 59: ");
        iS = sc.nextInt(); 
        
        if(iH>23 || iM>59 || iS>59){
            System.out.println("Formato Incorrecto: "+iH+":"+iM+":"+iS+" recuerde: H 0-23 | M 0-59 | S 0-59");
        }else{
            System.out.println("La Hora introducida es correcta: "+iH+":"+iM+":"+iS);
        }
    }
    
}
