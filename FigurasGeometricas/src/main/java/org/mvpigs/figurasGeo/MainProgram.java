package org.mvpigs.figurasGeo;

import java.util.ArrayList;

/* Programa main que se ejecutara para mostrar por pantalla el nombre y el área de todas las figuras almacenadas 
en un array. */

public class MainProgram {
    public static void main(String[] args) {
        ArrayList<SuperFiguras> figuras = new ArrayList();

        Circulo circuloS = new Circulo(8);
        Circulo circuloL = new Circulo("círculo", 8);

        Rectangulo rectanguloS = new Rectangulo(3, 6);
        Rectangulo rectanguloL = new Rectangulo("rectángulo", 3, 6);

        Cuadrado cuadradoS = new Cuadrado(10);
        Cuadrado cuadradoL = new Cuadrado("cuadrado", 10);

        figuras.add(circuloS);
        figuras.add(circuloL);
        figuras.add(rectanguloS);
        figuras.add(rectanguloL);
        figuras.add(cuadradoS);
        figuras.add(cuadradoL);

        for (SuperFiguras figura : figuras) {
            System.out.println("Area del " + figura.getNombre() + " = " + figura.area());
        }
    }
}