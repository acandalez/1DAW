package tema3.practicaobligatoria;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0, i = 0,  total;
		long fac = 1; //asignamos long ya que no se que resultado puede dar el factorial.
		
        Scanner sc = new Scanner(System.in);
        System.out.print("Introducir el numero factorial: ");
		n=sc.nextInt();
		
		for (i = 1; n != 0; i--) {
			
            fac = fac * n;
            
            n--; //decrementa el multiplicador
           
        }
		
		System.out.println("El total del numero factorial es el "+fac);
	}

}
