package actividad5_aedi;
import pila.*;

/**
 * @author david
 * 
 * se codifica reemplazando cada sucesión de caracteres consecutivos 
 * que no sean vocales por su imagen especular. Por ejemplo:
 * Mensaje original: "Bond, James Bond”
 * Mensaje codificado: "BoJ ,dnameB sodn"
 */
public class Ej2_pilas {
    public String codificar (String mensaje){
        // Produce: un nuevo mensaje que codifica el mensaje de entrada.
        String result = "";
        Pila<Character> aux = new EnlazadaPila<>();
        
        //Recorremos la cadena original
        for(int i=0; i<mensaje.length(); i++){
            char actual = mensaje.charAt(i); //Almacenamos el caracter actual
            
            //Si el caracter actual es una vocal entonces mandamos el contenido de
            //la pila a la cadena resultado seguido de la vocal de actual
            if(actual =='a' || actual =='e'|| actual =='i'|| actual =='o'|| actual =='u'||
                    actual =='A' || actual =='E'|| actual =='I'|| actual =='O'|| actual =='U'){
                while(!aux.esVacio()){
                    result += aux.pop();
                }
                result += actual;                
            }
            else{
                //Mientras el caracter actual sea un caracter distinto de vocal
                //se almacena en la pila
                aux.push(actual);
            }
        }
        
        //Si queda algún caracter en la pila se manda a la cadena resultado antes 
        //de terminar
        while (!aux.esVacio()) {
            result += aux.pop();
        }
        return result;
    }
}
