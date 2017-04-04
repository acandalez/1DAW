/*
Escribe una clase llamada DividePorCero que tiene dos atributos de tipo entero 
(numerador y denominador). Dicha clase tendrá un constructor con dos parámetros
(numerador y denominador) y un método operar, que devolverá el resultado de la 
división.

Se deberán capturar las posibles excepciones (división por cero) y, en caso de
producirse, mostrará el mensaje: "Error:división por cero".
 */
package tema7.A77;

import java.util.Scanner;

/**
 *
 * @author 1daw
 */
public class DividePorCero {
    double numerador;
    double denominador;

    public DividePorCero(double numerador, double denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    public double Operar(){
        double resultado = 0;
       
        resultado = numerador / denominador;
        
        return resultado;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean leido = false;
        double n = 0, d = 0;
        do{
            do{
                try {
                    System.out.println("Introduce numerador: ");
                    n = sc.nextDouble();
                    System.out.println("Introduce denominador: ");
                    d = sc.nextDouble();
                    if(n>0 && d>0){
                    System.out.println("Los numeros introducidos son correctos.");
                    leido = true;}else{
                    System.out.println("no se puede operar con cero.");}
                } catch (Exception e) {
                    System.out.println("El valor introducido no es correcto.");
                    sc.next();}
            }while(!leido);
            try {
            if(n>0 && d>0){
                DividePorCero dvc = new DividePorCero(n, d);
                System.out.println("El resultado es: "+dvc.Operar());
            }
        } catch (Exception e) {
            System.out.println("no se puede operar con cero.");
        }
            
        }while(n<=-1 || d<=-1);
    }
}