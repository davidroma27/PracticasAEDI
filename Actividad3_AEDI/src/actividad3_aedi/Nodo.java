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
public class Nodo {
    
    private int elem;
    private Nodo sig;

    public Nodo(int elem, Nodo sig) {
        this.elem = elem;
        this.sig = sig;
    }

    public int getElem() {
        return elem;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setElem(int elem) {
        this.elem = elem;
    }
    
    public void setSig(Nodo sig) {
        this.sig = sig;
    }
    
    
}
