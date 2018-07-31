import java.util.*;

public class ej4practico1{
	public static void main(String [] args){
		char digite;
		int data;
		Scanner input = new Scanner(System.in);

		System.out.println("Escribe el número el cual quieres que muestre sus digitos por separado");
		data = input.nextInt();

		while(data > 0){
			System.out.println(data % 10);
			data = data / 10;
			System.out.println("El valor actual del dato que ingresaste es: " + digite);

		}
		input.close();
	}
}