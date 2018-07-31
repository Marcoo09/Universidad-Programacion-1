/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Triangulo {
    
    private float lado1;
    private float lado2;
    private float lado3;
    
    //Constructores
    
    public Triangulo(){
        this.lado1 = 0;
        this.lado1 = 0;
        this.lado1 = 0;
    }
    public Triangulo(float lado1, float lado2, float lado3){
        /*
        this.setLado1(lado1);
        this.setLado2(lado2);
        this.setLado3(lado3);
          */    
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    //Metodos de modificación
    public void setLado1(float lado1){
        this.lado1 = lado1;
    }
    public void setLado2(float lado2){
        this.lado2 = lado2;
    }
    public void setLado3(float lado3){
        this.lado3 = lado3;
    }
    
    //Metodos de acceso
    public float getLado1(){
        return this.lado1;
    }
    public float getLado2(){
        return this.lado2;
    }
    public float getLado3(){
        return this.lado3;
    }
    
    //Metodos
    /*
        a. esEscaleno
        b. esIsósceles
        c. esEquilátero
        d. tieneAnguloRecto 
    */
    
    public boolean esEquilatero(){
        boolean esEquilatero = false;
        if((this.lado1 == this.lado2) && (this.lado2 == this.lado3)){
            esEquilatero = true;
           }
        return esEquilatero;
    }
    public boolean esEscaleno(){
        boolean esEscaleno = false;
        if((this.lado1 != this.lado2) && (this.lado1 != this.lado3) && (this.lado3 != this.lado2)){
            esEscaleno = true;
        }
        return esEscaleno;
    }
    public boolean esIsosceles(){
        boolean esIsosceles = false;
        if(((this.lado1 == this.lado2) || (this.lado1 == this.lado3) || (this.lado2 == this.lado3)) ){
            esIsosceles = true;
         }
        return esIsosceles;
    }
    
}
