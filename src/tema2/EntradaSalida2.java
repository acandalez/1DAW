
package tema2;

import java.util.Scanner;


public class EntradaSalida2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dLongitud,dArea, dRadio;
        System.out.print("Introduzca el Radio del circulo: ");
        dRadio = sc.nextDouble();
        dLongitud = 2 * PI * dRadio;
        dArea = PI * (dRadio*dRadio);
        
        System.out.println("La longitud del circulo es = "+ dLongitud + " |" + " El area del circulo es = "+ dArea);
        
    }
    
    public static final double PI = 3.14159;
    
}
