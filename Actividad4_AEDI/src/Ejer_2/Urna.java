package Ejer_2;

/**
 * Realizar una especificación semi-formal del TAD Urna<E>. Una urna es un TAD 
 * que almacena una colección de elementos (papeletas).
 * 
 * Operaciones:
 * -Crear urna vacía
 * -Añadir elemento a urna
 * -Añadir contenido de una urna a otra
 * -Eliminar elem de urna
 * -Recuperar elem(dada una urna)
 * -Cuantos elem hay en una urna
 * 
 * @param <E>
 */
public interface Urna <E> {
    //Nombre: Urna <E>
    //Declaración de tipos: Urna, <E>, int
    //Características:
    //      -TAD que almacena una coleccion de elementos (papeletas)
    //      -Cada elem(papeleta) contiene 2 numeros (int) del 1 al 10
    //      -Una papeleta no puede tener numeros repetidos
    //      -Los objetos son modificables
    
    public Urna <E> ();
        //Produce: Inicializa this al vacío (crea una urna vacía)
    public void addPapeleta(E elem);
        //Modifica: This
        //Produce: Añade una papeleta que se pasa como parámetro 
    public void moverPapeleta(Urna<E> orig);
        //Modifica: This
        //Produce: Mueve una papeleta de la urna origen a this
    public void borrar(E elem);
        //Modifica: This
        //Produce: Elimina una papeleta de una urna
    public <E> recuperar() throws UrnaVaciaException;
        //Produce: Si la urna esta vacia lanza la excepcion UrnaVaciaException,
        //si no, devulve una papeleta cualquiera
    public int numElem();
        //Produce: Devuelve el numero de papeletas que hay en una urna
}       
