package tema3.funciones;

import java.util.Scanner;

public class A_3_25_Cilindro_Correccion {

	public final static double PI = 3.1416;
	
	//Esto es un procedimiento
	public static void cilindro (String n, double rad, double alt){
		
		switch (n) {
		case "v":
			System.out.println("El volumen del cilindro es: " +PI*rad*rad*alt);			
			break;
		case "a": System.out.println("El area es: "+ 2*PI*rad*alt+ 2*(PI*rad*rad));
			break;

		default:System.out.println("No ha introducido 'a' o 'v'");
			break;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		String n;
		double rad, alt;
		System.out.println("Introduzca v para calcular el volumen o a para calcular el area");
		n=sc.next();
		
		System.out.println("Introduzca el radio");
		rad = sc.nextDouble();
		
		System.out.println("Introduzca la altura");
		alt = sc.nextDouble();
		
		cilindro(n, rad, alt);
		
	}

}
