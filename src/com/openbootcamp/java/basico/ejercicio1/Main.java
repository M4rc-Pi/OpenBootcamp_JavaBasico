package com.openbootcamp.java.basico.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        byte byte1 = 1;
        short short1 = 2;
        int entero = 3;
        long entero2 = 4;

        float decimal = 0.5f;
        double decimal2 = 1.5d;
        char caracter = 'm';

        boolean verdadero = true;

        String string = "Hola";

        String print = "Byte: "+byte1+"\n"
                +"Short: "+short1+"\n"
                +"Int: "+entero+"\n"
                +"Long: "+entero2+"\n"
                +"Float: "+decimal+"\n"
                +"Double: "+decimal2+"\n"
                +"Char: "+caracter+"\n"
                +"Boolean: "+verdadero+"\n"
                +"String: "+string+"\n";

        System.out.println(print);
    }
}
