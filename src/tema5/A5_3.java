/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.Scanner;

/**
 *
 Realizar un programa que lea por teclado la nota de los alumnos de una clase y
 * calcula la nota media del grupo. También muestra los alumnos con notas superiores
 * a la media. El número de alumnos se lee por teclado.
Este programa utiliza un array de elementos de tipo double que contendrá las
* notas de los alumnos. 
El tamaño del array será el número de alumnos de la clase, por lo tanto primero 
* se pedirá por teclado el número de alumnos y a continuación se creará el array.
Se realizan 3 recorridos sobre el array, el primero para asignar a cada elemento 
* las notas introducidas por teclado, el segundo para sumarlas y calcular la media 
* y el tercero para mostrar los alumnos con notas superiores a la media.
 */
public class A5_3 {
    private double[] nota;

    public A5_3() {
    }

    public A5_3(double[] nota) {
        setNota(nota);
    }
    public void medianota (){
       Scanner sc = new Scanner(System.in);
        //Asignamos el valor al Array.
        System.out.println("Introduce el numero de alumnos: ");
        int nAlumnos = 0;
        nAlumnos = sc.nextInt();
        double[] nota = new double[nAlumnos];
        
        double notasc = 0, promedio = 0, notastotales = 0;
        int cont = 0, cont2 = 0;
        
        for(int i = 0; i< nota.length; i++){
            System.out.print(i+1+ ". Introduce su nota: ");
            notasc = sc.nextDouble();
            nota[i]= notasc;
            cont++;
            notastotales=notastotales+notasc;    
        }
        promedio = notastotales/cont;
        System.out.println("El promedio es: "+promedio);
        for(int i = 0; i< nota.length; i++){
            if(nota[i]>promedio){
                cont2++;
            }
        }
        System.out.println("Los alumnos con nota mayor al promedio son: "+cont2);
    }
    public double[] getNota() {
        return nota;
    }

    public void setNota(double[] nota) {
        this.nota = nota;
    }
    
}
