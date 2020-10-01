/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Diego Niño Arias
 */
public class uso_arrays {
    public static void main(String[] args) {
        /*Las matrices son datos unidos, uno abajo del otro, deben ser del mismo
        tipo que yo declaro
        */
        int [] mi_matriz=new int [5];/*En este caso creo un array(matriz) llamado
        mi_matriz en cual primero declaro el tipo de datos que va a contener (int) y 
        luego uso los corchetes [] para decirle a la JVM que es una matriz, despues
        del igual instancio el objeto con la palabra new luego el tipo de datos (int)
        y luego entre corchetes ([5]) es el tamaño de la matriz*/
        
        mi_matriz[0]=21;/*mi_matriz[0] me indica el dato que va primero en la lista
        asi los podre rellenar hasta llegar al tamaño-1(puesto que empieza en 0)*/
        mi_matriz[1]=15;
        mi_matriz[2]=3;
        mi_matriz[3]=12;
        mi_matriz[4]=1;
        
        System.out.println(mi_matriz[0]);/*Aqui imprimo el contenido de mi_matriz 
        indice 0, pero seria mucho trabajo imprimir indice por indice para lo cual
        usaremos el bucle for*/
        
        for(int i=0;i<5;i++){
            System.out.println("el valor de índide ["+i+"] es: "+mi_matriz[i]);
        }
        
        int [] mi_matriz2={5,89,45,7,12,35,69,-4};/*Esta es otra forma de declarar un array*/
        
        for(int i=0;i<mi_matriz2.length;i++){/*uso el método lenght para saber la longitud del array*/
            System.out.println("el valor de índide ["+i+"] es: "+mi_matriz2[i]);
            
        }
        
        
        
    }
}
