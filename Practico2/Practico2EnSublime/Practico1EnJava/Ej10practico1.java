import java.util.*;

public class Ej10practico1{
	public static void main(String [] args) {
		int sumTotal = 0; //suma de todos los números
		int sumaMax = 0; // suma hasta el máximo
		int max = Integer.MIN_VALUE;
		int data = 0;
		Scanner input = new Scanner(System.in);
		int quantityN = 0;

		System.out.print("Escribe un número que determinará la cantidad de números que serán solicitados después: ");
		quantityN = input.nextInt();

		for(int i = 1; i <= quantityN; i++){
			System.out.println("Escribe un número: ");
			data = input.nextInt();

			sumTotal += data;
			if(data > max){
				sumaMax = sumTotal;
				max = data;
			}
		}
		if (quantityN > 0){
			System.out.printf("La suma total es: %d\nEl máximo es: %d ",sumTotal,max);
		}else{
			System.out.println("Como ingresaste un 0 no se ejecuto el programa");
		}
		input.close();
	}
}