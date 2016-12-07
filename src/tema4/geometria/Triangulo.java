package tema4.geometria;

public class Triangulo {

	
	private double base, altura;
	
	public Triangulo() {
		// TODO falta las formular para calcular el perimetro y el area.
		base = 1;
		altura = 1;
		
	}

	public Triangulo(double b, double h){
			
		this.setBase(b);
		this.setAltura(h);
	}
	
	public double perimetro(double h, double b){
		this.setBase(b);
		this.setAltura(h);
		
		return h+b+Math.sqrt(b*b+h*h);
		
	}
	
	public double area(double h, double b){
		this.setBase(b);
		this.setAltura(h);
		
		return (b*h)/2;
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
