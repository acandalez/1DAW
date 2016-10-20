/*
A3.8. Sentencias alternativas. Postulante

Un postulante a un empleo, realiza un test de capacitación, se obtuvo la 
siguiente información: cantidad total de preguntas que se le realizaron y la 
cantidad de preguntas que contestó correctamente. Se pide confeccionar un 
programa que ingrese los dos datos por teclado e informe el nivel del mismo 
según el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:
        Nivel máximo:	Porcentaje>=90%.
	Nivel medio:	Porcentaje>=75% y <90%.
	Nivel regular:	Porcentaje>=50% y <75%.
	Fuera de nivel:	Porcentaje<50%.
 */
package tema3;

import java.util.Scanner;

/**
 *
 * @author 1daw
 */
public class Postulante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nPreguntas, npCorrectas, iResultado;
        
         Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de preguntas realizadas");
        nPreguntas=sc.nextInt();
        System.out.println("Ingrese el numero de preguntas acertadas");
        npCorrectas=sc.nextInt();
        // TODO Mirar la formula ya que no concuerda
        iResultado=(npCorrectas / nPreguntas) *100;
        if(iResultado >=90){
            System.out.println("NMaximo " +iResultado);
        }else if(iResultado >=75 && iResultado<90){
            System.out.println("NMedio " +iResultado);
        }else if(iResultado >=50 && iResultado<75){
            System.out.println("NRegular "+iResultado);
        }else if(iResultado <50){
            System.out.println("FNivel " +iResultado);
        }
        
        
    }
    
}
