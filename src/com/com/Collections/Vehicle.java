package com.com.Collections;

/**
 * Created by nadimchouglay on 26/12/2018.
 */
public class Vehicle {
    String make;
    String model;
    int price;

    public Vehicle(String make, String model, boolean fourWDrive, int price) {
        this.make = make;
        this.model = model;
        this.fourWDrive = fourWDrive;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public boolean isFourWDrive() {
        return fourWDrive;
    }

    public void setFourWDrive(boolean fourWDrive) {
        this.fourWDrive = fourWDrive;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", fourWDrive=" + fourWDrive +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    boolean fourWDrive;

}
