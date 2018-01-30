package org.mvpigs.figurasGeo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ElipseTest {

    /* Testeando constructores */

    @Test
    public void semiejes() {
        Elipse elipse = new Elipse(10, 5);
        assertEquals(10.0, elipse.getSemiejeM(), 0);
        assertEquals(5.0, elipse.getSemiejem(), 0);
    }

    @Test
    public void testNombre() {
        Elipse elipse = new Elipse("elipse", 6, 1);
        assertEquals("elipse", elipse.getNombre());
        assertEquals(6.0, elipse.getSemiejeM(), 0);
        assertEquals(1.0, elipse.getSemiejem(), 0);
    }

    /* Testeando método */

    @Test
    public void testArea() {
        Elipse elipse = new Elipse(10, 5);
        assertEquals(157.0796, elipse.area(), 0.1);
    }
}