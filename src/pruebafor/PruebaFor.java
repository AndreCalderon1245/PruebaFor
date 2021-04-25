/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebafor;

import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
    public static char[][] gato = new char[3][3];
   
    // Encabezado
    
    public static void Encabezado(){
    
        System.out.println("=====================================================");  
        System.out.println("    UNIVERSIDAD AUTÓNOMA DEL ESTADO DE CAMPECHE");
        System.out.println("====================================================="); 
        System.out.println(" FACULTAD DE INGENIERÍA EN SISTEMAS COMPUTACIONALES"); 
        
        }
    
    
    // Cuerpo
    
    public static void Cuerpo(){
    
        System.out.println("====================================================="); 
        System.out.println(" CLASE DE LENGUAJE DE PROGRAMACIÓN 1RO A. CICLOS FOR"); 
        System.out.println("====================================================="); 
    }
    
    // Pie
    
    public static void Pie(){
    
        System.out.println("=====================================================");
        System.out.println("                                             ACM.2021"); 
    
    }
    
    // For que imprime la suma desde el 0 hasta el 10
    
    public static void Suma(){
        
        System.out.println("=======================[SUMA]========================"); 
        System.out.println("Programa que obtiene la suma del 0 al 10:"); 
        for (int i = 0; i <= 10; ++i) {
        j += i;
        System.out.println(j);
        }
    
    }
    
    //For que imprime el factorial del numero 10
    
    public static void Factorial() {
        
        System.out.println("====================[FACTORIAL]======================"); 
        System.out.println("Programa que obtiene el factorial del 1 al 10:");   
        for (int i = 1; i <= 10; ++i) {
        factorial *= i;
        System.out.println(factorial);
        
        }
}
    
    //For que imprime el factorial de un numero introducido por el usuario
    
    public static void FactorialIngresado() {
        
        System.out.println("===============[FACTORIAL INGRESADO]================="); 
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
        
        System.out.println("======================[MEDIA]========================"); 
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
        
        System.out.println("================[DISTANCIA NÚMERICA]================="); 
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
       
       System.out.println("==================[ARREGLO SEMANAL]==================="); 
       System.out.println("Arreglo que imprime los días de la semana:"); 
       String[] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sábado","Domingo"};
       for (String i:dias){
           j += 1;
        System.out.println("Dia " + j + ": " + i);
       }
}
    
       // Arreglo que modela el juego de gato
    
    public static void ArregloGato() {
        
        System.out.println("===================[ARREGLO GATO]===================="); 
        System.out.println("Arreglo que modela el juego de gato:");
        String [] gato = new String[9];
            gato[0] = "0,0";
            gato[1] = "0,1";
            gato[2] = "0,2";
            gato[3] = "1,0";
            gato[4] = "1,1";
            gato[5] = "1,2";
            gato[6] = "2,0";
            gato[7] = "2,1";
            gato[8] = "2,2";
        
        for (int x = 0; x < 3; x++) {
            
            System.out.print(" | " + gato[x] + " | ");

        }
        
        System.out.println();
        
        for (int x = 3; x < 6; x++) {
            
            System.out.print(" | " + gato[x] + " | ");
        
        }
        
        System.out.println();
        
        for (int x = 6; x < 9; x++) {
            
            System.out.print(" | " + gato[x] + " | ");
        
        }
        System.out.println();
        
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
            case 7:
                ArregloGato();
                break;
            default:
            System.out.println("Favor de escribir un número que este dentro de la lista:");   
                break;    
            }
        
    }
     
    // Pagina principal del programa
     
    public static void main(String[] args) {
    
    Encabezado();
    Cuerpo();
    Scanner sc = new Scanner(System.in);
        System.out.println("¿QUE PROGRAMA DESEA UTILIZAR? \nSUMA DEL 0 AL 10 -----------------------> [1] \nFACTORIAL DEL 1 AL 10 ------------------> [2] \nFACTORIAL INGRESADO --------------------> [3] \nMEDIA ----------------------------------> [4] \nMEDIA Y DISTANCIA NÚMERICA -------------> [5] \nARREGLO CON LOS DÍAS DE LA SEMANA ------> [6] \nARREGLO QUE MODELA EL JUEGO DE GATO ----> [7]");  
        seleccion = sc.nextInt();
        Seleccion(seleccion);
    Pie();    
    
    }
        
    }
    

