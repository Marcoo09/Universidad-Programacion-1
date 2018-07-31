/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author Usuario
 */
public class Libro {
    
    private String title;
    private boolean original;
    private boolean prestable;
    private int creationDate;

    public int getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(int creationDate) {
        this.creationDate = creationDate;
    }
    //Setter
    
    public void setTitle(String oneTitle){
        this.title = oneTitle;
    }
    public void setOriginal(boolean isOriginal){
        this.original = isOriginal;
    }
    public void setPrestable(boolean isPrestable){
        this.prestable = isPrestable;
    }
    
    //Getter
    public String getTitle() {
        return title;
    }
    public boolean getOriginal(){
        return this.original;
    }
    public boolean getPrestable(){
        return this.prestable;
    }
    
    public boolean isOriginal() {
        return (this.getOriginal() && !this.getTitle().contains("copia"));
    }

    public boolean isPrestable() {
        return (this.getPrestable()&& this.getTitle().contains("copia"));
    }
    
    @Override
    
    public String toString(){
        String returnData = "El título del libro es: " + this.getTitle();
        if(this.isPrestable()){
            returnData += " , es prestable";
        }
        if(this.isOriginal()){
            returnData+= " , es original";
        }
        return returnData + " y fue escrito hace " + (2018 - this.getCreationDate()) + " años";
    }
    
}
