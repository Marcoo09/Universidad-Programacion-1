import java.util.*;
/*
	Escribir el código necesario para mostrar el uso de los siguientes métodos de Math: max, min, abs, pow,
	sqrt. Investigar cuáles otros métodos están disponibles. 

*/
public class Ej2ClaseMath{
	public static void main(String [] args){
		int n1 = 5;
		int n2 = -180;

		System.out.println(Integer.toString(Math.min(n1,n2)) + " minimo" );

		System.out.println(Integer.toString(Math.max(n1,n2)) + " maximo");

		System.out.println((Math.min(Integer.MAX_VALUE,Float.MAX_VALUE)));

		System.out.println(Math.abs(n2) + " absoluto");

		System.out.println(Math.pow(n1,150) + " potencia");

		System.out.println(Math.sqrt(Math.abs(n2)) + " raiz cuadrada");


	}
}