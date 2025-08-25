package ar.edu.unahur.obj2.wtoj.contenido.pelicula;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PeliculaTest {
    @Test
    void testCostoLicencia() {
        Pelicula peli1= new Pelicula("El Padrino", 1000.0);
        assertEquals(peli1.costoLicencia(),1000.0); 
    }

    @Test
    void testGetCostoBase() {
        Pelicula peli1= new Pelicula("El Padrino", 1000.0);
        assertEquals(peli1.getCostoBase(),1000.0);
    }

    @Test
    void testGetTitulo() {
        Pelicula peli1= new Pelicula("El Padrino", 1000.0);
        assertEquals(peli1.getTitulo(),"El Padrino");
    }
}
