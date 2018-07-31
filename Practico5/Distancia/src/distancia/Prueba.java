/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distancia;

/**
 *
 * @author Usuario
 */
public class Prueba {
    public static void main(String [] args){
        Distancia dist = new Distancia("km", 100);
        System.out.println("La unidad es " + dist.getUnidad()+ " y las distancia es " + dist.getDistancia());
        float dist2 =  dist.convertTo("mill");
        System.out.println("La unidad es " + dist.getUnidad()+ " y las distancia es " + dist.getDistancia());
        float dist3 = dist.convertTo("km");
        System.out.println("La unidad es " + dist.getUnidad()+ " y las distancia es " + dist.getDistancia());


    }
}
