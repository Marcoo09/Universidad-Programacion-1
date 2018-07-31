import java.util.*;
import java.lang.*;
public class ej4practico1MODIFICADO{
	public static void main(String [] args){

		Scanner input = new Scanner(System.in);
        int number = 0;
        String auxiliarString;
        String asterisc = "*";
        int digite = 0;
		String repeated;
        number = input.nextInt(); // 148
        auxiliarString = Integer.toString(number); //3

		
        for(int i = 1; i <= auxiliarString.length(); i++){ //0 1 2 
        	digite = number / ((int)Math.pow(10,auxiliarString.length() - i)); // 1 4 8
        	repeated = asterisc.repeat(digite);
        	System.out.println(digite + ": " + repeated);// 1 4 8
        	number = number - (digite * ((int)Math.pow(10,auxiliarString.length() - i))); //48 8 0
        	//System.out.println("El valor actual del numero es: " + number);
        }
     	input.close();
	}
}