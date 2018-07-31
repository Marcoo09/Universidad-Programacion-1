import java.util.*;

public class Ej11practico1{
	public static void main(String [] args){
		//se asume que el trabajador entra y sale el mismo día
		int entryHourEmployee = 0;
		int departureHourEmployee = 0;
		int entryMinuteEmployee = 0;
		int departureMinuteEmployee = 0;
		int timeEntry = 0;
		int timeDeparture = 0;
		int timeHourWorked = 0;
		int timeMinutesWorked = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("Ingrese la hora de entrada y salida del trabajador: ");
		System.out.print("\nHora de entrada: ");
		entryHourEmployee = input.nextInt();
		System.out.print("\nMinuto de entrada: ");
		entryMinuteEmployee = input.nextInt();
		System.out.print("\nHora de salida: ");
		departureHourEmployee = input.nextInt();
		System.out.print("\nMinuto de salida: ");
		departureMinuteEmployee = input.nextInt();

		timeEntry = (entryHourEmployee) * 60 + entryMinuteEmployee;
		timeDeparture = (departureHourEmployee) * 60 + departureMinuteEmployee;
		timeHourWorked = (timeDeparture - timeEntry) / 60 ;
		timeMinutesWorked = (timeDeparture - timeEntry) % 60 ;

		if(timeHourWorked < 10 && timeMinutesWorked >= 10){
			System.out.printf("\nEl trabajador trabajó 0%d:%d", timeHourWorked, timeMinutesWorked);
		}
		else if(timeHourWorked >= 10 && timeMinutesWorked < 10){
			System.out.printf("\nEl trabajador trabajó %d:0%d", timeHourWorked, timeMinutesWorked);
		}
		else if(timeHourWorked < 10 && timeMinutesWorked < 10){
			System.out.printf("\nEl trabajador trabajó 0%d:0%d", timeHourWorked, timeMinutesWorked);
		}
		else if(!(timeHourWorked < 10 && timeMinutesWorked < 10)) {
			System.out.printf("\nEl trabajador trabajó %d:%d", timeHourWorked, timeMinutesWorked);
		}
		input.close();
	}
}