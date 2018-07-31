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
public class Persona {

    private String name;
    private int age;
    private String address;
    
    //Constructors
    public Persona(){
        this.name = "Sin especificar";
        this.age = 0;
        this.address = "18 de julio";
    }
    public Persona(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    protected String getAddress() {
        return address;
    }

    protected void setAddress(String address) {
        this.address = address;
    }
    
    //toString
    @Override
    public String toString(){
        return "Es persona";
    }
}
