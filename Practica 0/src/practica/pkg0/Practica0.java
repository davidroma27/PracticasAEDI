/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg0;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Practica0 {
    
    //Ejercicio 3:Implementa un método que intente intercambiar los valores de 
    //dos variables de tipo entero
    public static void intercambiar(){
        int var1, var2, aux;
        var1 = 5;
        var2 = 1;
        
        aux = var1;
        var1 = var2;
        var2 = aux;
        
        System.out.println("Antes: var1=5, var2=1");
        System.out.println("Ahora: var1=" + var1 + ", var2=" + var2);
    }
    
    //Ejercicio 4: Leer numero por teclado e indicar:
    //1)Si es numero par o impar
    //2)Si es 0 o distinto de 0
    //3)Si es mayor que 100 o menor
    public static void numeros(){
        Scanner in = new Scanner(System.in);
        int num;
        
        System.out.println("Introduce un numero entero: ");
        num = in.nextInt();
        
        if(num % 2 == 0){
            System.out.println("Numero par");
        }else{
            System.out.println("Numero impar");
        }
        if(num == 0){
            System.out.println("Numero cero");
        }else{
            System.out.println("Numero distinto de cero");
        }
        if(num < 100){
            System.out.println("Numero bajo");
        }else{
            System.out.println("Numero elevado");
        }
        
    }
    
    //Ejercicio 5:Escribe un programa que solicite un carácter y dos números reales al usuario
    //Realizar suma, resta, multiplicacion y división
    //Añadir control de errores (Al introducir distintos caracteres)
    //Controlar la division por cero
    public static void operaciones(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Introduce la operacion a realizar: ");
        char op = in.next().charAt(0);
        System.out.println("Introduce un numero real");
        double num1 = in.nextDouble();
        System.out.println("Introduce otro numero real");
        double num2 = in.nextDouble();
        
        switch(op){
            case '+':
                double suma = num1 + num2;
                System.out.println("La suma es : " + suma);
                break;
        }
        
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio3
        intercambiar();
        
        //Ejercicio4
        //numeros();
        
        //Ejercicio 5
        operaciones();
    }
    
}
