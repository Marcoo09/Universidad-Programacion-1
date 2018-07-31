import java.util.*;

public class Ej10Practico2{
	public static void main(String args[]){
		Scanner numberInput = new Scanner(System.in);
		Scanner stringInput = new Scanner(System.in);
		boolean repeat = true;

		float firstNumber = 0;
		float secondNumber = 0;
		String operation = new String();
		System.out.print("Por favor ingresa el primer número: ");
		firstNumber = numberInput.nextFloat();
		System.out.print("Por favor ingresa el segundo número: ");
		secondNumber = numberInput.nextInt();

		System.out.print("Ingresa:  s - S U M A R /r - R E S T A R / m - M U L T I P L I C A R / d - D I V I D I R ");
		operation = stringInput.nextLine();

		if(operation.toLowerCase().equals("s")){
			System.out.printf("%f + %f = &f ",secondNumber, firstNumber, (secondNumber + firstNumber));
		}else if(operation.toLowerCase().equals("r")){
			System.out.printf("%f - %f = &f ",secondNumber, firstNumber, (secondNumber - firstNumber)); 
		}else if(operation.toLowerCase().equals("m")){
			System.out.printf("%f * %f = &f ",secondNumber, firstNumber, (secondNumber * firstNumber)); 
		}else if(operation.toLowerCase().equals("d")){
			System.out.printf("%f / %f = &f ",secondNumber, firstNumber, (secondNumber / firstNumber)); 
		}else{
			System.out.println("No seleccionaste ninguna de las operaciones");
		}
		stringInput.close();
	}
}