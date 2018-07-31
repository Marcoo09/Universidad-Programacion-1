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
import java.util.ArrayList;
import java.util.Collections;

public class CollectionCD {
    private ArrayList<CD> collectionCD;

    public CollectionCD() {
        this.collectionCD = new ArrayList<>();
    }
    
    public ArrayList<CD> getCollectionCD() {
        return this.collectionCD;
    }

    public void addCD(CD oneCD) {
        this.getCollectionCD().add(oneCD);
    }
    
    public void removeCD(CD oneCD){
        this.getCollectionCD().remove(oneCD);
    }
    public ArrayList sort(){
        Collections.sort(this.getCollectionCD());
        return this.getCollectionCD();
    }
}
