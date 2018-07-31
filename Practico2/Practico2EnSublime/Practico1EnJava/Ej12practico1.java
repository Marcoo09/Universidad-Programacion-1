import java.util.*;

public class Ej12practico1{
	public static void main(String [] args){
		int num = 0;
		double raiz = 0;

		for(int i = 0; i <= 9; i++){
			for(int j = 0; j <= 9; j++){
				num = i*1000 + i*100 + j*10 + j*1;
				raiz = Math.sqrt(num);
				//System.out.printf("\nEl numero actual es: %d La ra;iz es %f",num,raiz);
				if(raiz == (int)Math.sqrt(num)){
					System.out.println(num);
				}	
			}
		}
	}
}