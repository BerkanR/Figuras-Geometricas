package org.mvpigs.figurasGeo;

/* Superclase abstracta */

public abstract class SuperFiguras {
    private String nombre;

    /* Constructores */

    public SuperFiguras() {
        this.nombre = "desconocido";
    }

    public SuperFiguras(String nombre) {
        this.nombre = nombre;
    }

    /* Getters y Setters */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /* Método abstracto de area() */

    public abstract double area();
}