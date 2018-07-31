import java.util.*;

public class ej7practio1{
	public static void main(String [] args){
		int number;
		int major1 = Integer.MIN_VALUE;
		int major2 = Integer.MIN_VALUE;
		Scanner input = new Scanner(System.in);
		int data;

		System.out.println("Ingresar un número: ");
		data = input.nextInt();
		while(data != 0){

			if(data > major1){
				major2 = major1;
				major1 = data;
			}else{
				if(data > major2){
					major2 = data;
				}
			}
			System.out.println("Ingresar un número: ");
			data = input.nextInt();
		}
		if((major1 == Integer.MIN_VALUE) && (major2 == Integer.MIN_VALUE)){
			System.out.println("No ingresaste ningún número");
		}else{
			System.out.println("El número mayor es: "+ major1);
			System.out.println("El segundo número mayor es: " + major2);
		}
		input.close();
	}
}