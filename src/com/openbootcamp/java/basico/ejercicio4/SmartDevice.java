package com.openbootcamp.java.basico.ejercicio4;

abstract public class SmartDevice {

    String brand;
    String model;
    String color;
    String powerAutonomy;

    public SmartDevice (String brand, String model, String color, String powerAutonomy) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.powerAutonomy = powerAutonomy;
    }
}
