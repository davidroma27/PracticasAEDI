package actividad6_aedi;

import lista.*;

/**
 * @author david
 * Escribe un método que dada una lista de elementos devuelva cierto si todos los
 * elementos aparecen igual número de veces. Se puede resolver con más de un método
 */
public class Ej3_listas {
    
    public int numVeces(Lista<Integer> elem, int num){
        int numVeces = 0;
        for(Integer i: elem){
           if(i.equals(num)){
               numVeces++;
           }
        }
        return numVeces;
    }
    
    public boolean igualVeces(Lista<Integer> elem){
        int veces = 0;
        for(Integer i: elem){
            veces = numVeces(elem, i);
        }
        
        while(elem.iteradorLista().hasNext()){
            return numVeces(elem, elem.iteradorLista().next()) == veces;
        }
        return false;
    }
}
