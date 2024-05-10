package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phoneNumber;

    private ArrayList<Vehicle> vehicles;

    public Dealership(String name, String address, String phoneNumber, ArrayList<Vehicle> vehicles) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.vehicles = vehicles;

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public Vehicle getVehiclesByPrice() : List<Vehicle>


    public void addVehicle(Vehicle vehicle) {

    }
    public void removeVehicle(Vehicle vehicle) {

    }
}
