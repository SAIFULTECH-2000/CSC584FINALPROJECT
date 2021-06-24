/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Location;

/**
 *
 * @author SAIFULTECH
 */
public class Hospital {
    String name;
    String region;
    String code;
    String phone;

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public String getCode() {
        return code;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Hospital() {
    }

    public Hospital(String name, String region, String code, String phone) {
        this.name = name;
        this.region = region;
        this.code = code;
        this.phone = phone;
    }
    
}
