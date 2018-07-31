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
public class Estudiante extends Persona {
    private int identification;
    
    public Estudiante(int id, String name, int age, String address ){
        this.identification = id;
        this.setName(name);
        this.setAge(age);
        this.setAddress(address);
    }

    public int getIdentification() {
        return identification;
    }

    public void setIdentification(int identification) {
        this.identification = identification;
    }
    
    @Override
    
    public String toString(){
        return super.toString() + " y es estudiante"; 
    }
}
