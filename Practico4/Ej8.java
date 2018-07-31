import java.util.*;

public class Ej8{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		float cat1 = 0;
		float cat2 = 0;

		System.out.print("Escribe el valor de un cateto: ");
		cat1 = input.nextFloat();
		input.nextLine();
		System.out.print("Escribe el valor del otro cateto: ");
		cat2 = input.nextFloat();

		System.out.printf("\nEl valor de la hipotenusa es %.2f", Math.sqrt(Math.pow(cat1,2) + Math.pow(cat2,2)));

		input.close();
	}
}