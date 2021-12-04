package com.openbootcamp.java.basico.ejercicios7_8_9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

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

    public String añadirElementosVector(String[] elementosVector) {
        Vector<String> vector = new Vector<>();
        for (String elemento : elementosVector) {
            vector.addElement(elemento);
        }
        Vector<String>vectorRemovido = (Vector<String>) vector.clone();
        vectorRemovido.removeElementAt(1);
        vectorRemovido.removeElementAt(1);
        return "4. Añadir 5 elementos a un vector y eliminar el 2do y 3er elemento:\n"
                +"\tVector completo: "+vector+"\n"
                +"\tVector removido: "+vectorRemovido;
    }

    public String imprimirArrayListLinkedList(List<String> arrayList) {
        List<String> linkedList = new LinkedList<>(arrayList);
        String respuesta = "6. Recorrer y imprimir elementos del mismo ArrayList/LinkedList:\n";
        String resArrayList = "";
        String resLinkedList = "";

        for (int i = 0; i < arrayList.size(); i++) {
            resArrayList += arrayList.get(i)+"-";
        }
        for (String elemento : linkedList) {
            resLinkedList += elemento+"-";
        }
        return respuesta
                +"\t - ArrayList: "+resArrayList+"\n"
                +"\t - LinkedList: "+resLinkedList+"\n";
    }

    public String imprimirArrayListNumerosImpares() {
        List<Integer> arrayListNumeros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (i%2 != 0) {
                arrayListNumeros.add(i);
            }
        }
        return "7. Imprimir ArrayList numeros del 1-10 y eliminar números pares:\n"
                +"\t"+arrayListNumeros+"\n";
    }
}
