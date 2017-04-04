/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

/**
 *
 * @author 1daw
 */
public class Email {

    private String email;

    public Email(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public boolean esCorrecto(){
        String sub;
        int arroba = email.indexOf('@');
        if(arroba == -1){
            return false;
        }
        sub = email.substring(arroba+1);
        if(sub.indexOf(".")==-1){
            return false;
        }
        return true;
    }
    
}
