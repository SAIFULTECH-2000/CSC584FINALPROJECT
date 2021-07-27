/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Location;

/**
 *
 * @author Saiful/Syakir
 */
public class Send {
    int id_hospital;
    int quantity;
    String bloodtype;

    public Send() {
        id_hospital=0;
        quantity=0;
        bloodtype=" ";
    }
    
    public Send(int id_hospital, int quantity,String bloodtype) {
        this.id_hospital = id_hospital;
        this.quantity = quantity;
        this.bloodtype = bloodtype;
    }

    public int getId_hospital() {
        return id_hospital;
    }

    public int getQuantity() {
        return quantity;
    }
    
    public String getBloodtype(){
        return bloodtype;
    }

    public void setId_hospital(int id_hospital) {
        this.id_hospital = id_hospital;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }

    @Override
    public String toString() {
        return "Send{" + "id_hospital=" + id_hospital + ", quantity=" + quantity + ", bloodtype=" + bloodtype + '}';
    }

    
    
    
    
}
