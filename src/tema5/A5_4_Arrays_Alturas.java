/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.Scanner;

/**
 *
 *Definir una clase llamada Alturas con un único atributo que sea un array de 5
 * componentes de tipo float que representen las alturas de 5 personas.

Definir el constructor sin parámetros y el constructor con 5 parámetros

Implementar además los siguientes métodos:

cargar() leerá por teclado las 5 alturas y las asignará al array

calcularPromedio() devolverá el valor promedio de las 5 alturas

mayoresPromedio() devolverá cuántas personas son más altas que el promedio

menoresPromedio() devolverá cuántas personas son más bajas que el promedio


Implementar un programa main que pruebe dicha clase, llamando a todos sus 
* métodos y mostrando los resultados.
 */
public class A5_4_Arrays_Alturas {
    public float[] altura = new float[5];
    

    public A5_4_Arrays_Alturas() {
    }
    
    public A5_4_Arrays_Alturas(float Altura1, float Altura2, float Altura3,
            float Altura4, float Altura5) {
        this.altura[1]=Altura1;
        this.altura[2]=Altura2;
        this.altura[3]=Altura3;
        this.altura[4]=Altura4;
        this.altura[5]=Altura5;
    }
   
    public void cargar(){
    
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        float alturassc;
        float alturasTotales = 0;
        for(int i = 0; i < altura.length; i++){
            System.out.println("Introduce la altura : ");
            alturassc = sc.nextFloat();
            altura[i] = alturassc;
            cont++;
            alturasTotales = alturasTotales + alturassc;
        }
        
    } 
    public float calcularPromedio(float promedio){
        float contador = 0, acumulador = 0;
        float alturasTotales = 0;
        for(int i = 0; i < altura.length; i++){
            altura[i]=alturasTotales;
            promedio = alturasTotales / 5;
        }
         return promedio;
    }
    public float mayoresPromedio(float mayorPromedio){
        float alturassc = 0;
        float promedio = 0;
        for (int i = 0; i < altura.length; i++ ){
            if(alturassc>promedio){
                mayorPromedio++;
            }
        }
        return mayorPromedio;
    }
    public float menoresPromedio(float menorPromedio){
        float alturassc = 0;
        float promedio = 0;
        for (int i = 0; i < altura.length; i++ ){
            if(alturassc<promedio){
                menorPromedio++;
            }
        }
        return menorPromedio;
    }
     
    
}
