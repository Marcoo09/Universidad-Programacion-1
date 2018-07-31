/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Socio {
    private String nombre;
    private int numero;
    private static int ProximoNumero = 1;
    
    //Constructores
    public Socio(String unNombre){
        this.nombre = unNombre;
        this.numero = ProximoNumero;
        ProximoNumero++;
    }
    //Metodos de modificacion
    public void setNombre(String unNombre){
        this.nombre = unNombre;
    }
    
    //Metodos de modificación
    
    public String getNombre(){
        return "El nombre del socio es " + this.nombre; 
    }
    public int getNumero(){
        return this.numero;
    }
}
