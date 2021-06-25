/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

/**
 *
 * @author SAIFULTECH/syakir
 */
public class Donator {
    String gender;
    String name;
    String ic;
    String address;
    String phone;
    String bloodtype;
    String history;

    public Donator(String gender, String name, String ic, String address, String phone, String bloodtype, String history) {
        this.gender = gender;
        this.name = name;
        this.ic = ic;
        this.address = address;
        this.phone = phone;
        this.bloodtype = bloodtype;
        this.history = history;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getIc() {
        return ic;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public String getHistory() {
        return history;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }

    public void setHistory(String history) {
        this.history = history;
    }
    
}
