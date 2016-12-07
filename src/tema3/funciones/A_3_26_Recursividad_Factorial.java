package tema3.funciones;

import java.util.Scanner;

public class A_3_26_Recursividad_Factorial {

	public static int factorial(int num){
		
		if (num==0){
			return 1;
		}else{
		//esta funcion se llama a si misma por eso es recursiva ya que se opera sobre si mismo.
			return num*factorial(num-1);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca un numero");
		int num = sc.nextInt();
		System.out.println("El factorial es "+ factorial(num));

	}

}
