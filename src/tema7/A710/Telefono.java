/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7.A710;

/**
 *
 * @author 1daw
 */
class Telefono {
    String[] prefijo;
    String numero;

    public Telefono(String numero) throws Exception {
        if(numero.length() != 9 ){
            throw new Exception(numero+" numero incorrecto.");
        }
        this.numero=numero;
    }

    
    public Telefono(String numero, String prefijo) throws Exception {
       String primero = prefijo.substring(0,1);//le decimos que recoja el primer cero
       String segundo = prefijo.substring(0,2);//le decimos que recoja el segundo cero
       
       if(primero.equals("+") && prefijo.length()==3 || segundo.equals("00") && prefijo.length()==4){
           this.prefijo = new String[]{"+34"};
           this.numero = numero;
        }else{
           throw new Exception("Prefijo Incorrecto.");
       }
        
        if(numero.length() != 9 ){
            throw new Exception(numero+" numero incorrecto.");
        }
        
        
    }
    
}
