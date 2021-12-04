package com.openbootcamp.java.basico.ejercicios7_8_9;

public class ArrayManager {

    public ArrayManager(){}

    public String reverse(String texto) {
        String textoInverso = "";

        for (int i = (texto.length()-1); i >= 0; i--) {
            textoInverso += texto.charAt(i);
        }
        return "1. String inversa:\n"+"\t"+texto+" -> "+textoInverso+"\n";
    }

    public String imprimirArrayString(String[] arrayTexto) {
        String resultado = "";
        for (String string: arrayTexto) {
            resultado += "\t- "+string+"\n";
        }
        return "2. Imprimir valores de un Array de Strings:\n"+resultado;
    }

    public String imprimirArrayBidimensional (int[][] arrayBidimensional) {
        String resultado = "";
        for (int i = 0; i < arrayBidimensional.length; i++) {
            for (int j = 0; j < arrayBidimensional[i].length; j++) {
                resultado += "\t Posición: ["+i+","+j+"] - Valor: "+arrayBidimensional[i][j]+"\n";
            }
        }
        return "3. Imprimir posición y valores de un Array Bidimesnional:\n"+resultado;
    }
}
