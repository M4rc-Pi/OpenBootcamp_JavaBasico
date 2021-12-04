package com.openbootcamp.java.basico.ejercicios7_8_9;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class FileManager {

    public FileManager(){}

    void copiarArchivo(InputStream fileIn, OutputStream fileOut) throws IOException {
        fileIn.transferTo(fileOut);
    }
}
