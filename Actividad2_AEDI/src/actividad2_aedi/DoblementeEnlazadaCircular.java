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
public class DoblementeEnlazadaCircular {
    private DobleNodo fin;
    private int numElem;

    public DoblementeEnlazadaCircular() {
        fin = null;
        numElem = 0;
    }
    
    public int numElem(){
        return numElem;
    }
    
    public int numVeces(int elem){
        if(fin == null) return 0;
        
        int res = 0;
        DobleNodo actual = fin;
        do{
            if(actual.getElem() == elem){
                res++;
            }
            actual=actual.getSig();
        }while(actual != fin);
        return res;
    }
    
    public int devuelvePrimero() throws NullPointerException{
        if(fin == null) throw new NullPointerException();
        return fin.getSig().getElem();
    }
    
    public void insertarFinal(int elem){
        DobleNodo nuevo = new DobleNodo(elem, null, null);
        
        if(fin == null){
            nuevo.setSig(nuevo);
            nuevo.setAnt(nuevo);
        }
        else{
            nuevo.setSig(fin.getSig()); //El nuevo apunta al primero
            nuevo.setAnt(fin); //El nuevo apunta al anterior (FIN)
            fin.getSig().setAnt(nuevo); //El primero apunta al anterior (NUEVO)
            fin.setSig(nuevo); //El siguiente de fin apunta la nuevo
        }
        fin = nuevo;
        numElem++;
    }
    
    public void borrarPrincipio(){
        if(fin == null){
            System.out.println("Estructura vacía");
        }
        else{
            if(fin.getSig() == fin){
                fin = null;
            }
            else{
                DobleNodo actual = fin.getSig();
                fin.setSig(actual.getSig());
                actual.getSig().setAnt(fin);
            }
            numElem--;
        }
    }
    
    public String toString(){
        String elem = "";
        int i = 1;
        
        for (DobleNodo actual = fin.getSig(); i <= numElem; i++, actual = actual.getSig()) {
            elem+=actual.getElem() + " ";
        }
        return elem;
    }
}
