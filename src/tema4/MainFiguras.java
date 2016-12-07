package tema4;

import java.util.Scanner;

import tema4.geometria.Circulo;
import tema4.geometria.Rectangulo;
import tema4.geometria.Triangulo;

public class MainFiguras {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circulo circulo = new Circulo();
		Rectangulo rectangulo = new Rectangulo();
		Triangulo triangulo = new Triangulo();
		
		Scanner sc = new Scanner (System.in);
		int menu = 0;
		double	base = 0, altura = 0, rad = 0;
		System.out.print("Introduzca: '1' para circulo, '2' para rectangulo y '3' para triangulo: ");
		menu = sc.nextInt();
		
		switch (menu) {
		case 1: 
			System.out.println("Introduzca el radio para calcular el AREA y el PERIMETRO del Circulo. ");
			System.out.print("Radio: ");
			rad=sc.nextInt();
			System.out.println("El Area es: "+circulo.area(rad));
			System.out.println("El Perimetro es: "+circulo.perimetro(rad));
		
			
			break;
			
		case 2:
			System.out.println("Introduzca la base y la altura para calcular el AREA y el PERIMETRO del Rectangulo");
			System.out.print("Base: ");
			base = sc.nextDouble();
			System.out.print("Altura: ");
			altura = sc.nextDouble();
			System.out.println("El Area es: "+rectangulo.area(altura, base));
			System.out.println("El Perimetro es: "+rectangulo.perimetro(altura, base));
			
			break;
			
		case 3:
			System.out.println("Introduzca la base y la altura para calcular el AREA y el PERIMETRO del Triangulo");
			System.out.print("Base: ");
			base = sc.nextDouble();
			System.out.print("Altura: ");
			altura = sc.nextDouble();
			System.out.println("El Area es: "+triangulo.area(altura, base));
			System.out.println("El Perimetro es: "+triangulo.perimetro(altura, base));
			
			break;

		default:
			System.out.print("Valor Incorrecto. Introduzca: '1' para circulo, '2' para rectangulo y '3' para triangulo: ");
			break;
		}
		
	}

}
