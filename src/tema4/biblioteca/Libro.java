package tema4.biblioteca;

public class Libro {
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;

    //constructor por defecto
    public Libro() {
    }

    //constructor con parámetros
    public Libro(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    //getters y setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //método para realizar el prestamo de un libro
    public boolean prestamo() {
        boolean prestado = true;
        if (prestados < ejemplares) {
            prestados++;
        } else {
            prestado = false;
        }
        return prestado;
    }

    //método para realizar la devolución de un libro
    public boolean devolucion() {
        boolean devuelto = true;
        if (prestados == 0) {
            devuelto = false;
        } else {
            prestados--;
        }
        return devuelto;
    }

    
    /*
    public String mostrarLibro(){
    	return "titulo: " + titulo + "\nautor: " + autor +
                "\nejemplares: " + ejemplares + "\nprestados: " + prestados;
    }*/
    
    public void mostrarLibro(){
    	System.out.println("Titulo: "+getTitulo());
    	System.out.println("Autor: "+getAutor());
    	System.out.println("Ejemplare: "+getEjemplares());
    	System.out.println("Prestados: "+getPrestados());
    }
    
   
}