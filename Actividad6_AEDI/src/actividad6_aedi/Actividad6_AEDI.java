package actividad6_aedi;

import Ej4_listas.CD;
import Ej4_listas.Cancion;
import Ej4_listas.Ej4_listas;
import cola.*;
import lista.*;

/**
 *
 * @author david
 */
public class Actividad6_AEDI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("-----------------Ejercicio 1-----------------");
        
        Ej1_listas ej1 = new Ej1_listas();
        Lista<Integer> l1 = new ListaEnlazada<>();
        for(int i=0; i<10; i++){
            l1.insertarPrincipio((int)(Math.random()*10));
        }
        
        Lista<Integer> l2 = ej1.devuelveInt(l1, 5);
        System.out.print("Los mayores son: ");
        for(Integer i:l2){
        System.out.print(i + " ");
        }
        
        System.out.println("\n=============================================\n");
        
        System.out.println("-----------------Ejercicio 2-----------------");
        Ej2_listas ej2 = new Ej2_listas();
        Lista<Integer> origen = new ListaEnlazada<>();
        for(int i=0; i<10; i++){
            origen.insertarFinal(i);
        }
        Lista<Integer> l3 = ej2.inversa(origen);
        System.out.print("Lista invertida: ");
        for(Integer i:l3){
            System.out.print(i + " ");
        }
        
        System.out.println("\n=============================================\n");
        
        System.out.println("-----------------Ejercicio 3-----------------");
        Ej3_listas ej3 = new Ej3_listas();
        Lista<Integer> num = new ListaEnlazada<>();
        for(int i=0; i<10; i++){
            num.insertarFinal(i);
        }
        
        System.out.println(ej3.igualVeces(num));
        
        
        System.out.println("\n=============================================\n");
        
        System.out.println("-----------------Ejercicio 4-----------------");
        Ej4_listas ej4 = new Ej4_listas();
        Cola<CD> cargador = new EnlazadaCola();
        Cancion c1 = new Cancion("Cancion1", 120);
        Cancion c2= new Cancion("Cancion2", 165);
        Cancion c3 = new Cancion("Cancion3", 174);
        Cancion c4 = new Cancion("Cancion4", 252);
        Lista<Cancion> canciones = new ListaEnlazada();
        canciones.insertarFinal(c1);
        canciones.insertarFinal(c2);
        canciones.insertarFinal(c3);
        canciones.insertarFinal(c4);
        CD cd = new CD("Autor", "CD1", canciones);
        cargador.insertar(cd);
        System.out.println(ej4.duracionTotal(cargador));
    }
    
}
