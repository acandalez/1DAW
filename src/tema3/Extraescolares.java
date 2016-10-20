
package tema3;

import java.util.Scanner;

/**
 *
 * @author 1daw
 */
public class Extraescolares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner sc = new Scanner(System.in);
        String  actividad = "" ,dia, semana = "";
         
        System.out.print("Introduzca dia de la semana en minusculas y sin "
                + "tildes: ");
        
        //Guarda el numero que se escribe en consola el usuario y transforma
        //el dato a minuscula
        semana=sc.nextLine();
        semana = semana.toLowerCase();
        
        switch(semana){
            case "lunes":
                actividad="Psicomotricidad";
                break;
            
            case "martes":
                actividad="Natación";
                break;
            case "miercoles":
                actividad="Música";
                break;
            case "jueves":
                actividad="Natación";
                break;
            case "viernes":
                actividad="Descanso";
                break;
            case "sabado":
                actividad="Día sin actividades";
                break;
            case "domingo":
                actividad="Día sin actividades";
                break;
            default:
                System.out.println("Día Erroneo");
                break;
        }
        if(actividad !=""){System.out.println("El día "+semana+ " tiene "+actividad);}
        
    }
    
}
