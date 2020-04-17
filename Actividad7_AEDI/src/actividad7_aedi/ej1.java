package actividad7_aedi;

/**
 * @author david
 * 
 * AUX, es el array de números enteros clasificados en orden decreciente. Puede contener
 * elementos repetidos.
 * 
 * ELEM, es el elemento sobre el que quiero saber cuántos mayores que él hay
 * 
 */
public class ej1 {

    public int cuantosMayores(int[] aux, int elem) {
        int inicio = 0;
        int fin = aux.length - 1;
        int medio;
        while (inicio <= fin) {
            medio = (inicio + fin) / 2;
            if (aux[medio] > elem) {
                inicio = medio + 1;
                if (inicio > fin) {
                    return inicio;
                }
            } else {
                if (aux[medio] < elem) {
                    fin = medio - 1;
                    if (inicio > fin) {
                        return medio;
                    }
                }
                else if(aux[medio] == elem){
                    return medio;
                }
            }
            while (medio > -1 && aux[medio] == elem){
                medio--;
                return medio;
            }
        }
        return -1;
    }
}
