package org.mvpigs.figurasGeo;

public class Circulo extends SuperFiguras {
    private double radio = 0d;
    private final double pi = Math.PI;

    /* Constructores */

    public Circulo() {
        super();
    }

    public Circulo(double radio) {
        super();
        this.radio = radio;
    }

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    /* Getters y Setters */

    public double getRadio() {
        return radio;
    }

    /* Método para calcular el área del círculo */

    public double area() {
        return pi * Math.pow(getRadio(), 2);
    }

}