package tema3.funciones;

import java.util.Scanner;

public class NumeroAleatorio {

	public static int numeroRandom (int min, int max){
		
		
		return (int) (Math.random() * (max - min+1) + min);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        int min = 0, max=0, result;
        while(min<=max){
        System.out.println("Introduce un numero minimo: ");
        min = sc.nextInt();
        System.out.println("Introduce un numero maximo: ");
        max= sc.nextInt();
         result= numeroRandom(min, max);
         System.out.println(result);
         /**
          * Ejercicio 17
          *
         double suma;
         for( int=0; i<60; i++){
        	 int edad=numeroRandom(min, max);
        	 suma=suma+edad;
        	 if(edad<min){
        		 min=edad;
        	 }
        	 if (edad>max){
        		 max=edad
        	 }
         }
         double promedioM = suma/x;
         System.out.println("Turno de mañana");
         System.out.println("Edad minima: " + min);
         System.out.println("Edad Maxima: "+max);
         System.out.println("Promedio: "+promedio);
         
         if (promedioM>=promedioT && promedioM>=promedioN){
        	 System.out.println("El turno que mas promedio tiene es el de la mañana");
         }else if(promedioT>=promedioM && promedioT>=promedioN){
        	 System.out.println("El turno que mas promedio tiene es el de la tarde");
         }else{
        	 System.out.println("El turno con mas promedio es el de la noche");
         }*/
	}
        
		
		
	}

}
