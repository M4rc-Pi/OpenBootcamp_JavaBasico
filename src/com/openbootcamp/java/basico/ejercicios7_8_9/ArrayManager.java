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
        return texto+" -> "+textoInverso;
    }

    public String imprimirArrayString(String[] arrayTexto) {
        String resultado = "";
        for (String string: arrayTexto) {
            resultado += "<br/>"+"- "+string;
        }
        return resultado;
    }

    public String imprimirArrayBidimensional (int[][] arrayBidimensional) {
        String resultado = "";
        for (int i = 0; i < arrayBidimensional.length; i++) {
            for (int j = 0; j < arrayBidimensional[i].length; j++) {
                resultado += "<br/>"+"Posición: ["+i+","+j+"] - Valor: "+arrayBidimensional[i][j];
            }
        }
        return resultado;
    }

    public String añadirElementosVector(String[] elementosVector) {
        Vector<String> vector = new Vector<>();
        for (String elemento : elementosVector) {
            vector.addElement(elemento);
        }
        Vector<String>vectorRemovido = (Vector<String>) vector.clone();
        vectorRemovido.removeElementAt(1);
        vectorRemovido.removeElementAt(1);
        return "Vector completo: "+vector+"<br/>"
                +"Vector removido: "+vectorRemovido;
    }

    public String imprimirArrayListLinkedList(List<String> arrayList) {
        List<String> linkedList = new LinkedList<>(arrayList);
        String resArrayList = "";
        String resLinkedList = "";

        for (int i = 0; i < arrayList.size(); i++) {
            resArrayList += arrayList.get(i)+"-";
        }
        for (String elemento : linkedList) {
            resLinkedList += elemento+"-";
        }
        return "<br/>"+" - ArrayList: "+resArrayList+"<br/>"
                +" - LinkedList: "+resLinkedList;
    }

    public String imprimirArrayListNumerosImpares() {
        List<Integer> arrayListNumeros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (i%2 != 0) {
                arrayListNumeros.add(i);
            }
        }
        return arrayListNumeros.toString();
    }
}
