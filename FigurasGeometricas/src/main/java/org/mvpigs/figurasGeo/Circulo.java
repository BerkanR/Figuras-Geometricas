package org.mvpigs.figurasGeo;

public class Circulo {
    private double radio = 0d;
    private final double pi = Math.PI;

    /* Constructores */

    public Circulo() {

    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    /* Getters y Setters */

    public double getRadio() {
        return radio;
    }

    /* Métodos para calcular el área de un círculo */

    public double area() {
        return pi * Math.pow(getRadio(), 2);
    }

}