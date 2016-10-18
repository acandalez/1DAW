
package tema2;

public class Par_Impar {

    
    public static void main(String[] args) {
        
        int iVariable = 10;
        String parimpar; 
       parimpar = (iVariable %2==0)?"Es Par":"Es Impar";
        System.out.println("iVariable"+"("+iVariable+"): "  + parimpar);
        
    }
    
}
