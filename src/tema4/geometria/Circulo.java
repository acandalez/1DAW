package tema4.geometria;

/**
 * A4.1. Mi primera clase. Clase circulo

Crear una clase en Java llamada c�rculo. Dicha clase ser� p�blica y tendr� los siguientes atributos y m�todos:

Atributos

radio: ser� un atributo privado de tipo double
M�todos (todos ellos p�blicos)

Un constructor que no recibir� par�metros e inicializar� el valor del radio a 1
Un constructor que recibir� como par�metro el valor del radio y se lo asigna al atributo radio
Un m�todo llamado getRadio sin par�metros que devolver� el valor del radio
Un m�todo llamado setRadio que recibe como par�metro el valor del radio y se lo asigna al atributo radio
Un m�todo llamado perimetro que nos devuelve la longtud de la circunferencia del c�rculo
Un m�todo llamado area que nos devuelve al �rea del c�rculo
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

	//Un m�todo llamado perimetro que nos devuelve la longtud de la circunferencia del c�rculo.
	public double perimetro(double rad){
				
		this.setRadio(rad);
		
		return 2*PI*rad;
	}
	
	//Un m�todo llamado area que nos devuelve al �rea del c�rculo.
	public double area(double rad){
		
		this.setRadio(rad);
		
		return PI*(rad*rad);
	}
	
	//Un m�todo llamado getRadio sin par�metros que devolver� el valor del radio.
	public double getRadio() {
		return radio;
	}

	//Un m�todo llamado setRadio que recibe como par�metro el valor del radio y se lo asigna al atributo radio.
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	

	
	
}
