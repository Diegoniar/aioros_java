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
 * Crea un array de números de un tamaño pasado por teclado, el array contendrá
 * números aleatorios primos entre los números deseados, por último nos indica 
 * cual es el mayor de todos.

Haz un método para comprobar que el número aleatorio es primo, 
* puedes hacer todos lo métodos que necesites.
 */
public class array_numeros_aleatorios_primos {
    public static void main(String[] args) {
        int posiciones = Integer.parseInt(JOptionPane.showInputDialog("De cuantas posiciones quiere la matriz", null));
        int [] matriz=new int [posiciones];
        llenar_matriz(matriz);
        com.aioros.co.arrays.array_con_numeros_aleatorios.mostrar_contenido(matriz);
        mayor(matriz);
    }
    
    public static boolean es_primo(int numero){
        int i=1;
        int aux=0;
        while(i<numero){
            if(numero%i==0){
                aux++;
            }
            i++;
        }
        
        return aux<2;
    }
    
    public static void llenar_matriz(int matriz[]){
        int i=0;
        Random ale=new Random();
        int aux=0;
        while(i<matriz.length){
            aux=ale.nextInt(1000);
            if(es_primo(aux)){
                matriz[i]=aux;
                i++;
            }
        }
    }
    
    public static void mayor(int matriz[]){
        int mayor=0;
        for (int i = 0; i < matriz.length; i++) {
            if(matriz[i]>mayor){
                mayor=matriz[i];
            }
        }
        
        System.out.println("El número mayor de la matriz es: "+mayor);
    }
    
    
}
