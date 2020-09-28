/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author usuario
 */
public class uso_arrays_foreach {
    public static void main(String[] args) {
        String [] paises=new String[10];
        
        paises[0]="Colombia";
        paises[1]="Venezuela";
        paises[2]="Brasil";
        paises[3]="Ecuador";
        paises[4]="Perú";
        paises[5]="Chile";
        paises[6]="Bolivia";
        paises[7]="Argentina";
        paises[8]="Paraguay";
        paises[9]="Uruguay";
        
        /*La forma convencional de imprimir un array seria con un bucle for
        donde ponemos el valor inicial del contador, la condición y cuanto aumentara 
        en cada vuelta del ciclo
        */
        for (int i = 0; i < paises.length; i++) {
            System.out.println("Pais "+(i+1)+": "+paises[i]);
        }
        
        /*El nuevo for each (desde java 5.0), nos dejará igualar 
        la lista a una variable del mismo tipo de la matriz, 
        en este caso es de tipo String, despues solo tendremo que llamar
        la varuable recien creada*/
        
        for(String pais:paises){
            System.out.println("Pais: "+pais);
        }
        
        /*También podemos declarar matrices de forma simplificada*/
        
        String [] paises_europa={"Portugal","España","Francia","Italia","Bélgica","Alemania",
            "Suiza", "Austria","Holanda","¨Polonia"};
        
        for(String europa:paises_europa){
            System.out.println(europa);
            
        }
        }
    }

