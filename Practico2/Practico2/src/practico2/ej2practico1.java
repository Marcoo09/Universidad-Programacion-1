/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico2;

import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Marco Fiorito
 */
public class ej2practico1 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        int userEntry = 0;
        int quantityMultipl2 = 0;
        int quantityMultipl3 = 0;
        //Receive the number which determine the quantity of numbers that the user will introduce
        System.out.println("Ingrese un número, este determinará la cantidad de números que serán solicitados luego.");
        number = input.nextInt();
        
        if(number > 0){
            for(int i = 1; i<= number;i++){
                System.out.println("Ingrese un número");
                userEntry = input.nextInt();
                sum += userEntry;
                
                if(userEntry % 2 == 0){
                    quantityMultipl2 += 1;
                }
                if(userEntry % 3 == 0){
                    quantityMultipl3 += 1;
                }
            }
            System.out.println("La suma de los números es: " + sum);
            System.out.println("La cantidad de números múltiplos de 2 es: " + quantityMultipl2);
            System.out.println("La cantidad de números múltiplos de 3 es: " + quantityMultipl3);
            System.in.read();
            input.close();

        }
    }
}
