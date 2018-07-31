import java.util.*;
/*
	Escribir el código necesario que ejemplifique el uso de los siguientes métodos de String: equals,
	compareTo, indexOf, length, toUpperCase, toLowerCase, equalsIgnoreCase, trim. 

*/
public class Ej1{
	public static void main(String [] args){

		String str1 = "Marco";
		String str2 = new String("Marco");
		System.out.println(Boolean.toString(str1.equals(str2)));

		String str3 = "Fiorito Marco";

		System.out.println(str1.compareTo(str3));

		System.out.println(str1.indexOf("r"));

		System.out.println(str2.toUpperCase());

		System.out.println(str2.toLowerCase());

		String pruebaTrim = "          un texto con       muchos      espacios    ";
		System.out.println(pruebaTrim);
		System.out.println(pruebaTrim.trim() + "gracias al método Trim ahora tiene menos");

		System.out.println(str1.charAt(4));

	}
}