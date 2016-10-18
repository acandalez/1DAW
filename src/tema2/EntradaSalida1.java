
package tema2;

import java.util.Scanner;

public class EntradaSalida1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        double a,dArea;
        System.out.print("Introduzca longitud del primer lado del Cuadrado: ");
        a = sc.nextDouble();
        
        
        dArea = (a*a)*2;
    System.out.println("Area -> " +  dArea);
    }
    
}
