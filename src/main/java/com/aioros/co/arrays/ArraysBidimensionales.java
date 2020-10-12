/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aioros.co.arrays;

/**
 *
 * @author Diego Niño Arias
 */
public class ArraysBidimensionales {
    public static void main(String[] args) {
        /*Declaramos el tipo de dato del array y dos corchetes indicando
        que sera bidimensional, supongamos que el primer dato son las columnas
        y el segundo dato son las filas*/
        int [][] matrix = new int [4][5];
        /*Para llenarlo de forma manual debemos estar pendientes de los limites
        en este caso sera el valor inicial -1*/
        
        matrix[0][0]=19;
        matrix[0][1]=19;
        matrix[0][2]=19;
        matrix[0][3]=19;
        matrix[0][4]=20;
        
        matrix[1][0]=61;
        matrix[1][1]=61;
        matrix[1][2]=84;
        matrix[1][3]=80;
        matrix[1][4]=9;
        
        matrix[2][0]=7;
        matrix[2][1]=8;
        matrix[2][2]=10;
        matrix[2][3]=4;
        matrix[2][4]=11;
        
        matrix[3][0]=12;
        matrix[3][1]=1;
        matrix[3][2]=20;
        matrix[3][3]=3;
        matrix[3][4]=6;
        
        /*Imprimiendolo con el for tradicional*/
        for (int i=0;i<matrix.length;i++){
            for (int j = 0; j < 5; j++) {
                System.out.print("Posición ["+i+"]["+j+"]="+matrix[i][j]+"\t");
            }
            
            System.out.println();
        }
        
        /*Con el for each*/
        
        for(int [] fila:matrix){
            for (int z:fila){
                System.out.print(z+"\t");
            }
            System.out.println();
        }
    }
}
