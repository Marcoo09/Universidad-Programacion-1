/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico8;

/**
 *
 * @author Usuario
 */
public abstract class Functionario {
    private String name;
    private int sueldo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    @Override
    
    public String toString(){
        return "El nombre del funcionario es" + this.getName() + "/n" + "Y su sueldo es " + this.getSueldo();
    }
    
    public abstract int calcularSueld(); 
   
}
