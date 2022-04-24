/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travelhistory;

import java.io.Serializable;

/**
 *
 * @author peter john
 */
public class Person implements Serializable {
    
    private String name;
    private String address;
    private String location;
    private String contactNumber;
    private String time;
    private String date;
    private String temperature;

    public Person() {
    }
    
    
    public Person(String name, String address, String location, String contactNumber, String time, String date, String temperature) {
        this.name = name;
        this.address = address;
        this.location = location;
        this.contactNumber = contactNumber;
        this.time = time;
        this.date = date;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

}
