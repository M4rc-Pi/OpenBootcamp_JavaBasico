package com.openbootcamp.java.basico.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<SmartDevice> smartDevices;

        //Los atributos son completamente inventados
        SmartDevice smartPhone1 = new SmartPhone("Apple", "v11", "white", "4.5h", "12MP" );
        SmartDevice smartPhone2 = new SmartPhone("Samsung", "Galaxy S", "black", "5h", "11MP");
        SmartDevice smartWatch1 = new SmartWatch("Fitbit", "Sense", "black", "8h", true);
        SmartDevice smartWatch2 = new SmartWatch("Apple", "v7", "white", "7.5h", false);

        smartDevices = new ArrayList<>();
        smartDevices.add(smartPhone1);
        smartDevices.add(smartPhone2);
        smartDevices.add(smartWatch1);
        smartDevices.add(smartWatch2);

        for (SmartDevice smartDevice: smartDevices) {
            System.out.println(smartDevice);
        }
    }
}
