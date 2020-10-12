/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aioros.co.arrays;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego Niño Arias
 */

/**Crea un array de 10 posiciones de números con valores pedidos por teclado. 
 * Muestra por consola el indice y el valor al que corresponde. 
 * Haz dos métodos, uno para rellenar valores y otro para mostrar.
 */
 
public class crear_matriz_rellenar_desde_teclado {
    public static void main(String[] args) {
        int [] matriz=new int [10];
        rellenar_matriz(matriz);
        mostrar_matriz(matriz);
        
    }
    
    public static void rellenar_matriz(int [] matriz_a_rellenar){
        int numero;
        for (int i = 0; i < matriz_a_rellenar.length; i++) {
            numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número",null));
            matriz_a_rellenar[i]=numero;
        }
    }
    
    public static void mostrar_matriz(int [] matriz_a_mostrar){
        for (int i = 0; i < matriz_a_mostrar.length; i++) {
            System.out.println("Indice["+i+"]="+matriz_a_mostrar[i]);
        }
    }
}
