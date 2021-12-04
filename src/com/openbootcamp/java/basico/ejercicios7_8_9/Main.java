package com.openbootcamp.java.basico.ejercicios7_8_9;

public class Main {

    public static void main(String[] args) {

        ArrayManager arrayManager = new ArrayManager();

        System.out.println("EJERCICIOS SESIONES 7,8 Y 9\n");

        //1.
        String texto = "hola mundo";
        System.out.println(arrayManager.reverse(texto));

        //2.
        String[] arrayTexto = {"manzana", "naranja", "limón", "kiwi"};
        System.out.println(arrayManager.imprimirArrayString(arrayTexto));

        //3.
        int[][] arrayBidimensional = {{1,2,3},{3,4,5},{6,7,8}};
        System.out.println(arrayManager.imprimirArrayBidimensional(arrayBidimensional));

    }
}
