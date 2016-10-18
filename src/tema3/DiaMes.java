/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;


import java.util.Scanner;

/**
 *
 * @author 1daw
 */
public class DiaMes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int seleccion;
        Scanner sc = new Scanner(System.in);
        System.out.print("Seleccione un mes del año por medio de valor "
                + "numerico del 1 al 12: ");
        seleccion = sc.nextInt();
        if(seleccion<=12){
        if(seleccion==1){ System.out.println("Enero tiene 31 dias"); }
        if(seleccion==2){ System.out.println("Febrero tiene 28 dias"); }
        if(seleccion==3){ System.out.println("Marzo tiene 31 dias"); }
        if(seleccion==4){ System.out.println("Abril tiene 30 dias"); }
        if(seleccion==5){ System.out.println("Mayo tiene 31 dias"); }
        if(seleccion==6){ System.out.println("Junio tiene 30 dias"); }
        if(seleccion==7){ System.out.println("Julio tiene 31 dias"); }
        if(seleccion==8){ System.out.println("Agosto tiene 31 dias"); }
        if(seleccion==9){ System.out.println("Septiembre tiene 30 dias"); }
        if(seleccion==10){ System.out.println("Octubre tiene 31 dias"); }
        if(seleccion==11){ System.out.println("Noviembre tiene 30 dias"); }
        if(seleccion==12){ System.out.println("Diciembre tiene 31 dias"); }
        }else{System.out.println("El mes seleccionado no existe");}
    }   
    
}
