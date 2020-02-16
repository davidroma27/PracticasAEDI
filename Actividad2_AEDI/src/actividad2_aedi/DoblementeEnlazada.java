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
            ultimo.setSig(nuevo);
            nuevo.setAnt(ultimo);
        }
        ultimo = nuevo;
        numElem++;
    }
    
    public void borrar(int elem){
        
    }
    
    public String toString(){
        return null;
        
    }
}
