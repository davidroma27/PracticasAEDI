package Ej4_listas;
import lista.*;
/**
 *
 * @author david
 */
public class CD {
    private String autor;
    private String titulo;
    private Lista<Cancion> canciones;

    public CD(String autor, String titulo, Lista<Cancion> canciones) {
        this.autor = autor;
        this.titulo = titulo;
        this.canciones = canciones;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Lista<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(Lista<Cancion> canciones) {
        this.canciones = canciones;
    }
    
    
}
