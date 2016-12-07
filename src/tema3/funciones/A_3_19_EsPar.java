package tema3.funciones;

import java.util.Scanner;

/**
 * A3.19. Funciones y procedimientos. EsPar

Se desea escribir un programa que vaya pidiendo n�meros al usuario y
 me diga si el n�mero introducido es par o impar. El programa terminar� al recibir 
 un n�mero negativo.

Se deber� utilizar una funci�n llamada esPar que reciba como par�metro un n�mero entero 
y devuelva un valor booleano (true si el n�mero es par y false si el n�mero es impar)

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
