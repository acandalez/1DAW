/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.A_91;

import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author 1daw
 */
public class EscribirFichero {
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("D:\\1DAW\\fichero.txt");
           /* f.write("Uno");
            f.write("\nDos");
            f.close();*/
            f = new FileWriter("D:\\1DAW\\fichero.txt", true);
          /*  f.write("\nTres");
            f.close();*/
            
            System.out.println("Introduzca frases: ");
            Scanner sc = new Scanner(System.in);
            String s = "";
            while(!s.equals("fin")){//si es distinto de fin entra.
                s = sc.next();
                f.write(s);
            }
            f.close();
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
