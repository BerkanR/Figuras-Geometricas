package org.mvpigs.figurasGeo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CuadradoTest {

    /* Testeando Constructores */

    @Test
    public void testLado() {
        Cuadrado cuadrado = new Cuadrado(5);
        assertEquals(5.0, cuadrado.getLado(), 0);
    }

    @Test
    public void testNombre() {
        Cuadrado cuadrado = new Cuadrado("cuadrado", 5);
        assertEquals("cuadrado", cuadrado.getNombre());
        assertEquals(5.0, cuadrado.getLado(), 0);
    }

    /* Testeando método */

    @Test
    public void testArea() {
        Cuadrado cuadrado = new Cuadrado(5);
        assertEquals(25.0, cuadrado.area(), 0);
    }
}