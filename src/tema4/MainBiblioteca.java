package tema4;

import java.util.Scanner;

import tema4.biblioteca.Libro;

public class MainBiblioteca {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        String titulo, autor;
        int ejemplares;
        //se crea el objeto libro1 utilizando el constructor con par�metros
        Libro libro1 = new Libro("El quijote", "Cervantes", 1, 0);
        //se crea el objeto libro2 utilizando el constructor por defecto
        Libro libro2 = new Libro();
        System.out.print("Introduce titulo: ");
        titulo = sc.nextLine();
        System.out.print("Introduce autor: ");
        autor = sc.nextLine();
        System.out.print("Numero de ejemplares: ");
        ejemplares = sc.nextInt();
        //se asigna a libro2 los datos pedidos por teclado.
        //para ello se utilizan los m�todos set
        libro2.setTitulo(titulo);
        libro2.setAutor(autor);
        libro2.setEjemplares(ejemplares);
        //se muestran por pantalla los datos del objeto libro1
        //se utilizan los m�todos getters para acceder al valor de los atributos
        System.out.println("Libro 1:");
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Ejemplares: " + libro1.getEjemplares());
        System.out.println("Prestados: " + libro1.getPrestados());
        System.out.println();
        //se realiza un pr�stamo de libro1. El m�todo devuelve true si se ha podido
        //realizar el pr�stamo y false en caso contrario
        if (libro1.prestamo()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
        }
        //se realiza una devoluci�n de libro1. El m�todo devuelve true si se ha podido
        //realizar la devoluci�n y false en caso contrario
        if (libro1.devolucion()) {
            System.out.println("Se ha devuelto el libro " + libro1.getTitulo());
        } else {
            System.out.println("No hay ejemplares del libro " + libro1.getTitulo() + " prestados");
        }
        //se realiza otro pr�stamo de libro1
        if (libro1.prestamo()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
        }
        //se realiza otro pr�stamo de libro1. En este caso no se podr� realizar ya que
        //solo hay un ejemplar de este libro y ya est� prestado. Se mostrar� por
        //pantalla el mensaje No quedan ejemplares del libro�
        if (libro1.prestamo()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
        }
        //mostrar los datos del objeto libro1
        System.out.println("Libro 1:");
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Ejemplares: " + libro1.getEjemplares());
        System.out.println("Prestados: " + libro1.getPrestados());
        System.out.println();
        //mostrar los datos del objeto utilizando el m�todo mostrarLibro
        libro2.mostrarLibro();
        
		
	}

}
