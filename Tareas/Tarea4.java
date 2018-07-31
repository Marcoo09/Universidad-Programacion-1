import java.util.*;
/* 
	Trabajo realizado por:
	Marco Fiorito - Nro 227548 
	Universidad ORT 
	Carrera Ingeniería en Sistemas 
	Entregado: 29/04/2018
*/

public class Tarea4{
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		String userEntry = "";

		char letter = ' ';

		int qtyVowels = 0;
		int qtyDigits = 0;
		float realLength = 0;
		int length = 0;
		float percentage = 0f;

		System.out.print("Por favor escribe algo: ");
		userEntry = input.nextLine();
		//Convierto a minúscula para ahorrarme esto más adelante.
		userEntry = userEntry.trim().toLowerCase();
		length = userEntry.length();
		//Recorro la cadena de caracteres
		for(int i = 0; i < length; i++){
			//Hago el control si es digito, espacio en blanco o vocal
			if(!Character.isWhitespace(userEntry.charAt(i))){
				realLength++;
				letter = userEntry.charAt(i);
				if(Character.isDigit(letter)){
					qtyDigits++;
				}else{
					if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
						qtyVowels++;
					}
				}
			}
		}
		//Calculo el porcentaje dependiendo si las variables son mayor que 0
		if(qtyDigits > 0 || qtyVowels > 0){
			System.out.printf("El porcentaje de digitos en '%s' es: %.1f", userEntry ,(qtyDigits / realLength) * 100);
			System.out.printf("\nEl porcentaje de vocales en '%s' es: %.1f ", userEntry,(qtyVowels / realLength) * 100);
		}else{
			System.out.println("No has ingresado números ni vocales");
		}

		input.close();
	}
}