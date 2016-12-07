package tema3.funciones;

import java.util.Scanner;

public class Potencias {
	
	public static double potencia(double x, int n){
		// le asignamos un valor a la base y la igualamos en otro valor para que se multiplique a si mismo.
		double x1 = x;
		
		for(int i = 0; i<n; i++){
			x= x1 * x;
			
		}
		return x;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base = 0;
		int exponente = 0;
		System.out.println("Escribe la base");
		base = sc.nextDouble();
		System.out.println("Escribe el exponente");
		exponente = sc.nextInt();
		double total = potencia(base, exponente);
		System.out.println(total);
	}

}
