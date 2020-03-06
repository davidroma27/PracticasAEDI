/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad3_aedi;

/**
 *
 * @author david
 */
public class DoblementeEnlazadaCentinelas {
    private DobleNodo primero, ultimo;
    private int numElem;
    
    public DoblementeEnlazadaCentinelas(){
        primero = new DobleNodo(-0, null, null);
        ultimo = new DobleNodo(-0, null, primero);
        primero.setSig(ultimo);
        numElem = 0;
    }
    
    public int numElem(){
        return numElem;
    }
    
    public int numVeces(int elem){
        int cont = 0;
        
        for(DobleNodo actual = primero.getSig(); actual != ultimo; actual =  actual.getSig()){ 
            if (actual.getElem() == elem) {
               cont++; 
            }
        }
        return cont;
    }
    
    public boolean esta(int elem){
        DobleNodo actual = primero.getSig();
        while(actual != ultimo && actual.getElem() != elem){
            actual = actual.getSig();
        }
        return actual != ultimo;
    }
    
    public void insertarPrincipio(int elem){
        DobleNodo nuevo = new DobleNodo(elem, primero.getSig(), primero);
        
        primero.getSig().setAnt(nuevo);
        primero.setSig(nuevo);
        numElem++;
    }
    
    public void insertarFinal(int elem){
        DobleNodo nuevo = new DobleNodo(elem, ultimo, ultimo.getAnt());
        
        ultimo.getAnt().setSig(nuevo);
        ultimo.setAnt(nuevo);
        numElem++;
    }
    
    public void borrar(int elem){
        if(primero.getSig() == ultimo){
            System.out.println("Estructura vacía");
        }
        else{
            DobleNodo actual = primero.getSig();
            while(actual != ultimo && actual.getElem() != elem){
                actual = actual.getSig();
            }
            if(actual == ultimo){
                System.out.println("El elemento no esta en la lista");
            }
            else{
                actual.getAnt().setSig(actual.getSig());
                actual.getSig().setAnt(actual.getAnt());
                numElem--;
            }
        }
    }
    
    public String toString(){
        String res = "";
        for (DobleNodo actual = primero.getSig(); actual != ultimo; actual = actual.getSig())
            res+= actual.getElem() + " ";
        return res;
    }
}
