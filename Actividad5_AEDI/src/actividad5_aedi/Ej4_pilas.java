package actividad5_aedi;
import pila.*;

/**
 * @author david
 * 
 * Convertir un entero en base 10 a un entero en base 2 y mostrar el resultado.
 * 
 */
public class Ej4_pilas {
    
    public void cambioBase(int n){
        int num = n;
        Pila p = new EnlazadaPila();
                
        while(n > 0){
            p.push(n % 2);
            n = n/2;
        }
        
        System.out.print("Numero: " + num + ", ");
        while(!p.esVacio()){
            System.out.print(p.pop());
        }
        System.out.println("\n");
    }
}
