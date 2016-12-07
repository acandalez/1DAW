package tema3.funciones;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * A3.25. Funciones y procedimientos. Cilindro

Realizar una procedimiento que calcule y muestre en pantalla el área o el volumen de un cilindro, 
según se especifique. Para distinguir un caso de otro se le pasará el carácter 'a' (para área) o 'v' (para el volumen).
Además hemos de pasarle a la función el radio y la altura.

 * @author acand
 *
 */
public class A_3_25_Cilindro {
	
	public final static double PI = 3.1416;
	
	//Esto es una funcion.
	public static double area (double r){
		return 2*(PI*(r*r));//esto es 2 x PI x r^2
	}
	
	public static double volumen (double a, double r){
		
		return PI*(r*r)*a; //PI x r^2 * altura.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double a = 0, r = 0;
		System.out.println("Escriba a si desea calcular el Area, v si es el Volumen: ");
		String menu = "";
		
		menu=sc.nextLine();
		menu = menu.toLowerCase();
		
		switch(menu){
        case "a":
        	System.out.print("Introduzca el radio de la circunferencia para calcular su area: ");
        	r = sc.nextDouble();
            area(r);
            break;
        case "v":
        	System.out.print("Introduzca el area: ");
        	a = sc.nextDouble();
        	System.out.print("Introduzca el radio: ");
        	r = sc.nextDouble();
        	volumen(a, r);
        	break;
        default:
            System.out.println("Dato Erroneo");
            break;
    }
		if(area(r)!=0){
		System.out.println("Area: "+area(r));
		}else if(volumen(a, r)!=0){
		System.out.println("Volumen: "+volumen(a, r));}
	}

}
