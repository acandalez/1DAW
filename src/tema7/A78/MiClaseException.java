/*
A7.8. Mi propia excepción 1

Cree su propia clase de excepción utilizando la palabra clave extends. Escriba 
un constructor para dicha clase que tome un argumento String y lo almacene dentro
del objeto como una referencia de tipo String. Escriba un método que muestre la 
cadena de caracteres almacenada. Cree una cláusula try-catch para probar la nueva 
excepción.
 */
package tema7.A78;

/**
 *
 * @author 1daw
 */
public class MiClaseException extends Exception{
    private String cad;

    public MiClaseException(String cad) {
        this.cad = cad;
    }
    
    public String getCad(){
        return cad;
    }
    
    public static void main(String[] args) throws MiClaseException {
        try
        {
            //lanzamos una excepcion.
            throw new MiClaseException("Esto es una excepcion de MiClaseException");
        } catch (MiClaseException e)
        {
            //mostramos el texto de la excepcion.
            System.out.println(e.getCad());
        }
    }
}
