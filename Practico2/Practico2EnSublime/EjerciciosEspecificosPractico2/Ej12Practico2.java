import java.util.*;

public class Ej12Practico2{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int numSaved = 0;
		int countMultip = 0;
		int numberRequested = 0;
		numberRequested = input.nextInt();

		for(int i = 1; i < 10; i++){
			numberRequested = input.nextInt();
			if(numSaved % numberRequested == 0){
				countMultip++;
			}
		}
		System.out.println("La cantidad de múltiplos ingresados es " + countMultip);
		input.close();	
	}
}