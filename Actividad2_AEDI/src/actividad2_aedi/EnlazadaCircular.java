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
public class EnlazadaCircular {
    
    private Nodo fin;
    private int numElem;

    public EnlazadaCircular() {
        fin = null;
        numElem = 0;
    }
    
    public int numVeces(int elem){
        return numElem;
    }
    
    public int primerElem() throws NullPointerException {
        if(fin == null) throw new NullPointerException();
        else return fin.getSig().getElem();
    }
    
    public void insertarFinal(int elem){
        Nodo nuevo = new Nodo(elem, null);
        
        if(fin == null){
            nuevo.setSig(nuevo);
        }
        else{
            nuevo.setSig(fin.getSig());
            fin.setSig(nuevo);
        }
        fin = nuevo;
        numElem++;
    }
    
    public void borrarPrincipio(){
        if(numElem == 0){
            System.out.println("La lista está vacía");
        }
        else{
            if(fin.getSig() == fin){
                fin = null;
            }
            else{
                fin.setSig(fin.getSig().getSig());
                numElem--;
            }
        }
    }
    
    public String toString(){
        String elem = "";
        int i = 1;
        for (Nodo actual = fin.getSig(); i <= numElem; i++, actual = actual.getSig())
            elem+= actual.getElem() + " ";
        return elem;
    }
}
