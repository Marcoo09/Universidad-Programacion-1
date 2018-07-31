import java.util.*;

public class Ej11Practico2{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int positiveNumber = 0;
		int contadorDigitos = 0;
		System.out.println("Por favor ingresa numeros positivos ");
		positiveNumber = input.nextInt();

		while(positiveNumber != 0){
			contadorDigitos++;
			positiveNumber = positiveNumber/10;
		}
		System.out.println(contadorDigitos);
	}
}