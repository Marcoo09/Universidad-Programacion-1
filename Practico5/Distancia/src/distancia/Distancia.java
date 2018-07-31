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
public class Distancia {
    private String unidad;
    private float dist;
    
   public Distancia(){
        this.dist = 100;
        this.unidad = "Kilometers";
    }
   public Distancia(String unidad, float dist){
       this.dist = dist;
       this.unidad = unidad;
   }
   
   public void setDistancia(float dist){
       this.dist = dist;
   }
   public void setUnidad(String unidad){
       this.unidad = unidad;
   }
   
   public float getDistancia(){
       return this.dist;
   }
   public String getUnidad(){
       return this.unidad;
    }
    
    public float convertTo(String unidad){
        if(unidad.equalsIgnoreCase("km") && !this.unidad.equalsIgnoreCase(unidad)){
            this.setUnidad(unidad);
            this.dist = (float) (this.dist * 0.625);
        }else if(unidad.equalsIgnoreCase("mill") && !this.unidad.equalsIgnoreCase(unidad)){
            this.setUnidad(unidad);
            this.dist = (float) (this.dist *1.6);
        }
        return this.dist;
    }
}
