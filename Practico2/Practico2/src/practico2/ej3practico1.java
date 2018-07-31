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
public class ej3practico1 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int userEntry = 0;
        
        System.out.println("Ingresa los 6 números que serán sumados: ");
        
        for(int i = 1; i<=6;i++){
            userEntry = input.nextInt();
            if(userEntry < 0){
                userEntry = -(userEntry);
            }
            sum += userEntry;
        }
        System.out.println("La suma de 6 números naturales es: " + sum);
        System.in.read();
        input.close();
    }
}
