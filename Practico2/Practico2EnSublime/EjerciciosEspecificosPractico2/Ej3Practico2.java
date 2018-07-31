import java.util.*;


public class Ej3practico2{
	public static void main(String [] args){

		Scanner input = new Scanner(System.in);
		float entry = 0;
		float sum = 0f;

		for(int i = 1; i <= 10; i++){
			System.out.println("Ingrese un número para ser sumado: ");
			entry = input.nextFloat();
			sum += entry;
		}
		System.out.printf("La suma de los 10 números es: %f", sum);
		input.close();
	}
}