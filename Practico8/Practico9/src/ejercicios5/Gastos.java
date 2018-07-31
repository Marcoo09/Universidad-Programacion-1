/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios5;

/**
 *
 * @author Usuario
 */
public class Gastos {
    private int amount;
    private int day;
    private String description;
    
    //Constructor
    public Gastos(int anAmount, int aDay, String aDescription){
        this.amount = anAmount;
        this.day = aDay;
        this.description = aDescription;
    }
    
    //Getter and Setters
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
 
    @Override
    public String toString(){
        return "El gasto es de " + this.getAmount() + "\nEl día fue: " + this.getDay() + "\nSu descripción es: " + this.getDescription() + "\n";
    }
}
