package com.openbootcamp.java.basico.ejercicio4;

public class SmartWatch extends SmartDevice {

    boolean waterResistance;

    public SmartWatch(String brand, String model, String color, String powerAutonomy, boolean waterResistance) {
        super(brand, model, color, powerAutonomy);
        this.waterResistance = waterResistance;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", powerAutonomy=" + powerAutonomy +
                ", waterResistance=" + waterResistance +
                '}';
    }
}
