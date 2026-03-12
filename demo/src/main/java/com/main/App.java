package com.main;

import java.util.Random;

import com.intrinsic.VehicleType;

public class App {

    public static void main(String[] args) {

        Dealership dealership = new Dealership();
        Runtime runtime = Runtime.getRuntime();

        // Crear múltiples VehicleTypes que serán reutilizados
        VehicleType type1 = new VehicleType("Toyota", "Camry", "Rojo");
        VehicleType type2 = new VehicleType("Honda", "Civic", "Azul");
        VehicleType type3 = new VehicleType("Ford", "Mustang", "Negro");
        VehicleType type4 = new VehicleType("BMW", "M3", "Plata");
        VehicleType type5 = new VehicleType("Tesla", "Model3", "Blanco");

        VehicleType[] types = {type1, type2, type3, type4, type5};

        
        for (int i = 0; i < 4000000; i++) {
            String licensePlate = "PLATE" + i;
            float x = i + 10;         // Valores aleatorios para posición
            float y = (i - 10);
            float speed = new Random().nextFloat() * 120; // Velocidad aleatoria entre 0 y 120
            
            speed = Math.round(speed * 100) / 100.0f; // Redondear a 2 decimales
            
            // Seleccionar tipo de forma cíclica 
            VehicleType selectedType = types[i % types.length];

            dealership.addVehicle(licensePlate, x, y, speed, selectedType);
        }

        // Medir memoria después de crear los vehículos
        long totalMemory = runtime.totalMemory() / (1024 * 1024);
        long freeMemory = runtime.freeMemory() / (1024 * 1024);
        long usedMemory = totalMemory - freeMemory;

        System.out.println("Resultados:");
        System.out.println("  - Total de vehículos creados: " + dealership.getVehicles().size());
        System.out.println("  - Tipos de vehículos únicos: " + types.length);
        System.out.println("  - Vehículos por tipo: " + (4000000 / types.length));
        System.out.println("  - Memoria total disponible: " + totalMemory + " MB");
        System.out.println("  - Memoria final: " + freeMemory + " MB");
        System.out.println("  - Memoria utilizada: " + usedMemory + " MB");

        // Información de algunos vehículos
        System.out.println("\nMuestreo de vehículos (placas 100-109):");
        for (int i = 100; i < 110 && i < dealership.getVehicles().size(); i++) {
            System.out.println("Vehículo " + (i + 1) + ":");
            dealership.getVehicles().get(i).getInfo();
            System.out.println();
        }

    }
}
