package com.openbootcamp.java.basico.ejercicio2;

import java.security.InvalidParameterException;

public class Iva {

    private double valor;
    private String tipo;

    protected Iva (String tipo) {
        this.tipo = tipo;
    }

    protected double obtenerValorIva() throws InvalidParameterException {

        switch(tipo) {
            case "GENERAL":
                valor = 0.21;
                break;
            case "REDUCIDO":
                valor = 0.10;
                break;
            case "SUPERREDUCIDO":
                valor = 0.04;
                break;
            default:
                throw new InvalidParameterException ("Tipo de IVA no válido.");
        }
        return valor;
    }

    public double getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
