/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resystem;

/**
 *
 * @author Abd El Rahman
 */
public class Customer extends Person{
    
    ArrayList<Apartement> AquiredApartements;

    public ArrayList<Apartement> getAquiredApartements() {
        return AquiredApartements;
    }

    public void setAquiredApartements(ArrayList<Apartement> AquiredApartements) {
        this.AquiredApartements = AquiredApartements;
    }  
    
}
