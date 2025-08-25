package ar.edu.unahur.obj2.wtoj.contenido.documentales;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DocumentalTest {
    @Test
    public void testCostoLicencia() {
        Documental doc1 = new Documental("Planeta Tierra", 1500.0);
        assertEquals(doc1.costoLicencia(),1500.5);
    }
}
