package com.openbootcamp.java.basico.ejercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String precioBaseProducto;
        Iva iva;
        String ivaTipo;
        double ivaValor;

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Introduzca el precio del producto:");
        precioBaseProducto = scanner.nextLine();
        System.out.println("Tipo de IVA: (GENERAL, REDUCIDO, SUPERREDUCIDO)");
        ivaTipo= scanner.nextLine();// Read user input

        try{
            iva = new Iva(ivaTipo.toUpperCase());
            ivaValor = iva.obtenerValorIva();

            Producto producto = new Producto("producto1", Double.parseDouble(precioBaseProducto));
            producto.setIva(ivaValor);

            System.out.println("El precio total és: "+ producto.obtenerPrecioTotal());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

