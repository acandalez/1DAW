/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.A_92;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author 1daw
 */
public class FicheroExiste {
    public static Scanner sc, scr ;
    
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Introduzca el fichero a leer: ");
        try {
            String url = sc.next();
            File f = new File(url);
            if(! f.exists()){
                System.out.println("Fichero no encontrado");
                return;
            }else{
                scr = new Scanner(f);
                while (scr.hasNext()){
                    System.out.println(scr.nextLine());
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
