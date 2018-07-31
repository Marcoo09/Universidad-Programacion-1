import java.util.*;

public class Ej5Practico2{
	public static void main(String[] args) {
		int firstNumber = 0;
		int secondNumber = 0;
		int thirdNumber = 0;
		Scanner input = new Scanner(System.in);
		Scanner stringInput = new Scanner(System.in);
		boolean repeat = true;
		String confirm = "";

		while(repeat){

			System.out.print("Escribe el primer número: ");
			firstNumber = input.nextInt();
			System.out.print("Escribe el segundo número: ");
			secondNumber = input.nextInt();
			System.out.print("Escribe el tercer número: ");
			thirdNumber = input.nextInt();

			if(firstNumber == secondNumber){
				System.out.println("El número que se repite es el: " + firstNumber);
			}else{
				if(secondNumber == thirdNumber || firstNumber == thirdNumber){
					System.out.println("El número que se repite es el: " + thirdNumber);
				}
				else{
					System.out.println("Escribiste todos diferentes. ");
				}
			}

			System.out.println("Si quieres volver a jugar presiona S: ");
			confirm = stringInput.nextLine();
			//System.out.println(confirm + " " +(confirm.toLowerCase()) + (confirm.toLowerCase().equals("s")));
			if(!confirm.equalsIgnoreCase("s")){
				repeat = false;
			}
			
		}
		input.close();
	}
}