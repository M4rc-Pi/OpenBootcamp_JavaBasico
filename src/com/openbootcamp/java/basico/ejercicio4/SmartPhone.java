package com.openbootcamp.java.basico.ejercicio4;

public class SmartPhone extends SmartDevice{

    String cameraResolution;

    public SmartPhone(String brand, String model, String color, String powerAutonomy, String cameraResolution) {
        super(brand, model, color, powerAutonomy);
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", powerAutonomy=" + powerAutonomy +
                ", cameraResolution=" + cameraResolution +
                '}';
    }
}
