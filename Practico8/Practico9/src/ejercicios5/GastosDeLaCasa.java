/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
/**
 *
 * @author Usuario
 */
public class GastosDeLaCasa {
    
    private ArrayList<Gastos> gastos;
    
    public GastosDeLaCasa(){
        this.gastos = new ArrayList<>();
    }

    public ArrayList<Gastos> getGastos() {
        return this.gastos;
    }

    public void addGasto(Gastos gasto) {
        this.getGastos().add(gasto);
    }
    
    public Gastos getMaxGastoDescription(){
        Iterator <Gastos> it = this.getGastos().iterator();
        int aux = 0;
        Gastos gAux = null;
        while(it.hasNext()){
            if(it.next().getAmount() >= aux){
                aux = it.next().getAmount();
                gAux = it.next();
           }
        }
        return gAux;
    }

}
