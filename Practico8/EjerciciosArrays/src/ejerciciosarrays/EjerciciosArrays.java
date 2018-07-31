/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosarrays;

/**
 *
 * @author Usuario
 */
public class EjerciciosArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int countMax = 0;
        int [] listOfNumbers = new int[10];
        listOfNumbers[0] = 200;
        listOfNumbers[1] = 200;
        listOfNumbers[2] = 75;
        listOfNumbers[3] = 125;
        listOfNumbers[4] = 150;
        listOfNumbers[5] = 175;
        listOfNumbers[6] = 178;
        listOfNumbers[7] = 119;
        listOfNumbers[8] = 219;
        listOfNumbers[9] = 219;
        
        
        /*PROMEDIO
        for(int i = 0; i<listOfNumbers.length; i++){
            sum+= listOfNumbers[i];
        }
        System.out.println(sum/10);
        PROMEDIO*/
        
        /*MAXIMO
        for(int i = 0; i<listOfNumbers.length; i++){
            if(max < listOfNumbers[i]){
                max = listOfNumbers[i];
            }
        }
        System.out.println(max);
        MAXIMO*/
        /*MAXIMO Y CANT DE VECES QUE APARECE
        for(int i = 0; i<listOfNumbers.length; i++){
            if(max < listOfNumbers[i]){
                max = listOfNumbers[i];
                countMax++;
            }
        }
        System.out.println("El maximo es : " + max + " y ;a cantidad de veces que se repite es: "+ countMax);
       MAXIMO Y CANT DE VECES QUE APARECE*/
        /*
        for(int i = 0; i<listOfNumbers.length; i++){
            if(max < listOfNumbers[i]){
                max = listOfNumbers[i];
            }
            if(min>listOfNumbers[i]){
                min = listOfNumbers[i];
            }
        }
        System.out.println("El rango es: " + "[" + min + "," + max + "]");
        MAXIMO Y MINIMO*/
        
        
    }
    
}
