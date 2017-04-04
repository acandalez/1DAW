
package tema7.A74;




public class ParImpar {

    public static void main(String[] args) throws Exception {
        int numeroR = (int) (Math.random() * 999);
        int numero = numeroR%2;
        
            if(numero == 0){
                throw new Exception("El numero: "+numeroR+" es par");
            }else{
                throw new Exception("El numero: "+numeroR+" es impar");
            }
            
        
    }
    
}
