package com.openbootcamp.java.basico.ejercicios7_8_9;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        ArrayManager arrayManager = new ArrayManager();
        Calculadora calculadora = new Calculadora();
        FileManager fileManager = new FileManager();

        System.out.println("EJERCICIOS SESIONES 7,8 Y 9\n");

        //1.
        String texto = "Hola mundo";
        System.out.println(arrayManager.reverse(texto));

        //2.
        String[] arrayTexto = {"manzana", "naranja", "limón", "kiwi"};
        System.out.println(arrayManager.imprimirArrayString(arrayTexto));

        //3.
        int[][] arrayBidimensional = {{1,2,3},{3,4,5},{6,7,8}};
        System.out.println(arrayManager.imprimirArrayBidimensional(arrayBidimensional));

        //4.
        String[] elementosVector = {"Guitarra", "Piano", "Oboe", "Bateria", "Cello"};
        System.out.println(arrayManager.añadirElementosVector(elementosVector));

        //5.
        System.out.println("\n5. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto "
                + "si tuviésemos 1000 elementos para ser añadidos al mismo.");

        System.out.println("\tR: No se puede incrementar la capacidad de un Vector inicializado con una capacidad por defecto \n"
                + "\ta no ser que se indique en el momento de crear el Vector la capacidad de incremento.\n");

        //6.
        List<String> arrayListAnimales = new ArrayList<>();
        arrayListAnimales.add("Elefante");
        arrayListAnimales.add("Perro");
        arrayListAnimales.add("Gato");
        arrayListAnimales.add("Tigre");
        System.out.println(arrayManager.imprimirArrayListLinkedList(arrayListAnimales));

        //7.
        System.out.println(arrayManager.imprimirArrayListNumerosImpares());

        //8.
        int num = 7;
        try {
            System.out.println(calculadora.dividePorCero(num));
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        finally{
            System.out.println("8. Capturar una excepción con el método dividePorCero\n"
                    +"\tR: finally: Demo de código.\n");
        }

        //9.
        String filesPath = "/home/daabu/IdeaProjects/OpenBootcamp_JavaBasico/src/com/openbootcamp/java/basico/ejercicios7_8_9/files";
        try {
            InputStream fileIn = Files.newInputStream(Paths.get(filesPath+"/fileIn.txt"));
            OutputStream fileOut = Files.newOutputStream(Paths.get(filesPath+"/fileOut.txt"));
            fileManager.copiarArchivo(fileIn, fileOut);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("9. Copiar el contenido de un fichero a otro con InputStream y OutputStream\n"
                +"\t R: Mirar el archivo fileOut dentro del directorio files.\n");
    }
}
