import java.lang.*;
import java.util.*;

public class ej5practico2 {
	public static void main(String [] args){
		int suma = 0;
		Scanner input = new Scanner(System.in);
		int dato = 0;
		System.out.println("Escribe algunos números ");
		dato = input.nextInt();

		while(dato != 0){
			if( dato > 0){
				suma += dato;
				if (dato % 2 == 0){
					suma *=2;
				}
			}
			dato = input.nextInt();
		}
		input.close();
		System.out.println("La suma es: " + suma);
	}
}