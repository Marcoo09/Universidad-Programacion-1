import java.util.*;
/*
	 Sean las variables enteras: largo=18 y ancho=3 y la variable double altura = 2.25.
	Indicar el valor de:
	a. largo / ancho d. ancho % altura
	b. largo / altura e. largo * ancho + altura
	c. largo % ancho f. largo + ancho * altura 

*/
public class Ej3{
	public static void main(String [] args){
		int largo = 18;
		int ancho = 3;
		double altura = 2.25;

		System.out.println("largo / ancho " + (largo/ancho));

		System.out.println("ancho % altura " + (ancho % altura));

		System.out.println("largo / altura " + (largo / altura));

		System.out.println("largo * ancho + altura " + (largo * ancho + altura));

		System.out.println("largo % ancho " + (largo % ancho));

		System.out.println("largo + ancho * altura " + (largo + ancho * altura ));



	}
}