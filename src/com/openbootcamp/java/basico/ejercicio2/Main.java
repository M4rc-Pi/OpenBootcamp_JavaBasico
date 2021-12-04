package com.openbootcamp.java.basico.ejercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String precioBaseProducto;
        String tipoIVA;

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Introduzca el precio del producto:");
        precioBaseProducto = scanner.nextLine();
        System.out.println("Tipo de IVA: (GENERAL, REDUCIDO, SUPERREDUCIDO)");
        tipoIVA= scanner.nextLine();// Read user input

        try{
            Producto producto = new Producto("producto1", Double.parseDouble(precioBaseProducto));
            producto.setTipoIVA(tipoIVA);

            System.out.println("El precio total és: "+ producto.obtenerPrecioTotal());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

