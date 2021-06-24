/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

/**
 *
 * @author SAIFULTECH
 */
public class BloodDonator {
    String ic;
    String quantity;

    public String getIc() {
        return ic;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public BloodDonator() {
    }

    public BloodDonator(String ic, String quantity) {
        this.ic = ic;
        this.quantity = quantity;
    }
    
}
