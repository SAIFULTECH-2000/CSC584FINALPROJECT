/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

import java.io.Serializable;

/**
 *
 * @author saifultech
 */
public class Staff implements Serializable {
String name;
String email;
String ic;
String position;

    public Staff(){}

    public Staff(String name, String email, String ic, String position) {
        this.name = name;
        this.email = email;
        this.ic = ic;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getIc() {
        return ic;
    }

    public String getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Staff{" + "name=" + name + ", email=" + email + ", ic=" + ic + ", position=" + position + '}';
    }

   
}
