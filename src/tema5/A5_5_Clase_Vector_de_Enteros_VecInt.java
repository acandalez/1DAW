/*
 Definir una clase llamada VectInt según la siguiente definición:

Atributos

Tendrá un único atributo privado que será un array de números enteros que, en principio, podrá ser de cualquier tamaño.


Constructores

Tendrá un único constructor con un parámetro de tipo entero que indicará el número de elementos del array

Métodos

 

cargar() leerá por teclado los valores de todos los elementos del array

cargar(int a, int b) asignará a los elementos del array valores aleatorios entre a y b

promedio() devolverá un double que será el valor promedio de todos los valores

moda() devolverá un entero que será el valor que más se repite

suma() devolverá el resultado de sumar todos los elementos del array

toString() devolverá un String con los valores del array con el formato (v1, v2, v3, ...., vn)
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author 1daw
 */
public class A5_5_Clase_Vector_de_Enteros_VecInt {
    private int [] vecint; 

    public A5_5_Clase_Vector_de_Enteros_VecInt(int i) {
        vecint = new int[10];
    }
    
    public void cargar(){
        System.out.println("Introducir datos");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < vecint.length; i++){
            System.out.println("Introduzca el valor"+(i+1));
            vecint[i]= sc.nextInt();
        }
    }
    
    public void cargar(int x, int y){
        for(int i = 0; i < vecint.length; i++){
        vecint[i] =(int) (Math.random()*(x-y)+1);
        }
    }
    
    public int suma(){
        int suma = 0;
        for(int i = 0; i < vecint.length; i++){
            suma = suma + vecint[i];
        }
       return suma;
    }
    
    public double promedio(){
        return suma()/vecint.length;
    }
    
    private int repeticiones(int n){
        //recive un numero como parametro y te va a decir cuantas veces lo a 
        //recivido para pasarlo al vector
        int cont = 0;
        for(int i = 0; i < vecint.length; i++){
            if(vecint[i]==n){
                cont++;
            }
        }
        return cont;
    }
    
    public double moda(){
        //lo que vamos a hacer es recorrer el vector y ver cuantas repeticiones 
        //hay y que numero es.
        int rep = 0, moda = 0;
        
        for(int i = 0; i < vecint.length; i++){
            int aux = repeticiones(vecint[i]);
            
            if(aux>rep){
                rep = aux;
                moda=vecint[i];
            }
        }
        return moda;
    }
    public String toString(){
        String str = "(";
        for(int i = 0; i < vecint.length; i++){
            str = str + vecint[i];
            if(1 ==(vecint.length - 1)){
                str = str + ")";
            }else{
                str = str + ", ";
            }
        }
        return str;
    }
}
