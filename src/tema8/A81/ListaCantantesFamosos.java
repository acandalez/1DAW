/*
 *Crea una clase denominada ListaCantantesFamosos que al ser inicializada 
contenga un ArrayList con tres Strings que sean el nombre de cantantes famosos. 
Crea una clase test con el método main que inicialice un objeto ListaCantantesFamosos,
pida dos cantantes famosos más al usuario, los añada a la lista y muestre el contenido
de la lista por pantalla. 
 */
package tema8.A81;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 1daw
 */
public class ListaCantantesFamosos {
    private String cantantesLista;
    private ArrayList<String> listaCantantes;

    public ListaCantantesFamosos() {
        listaCantantes = new ArrayList<String>();
        listaCantantes.add ("juan");
        listaCantantes.add ("pedro");
        listaCantantes.add ("rosa");
    }
    
    public ListaCantantesFamosos (String cantantesLista) {
        this.cantantesLista=cantantesLista;
        listaCantantes = new ArrayList<String>();
    }
    
    //Añade nombres a la ArrayList
    public void addNombre (String valor_nombre){

        listaCantantes.add (valor_nombre);
    }
    
    public String getNombre (int posicion){
        if (posicion >= 0 && posicion < listaCantantes.size()){
            return listaCantantes.get(posicion);
        }else{
            return "no existe el nombre en la posicion señalada";
        }
    }
    
    public String getNombres (){
       
            return listaCantantes.toString();
        
    }
    
    //Obtiene el tamaño de la ArrayList
    public int getTamaño(){
        return listaCantantes.size();
    }
    //Elimina elemento del ArrayList de n posicion
    public void removeNombre(int posicion){
        if (posicion >= 0 && posicion < listaCantantes.size() ){
            listaCantantes.remove(posicion);
        }
    }
    
    public static void main(String[] args) {
        ListaCantantesFamosos lista = new ListaCantantesFamosos();
        System.out.println(lista.getNombres());
    }
}
