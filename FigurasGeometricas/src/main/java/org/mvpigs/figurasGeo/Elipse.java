package org.mvpigs.figurasGeo;

public class Elipse extends SuperFiguras {
    private double semiejeM = 0d; // Semieje Mayor
    private double semiejem = 0d; // Semieje Menor
    private final double pi = Math.PI;

    /* Constructores */

    public Elipse() {
        super();
    }

    public Elipse(double semiejeM, double semiejem) {
        super();
        this.semiejeM = semiejeM;
        this.semiejem = semiejem;
    }

    public Elipse(String nombre, double semiejeM, double semiejem) {
        super(nombre);
        this.semiejeM = semiejeM;
        this.semiejem = semiejem;
    }

    /* Getters y Setters */

    public double getSemiejeM() {
        return semiejeM;
    }

    public void setSemiejeM(double semiejeM) {
        this.semiejeM = semiejeM;
    }

    public double getSemiejem() {
        return semiejem;
    }

    public void setSemiejem(double semiejem) {
        this.semiejem = semiejem;
    }

    /* Método para calcular el área de la elipse */

    public double area() {
        return pi * getSemiejeM() * getSemiejem();
    }
}