package com.openbootcamp.java.basico.ejercicio3;

import java.util.List;

public class Concatenador {

    String stringsConcatenados = " ";

    public Concatenador(){};

    protected String concatenarStrings (List<String> strings) {
        for (String string: strings) {
            stringsConcatenados += string + "-";
        }
        return stringsConcatenados;
    }
}
