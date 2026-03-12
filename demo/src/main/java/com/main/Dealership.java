package com.main;

import java.util.ArrayList;
import java.util.List;

import com.extrinsic.Vehicle;
import com.intrinsic.VehicleType;

public class Dealership {

     List<VehicleType> vehicleTypes;
    private List<Vehicle> vehicles;


    public Dealership() {
        this.vehicles = new ArrayList<>();
        this.vehicleTypes = new ArrayList<>();
    }

    public void addVehicleType(String brand, String model, String color){
        this.vehicleTypes.add(new VehicleType(brand, model, color));
    }

    public void showVehicleTypes(){
        System.out.println("Available Vehicle Types:");
        for (VehicleType type : vehicleTypes) {
            System.out.println(type);
        }
    }

    public void addVehicle(String licensePlate, float x, float y, float speed, VehicleType type){
        this.vehicles.add(new Vehicle(licensePlate, x, y, speed, type));
    }

    public void produceVehicle(String licensePlate, float x, float y, float speed, VehicleType type){
        addVehicle(licensePlate, x, y, speed, type);
    }
    
    public List<Vehicle> getVehicles() {
        return vehicles;
    }

   
}
