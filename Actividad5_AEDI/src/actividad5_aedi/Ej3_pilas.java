package actividad5_aedi;
import pila.*;

/**
 *
 * @author david
 */
public class Ej3_pilas {
        
    public <E> E desapilarElemento (Pila<E> p, int n) throws IllegalArgumentException {
        //Modifica: p
        //Produce: devuelve y elimina el elemento que está en la posición n de la pila, empezando
        //desde el tope; si no es posible, lanza la excepción IllegalArgumentException
        int actual = 0;
        E elem = p.top();
        
        while(actual != n){
            Pila<E> aux = new EnlazadaPila<>();
            
            elem = p.pop();
            aux.push(elem);
            
            if(actual == n){
                elem = p.pop();
            }
            actual++;
        }
        System.out.println("Elem in position " + n + ": " + elem);
        return elem;
    }
}
