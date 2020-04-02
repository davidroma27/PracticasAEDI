package actividad5_aedi;
import pila.*;

/**
 * @author david
 * Haciendo uso del TAD Pila<E>, escribe un algoritmo que indique si en una expresión
 * matemática los paréntesis son correctos, es decir, para cada paréntesis de apertura
 * existe su correspondiente paréntesis de cierre y al revés. La expresión puede contener
 * cualquiera de los siguientes paréntesis: (), [] y {}
 */
public class Ej1_pilas {
    /**
     * Formato parentesis:
     * Caso 1: {[()]} ---> CORRECTO
     * Caso 2: ()]  ---> INCORRECTO
     * Caso 3: [()  ---> INCORRECTO
     */
    
    public boolean validaParentesis(String expr){
        //Produce: Devuelve True cuando una expr contiene tantas llaves de apertura como de cierre
        Pila<Character> pila = new EnlazadaPila<>();
        int longitud = expr.length(); //Se almacena la longitud de la expresión 
        boolean llaveOk = true; //variable que evalua la cadena
        
        for(int i=0; i<longitud && llaveOk; i++){
            switch (expr.charAt(i)) {
                case '[':
                    pila.push(expr.charAt(i));
                    break;
                case '(':
                    pila.push(expr.charAt(i));
                    break;
                case '{':
                    pila.push(expr.charAt(i));
                    break;
                case ']':
                    if (pila.esVacio() || pila.pop() != '[') {
                        llaveOk = false;
                    }
                    break;
                case ')':
                    if (pila.esVacio() || pila.pop() != '(') {
                        llaveOk = false;
                    }
                    break;
                case '}':
                    if (pila.esVacio() || pila.pop() != '{') {
                        llaveOk = false;
                    }
                    break;
            }
        }
        return llaveOk && pila.esVacio();
    }
}
