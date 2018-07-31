/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author Usuario
 */
public class Biblioteca {

    public static void main(String [] args){
        
        Libro l1 = new Libro();
        l1.setTitle("Python copia");
        l1.setPrestable(true);
        l1.setOriginal(true);
        l1.setCreationDate(2017);
        
        Libro l2 = new Libro();
        l2.setTitle("Calculo ");
        l2.setPrestable(true);
        l2.setOriginal(true);
        l2.setCreationDate(2018);

        System.out.println(l1 + " \n" + l2);
    }
    
}
