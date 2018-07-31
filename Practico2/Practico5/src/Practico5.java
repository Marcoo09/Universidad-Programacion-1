/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Usuario
 */

import java.util.*;

public class Practico5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangulo tri = new Triangulo(7,8,7);
        
        System.out.println(tri.esEquilatero());
        
        System.out.println(tri.esEscaleno()); 
        
        System.out.println(tri.esIsosceles()); 
        
        Socio s1 = new Socio("Marco Fiorito");
        
        System.out.println(s1.getNombre() + " y su número de socio es " + s1.getNumero());
        s1.setNombre("Darío");
        System.out.println(s1.getNombre() + " y su número de socio es " + s1.getNumero());
        
        Socio s2 = new Socio("Enzo Fiorito");
        System.out.println(s2.getNombre() + " y su número de socio es " + s2.getNumero());
        
    }
    
}
