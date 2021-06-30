/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

import java.io.Serializable;

/**
 *
 * @author saifultech/syakir
 */
public class Staff implements Serializable {
String name;
String email;
String ic;
String position;
String username;
int role;

    public Staff() {
        name = " ";
        email = " ";
        ic = " ";
        position = " ";
        username ="";
    }
    
    public Staff(String username,String name, String email, String ic, String position,int role) {
        this.username=username;
        this.name = name;
        this.email = email;
        this.ic = ic;
        this.position = position;
        this.role = role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getRole() {
        return role;
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

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "Staff{" + "name=" + name + ", email=" + email + ", ic=" + ic + ", position=" + position + '}';
    }

   
}
