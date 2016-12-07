package tema3.funciones;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

/**
 * A3.21. Funciones y procedimientos

Tenemos el siguiente programa cuyo m�todo main llama a la funci�n leerNumero y al procedimiento Escribir.



La funci�n leerNumero no recibe ning�n par�metro y nos devuelve un n�mero escrito por teclado (no debe escribir nada por pantalla)

El procedimiento escribir escribe en pantalla el texto recibido como par�metro.

Se pide completar dicho programa implementando la funci�n leerNumero y el procedimiento escribir.
 * @author acand
 *
 */
public class Void {
	//le decimos que imprima lo definido en el main.
	public static void  escribir (String str){
		
		System.out.println(str);		
		
	}
	//le decimos que escriba un numero y se guarde en valor.
	public static int leerNumero (){
		
		Scanner sc = new Scanner(System.in);
		
		return sc.nextInt();
	}
	public static void main(String[] args) {
		
		escribir("Introduce un valor");
		int valor = leerNumero();
		escribir("El numero es "+valor);
	}

}
