package actividad3_aedi;

/**
 *
 * @author david
 */
public class Actividad3_AEDI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Estructura doblemente enlazada con centinelas");
        DoblementeEnlazadaCentinelas dec = new DoblementeEnlazadaCentinelas();
        
        dec.insertarPrincipio(1);
        dec.insertarFinal(8);
        dec.insertarFinal(5);
        dec.insertarFinal(3);
        dec.insertarFinal(10);
        
        System.out.println(dec.toString());
        
        System.out.println("\nNumero de elementos: " + dec.numElem());
        System.out.println("Numero de veces nº 1: " + dec.numVeces(1));
        System.out.println("Está el elemento 8? " + dec.esta(8));
        
        //Borrar un elemento
        dec.borrar(8);
        
        System.out.println("\nDespues de borrar:");
        System.out.println(dec.toString());
        System.out.println("\nNumero de elementos: " + dec.numElem());
        System.out.println("Numero de veces nº 1: " + dec.numVeces(1));
        System.out.println("Está el elemento 8? " + dec.esta(8));
        
        System.out.println("------------------------------------------------\n");
        
        System.out.println("Estructura doblemente enlazada circular con centinela");
        DoblementeEnlazadaCircularConCentinelas decc = new DoblementeEnlazadaCircularConCentinelas();
        
        decc.insertarPrincipio(1);
        decc.insertarFinal(8);
        decc.insertarFinal(5);
        decc.insertarFinal(3);
        decc.insertarFinal(10);
        
        System.out.println(decc.toString());
        
        System.out.println("\nNumero de elementos: " + decc.numElem());
        System.out.println("Numero de veces nº 1: " + decc.numVeces(1));
        
        decc.borrar(8);
        
        System.out.println("\nDespues de borrar:");
        System.out.println(decc.toString());
        System.out.println("\nNumero de elementos: " + decc.numElem());
        System.out.println("Numero de veces nº 1: " + decc.numVeces(1));
        
        System.out.println("------------------------------------------------\n");
        
        System.out.println("Estructura ordenada centinela");
        OrdenadaEnlazadaCentinela oec = new OrdenadaEnlazadaCentinela();
        
        oec.insertar(1);
        oec.insertar(8);
        oec.insertar(5);
        oec.insertar(3);
        oec.insertar(10);
        
        System.out.println(oec.toString());
        
        System.out.println("\nNumero de elementos: " + oec.numElem());
        System.out.println("Está el elemento 8? " + oec.esta(8));
        
        oec.borrar(8);
        
        System.out.println("\nDespues de borrar:");
        System.out.println(oec.toString());
        System.out.println("\nNumero de elementos: " + oec.numElem());
        System.out.println("Está el elemento 8? " + oec.esta(8));
        
    }
}
