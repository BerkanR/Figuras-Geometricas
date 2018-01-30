package org.mvpigs.figurasGeo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CirculoTest {

    /* Testeando constructores */

    @Test
    public void testRadio() {
        Circulo circulo = new Circulo(2);
        assertEquals(2.0, circulo.getRadio(), 0);
    }

    @Test
    public void testNombre() {
        Circulo circulo = new Circulo("círculo", 2);
        assertEquals("círculo", circulo.getNombre());
        assertEquals(2.0, circulo.getRadio(), 0);
    }

    /* Testeando métodos */

    @Test
    public void testArea() {
        Circulo circulo = new Circulo(2);
        assertEquals(12.56, circulo.area(), 0.1);
    }
}