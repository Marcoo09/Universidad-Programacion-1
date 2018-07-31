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
public class ej1practico1 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        System.out.println("Escribe un número, este determinará la cantidad de números que ingresarás luego: ");
        number = input.nextInt();
        input.nextLine();
        for(int i = 1; i<= number; i+=2){
            sum+= i;
        }
        System.out.println("La suma de los numeros impares entre 1 y nro es: " + sum);
        System.in.read();
        input.close();
    }
}
