/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Pract9Ej5 {
    public static void main(String [] args){
        boolean isMenuExecuted = true;
        int entry;
        Scanner input = new Scanner(System.in);
        
        Gastos gasto;
        Gastos gastoMax;
        GastosDeLaCasa gastosDeLaCasa = new GastosDeLaCasa();
        
        while(isMenuExecuted){
            System.out.println("• Ingresar gasto(1)\n" +
                                "• Listar gastos(2)\n" +
                                "• Descripción del gasto de mayor monto(3)\n" +
                                "• Salir(4)\n");
            System.out.println("Ingrese una de las opciones del menú: ");
            entry = input.nextInt();
            
            switch(entry){
                case 1:
                    gasto = Pract9Ej5.addGasto();
                    gastosDeLaCasa.addGasto(gasto);
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println(gastosDeLaCasa.getGastos());
                    break;
                case 3:
                    //Maximo
                    if(gastosDeLaCasa.getGastos().size() != 0){
                        gastoMax = gastosDeLaCasa.getMaxGastoDescription();
                        System.out.println("La descripción es: " + gastoMax.getDescription());
                    }else{
                        System.out.println("No hay gastos de la casa ingresados");
                    }
                    break;
                case 4:
                    isMenuExecuted = false;
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }
        }
    }
    
    public static Gastos addGasto(){
        int day = askForNumeric("el día");
        int amount = askForNumeric("el gasto");
        String description = askForString("la descripción");
        return new Gastos(amount, day, description);
        
    }
    
    //This method ask for a String and return the value
    public static String askForString(String whatToAsk) {
        Scanner inputString = new Scanner(System.in);
        System.out.print("Ingrese " + whatToAsk + ": ");
        return inputString.nextLine();
    }

    //This method ask for a Number and return the value
    public static int askForNumeric(String whatToAsk) {
        Scanner inputNumeric = new Scanner(System.in);
        System.out.print("Ingrese " + whatToAsk + ": ");
        return inputNumeric.nextInt();
    }
}
