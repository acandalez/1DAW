/*
Escriba un programa simule varios lanzamientos de un dado y muestre la  
frecuencia de cada una de las caras así como la proporción del número de 
veces que haya salido cada cara con respecto al total. Para ello simule 6000 
lanzamientos de un dado utilizando la función Math.random()*6 para simular  cada
lanzamiento.

NOTA: Almacenar los lanzamientos del dado en un array
 */
package tema5;

public class A5_7_El_dado {

    private int[] dado;
    
    public A5_7_El_dado() {
        dado = new int[6];
    }
    public void lanzamiento (){
        System.out.println("Lanzamientos: ");
        int x = 1;
        int y = 6;
        for (int i = 0; i < 6000; i++){
            dado[i] = (int)Math.floor(Math.random()*(x - (y + 1)) + (y));
        }
    }
    public void repeticiones(){
        //recive un numero como parametro y te va a decir cuantas veces lo a 
        //recivido para pasarlo al vector
        int l1 = 0, l2 = 0, l3 = 0, l4 = 0, l5 = 0, l6 = 0;
        for(int i = 0; i < 6000; i++){
            if(dado[i]==1){
                l1++;
            }else if(dado[i]==2){
                l2++;
            }else if(dado[i]==3){
                l3++;
            }else if(dado[i]==4){
                l4++;
            }else if(dado[i]==5){
                l5++;
            }else if(dado[i]==6){
                l6++;
            }
        }
        System.out.println("Hay "+ l1 + " del lado 1");
        System.out.println("Hay "+ l2 + " del lado 2");
        System.out.println("Hay "+ l3 + " del lado 3");
        System.out.println("Hay "+ l4 + " del lado 4");
        System.out.println("Hay "+ l5 + " del lado 5");
        System.out.println("Hay "+ l6 + " del lado 6");
    }
    
}
