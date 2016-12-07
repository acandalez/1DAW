package tema4.practicaobligatoria;

public class MainOperacionesComplejo {

	public static void main(String[] args) {

		// TODO Auto-generated constructor stub
		
		 Complejo a = new Complejo(2,5);
		 Complejo b = new Complejo();
		 b.setReal(4.6);
		 b.setImag(3.5);
		 Complejo suma = a.sumar(b);
		 Complejo resta = a.restar(b);
		 Complejo mult = a.multiplicar(b);
		 Complejo mult2 = a.multiplicar(5.2);
		 Complejo div = a.dividir(b);
		 System.out.println(suma);
		 System.out.println(resta);
		 System.out.println(mult);
		 System.out.println(mult2);
		 System.out.println("division : "+div);
		 if (a.equals(b))
		 System.out.println("Los dos números son iguales");

		 Complejo p = new Complejo(2,5);
		 Complejo pot = Complejo.potencia(p,3);
		 System.out.println("potencia: "+pot);
	}

}
