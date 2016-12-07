package tema3.funciones;

import java.util.Scanner;

/**
 * A3.19. Funciones y procedimientos. EsPar

Se desea escribir un programa que vaya pidiendo números al usuario y
 me diga si el número introducido es par o impar. El programa terminará al recibir 
 un número negativo.

Se deberá utilizar una función llamada esPar que reciba como parámetro un número entero 
y devuelva un valor booleano (true si el número es par y false si el número es impar)

 * @author acand
 *
 */
public class A_3_19_EsPar {
/* definimos la funcion */
	public static boolean esPar(int x){
	//si es par	 
		if(x %2==0){
	           
	            return true;
	        }else{
	            //si es impar
	            return false;
	        }
		 
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("introducir un numero: ");
		int n = sc.nextInt();
		boolean i = esPar(n); //asignamos la variable al entero x por medio de la forma clave, valor.
		
		
		if(i){
			System.out.println("es par");
			
		}else{
			System.out.println("es impar");
		}
		
		
		
	}
}
