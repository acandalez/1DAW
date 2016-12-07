package tema4.geometria;
/**
 * CLASE RECT�NGULO

Atributos

base: ser� un atributo privado de tipo double
altura: ser� un atributo privado de tipo double
M�todos (todos ellos p�blicos)

Un constructor que no recibir� par�metros e inicializar� el valor de la base y de la altura a 1
Un constructor que recibir� como par�metros el valor de la base y de la altura
Un m�todo llamado getBase sin par�metros que devolver� el valor de la base
Un m�todo llamado getAltura sin par�metros que devolver� el valor de la altura
Un m�todo llamado setBase que recibe como par�metro el valor de la base y se lo asigna al atributo base
Un m�todo llamado setAltura que recibe como par�metro el valor de la altura y se lo asigna al atributo altura
Un m�todo llamado setLados que recibe como par�metros la base y la altura y se los asigna a los atributos base y altura
Un m�todo llamado perimetro que nos devuelve el per�metro del rect�ngulo
Un m�todo llamado area que nos devuelve al �rea del rect�ngulo
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

	//Un constructor que no recibir� par�metros e inicializar� el valor de la base y de la altura a 1
	public Rectangulo(double b, double h) {
		
		this.setBase(b);
		this.setAltura(h);
	}
	
	//Un m�todo llamado perimetro que nos devuelve el per�metro del rect�ngulo.
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
	
	//Un m�todo llamado getBase sin par�metros que devolver� el valor de la base.
	public double getBase() {
		return base;
	}

	//Un m�todo llamado setBase que recibe como par�metro el valor de la base y se lo asigna al atributo base.
	public void setBase(double base) {
		this.base = base;
	}

	//Un m�todo llamado getAltura sin par�metros que devolver� el valor de la altura.
	public double getAltura() {
		return altura;
	}

	//Un m�todo llamado setAltura que recibe como par�metro el valor de la altura y se lo asigna al atributo altura.
	public void setAltura(double altura) {
		this.altura = altura;
	}

}
