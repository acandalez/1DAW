/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.A_93;

import java.io.*;

/**
 *
 * @author 1daw
 */
public class TransformarContFichero {

    /*Verificamos si el fichero existe mostrarlo y listarlo*/
    public static void verificarFichero(File f){
        if ((f.isDirectory() && f.exists())){
            for (String s : f.list()){
                System.out.println(s);
            }
        }
    }
    
    public static String[] leerFichero(File f){
        String[] lineasFichero = null;
        if((f == null)&& (!f.isFile())){
            try {
                f.createNewFile();  
            } catch (IOException e) {
                System.out.println("Error al crear el fichero"); 
           }
        }
        FileReader fr = null;
        BufferedReader br = null;
        String linea;
        int i = 0;//lo que vamos a almacenar en la array para transformarlo
        try {
            fr = new FileReader(f);
            br = new BufferedReader(br);
            while((linea = br.readLine()) != null){
                lineasFichero[i] = linea;
                i++;
            }
        } catch (FileNotFoundException e) {
        }catch (IOException e){
        }finally {
            try {
                if (br != null){
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return lineasFichero;
    }
    
}
