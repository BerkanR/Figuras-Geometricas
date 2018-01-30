package org.mvpigs.figurasGeo;

public class Cuadrado extends SuperFiguras {
    private double lado = 0d;

    /* Constructores */

    public Cuadrado() {
        super();
    }

    public Cuadrado(double lado) {
        super();
        this.lado = lado;
    }

    public Cuadrado(String nombre, double lado) {
        super(nombre);
        this.lado = lado;
    }

    /* Getters y Setters */

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    /* Método del área del cuadrado */

    public double area() {
        return getLado() * getLado();
    }

}