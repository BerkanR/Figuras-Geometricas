package org.mvpigs.figurasGeo;

public class Rectangulo {
    private double altura = 0d;
    private double anchura = 0d; //base

    /* Constructores */

    public Rectangulo() {

    }

    public Rectangulo(double altura, double anchura) {
        this.altura = altura;
        this.anchura = anchura;
    }

    /* Getters y Setters */

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura, double anchura) {
        this.altura = altura;
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }

    /* Método para calcular el área de un rectángulo */

    public double area() {
        return getAnchura() * getAltura();
    }
}