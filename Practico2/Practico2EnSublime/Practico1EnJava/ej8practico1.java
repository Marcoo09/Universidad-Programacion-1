import java.util.*;

public class ej8practico1{
	public static void main(String [] args){
		float sum = 0;
		float sum1and2=0;
		float multp2and3 = 1;
		float data = 0;
		char suma = '+';
		char multipl = '*';

		System.out.println("Ingresa 5 números: ");
		
		Scanner input = new Scanner(System.in);
		for(int i = 1; i <= 5; i++){
			data = input.nextFloat();
			sum+= data;
			if(i == 1 || i == 2){
				sum1and2+= data;
			}
			if(i == 2 || i == 3){
				multp2and3*=data;
			}
		}
		System.out.println("La " + suma + " total de números es: " + sum);
		System.out.println("La " + suma + " del primer y segundo número es: " + sum1and2);
		System.out.println("La " + multipl +" del segundo y tercer número es: " + multp2and3);
		System.out.println("El promedio es: " + sum/5f);

		input.close();
	}
}