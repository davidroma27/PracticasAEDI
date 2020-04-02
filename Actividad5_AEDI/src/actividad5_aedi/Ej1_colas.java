package actividad5_aedi;
import cola.*;

/**
 * @author david
 * 
 */
public class Ej1_colas {
    
    public <E> void concatenar(Cola<E> q1, Cola<E> q2){
        // Modifica: q1 y q2
        // Produce: añade q2 a q1, dejando q2 vacía
        
        while(!q2.esVacio()){
            q1.insertar(q2.suprimir());
        }
        
        System.out.print("Concatenación --> Cola 1: ");
        while(!q1.esVacio()) System.out.print(q1.suprimir());
        System.out.println("\n");
    }
    
    public <E> Cola<E> barajar (Cola<E> q1, Cola<E> q2){
        //Modifica: q1, q2
        /*Produce: mezcla los elementos de q1 con los elementos de q2, de manera que los
        elementos de q2 ocupen posiciones impares y los elementos de q1 ocupen las
        posiciones pares. q1 y q2 quedan vacías*/
        
        Cola<E> q3 = new EnlazadaCola();
        
        while(!q1.esVacio() && !q2.esVacio()){
            q3.insertar(q2.suprimir());
            q3.insertar(q1.suprimir());
        }
        return q3;
    }
}
