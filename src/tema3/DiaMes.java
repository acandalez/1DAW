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
        if(seleccion<12 || seleccion <= 1 ){
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
    /*
     Scanner sc = new Scanner(System.in);
        int mes;
        System.out.print("Introduzca número de mes: ");
        mes =  sc.nextInt();
        if(mes < 1 || mes > 12) //se comprueba que el valor del mes es correcto
            System.out.println("Mes incorrecto");
        else{  //si el mes es correcto
            switch(mes){  //se muestra el nombre mediante una instrucción switch
                case 1: System.out.print("Enero");
                        break;
                case 2: System.out.print("Febrero");
                        break;
                case 3: System.out.print("Marzo");
                        break;
                case 4: System.out.print("Abril");
                        break;
                case 5: System.out.print("Mayo");
                        break;
                case 6: System.out.print("Junio");
                        break;
                case 7: System.out.print("Julio");
                        break;
                case 8: System.out.print("Agosto");
                        break;
                case 9: System.out.print("Septiembre");
                        break;
                case 10: System.out.print("Octubre");
                        break;
                case 11: System.out.print("Noviembre");
                        break;
                case 12: System.out.print("Diciembre");
                        break;
            }
            // mostrar si es un mes de 30, 31 0 28 días
            if(mes == 4 || mes == 6 || mes == 9 || mes == 11)       
               System.out.println(" es un mes de 30 días");
            else if(mes == 2)
                     System.out.println(" es un mes de 28 días");
                   else
                      System.out.println(" es un mes de 31 días");
        }
    */
}
