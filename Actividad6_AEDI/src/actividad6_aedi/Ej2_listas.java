package actividad6_aedi;

import lista.*;

/**
 * @author david
 * Escribe un método que dada una lista L devuelva otra lista I, inversa de L.
 */
public class Ej2_listas {
    
    public Lista<Integer> inversa(Lista<Integer> origen){
        
        Lista<Integer> inversa = new ListaEnlazada<>();
        for(Integer i: origen){
            inversa.insertarPrincipio(i);
        }
        return inversa;
    }
}
