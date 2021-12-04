package com.openbootcamp.java.basico.ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Concatenador concatenador = new Concatenador();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        int opcion;
        String palabra;
        List<String> palabras = new ArrayList<>(); //En el caso de hacerlo con un String[] simplemente especificaria el tamaño aquí

        do {
            System.out.println("MENU");// Create a Scanner object
            System.out.println("\t 1 - Añadir Palabra.\n \t 2 - Salir.");
            opcion = Integer.parseInt(scanner.nextLine());
            if (opcion == 2) {
                exit = true;
            }
            else {
                System.out.println("Escriba la palabra a añadir: ");
                palabra = scanner.nextLine();
                palabras.add(palabra);
            }
        } while(!exit);

        System.out.println(concatenador.concatenarStrings(palabras));
    }
}
