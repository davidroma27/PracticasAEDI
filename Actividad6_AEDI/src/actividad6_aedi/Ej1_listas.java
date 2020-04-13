package actividad6_aedi;

import lista.*;

/**
 * @author david
 * Escribe un método que dada una lista de enteros L y un número num, devuelva otra
 * lista conteniendo los elementos de L mayores a dicho número
 */
public class Ej1_listas {
    
    public Lista<Integer> devuelveInt(Lista<Integer> l1, int num){
        Lista<Integer> l2 = new ListaEnlazada<>();
        
        for(Integer i: l1){
            if(i > num){
                l2.insertarPrincipio(i);
                
            }
        }
        return l2;
    }
}
