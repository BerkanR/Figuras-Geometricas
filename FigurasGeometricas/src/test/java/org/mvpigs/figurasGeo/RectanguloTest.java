package org.mvpigs.figurasGeo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RectanguloTest {

    /* Testeando constructores */

    @Test
    public void testLado() {
        Rectangulo rectangulo = new Rectangulo(3, 5);
        assertEquals(3.0, rectangulo.getAltura(), 0);
    }

    @Test
    public void testAnchura() {
        Rectangulo rectangulo = new Rectangulo(3, 5);
        assertEquals(5.0, rectangulo.getAnchura(), 0);
    }

    /* Testeando métodos */

    @Test
    public void testArea() {
        Rectangulo rectangulo = new Rectangulo(3, 5);
        assertEquals(15.0, rectangulo.area(), 0);
    }
}