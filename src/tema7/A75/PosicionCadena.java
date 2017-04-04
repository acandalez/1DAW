/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7.A75;

import java.util.Scanner;

/**
 *
 * @author 1daw
 */
public class PosicionCadena {

    /**
     * @param pos
     * @param cad
     * @param args the command line arguments
     */
    public static void caracterEn(int pos, String cad) throws Exception{
        if(pos >=0 && pos <= cad.length()){
            throw new Exception("Bien!");
        }else{
            throw new Exception( "Has intentado recuperar una posición  de la cadena de caracteres que no existe");
        }
    }
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra: ");
        int pos = 7;
        String cad = sc.next();
        caracterEn(pos,cad);
       
    }
    
}
