package Ejer_1;

/**
 * Cada término del polinomio contiene un coeficiente de tipo real y un 
 * exponente de tipo entero positivo.
 * 
 * Operaciones:
 * -Crear polinomio cero
 * -Devolver grado de un polinomio
 * -Devolver coeficiente de un término, dado su exponente.
 * -Añadir nuevo termino (ayx^y). Si y=0 o a=0, throw IllegalArgumentException
 * -Eliminar un termino del polinomio, dado su exponente
 */

public interface Polinomio {
    //Nombre: Polinomio
    //Declaración de tipos: Polinomio, double, int
    //Características:
    //      -Conjunto ilimitado de términos de la forma ayx^y (a0 + a1x + a2x^2 + ... + anx^n)
    //      -Cada término tiene un coeficiente de tipo double y un exponente de tipo int
    //      -Los objetos son modificables.
    public Polinomio();
        //Produce: Inicializa this al polinomio 0. (Polinomio termino 0)
    public int getGrado();
        //Produce: Devuelve el grado del polinomio (el mayor exponente)
    public double getCoeficiente(int exp);
        //Produce: Devuelve el coeficiente del termino con exponente pasado por parametro
    public void addTermino(double Coeficiente, int exp) throws IllegalArgumentException;
        //Produce: Añade un nuevo termino (coeficiente+exponente) al polinomio
            //Si el coeficiente es 0 o exponente negativo lanza excepcion IllegalArgumentException
    public void borrarTermino(int exp);
        //Modifica: This
        //Produce: Elimina un termino del polinomio dado un exponente pasado por parametro
}