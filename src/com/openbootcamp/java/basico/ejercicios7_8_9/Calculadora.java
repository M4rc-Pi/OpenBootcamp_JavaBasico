package com.openbootcamp.java.basico.ejercicios7_8_9;

public class Calculadora {

    public Calculadora(){}

    public double dividePorCero(int num) throws ArithmeticException {

        int divisor = 0;
        double resultado;

        switch (divisor) {
            case 0:
                throw new ArithmeticException("Esto no puede hacerse.");
            default:
                resultado = num/divisor;
                break;
        }
        if (resultado != 0) {
            throw new ArithmeticException("Esto no puede hacerse.");
        }
        return resultado;
    }
}
