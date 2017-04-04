/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7.A79;

import java.util.Scanner;

/**
 *
 * @author 1daw
 */
public class Fraccion {
    private double nominador, denominador;

    public Fraccion(double nominador, double denominador)throws Exception{
        this.nominador = nominador;
        this.denominador = denominador;
        try {
            if(denominador == 0){
                throw new FraccionException ("denominador cero");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public double Sumar(){
        double resultado = 0;
        resultado = nominador + denominador;
        return resultado;
    }
    
    public double Restar(){
        double resultado = 0;
        resultado = nominador - denominador;
        return resultado;
    }
    
    public double Multiplicar(){
        double resultado = 0;
        resultado = nominador * denominador;
        return resultado;
    }
    
    public double Dividir(){
        double resultado = 0;
        resultado = nominador / denominador;
        return resultado;
    }
    
    public static void main(String[] args) throws FraccionException, Exception{
        Scanner sc = new Scanner(System.in);
        double n = 0, d = 0;
        System.out.println("Introduce numerador: ");
        n = sc.nextDouble();
         System.out.println("Introduce denominador: ");
        d = sc.nextDouble();
        Fraccion f = new Fraccion(d, n);
        System.out.println(f.Sumar());
        try {
            if(d == 0){
                System.out.println(f.Dividir());
                throw new FraccionException ("Esto es una division con denominador cero");
            }else if(n == 0){
                System.out.println(f.Dividir());
                throw new FraccionException ("Esto es una division con numerador cero");
            }else if(d == 0){
                System.out.println(f.Sumar());
                throw new FraccionException ("Esto es una operacion con denominador cero");
            }
            //TODO falta los dos siguientes apartados
        } catch (FraccionException e) {
            System.err.println(e.GetException());
        }
    }
}
