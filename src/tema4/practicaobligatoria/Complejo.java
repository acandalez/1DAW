package tema4.practicaobligatoria;


public class Complejo {
    private double real;
    private double imag;
  
    //Constructor por defecto de la clase
    public Complejo() {
    	real = 0;
    	imag = 0;
    }
    
    //Constructor con un párametro
    public Complejo(double real){
        this.real=real;
        imag=0;
    }
    //Constructor con parámetros
    public Complejo(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    //métodos setters y getters
    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }
   
    //sumar dos números complejos
    //(a, b) + (c, d) = (a + c, b + d);
    public Complejo sumar(Complejo c){
        Complejo aux = new Complejo();
        aux.real = real + c.real;
        aux.imag = imag + c.imag;
        return aux;
    }
   
    //restar dos números complejos
    //(a, b) - (c, d) = (a - c, b - d);
    public Complejo restar(Complejo c){
        Complejo aux = new Complejo();
        aux.real = real - c.real;
        aux.imag = imag - c.imag;
        return aux;
    }
   
    //multiplicar dos números complejos
    //(a, b) * (c, d) = (a*c – b*d, a*d + b*c)
    public Complejo multiplicar(Complejo c){
        Complejo aux = new Complejo();
        aux.real = real * c.real - imag * c.imag;
        aux.imag = real * c.imag + imag * c.real;
        return aux;
    }
   
    //multiplicar un número complejo por un número de tipo double
    //(a, b) * n = (a * n, b * n)
    public Complejo multiplicar(double n){
        Complejo aux = new Complejo();
        aux.real = real * n;
        aux.imag = imag * n;
        return aux;
    }
   
    //dividir dos números complejos
    //(a, b) / (c, d) = ((a*c + b*d) / (c^2 + d^2) , (b*c – a*d) / (c^2 + d^2))
    public Complejo dividir(Complejo c){
        Complejo aux = new Complejo();
        aux.real = (real * c.real + imag * c.imag)/(c.real * c.real + c.imag * c.imag);
        aux.imag = (imag * c.real - real * c.imag)/(c.real * c.real + c.imag * c.imag);
        return aux;
    }
    
    //método toString
    @Override
    public String toString() {
        return "(" + real + ", " + imag + ")";
    }

    //método equals
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Complejo other = (Complejo) obj;
        if (this.real != other.real) {
            return false;
        }
        if (this.imag != other.imag) {
            return false;
        }
        return true;
    } 
    
    //===========================POTENCIA===============================//
    private static double potencia(double base, int exponente){
        double resultado=1.0;
        for(int i=0; i<exponente; i++){
            resultado*=base;
        }
        return resultado;
      }
    
    private static double combinatorio(int m, int n){
        long num=1;
        long den=1;
        for(int i=m; i>m-n; i--){
            num*=i;
        }
        for(int i=2; i<=n; i++){
            den*=i;
        }
        return (double)num/den;
      }
    
    public static Complejo potencia(Complejo c, int exponente){
        double x=0.0, y=0.0;
        int signo;
        for(int i=0; i<=exponente; i++){
            signo=(i%2==0) ? 1 : -1;
    //parte real
            x+=combinatorio(exponente, 2*i)*potencia(c.real, exponente-2*i)*potencia(c.imag, 2*i)*signo;
            if(exponente==2*i)  break;
    //parte imaginaria  
            y+=combinatorio(exponente, 2*i+1)*potencia(c.real, exponente-(2*i+1))*potencia(c.imag, 2*i+1)*signo;
        }
        return new Complejo(x, y);
      }
    //=======================FIN POTENCIA=======================//
} //Fin 