/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso.java;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class RepasoJava {

    /**
     * @param args the command line arguments
     */
    
    //Los metodos se construyen fuera del main
    //Declaramos el metodo void porque no va a devovler ningún tipo de dato
    //Ejercicio1: Implementa un algoritmo que calcule x^n
    public static void calculaPotencia(){
            double res;
            int base = 2;
            int exp = 4;
            
            res = Math.pow(base, exp); //La funcion Math.pow calcula la potencia de dos variables
                                       //Esta funcion solo admite valores de tipo double
            
            System.out.println("Ejercicio 1: Resultado potencia: " + base + "^" + exp + " = "+ Math.round(res));
            //La funcion Math.round parsea las variables de tipo double o float a variables de tipo int
        }
    
    //-----------------------------------------------------------------------------//
    
    //Ejercicio 2: Implementa un algorito que calcule el factoria de un entero positivo
    public static void calculaFactorial(){
        int num = 5; //La entrada es un entero positivo
        int res = 1;
        
        while(num != 0){ //Algoritmo factorial: Mientras el numero no llegue a cero se multiplica por el resultado anterior
            res=res*num;
            num--;
        }
        
        System.out.println("Ejercicio 2: Factorial 5: " + res);
    }
    
    //-----------------------------------------------------------------------------//
    
    //Ejercicio 3: Suma los n primeros numeros pares
    public static void sumaPares(){
        int num = 8; //Se van a sumar los 8 primeros numeros pares
        int res = 0;
        
        while(num != 0){
            if(num % 2 == 0){ //Si el numero es par, se suma al resultado
                res += num;
            }
            num--;
        }
        
        System.out.println("Ejercicio 3: La suma de los 8 primeros pares es: " + res);
    }
    
    //-----------------------------------------------------------------------------//
    
    //Ejercicio 4: Suma de numeros multiplos de 5 y 7 entre 1 y 100
    public static void sumaMultiplos(){
        int res = 0;
        
        //Creamos un bucle for que recorra de 1 a 100
        //En cada ciclo comprueba si cada numero es modulo de 5 y despues modulo de 7
        //Si lo son se suman al resultado
        for(int i=1; i<=100; i++){
            if(i % 5 == 0){
                res += i;
            }
            
            if(i % 7 == 0){
                res += i;
            }

        }
        
        System.out.println("Ejercicio 4: La suma de multiplos es: " + res);
        
    }
    
    //-----------------------------------------------------------------------------//
    
    /**
     * Ejercicio 5: Calcular total a partir de un codigo de entrada
     * 
     * cod1 = 10€/u
     * cod2 = 7€/u - 10u/65€
     * cod3 = 3€/u - >10u -> 0.1*total
     * cod4 = 1€/u
     * @return 
     */
    
    public static double calculaCompra(){
        Scanner in = new Scanner(System.in);
        
        final int cod1 = 111111;
        final int cod2 = 222222;
        final int cod3 = 333333;
        final int cod4 = 444444;
        double res = 0;
        
        int cod, cant;
        
        System.out.println("Introduce el codigo del articulo: ");
        cod = in.nextInt();
        System.out.println("Introduce la cantidad de unidades: ");
        cant = in.nextInt();
        
        switch (cod){
        
            case cod1:
                res = cant * 10;
                
                System.out.println("El total es: " + res + "€");
                break;
                
            case cod2:
                if(cant == 10){
                    res = 65;
                    System.out.println("El total es: " + res + "€");
                }
                else{
                    res = cant * 7;
                    System.out.println("El total es: " + res + "€");
                }
                break;
                
            case cod3:
                if(cant > 10){
                    res = cant*3-(cant*3*0.1);
                    System.out.println("El total es: " + res + "€");
                }
                else{
                    res = cant * 3;
                    System.out.println("El total es: " + res + "€");
                }
                break;
            
            case cod4:
                res = cant;
                System.out.println("El total es: " + res + "€");
                break;
        }
        
        return res;
    }
    
    //-----------------------------------------------------------------------------//
    
    //Ejercicio 6: Escribe un algoritmo que calcule la letra del DNI a partir del numero
    //Para ello debe obtener el resto de dividir el numero entre 23 (módulo)
    
    public static void calculaDNI(){
        Scanner in = new Scanner(System.in);
        int num, pos;
        String dni;
        
        char [] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'}; //Creamos un array que almacene todas las letras del DNI
        
        System.out.println("Introduce un numero de DNI (sin letra)");
        num = in.nextInt();
        
        pos = num % 23; //Calculamos el modulo con el numero de entrada y obtenemos la posicion de la letra que corresponde a ese numero.
        
        dni = String.valueOf(num)+letras[pos]; //La funcion valueOf() de la clase String sirve para convertir objetos a variables de tipo string
        
        System.out.println("Ejercicio &: El DNI completo es: " + dni);
        
    }
    
    //-----------------------------------------------------------------------------//
    
    //Ejercicio 7: Escribe un algoritmo que dado un array de enteros muestre por pantalla los impares
    
    public static void muestraImpares(){
        //Creamos el array
        int [] enteros = {1,2,3,4,5,6,7,8,9,10};
        
        for(int i=0; i<enteros.length; i++){
            if(enteros[i] % 2 != 0){
                System.out.println("Ejercicio 7: Impar: " + enteros[i]);
            }
        }
    }
    
    //-----------------------------------------------------------------------------//
    
    //Ejercicio 8: Busca un elemento de un array
    //Si elem esta: Devolver la posición del array
    //Si elem no esta: Devolver mensaje
    //Devolver siempre la primera aparición
    
    public static void buscaElem(){
        int [] enteros = {1,2,3,4,5,6,7,8,9};
        int elem = 5;
        int pos = 0;
        
        //El programa busca el numero 5
        //Mientras no lo encuentre, elem incrementa una posición y comprueba si 
        //en esa posicion esta el elemento 5
        while(pos <= enteros.length-1 && enteros[pos] != elem){ 
            pos++;
        }
        System.out.println("El elemento ha sido encontrado en la posición: " + pos);
    }
    
    //-----------------------------------------------------------------------------//
    
    //Ejercicio 9: Dado un array y un indice, determina si el indice es una pos valida.
    //Si pos es valida, se elimina el elemento del array y desplaza los demas elementos
    
    public static void eliminaPos(){
        int [] array = {1,2,3,4,5};
        int indice;
        
        for(indice=0; indice<=array.length-1; indice++){
            array[indice]=0;
            
        }
    }
    
    public static void main(String[] args) {
        
        //Llamamos a los metodos desde dentro del main
        
        //Ejercicio 1
        calculaPotencia();
        
        //Ejercicio 2
        calculaFactorial();
        
        //Ejercicio 3
        sumaPares();
        
        //Ejercicio 4
        sumaMultiplos();
        
        //Ejercicio 5
        //calculaCompra();
        
        //Ejercicio 6
        //calculaDNI();
        
        //Ejercicio 7
        muestraImpares();
        
        //Ejercicio 8
        buscaElem();
        
        //Ejercicio 9
        eliminaPos();
    }
    
}
