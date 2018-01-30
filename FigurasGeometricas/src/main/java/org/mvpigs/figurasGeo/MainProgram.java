package org.mvpigs.figurasGeo;

import java.util.ArrayList;

/* Programa main que se ejecutara para mostrar por pantalla el nombre y el área de todas las figuras almacenadas 
en un array. */

public class MainProgram {
    public static void main(String[] args) {
        ArrayList<SuperFiguras> figuras = new ArrayList();

        for (SuperFiguras figura : figuras) {
            System.out.println("Area del " + figura.getNombre() + " = " + figura.area());
        }
    }
}