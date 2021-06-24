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
public class Submission {
    String personincas;
    String quantity;
    String hospitalcode;
    String date;

    public Submission(String personincas, String quantity, String hospitalcode, String date) {
        this.personincas = personincas;
        this.quantity = quantity;
        this.hospitalcode = hospitalcode;
        this.date = date;
    }

    public Submission() {
    }

    public String getPersonincas() {
        return personincas;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getHospitalcode() {
        return hospitalcode;
    }

    public String getDate() {
        return date;
    }

    public void setPersonincas(String personincas) {
        this.personincas = personincas;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setHospitalcode(String hospitalcode) {
        this.hospitalcode = hospitalcode;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
}
