/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aioros.co.arrays;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego Niño Arias
 * 
 * Crea un array de números donde le indicamos por teclado el tamaño del array, 
 * rellenaremos el array con números aleatorios entre 0 y 9, al final muestra 
 * por pantalla el valor de cada posición y la suma de todos los valores. 
 * Haz un método para rellenar el array (que tenga como parámetros los números 
 * entre los que tenga que generar), para mostrar el contenido y la suma del 
 * array y un método privado para generar número aleatorio (lo puedes usar para 
 * otros ejercicios).
 */
public class array_con_numeros_aleatorios {
    public static void main(String[] args) {
        int posiciones=Integer.parseInt(JOptionPane.showInputDialog("De cuantas posiciones quiere el array:", null));
        int [] matriz=new int [posiciones];
        llenar_matriz(matriz);
        mostrar_contenido(matriz);
        sumar_contenido(matriz);
        
    }
    
    private static int num_random(int limite){
        Random r = new Random();
        return r.nextInt(limite);
    }
    
    public static void llenar_matriz(int matriz[]){
        for(int i=0;i<matriz.length;i++){
            matriz[i]=num_random(10);
        }
    }
    
    public static void mostrar_contenido(int matrix[]){
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Posición["+i+"]="+matrix[i]);
        }
    }
    
    public static void sumar_contenido(int matrix []){
        int suma=0;
        for (int i = 0; i < matrix.length; i++) {
            suma+=matrix[i];
        }
        System.out.println("La suma de todos los elementos de la matriz es: "+suma);
    }
    
}
