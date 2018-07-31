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
public class Jornalero extends Functionario {
    private int cantidadJornales;
    private int valorJornal;

    public int getCantidadJornales() {
        return cantidadJornales;
    }

    public void setCantidadJornales(int cantidadJornales) {
        this.cantidadJornales = cantidadJornales;
    }

    public int getValorJornal() {
        return valorJornal;
    }

    public void setValorJornal(int valorJornal) {
        this.valorJornal = valorJornal;
    }
    
    @Override
    public int calcularSueld(){
        return this.getValorJornal() * this.getValorJornal();
    }
}
