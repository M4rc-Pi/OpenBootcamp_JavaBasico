package com.openbootcamp.java.basico.ejercicios7_8_9;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Map;
import java.util.Scanner;


public class FileManager {

    final String[] numEjercicio = {"1","2","3","4","5","6","7","8","9","10"};

    public FileManager(){}

    void copiarArchivo(InputStream fileIn, OutputStream fileOut) throws IOException {
        fileIn.transferTo(fileOut);
    }

    void readmeBuilder(InputStream fileIn, String tituloEjercicio, Map<String,String> enunciadoSolucion, String filePath) {

        Scanner s = new Scanner(fileIn).useDelimiter("\\A");
        String tituloReadme= s.hasNext() ? s.next() : "";
        int index = 0;
        
        String textoFormatado = "#"+tituloReadme+"\n##"+tituloEjercicio+"\n"+"*Los ejercicios no estan en orden.*\n"+"<br/><br/>";

        try (PrintStream writer = new PrintStream(filePath)){

            for(Map.Entry<String, String> pair: enunciadoSolucion.entrySet()){
                String enunciado = pair.getKey();
                String solucion = pair.getValue();
                textoFormatado += "**"+numEjercicio[index]+".**"
                        +" "+enunciado+"<br/></br>"
                        +"**Solución:** "+solucion+"<br/><br/><br/>";
                index++;
            }
            writer.print(textoFormatado);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void readmeReset(String filePath) {
        try (PrintStream writer = new PrintStream(filePath)){
            writer.print("");
            writer.print("OpenBootcamp Java Basico");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
