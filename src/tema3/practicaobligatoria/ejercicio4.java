package tema3.practicaobligatoria;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO si pongo distinto que cero en alguno de los valore, hace el bucle pero me recogeel valor introducido.
		String n1 ="";
		int n=0;
        int a = 0, b = 0, c = 0, i = 0;
        int cont = 0;
       // System.out.println("introduce numeros, termina con 0");
        Scanner sc = new Scanner(System.in);
        
        for (i=1; a==0 || b==0 || c==0; i++) {        
        	
        	if(a<=0){
        	System.out.println("introduce numeros, termina con 0");
        	a=sc.nextInt();
        	}else if(b<=0){
        	System.out.println("introduce numeros, termina con 0");
        	b=sc.nextInt();
        	}else if(c<=0){
        	System.out.println("introduce numeros, termina con 0");
        	c=sc.nextInt();
        	}else{
       
            cont++;
        	}
        }
            
        
        int suma = a + b + c;
        int mul = a * b * c;
        System.out.println("Suma: " +suma);
        System.out.println("Multiplicacion: " + mul);
    }
 
}
