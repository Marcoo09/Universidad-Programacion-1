/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decode;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Decode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String message = "Hay ahora cien expedientes , contando ademas los otros recursos." ;
        
        String [] arrayWords = message.split(" ");
        
        //String fromArrayWords = String.valueOf(arrayWords);
        
        //String [] secondArrayWords = fromArrayWords.split(" ");
        
        String decodeMessage = "";
        System.out.println(arrayWords.length);
        for(String a: arrayWords){
            if(!(a.equals("." ) || a.equals(",") || a.equals(";"))){
                decodeMessage+= a.charAt(0);
            }
            for(int i = 0; i < a.length(); i++){
                char character = a.charAt(i);
                if(character == '.' || character == ',' || character == ';'){
                    decodeMessage += " ";
                }
            }
        }
        
        System.out.println("El mensaje decodificado es: " + decodeMessage);
        
    }
    
}
