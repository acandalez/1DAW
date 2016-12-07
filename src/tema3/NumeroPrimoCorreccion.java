package tema3;

import java.util.Scanner;

public class NumeroPrimoCorreccion {

	public static void main(String[] args) {
		// TODO no esta del todo hecho
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("ingresar numero");
		num=sc.nextInt();
		
		while(num!=1){
			boolean primo = true;
			int divisor=2;
			while(divisor<=num-1){
				if(num%divisor==0){
					primo=false;
				}
				divisor ++;
			}if (primo){
				System.out.println("Es Primo");
				
			}else{
				System.out.println("no es primo");
				
			}
			System.out.println("Introduzca numero");
			num=sc.nextInt();
			
		}
		
	}

}
