package com.openbootcamp.java.basico.ejercicios7_8_9;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        ArrayManager arrayManager = new ArrayManager();
        Calculadora calculadora = new Calculadora();
        FileManager fileManager = new FileManager();
        Map<String,String> enunciadoSolucion = new HashMap<>();
        String filesPath = "./src/com/openbootcamp/java/basico/ejercicios7_8_9/files";
        Scanner scanner = new Scanner(System.in);
        int opcion;

        String titulo = "EJERCICIOS SESIONES 7, 8 Y 9\n";
        String warning = "LAS SOLUCIONES SE PODRAN VER EN EL README.md UNA VEZ EJECUTES LA OPCIÓN \"Añadir Soluciones al README.md.\" \n";
        System.out.println("\n"+titulo+warning);

        String excepcionEj8 = "*Esto de aquí abajo es la excepción del ejercicio \"DividePorCero.\"";
        System.out.println(excepcionEj8);

        //1.
        String texto = "Hola mundo";
        String enunciado1 = "Dada la función:\n"
                + "public static String reverse(String texto) {\n"
                + "}\n"
                +"Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena \"hola mundo\", debe retornar \"odnum aloh\".";
        String solucionEj1 = arrayManager.reverse(texto);
        enunciadoSolucion.put(enunciado1, solucionEj1);
        //System.out.println(enunciado1 + "\n" + solucionEj1);

        //2.
        String[] arrayTexto = {"manzana", "naranja", "limón", "kiwi"};
        String enunciado2 = "Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.";
        String solucionEj2 = arrayManager.imprimirArrayString(arrayTexto);
        enunciadoSolucion.put(enunciado2, solucionEj2);
        //System.out.println(enunciado2 + "\n" + solucionEj2);

        //3.
        int[][] arrayBidimensional = {{1,2,3},{3,4,5},{6,7,8}};
        String enunciado3 = "Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.";
        String solucionEj3 = arrayManager.imprimirArrayBidimensional(arrayBidimensional);
        enunciadoSolucion.put(enunciado3, solucionEj3);
        //System.out.println(enunciado3 + "\n" + solucionEj3);

        //4.
        String[] elementosVector = {"Guitarra", "Piano", "Oboe", "Bateria", "Cello"};
        String enunciado4 = "Crea un \"Vector\" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.";
        String solucionEj4 = arrayManager.añadirElementosVector(elementosVector);
        enunciadoSolucion.put(enunciado4, solucionEj4);
        //System.out.println(enunciado4 + "\n" + solucionEj4+ "\n");

        //5.
        String enunciado5 = "Indica cuál es el problema de utilizar un Vector con la capacidad por defecto "
                + "si tuviésemos 1000 elementos para ser añadidos al mismo.";
        String solucionEj5 = "No se puede incrementar la capacidad de un Vector inicializado con una capacidad por defecto \n"
                + "\ta no ser que se indique en el momento de crear el Vector la capacidad de incremento.\n";
        enunciadoSolucion.put(enunciado5, solucionEj5);
        //System.out.println(enunciado5 + "\n" + solucionEj5);

        //6.
        List<String> arrayListAnimales = new ArrayList<>();
        arrayListAnimales.add("Elefante");
        arrayListAnimales.add("Perro");
        arrayListAnimales.add("Gato");
        arrayListAnimales.add("Tigre");
        String enunciado6 = "Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.";
        String solucionEj6 = arrayManager.imprimirArrayListLinkedList(arrayListAnimales);
        enunciadoSolucion.put(enunciado6, solucionEj6);
        //System.out.println(enunciado6 + "\n" + solucionEj6);

        //7.
        String enunciado7 = "Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer \"for\" de relleno.";
        String solucionEj7 = arrayManager.imprimirArrayListNumerosImpares();
        enunciadoSolucion.put(enunciado7, solucionEj7);
        //System.out.println(enunciado7 + "\n" + solucionEj7);

        //8.
        int num = 7;
        try {
            System.out.println(calculadora.dividePorCero(num));
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        finally{
            String enunciado8 = "Capturar una excepción con el método dividePorCero";
            String solucionEj8 = "Hay que mirar la excepción en la consola cuando se ejecuta el programa.\n"+"Ej8 -> finally: Demo de código.\n";
            enunciadoSolucion.put(enunciado8, solucionEj8);
            //System.out.println("Ej8 -> finally: Demo de código.\n");
        }

        //9
        try {
            InputStream fileIn = Files.newInputStream(Paths.get(filesPath+"/fileIn.txt"));
            OutputStream fileOut = Files.newOutputStream(Paths.get(filesPath+"/fileOut.txt"));
            fileManager.copiarArchivo(fileIn, fileOut);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String enunciado9 = "Copiar el contenido de un fichero a otro con InputStream y OutputStream";
        String solucionEj9 = "Mirar el archivo fileOut dentro del directorio files.";
        enunciadoSolucion.put(enunciado9, solucionEj9);


        //10
        //Este programa va a rellenar el README.md con las soluciones de los ejercicios anteriores.
        System.out.println("\nMENU");
        System.out.println("\t 1 - Añadir Soluciones al README.md.\n \t 2 - Resetear README.md estado por defecto.");
        opcion = scanner.nextInt();

        if(opcion==1) {
            try {
                InputStream fileIn = Files.newInputStream(Paths.get("./README.md"));
                fileManager.readmeBuilder(fileIn, titulo, enunciadoSolucion, "./README.md");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            fileManager.readmeReset("./README.md");
        }
    }
}
