import java.util.*;

public class Ej4Practico2{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		float suma = 0;
		float data= -1;
		int counter = 0;
		do{
			System.out.println("Por favor ingresa numeros para calcular el promedio");
			data = input.nextFloat();
			suma += data;
			counter++; 
		}while(data != 0);

		System.out.printf("El promedio es: %.3f", (suma / counter));
		input.close();
	}
}