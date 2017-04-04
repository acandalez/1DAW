/*
menor_pos = 0

mayor_pos = N

medio_pos = (menor_pos + mayor_pos) / 2

while (menor_pos <= mayor_pos AND vector[medio_pos] != valor) {

if (valor < vector[medio_pos])

mayor_pos = medio_pos -1;

else

menor_pos = medio_pos +1;

medio_pos = (menor_pos + mayor_pos)/2
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author 1daw
 */
public class BusquedaBinaria {
    
    public static void buscando (int[]A){
        Scanner sc = new Scanner(System.in);
        int n= 0, menor_pos = 0, valor = 0;
        System.out.println("Introduce el tamaño del Array: ");
        valor = sc.nextInt();
        int mayor_pos = A.length;
        int medio_pos = (menor_pos + mayor_pos) / 2;
        while (menor_pos <= mayor_pos && A[medio_pos] != valor) {
            if(valor < A[medio_pos]){
                mayor_pos = medio_pos -1;
            }else{
                menor_pos = medio_pos +1;
            }
            medio_pos = (medio_pos + mayor_pos) / 2;
        }
        for(int i = 0; i < A.length; i++){
            if(n==A[i]){
                System.out.println("Esta en la posición "+(i+1));
                break;//cuando lo encuentre se salga del for
            }else if(i == A.length-1){
                System.out.println("Numero no encontrado");
            }
        }
    }
    
    
    
}
