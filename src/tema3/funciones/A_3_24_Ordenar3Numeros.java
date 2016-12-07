package tema3.funciones;

import java.util.Scanner;

public class A_3_24_Ordenar3Numeros {
	
	
	
	public static int maximo (int x, int y, int z){
		
		if(x>=y && x>=z){
			return x;        
		}else if(y>=x && y>=z){
			return y;
        }else{
        	return z;
        	}
        
		
		
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int max;

		int a, b, c;

		System.out.print("Introduzca un numero: ");

		a=sc.nextInt();

		System.out.print("Introduzca otro numero: ");

		b=sc.nextInt();

		System.out.print("Introduzca el último: ");

		c=sc.nextInt();

		System.out.println("");

		max = maximo (a, b, c);

		System.out.println("El número mayor es: " +max);

		}
	
}
