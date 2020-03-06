
package actividad3_aedi;

/**
 *
 * @author david
 */
public class OrdenadaEnlazadaCentinela {
    private Nodo primero;
    private int numElem;
    
    public OrdenadaEnlazadaCentinela(){
        primero = new Nodo (-0, null);
        numElem = 0;
    }
    
    public int numElem(){
        return numElem;
    }
    
    public boolean esta(int elem){
        Nodo actual = primero.getSig();
        
        while(actual != null && actual.getElem() != elem){
            actual = actual.getSig();
        }
        return actual != null;
    }
    
    public void insertar(int elem){
        Nodo nuevo = new Nodo(elem, null);
        Nodo actual = primero;
        
        //Si actual es menor que el elem a insertar entonces se pasa al siguiente
        while(actual.getSig() != null && actual.getSig().getElem() < elem ){
            actual = actual.getSig();
        }
        nuevo.setSig(actual.getSig());
        actual.setSig(nuevo);
        numElem++;
        
    }
    
    public void borrar(int elem){
        if(primero.getSig() == null){
            System.out.println("Estructura vacía");
        }
        else{
            Nodo actual = primero;
            while(actual.getSig() != null && actual.getSig().getElem() != elem){
                actual = actual.getSig();
            }
            if (actual == null) {
                System.out.println("El elemento no esta");
            }
            actual.setSig(actual.getSig().getSig());
            numElem--;
        }
    }
    
    public String toString(){
        String toRet = "";
        for (Nodo actual = primero.getSig(); actual != null; actual = actual.getSig())
            toRet+= actual.getElem() + " ";
        return toRet;
        
    }
}
