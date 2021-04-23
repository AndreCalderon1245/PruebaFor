/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebafor;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author End User
 */
public class PruebaFor {
    
    //Variables universales
    
    public static int j;
    public static int seleccion;
    public static double suma;
    public static int factorial = 1;
    public static double media;
    
    
    // For que imprime la suma desde el 0 hasta el 10
    
    public static void Suma(){
    
        System.out.println("Programa que obtiene la suma del 0 al 10:"); 
        for (int i = 0; i <= 10; ++i) {
        suma += i;
        System.out.println(suma);
        }
    
    }
    
    //For que imprime el factorial del numero 10
    
    public static void Factorial() {
        
        System.out.println("Programa que obtiene el factorial del 1 al 10:");   
        for (int i = 1; i <= 10; ++i) {
        factorial *= i;
        System.out.println(factorial);
        
        }
}
    
    //For que imprime el factorial de un numero introducido por el usuario
    
    public static void FactorialIngresado() {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un número para obtener su factorial:");   
        j = sc.nextInt();
        for (int i = 1; i <= j; ++i) {
        factorial *= i;
        System.out.println(factorial);
        
        }
}
    
    //For que imprime la media de un numero ingresado por el usuario
    
    public static void Media() {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un número para obtener la media de la suma del 0 hasta el número que introduzca:");   
        j = sc.nextInt();
        for (int i = 1; i <= j; ++i) {
        suma += i;    
        }
        media = suma / j;
        System.out.println(media);
}
    
      //For que imprime la media de un numero ingresado por el usuario
    
    public static void DistanciaNumerica() {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un número para obtener la media de la suma del 0 hasta el número que introduzca y sacar el número más alto y el más bajo y su distancia númerica:");   
        j = sc.nextInt();
        for (int i = 1; i <= j; ++i) {
        suma += i;
        media = suma / j;
        if (i == 1){
        System.out.println("El número más bajo de la media es el " + media);
        }
         if (i == j){
        System.out.println("El número más alto de la media es el " + media);
        }
        }
        System.out.println("Existe un diferencia númerica de " + media + " números entre el número más alto y el más bajo de la media de la suma repitada " + j + " veces");
}
    
     // Arreglo con los dias de la semana
    
    public static void ArregloSemanal() {
       
       System.out.println("Arreglo que imprime los días de la semana"); 
       String[] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sábado","Domingo"};
       for (String i:dias){
           j += 1;
        System.out.println("Dia " + j + ": " + i);
       }
}
    
    // Switch para la selección de sistema
    
     public static void Seleccion(int opcion){
        
            switch (opcion) {
            case 1:
                Suma();
                break;
            case 2:
                Factorial();
                break;
            case 3:
                FactorialIngresado();
                break;
            case 4:
                Media();
                break;
            case 5:
                DistanciaNumerica();
                break;
            case 6:
                ArregloSemanal();
                break;
            default:
            System.out.println("Favor de escribir un número que este dentro de la lista:");   
                break;    
            }
        
    }
     
    // Pagina principal del programa
     
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
        System.out.println("¿Que sistema desea utilizar?\nSeleccione un mes según la lista \nSuma del 0 al 10[1] \nFactorial del 1 al 10[2] \nFactorial ingresado[3] \nMedia[4] \nMedia y distancia númerica[5] \nArreglo con los días de la semana[6]");
        seleccion = sc.nextInt();
        Seleccion(seleccion);
        
    
    }
        
    }
    

