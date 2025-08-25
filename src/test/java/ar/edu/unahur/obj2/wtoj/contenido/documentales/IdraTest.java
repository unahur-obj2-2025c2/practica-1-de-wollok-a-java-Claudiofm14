package ar.edu.unahur.obj2.wtoj.contenido.documentales;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IdraTest {
    @Test
    void testGetCanon() {
        assertEquals(0.5, Idra.getInstance().getCanon());
    }

    @Test
    void testSetCanon() {
        Idra.getInstance().setCanon(0.7);
        assertEquals(0.7, Idra.getInstance().getCanon());
    }
}
