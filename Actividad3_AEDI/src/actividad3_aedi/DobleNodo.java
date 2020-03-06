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
public class DobleNodo {
    private int elem;
    private DobleNodo sig, ant;

    public DobleNodo(int elem, DobleNodo sig, DobleNodo ant) {
        this.elem = elem;
        this.sig = sig;
        this.ant = ant;
    }

    public int getElem() {
        return elem;
    }

    public DobleNodo getSig() {
        return sig;
    }
    
    public DobleNodo getAnt(){
        return ant;
    }

    public void setElem(int elem) {
        this.elem = elem;
    }
    
    public void setSig(DobleNodo sig) {
        this.sig = sig;
    }
    
    public void setAnt(DobleNodo ant){
        this.ant = ant;
    }
}
