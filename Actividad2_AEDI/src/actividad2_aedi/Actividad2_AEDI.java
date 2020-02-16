/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad2_aedi;

/**
 *
 * @author david
 */
public class Actividad2_AEDI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Creamos una estructura enlazada simple
        EnlazadaSimple2Refer e = new  EnlazadaSimple2Refer();
        
        e.insertarPrincipio(1);
        e.insertarFinal(8);
        e.insertarFinal(5);
        e.insertarFinal(3);
        e.insertarFinal(10);
        
        System.out.println(e.toString());
        
        System.out.println("Numero de elementos: " + e.numElem());
        System.out.println("Numero veces: " + e.numVeces(1));
        System.out.println("El elemento esta? " + e.esta(1));
        
        //Borrar un elemento
        e.borrar(1);
        
        System.out.println("\nDespues de borrar:");
        System.out.println("Numero de elementos: " + e.numElem());
        System.out.println("Numero veces: " + e.numVeces(1));
        System.out.println("El elemento esta? " + e.esta(1));
    }
    
}
