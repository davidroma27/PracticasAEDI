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
public class EnlazadaSimple2Refer {

    private Nodo primero, ultimo; //Creamos las referencias que apuntan al primer y ultimo nodo
    private int numElem; //Variable que almacena el numero de elementos que tiene la lista

    public EnlazadaSimple2Refer() {
        primero =  null; //Inicializamos las referencias a null (Estructura vacia)
        ultimo = null;
        numElem = 0;
    }

    public int numElem() { //Devuelve el numero de elementos de la lista
        return numElem;
    }

    public int numVeces(int elem) { //Devuelve el numero de veces que aparece un elemento
        int numVeces = 0;

        for (Nodo actual = primero; actual != null; actual = actual.getSig()) { //Recorremos la lista hasta el final
            if (actual.getElem() == elem) { //Si el elemento que apunta actual es igual al elemento a buscar
                numVeces++; //Incrementamos las veces en 1
            }
        }
        return numVeces;
    }

    public boolean esta(int elem) { //Devuelve true si el elemento esta en la lista
        Nodo actual = primero;

        while (actual != null && actual.getElem() != elem) { //Mientras actual no sea null y sea distinto del elemento buscado
            actual = actual.getSig(); //Pasa al siguiente elemento
        }

        return actual != null; //Devuelve el elemento buscado que no sea null
        /**
         * Es equivalente a:
         *
         * if(actual != null) return true; else return false;
         */
    }

    public void insertarPrincipio(int elem) {
        Nodo nuevo = new Nodo(elem, null); //Creamos un nuevo nodo que apunta a null
        
        if (numElem != 0){ //Si hay elementos en la lista
            nuevo.setSig(primero); //La referencia siguiente del nuevo nodo apunta al primero
        }
        primero = ultimo = nuevo; //Tanto si hay elementos como si no...
        numElem++;
    }
    
    public void insertarFinal(int elem){
        Nodo nuevo = new Nodo(elem, null); //1º- Creamos el nodo nuevo que apunta a null (ultimo nodo)
        
        if(numElem == 0){ //si no hay elementos primero apunta a nuevo
            primero = nuevo;
        }
        else{ //2º- Si hay elementos en la lista la referencia siguiente del ultimo nodo apunta al nuevo
            ultimo.setSig(nuevo);
        }
        
        ultimo = nuevo; //3º- La referencia ultimo pasa a apuntar al nuevo nodo tanto si hay elementos como si no
        numElem++;
    }
    
    public void borrar(int elem){
        if(primero == null){ //Si no hay elementos
            System.out.println("Estructura vacía");
        }
        else{
            if(primero.getElem() == elem){ //Borrar el primer elemento
                primero = primero.getSig(); //La referencia primero apunta al siguiente del primer nodo
                numElem--;
            }
            else{ //Borrar un elemento en el medio
                Nodo actual = primero;
                
                while(actual.getSig() != null && actual.getElem() != elem){ //Mientras actual no sea null y sea distinto del elemento buscado
                    actual = actual.getSig(); //Pasa al siguiente elemento
                }
                
                if(actual.getSig() == null){ //Si la referencia actual apunta a null
                    System.out.println("El elemento no está en la estructura");
                }
                else{ //Si encontramos el elemento a borrar
                    actual.setSig(actual.getSig().getSig()); //La referencia actual apunta al siguiente elemento al que queremos borrar
                    numElem--;
                }
            }
        }
    }
    
    @Override
    public String toString() {
        String elem ="";
        
        for(Nodo actual = primero; actual != null; actual = actual.getSig()){
            elem+=actual.getElem() + " ";
        }
        return elem;
    }
    
}
