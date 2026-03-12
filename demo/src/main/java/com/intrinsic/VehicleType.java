package com.intrinsic;

public class VehicleType {

    private String brand;
    private String model;
    private String color;

    public VehicleType(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }
   
    public VehicleType() {
    
    }

    @Override
    public String toString() {
        return brand + " " + model + " (" + color + ")";
    }
}
