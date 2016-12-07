package tema3.practicaobligatoria;

import java.util.Scanner;


/**
 * 	
Realizar un programa que lea los lados de n tri�ngulos, e informar (se preguntar� al usuario el n�mero de tri�ngulos a introducir):
a) De cada uno de ellos, qu� tipo de tri�ngulo es: equil�tero (tres lados iguales), is�sceles (dos lados iguales), o escaleno (ning�n lado igual)
b) Cantidad de tri�ngulos de cada tipo.
c) Tipo de tri�ngulo que posee menor cantidad.

 *@author Alexander Acanda
 *
 */
public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Scanner sc = new Scanner(System.in);
		 int  nTrianguloEquilatero = 0, nTriangulosEscaleno = 0, nTrianguloIsosceles = 0 , l1, l2 = 0, l3 = 0, i = 0, n = 0;
		 System.out.print("Introducir el numero de triangulos: ");
		 n=sc.nextInt();
		 
		 for (i = 1 ; i<=n; i++ ){
			 
			
			 System.out.print("Ingrese el primer lado: ");
			 l1=sc.nextInt();
			 System.out.print("Ingrese el segundo lado: ");
			 l2=sc.nextInt();
			 System.out.print("Ingrese el el tercer lado: ");
			 l3=sc.nextInt();
			 System.out.println(i+ " de "+n);
			 
			 if(l1==l2 && l1==l3 ){
				 
				 System.out.println("Es un triangulo equilatero ");
				 nTrianguloEquilatero ++;
				 
				 
			 }else if(l1 == l2 || l1 == l3 || l2 == l3 ){
				 
				 System.out.println("Es un triangulo is�sceles ");
				 nTrianguloIsosceles++;
				
			 }else{
				 
				 System.out.println("Es un triangulo escaleno  ");
				 nTriangulosEscaleno ++;
				
			 }
		 }
		 System.out.println(" Cantidad de triangulos introducidos "+n);
		 System.out.println("triangulo equilatero " + nTrianguloEquilatero);
		 System.out.println("triangulo is�sceles " + nTrianguloIsosceles);
		 System.out.println("triangulo escaleno " + nTriangulosEscaleno);
		 

	}

}
