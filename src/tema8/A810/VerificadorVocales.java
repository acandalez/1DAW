/*
Crea una clase denominada VerificadorVocales con un método capaz de recibir una
cadena y una vocal y devolver un resultado que será 1 si el número de la vocal
pasada como parámetro es par (hay equilibrio en esa vocal), -1 si el número de
la vocal pasada como parámetro es impar (no hay equilibrio en esa vocal) ó 0 
(no existe esa vocal en la cadena). Para ello debes utilizar una pila (Stack).

Crea una clase con el método main donde se pida al usuario una cadena y se le 
devuelva un mensaje informativo sobre si el números de a’s, e’s, i’s, o’s, u’s es 
par o impar. El programa debe dar opción al usuario a seguir introduciendo 
cadenas si lo desea.
 */
package tema8.A810;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author 1daw
 */
public class VerificadorVocales {
    public static int verificaVocales(String cadena, char vocal){
        Stack<String> pila = new Stack<String>();
        int i = 0;
        boolean flag = false;
        while(i < cadena.length()){
            
            if(cadena.charAt(i)==vocal){
               if(pila.empty()){
                 pila.add("Si");
                 flag=true;
               }else{
                   pila.pop();
               }  
            }
        }
        if(!flag){
            return 0;
        }
        if(pila.empty()){
            return 1;
        }else{
            return -1;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que cadena desea analizar?");
        String cadena = sc.next();
        
        int r1 = verificaVocales(cadena, 'a');
        int r2 = verificaVocales(cadena, 'e');
        int r3 = verificaVocales(cadena, 'i');
        int r4 = verificaVocales(cadena, 'o');
        int r5 = verificaVocales(cadena, 'u');
        
        if(r1==-1){
            System.out.println("Par");
        }else if(r1 == 0){
            System.out.println("0, ");
        }else{
            System.out.println("Impar");
        }
        if(r2==-1){
            System.out.println("Par");
        }else if(r2 == 0){
            System.out.println("0, ");
        }else{
            System.out.println("Impar");
        }
        if(r3==-1){
            System.out.println("Par");
        }else if(r3 == 0){
            System.out.println("0, ");
        }else{
            System.out.println("Impar");
        }
        if(r4==-1){
            System.out.println("Par");
        }else if(r4 == 0){
            System.out.println("0, ");
        }else{
            System.out.println("Impar");
        }
        if(r5==-1){
            System.out.println("Par");
        }else if(r5 == 0){
            System.out.println("0, ");
        }else{
            System.out.println("Impar");
        }
        
        System.out.println("Desea analizar otra cadena? ");
        cadena = sc.nextLine();
        
    }
}
