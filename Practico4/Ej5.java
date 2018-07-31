import java.util.*;
/*
 	Pedir 10 Strings y mostrar en minúsculas el de mayor cantidad de caracteres.
*/

 public class Ej5{
 	public static void main(String [] args){
 		Scanner input = new Scanner(System.in);

 		int length = 0;
 		String entry = "";
 		String maxLengthString = "";

 		for(int i = 1; i<= 5;i++){
 			entry = input.nextLine();
 			length = entry.length();

 			if(length > maxLengthString.length()){
 				maxLengthString = entry;
 			}
 		}

 		System.out.println("El string con mayor largo es " + maxLengthString.toLowerCase());

 		input.close();
 	}
 }