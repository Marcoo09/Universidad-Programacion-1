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
 
 Functionalidad: Muestra los digitos de un número con sus digitos separados.
 * 
 */
public class ej4practico1 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int number = 0;
        
        System.out.println("Escribe el número que quieres mostrar con sus digitos separados");
        number = input.nextInt();
        while(number > 0){
            System.out.println(number % 10);
            number = number / 10;
        }
        System.in.read();
        input.close();
    }
}
