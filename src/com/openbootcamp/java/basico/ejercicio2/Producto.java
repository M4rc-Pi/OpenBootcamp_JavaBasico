package com.openbootcamp.java.basico.ejercicio2;

public class Producto {

    private double iva;
    private String nombreProducto;
    private double precioBase;
    private double precioTotal;

    protected Producto (String nombreProducto, double precio) {
        this.nombreProducto = nombreProducto;
        this.precioBase = precio;
    }

    protected double obtenerPrecioTotal () {
        precioTotal = precioBase + precioBase * iva;
        return precioTotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
}
