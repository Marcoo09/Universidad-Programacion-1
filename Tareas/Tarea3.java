import java.util.*;
/* 
	Trabajo realizado por:
	Marco Fiorito - Nro 227548 
	Universidad ORT 
	Carrera Ingeniería en Sistemas 
	Entregado: 14/04/2018
*/
public class Tarea3{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int number = 0;		
		int digite = 0;
		int length = 0;

		System.out.print("Por favor ingrese un número: ");
		number = input.nextInt();
		//Convierto el número en String para luego obtener su largo.
		length = (Integer.toString(number)).length();
		//Si el número es menor que 0 le resto 1 para que su largo no se vea influido por el signo -
		if(number < 0){
			length -= 1;
		}
		for(int i = 1; i <= length; i++){
			//Utilizo las potencias de 10 para obtener el valor entero de cada digito, lo debo castear dado que Math.pow da como resultado un float
			//Utilizo una conversión no segura pero estoy seguro que la potencia de 10 de un número entero siempre es entera.\
			digite = number / ((int)Math.pow(10,length - i));
			System.out.print("\n" + digite + ": ");
			//Reasigno number para que en la próxima iteración obtener otro digito
        	number = number - (digite * ((int)Math.pow(10,length - i))); 
			while(digite != 0){
				System.out.print("*");
				//Si no hago lo siguiente para valores + o - no funcionará.
				if(digite > 0){
					digite--;
				}
				else{
					digite++;
				}
			}
		}
		input.close();
	}
}