package tema4.geometria;
/**
 * CLASE RECTÁNGULO

Atributos

base: será un atributo privado de tipo double
altura: será un atributo privado de tipo double
Métodos (todos ellos públicos)

Un constructor que no recibirá parámetros e inicializará el valor de la base y de la altura a 1
Un constructor que recibirá como parámetros el valor de la base y de la altura
Un método llamado getBase sin parámetros que devolverá el valor de la base
Un método llamado getAltura sin parámetros que devolverá el valor de la altura
Un método llamado setBase que recibe como parámetro el valor de la base y se lo asigna al atributo base
Un método llamado setAltura que recibe como parámetro el valor de la altura y se lo asigna al atributo altura
Un método llamado setLados que recibe como parámetros la base y la altura y se los asigna a los atributos base y altura
Un método llamado perimetro que nos devuelve el perímetro del rectángulo
Un método llamado area que nos devuelve al área del rectángulo
 * @author acand
 *
 */
public class Rectangulo {

	private double base, altura;
	
	public Rectangulo() {
		// TODO Auto-generated constructor stub
		base=1;
		altura=1;
		
	}

	//Un constructor que no recibirá parámetros e inicializará el valor de la base y de la altura a 1
	public Rectangulo(double b, double h) {
		
		this.setBase(b);
		this.setAltura(h);
	}
	
	//Un método llamado perimetro que nos devuelve el perímetro del rectángulo.
	public double perimetro(double h, double b){
		this.setBase(b);
		this.setAltura(h);
		
		return 2*b + 2*h;
		
	}
	
	public double area(double h, double b){
		this.setBase(b);
		this.setAltura(h);
		
		return h*b;
	}
	
	//Un método llamado getBase sin parámetros que devolverá el valor de la base.
	public double getBase() {
		return base;
	}

	//Un método llamado setBase que recibe como parámetro el valor de la base y se lo asigna al atributo base.
	public void setBase(double base) {
		this.base = base;
	}

	//Un método llamado getAltura sin parámetros que devolverá el valor de la altura.
	public double getAltura() {
		return altura;
	}

	//Un método llamado setAltura que recibe como parámetro el valor de la altura y se lo asigna al atributo altura.
	public void setAltura(double altura) {
		this.altura = altura;
	}

}
