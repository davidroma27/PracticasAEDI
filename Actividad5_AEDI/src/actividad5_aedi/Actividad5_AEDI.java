package actividad5_aedi;

import pila.*;
import cola.*;


/**
 *
 * @author david
 */
public class Actividad5_AEDI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 1 Pilas
        System.out.println("-------------Ejercicio 1---------------");
        Ej1_pilas llaves = new Ej1_pilas();
        if(llaves.validaParentesis("[2^5+(5+3}*5)]") == true){
            System.out.println("Correct Sintax");
        }else System.out.println("Incorrect Sintax");
        
        System.out.println("\n======================================\n");
        
        //Ejercicio 2 Pilas
        System.out.println("-------------Ejercicio 2---------------");
        Ej2_pilas cadena = new Ej2_pilas();
        System.out.println(cadena.codificar("Bond, James Bond"));
        
        System.out.println("\n======================================\n");
        
        //Ejercicio 3 Pilas
        System.out.println("-------------Ejercicio 3---------------");
        Pila<Integer> p = new EnlazadaPila();
        for(int i=0; i<10; i++){
            p.push((int)(Math.random() * 10));
        }
        
        Ej3_pilas ej3 = new Ej3_pilas();
        System.out.println(ej3.desapilarElemento(p, 3));
        
        System.out.println("\n======================================\n");
        
        //Ejercicio 4 Pilas
        System.out.println("-------------Ejercicio 4---------------");
        Ej4_pilas ej4 = new Ej4_pilas();
        ej4.cambioBase(18);
        
        System.out.println("\n================COLAS=================\n");
        
        //Ejercicio 1 Colas
        System.out.println("-------------Ejercicio 1---------------");
        Cola q1 = new EnlazadaCola();
        Cola q2 = new EnlazadaCola();
        Cola<Integer> q3 = new EnlazadaCola<>();
        for(int i=1; i<=5; i++){
            q1.insertar(i);
            q2.insertar(i);
        }
        
        Ej1_colas correos = new Ej1_colas();
        correos.concatenar(q1, q2);
                
        for(int i=1; i<=5; i++){
            q1.insertar(i);
            q2.insertar(i);
        }
        q3 = correos.barajar(q1,q2);
        
        System.out.print("Barajar --> Cola 3: ");
        while(!q3.esVacio()) System.out.print(q3.suprimir());
        System.out.println("\n");
        
        System.out.println("\n======================================\n");
        
        //Ejercicio 2 Colas
        System.out.println("-------------Ejercicio 2---------------");
        Ej2_colas josephus = new Ej2_colas();
        Cola<Integer> soldados = new EnlazadaCola<>();
        josephus.escogeSoldado(soldados, 4, 3);
        
    }
    
}
