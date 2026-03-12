package com.extrinsic;

import com.intrinsic.VehicleType;

public class Vehicle {

    private String licensePlate;
    private float x;
    private float y;
    private float speed;
    private VehicleType type;
    
    public Vehicle(String licensePlate, float x, float y, float speed, VehicleType type) {
        this.licensePlate = licensePlate;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.type = type;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getType() {
        return type.toString();
    }

    public void getInfo(){
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Position: (" + x + ", " + y + ")");
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Vehicle Type: " + getType());
    }

}
