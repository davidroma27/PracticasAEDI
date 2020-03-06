
package actividad3_aedi;

/**
 *
 * @author david
 */
public class DoblementeEnlazadaCircularConCentinelas {
    private DobleNodo fin;
    private int numElem;
    
    public DoblementeEnlazadaCircularConCentinelas(){
        fin = new DobleNodo(-0, null, null);
        fin.setSig(fin);
        fin.setAnt(fin);
        numElem = 0;
    }
    
    public int numElem(){
        return numElem;
    }
    
    public int numVeces(int elem){
        int cont=0;
        for(DobleNodo actual = fin.getSig(); actual != fin; actual = actual.getSig()){
            if(actual.getElem() == elem) cont++;
        }
        return cont;
    }
    
    public void insertarPrincipio(int elem){
        DobleNodo nuevo = new DobleNodo(elem, fin.getSig(), fin);
        
        fin.getSig().setAnt(nuevo);
        fin.setSig(nuevo);
        numElem++;
    }
    
    public void insertarFinal(int elem){
        DobleNodo nuevo = new DobleNodo(elem, fin, fin.getAnt());
        
        fin.getAnt().setSig(nuevo);
        fin.setAnt(nuevo);
        numElem++;
    }
    
    public void borrar(int elem){
        if(fin.getSig() == fin){
            System.out.println("Estructura vacia");
        }
        else{
            DobleNodo actual = fin.getSig();
            while(actual != fin && actual.getElem() != elem){
                actual = actual.getSig();
            }
            if(actual == fin){
                System.out.println("El elemento no está");
            }
            else{
                actual.getAnt().setSig(actual.getSig());
                actual.getSig().setAnt(actual.getAnt());
                numElem--;
            }
        }
    }
    
    public String toString() {
        String toRet = "";
        for (DobleNodo actual = fin.getSig(); actual != fin; actual = actual.getSig()) {
            toRet += actual.getElem() + " ";
        }
        return toRet;
    }
}
