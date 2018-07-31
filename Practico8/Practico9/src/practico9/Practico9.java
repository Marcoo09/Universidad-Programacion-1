/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico9;

/**
 *
 * @author Usuario
 */
import java.util.*;

public class Practico9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Variables of menu
        boolean isMenuExecuted = true;
        Scanner input = new Scanner(System.in);
        int entry = 0;
        
        //Variables of CD
        CD oneCd;
        ArrayList<CD> cdList = new ArrayList<>();
        boolean existThisTitle;
        
        //Collection of CD
        
        CollectionCD collCD = new CollectionCD();
        
        //Menu
        while(isMenuExecuted){
            System.out.println("• agregar un CD(1)\n" +
                                "• listar todos(2)\n" +
                                "• indicar si está el CD de un título dado(3)\n" +
                                "• eliminar un CD(4)\n" +
                                "• cambiar el número al CD de título dado(5)\n" +
                                "• listar todos ordenados por título(6)\n"+
                                "• Salir(7)\n");
            System.out.println("Ingrese una de las opciones del menú: ");
            try{
                entry = input.nextInt();
            }catch(InputMismatchException ex){
                input.next();
            }
            switch(entry){
                case 1:
                    //Create new CD
                    oneCd = Practico9.createCd();
                    collCD.addCD(oneCd);
                    break;
                case 2:
                    Practico9.listAllCd(collCD);
                    break;
                case 3:
                    existThisTitle = Practico9.isAnExistTitle(collCD);
                    if(existThisTitle){
                        System.out.println("Existe");
                    }else{
                        System.out.println("No existe");
                    }
                    break;
                case 4:
                    Practico9.removeCd(collCD);
                    break;
                case 5:
                    Practico9.changeCdTitle(collCD);
                    break;
                case 6:
                    System.out.println(collCD.sort());
                    break;
                case 7:
                    isMenuExecuted = false;
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }
        }
        
    }
    
    public static CD createCd(){
        String title = askForString("el titlo del cd");
        int number = askForNumeric("el numero del cd");
        return new CD(title, number);
    }
    //list CDs
    public static void listAllCd(CollectionCD collCD) {
        Iterator<CD> it = collCD.getCollectionCD().iterator();
        if(collCD.getCollectionCD().size()>0){
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }else{
            System.out.println("No hay cd ingresados");
        }
    }
    
    public static boolean isAnExistTitle(CollectionCD cdList) {
        String title;
        title = Practico9.askForString("el titulo por el cual quieres buscar");
        CD cdUtil = new CD(title);
        
        return cdList.getCollectionCD().contains(cdUtil);
    }
    
    public static void removeCd(CollectionCD cdList){
        int cdNumber;
        Iterator<CD> it = cdList.getCollectionCD().iterator();
        
        cdNumber = askForNumeric("numero de cd a eliminar");
        
        while(it.hasNext()){
            CD next = it.next();
            if(next.getNumber() == cdNumber){
                cdList.getCollectionCD().remove(next);
                break;
            }
        }
    }
    
    public static void changeCdTitle(CollectionCD cdList){
        String title;
        int newNumber;
        int index;
        title = Practico9.askForString("el titulo del libero el cual quieres modificar su numero");
        CD cdUtil = new CD(title);
        CD toModify;
        
        if(cdList.getCollectionCD().contains(cdUtil)){
            newNumber = askForNumeric("nuevo numero");
            index =cdList.getCollectionCD().indexOf(cdUtil);
            toModify = cdList.getCollectionCD().get(index);
            toModify.setNumber(newNumber);
            cdList.getCollectionCD().set(index,toModify);
        }else{
            System.out.println("No se ha encontrado este numero");
        }
    }
    
    public static boolean validateAttribute(int numberToValidate, int intialRange, int finalRange) {
        //Check if the first parameter is between the range
        return (numberToValidate >= intialRange && numberToValidate <= finalRange);
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
