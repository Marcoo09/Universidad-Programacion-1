import java.util.*;
/*
	Pedir 8 números, calcular los dos números pares mayores e indicar el resultado de:
	a. sumarlos
	b. elevarlos al cuadrado.
	c. el valor absoluto de su resta
	d. su división en punto flotante 
*/
public class Ej4{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int major1 = Integer.MIN_VALUE;
		int major2 = Integer.MIN_VALUE;
		int entry = 0;

		for (int i = 1; i <= 8; i++) {
			System.out.print("Escribe un número: ");
			entry = input.nextInt();
			if(entry % 2 == 0){
				if(entry > major1){
					major2 = major1;
					major1 = entry;

				} else if(entry > major2){
					major2 = entry;
				}
			}		
		}

		System.out.printf("El mayor es %d y el que le sigue es %d \n", major1, major2);

		System.out.println("La suma de estos es: " + (major1 + major2));

		System.out.printf("Elevados al cuadrado: %.2f , %.2f \n", Math.pow(major1 , 2), Math.pow(major2 , 2));

		System.out.printf("El valor absoluto de la resta es %d \n", Math.abs(major2 - major1));

		System.out.printf("Su división en float es: %f \n", (float)major1 / major2);

		input.close();
	}
}
