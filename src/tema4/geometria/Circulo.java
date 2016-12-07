package tema4.geometria;

/**
 * A4.1. Mi primera clase. Clase circulo

Crear una clase en Java llamada círculo. Dicha clase será pública y tendrá los siguientes atributos y métodos:

Atributos

radio: será un atributo privado de tipo double
Métodos (todos ellos públicos)

Un constructor que no recibirá parámetros e inicializará el valor del radio a 1
Un constructor que recibirá como parámetro el valor del radio y se lo asigna al atributo radio
Un método llamado getRadio sin parámetros que devolverá el valor del radio
Un método llamado setRadio que recibe como parámetro el valor del radio y se lo asigna al atributo radio
Un método llamado perimetro que nos devuelve la longtud de la circunferencia del círculo
Un método llamado area que nos devuelve al área del círculo
 * @author acand
 *
 */
public class Circulo {

	private double radio;
	public final static double PI = 3.1416;
	
	//Constructor
	public  Circulo(){
		radio = 1;
	}
	
	public Circulo(double rad){
		this.setRadio(rad);
		
	}

	//Un método llamado perimetro que nos devuelve la longtud de la circunferencia del círculo.
	public double perimetro(double rad){
				
		this.setRadio(rad);
		
		return 2*PI*rad;
	}
	
	//Un método llamado area que nos devuelve al área del círculo.
	public double area(double rad){
		
		this.setRadio(rad);
		
		return PI*(rad*rad);
	}
	
	//Un método llamado getRadio sin parámetros que devolverá el valor del radio.
	public double getRadio() {
		return radio;
	}

	//Un método llamado setRadio que recibe como parámetro el valor del radio y se lo asigna al atributo radio.
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	

	
	
}
