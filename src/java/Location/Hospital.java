/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Location;

/**
 *
 * @author SAIFULTECH/syakir
 */
public class Hospital {
    String name_hospital;
    String address_hospital;
    String pic;
    
    public String getName() {
        return name_hospital;
    }

    public String getAddress() {
        return address_hospital;
    }

    public String getPIC() {
        return pic;
    }

    public void setName(String name_hospital) {
        this.name_hospital = name_hospital;
    }

    public void setAddress(String address_hospital) {
        this.address_hospital = address_hospital;
    }

    public void setPIC(String pic) {
        this.pic = pic;
    }

    public Hospital() {
    }

    public Hospital(String name_hospital, String address_hospital, String pic) {
        this.name_hospital = name_hospital;
        this.address_hospital = address_hospital;
        this.pic = pic;
    }
    
}
