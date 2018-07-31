/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico9;

/**
 *
 * @author Usuario
 */
public class CD implements Comparable<CD>{

    private String title;
    private int number;

    //Constructors
    public CD(String aTitle, int aNumber) {
        this.title = aTitle;
        this.number = aNumber;
    }

    public CD(String aTitle) {
        this.title = aTitle;
        this.number = 0;
    }

    //Setter Methods
    public void setTitle(String aTitle) {
        this.title = aTitle;
    }

    public void setNumber(int aNumber) {
        this.number = aNumber;
    }

    //Getter
    public String getTitle() {
        return this.title;
    }

    public int getNumber() {
        return this.number;
    }

    //ToString override
    @Override
    public String toString() {
        return "El titulo es " + this.getTitle() + "\nY y el número es: " + this.getNumber() + "\n";
    }

     @Override
    //equals To
    public boolean equals(Object ob) {
        boolean result;
        if ((ob == null) || (getClass() != ob.getClass())) {
            result = false;
        } // end if
        else {
            CD otherCd = (CD)ob;
            result = this.getTitle().equals(otherCd.getTitle());
        } // end else

        return result;
    }
    @Override
    public int compareTo(CD o){
        return this.getTitle().compareTo(o.getTitle());
    }

}
