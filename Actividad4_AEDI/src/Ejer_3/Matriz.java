package Ejer_3;

/**
 * Especifica utilizando la notación semi-formal el TAD modificable Matriz de enteros
 * 
 * Operaciones:
 * -Crear una matriz n x m, sin valores (solo la dimension)
 * -Insertar un entero en la fila i, columna j
 * -Recuperar el entero de la fila i, columna j
 * -Devolver el numero de filas de la matriz
 * -Devolver el numero de columnas de la matriz
 */
public interface Matriz {
    //Nombre: Matriz
    //Declaración de tipos: Matriz, int
    //Características:
    //      -TAD que genera una matriz (m x n) que almacena enteros
    //      -La matriz se compone de filas y columnas
    //      -El TAD permite realizar operaciones entre matrices
    //      -Los objetos son modificables
    
    public Matriz(int n, int m);
    //Produce: Crea una matriz de N filas y M columnas, sin elementos (vacía).
    
    public void insertar(int i, int j, int elem);
    //Modifica: This
    //Produce: Si i<=0, j<=0 lanza la excepcion IndexOutOfBoundsException. En los demas casos 
    //añade un entero nuevo a la matriz en la fila i, columna j pasadas como parametro
    
    public int recuperar(int i, int j);
    //Produce: Si i<=0 o i>n y j<=0 o j>m lanza excepcion IndexOutOfBoundsException. En los demas casos
    //devuelve el entero que se encuentra en la posicion pasada como parametro.
    
    public int numFilas();
    //Produce: Devuelve el numero de filas que tiene una matriz
    
    public int numCol();
    //Produce: Devuelve el numero de columnas que tiene una matriz
       
}
