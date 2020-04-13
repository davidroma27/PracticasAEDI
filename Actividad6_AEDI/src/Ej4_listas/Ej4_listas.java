package Ej4_listas;
import cola.*;
import lista.*;

/**
 * @author david
 * Nuestro coche dispone de un cargador de CDs de música. Suponemos que los CD se
 * van escuchado por orden de llegada al cargador. De cada CD sabemos el autor, el título
 * y una lista (Lista<Cancion>) con las canciones que contiene. Para cada canción
 * conocemos su título y su duración en segundos. Se pide implementar un método que,
 * dado un cargador con varios CDs, devuelva durante cuánto tiempo podemos escuchar
 * música (duración total en segundos).
 */
public class Ej4_listas {
    public double duracionTotal(Cola<CD> cargador) {
        //Modifica: cargador.
        //Produce: devuelve la duración total del cargador en segundos, dejando el cargador vacío
        int durTotal=0;
        
        for(int i=0; i<cargador.tamaño(); i++){
            CD cd = cargador.suprimir();
            Lista<Cancion> canciones = cd.getCanciones();
            for(Cancion c: canciones){
                durTotal += c.getDuracion();
            }
        }
        return durTotal;
    }
}
