/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7.A79;

/**
 *
 * @author 1daw
 */
public class FraccionException extends Exception{
    private String exception;

    public FraccionException(String exception) {
        this.exception = exception;
    }
    
    public String GetException(){
        return exception;
    }
}
