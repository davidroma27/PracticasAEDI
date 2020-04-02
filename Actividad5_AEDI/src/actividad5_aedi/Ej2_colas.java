package actividad5_aedi;
import cola.*;

/**
 * * @author david
 * 
 */
public class Ej2_colas {
    
    public Integer escogeSoldado(Cola<Integer> soldados, int n, int m){
        //Modifica: soldados
        //Produce: un entero que resulta después de aplicar el algoritmo de josephus
        
        for (int i = 1; i <= n; i++) {
            soldados.insertar(i);
        }
        
        while (soldados.tamaño() > 1) {
            int i = 1; 
            
            while (i < m) {
                soldados.insertar(soldados.suprimir());
                i = i + 1;
            }
            soldados.suprimir();
        }
        int elegido = soldados.primero();
        System.out.println("Soldado elegido: " + elegido);
        return null;
    }
}
