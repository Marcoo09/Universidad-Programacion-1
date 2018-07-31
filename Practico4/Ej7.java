import java.util.*;
import javax.swing.JOptionPane;

/*
	Programar un método que pida una letra por pantalla y devuelva su posición en el alfabeto. 
*/

public class Ej7{
	public static void main(String [] args){
		char a = ' ';
		int positionA = 96;
		int positionAlphabet = 0;
		boolean entro = false;
		a = (JOptionPane.showInputDialog("Digite una cadena: ")).trim().toLowerCase().charAt(0);

		System.out.println(" " + (int)a);

		if((Character.isLetter(a)) && ((int)(a) > positionA)){
			positionAlphabet = (int)a - positionA;
			entro = true;
		}

		if(entro){
			JOptionPane.showMessageDialog(null,"La posición del alfabeto es : " + positionAlphabet);
		}else{
			JOptionPane.showMessageDialog(null, "No ingresaste una letra del alfabeto");
		}

	}
}


