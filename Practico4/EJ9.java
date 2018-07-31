import java.util.*;

public class Ej9{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		float lado = 0;
		
		System.out.print("Ingresa el valor del lado del cuadrado: ");
		lado = input.nextFloat();

		System.out.printf("El área del cuadrado es %.2f y el valor de su diagonal es %.2f ", lado*lado, Math.sqrt(Math.pow(lado,2) + Math.pow(lado,2)));

		input.close();

	}
}