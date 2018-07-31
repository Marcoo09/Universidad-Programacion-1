import java.util.*;
/*
	Cantidad de secuencias estrictamente ascendentes
*/
public class Ej9practico1{
	public static void main(String args []){
		int anterior = Integer.MAX_VALUE;
		int sequencies = 0;
		int data = 0;
		String sequenciesText = " secuencias";
		Scanner input = new Scanner(System.in);

		for(int i = 1; i <= 10; i++){
			System.out.print("Ingresa un número: ");
			data = input.nextInt();
			if(data < anterior){
				sequencies++;
			}
			anterior = data;
		}

		System.out.println("Hay " + sequencies + sequenciesText + " estrictamente ascendentes");
		input.close();

	}
}