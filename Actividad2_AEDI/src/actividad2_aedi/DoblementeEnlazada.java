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
public class DoblementeEnlazada {
    private DobleNodo primero, ultimo;
    private int numElem;
    
    public DoblementeEnlazada(){
        primero = null;
        ultimo = null;
        numElem = 0;
    }
    
    public int numElem(){
        return numElem;
    }
    
    public void insertarPrincipio(int elem){
        DobleNodo nuevo = new DobleNodo(elem, null, null);
        
        if(primero != null){
            nuevo.setSig(primero);
            primero.setAnt(nuevo);
            ultimo = nuevo;
        }
        primero = nuevo;
        numElem++;
    }
    
    public void insertarFinal(int elem){
        DobleNodo nuevo = new DobleNodo(elem, null, null);
        
        if(primero == null){
            primero = nuevo;
        }
        else{
            //ultimo.setSig(nuevo);
            nuevo.setAnt(ultimo);
        }
        ultimo = nuevo;
        numElem++;
    }
    
    public void borrar(int elem){
        
        if(primero == null && ultimo == null){
            System.out.println("No hay elementos");
        }
        else{
            if(primero == ultimo && primero.getElem() == elem) { //Si solo hay un elemento
                primero = ultimo = null;
                numElem--;
            }
            else{
                if(primero.getElem() == elem){ //Borrar el primer elemento
                    primero.getSig().setAnt(null);
                    primero = primero.getSig();
                    numElem--;
                }
                else{
                    //Recorremos el resto de la lista
                    DobleNodo actual = primero;
                    while(actual != null && actual.getElem() != elem){
                        actual = actual.getSig();
                    }
                    //Si el elemento no se encuentra
                    if(actual == null){
                        System.out.println("El elemento no está");
                    }
                    else if(actual == ultimo){ //Borrar el ultimo elemento
                            ultimo.getAnt().setSig(null);
                            ultimo = ultimo.getAnt();
                            numElem--;  
                    }
                    else{ //Borrar un elemento en el medio
                        actual.getAnt().setSig(actual.getSig());
                        actual.getSig().setAnt(actual.getAnt());
                    }
                }
            }
        }
    }
    
    public String toString(){
        String elem = "";
        for (DobleNodo actual = primero; actual != null; actual = actual.getSig())
            elem+= actual.getElem() + " ";
        return elem; 
    }
}
