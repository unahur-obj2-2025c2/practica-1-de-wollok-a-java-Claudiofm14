package ar.edu.unahur.obj2.wtoj.usuarios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.wtoj.contenido.pelicula.Pelicula;
import ar.edu.unahur.obj2.wtoj.planes.PlanBasico;
import ar.edu.unahur.obj2.wtoj.planes.PlanFamiliar;

public class UsuarioTest {
    private Usuario usuario1;
    private Usuario usuario2;
    private PlanBasico plan1;
    private PlanFamiliar plan2;
    private Pelicula peli1;
    private Pelicula peli2;
    private Pelicula peli3;
    
    @BeforeEach
    void setUp() {
        peli1= new Pelicula("El Padrino", 1000.0);
        peli2= new Pelicula("La La Land", 800.0);
        peli3= new Pelicula("Toy Story", 600.0);
        usuario2 = new Usuario(plan2);
        usuario1 = new Usuario(plan1);
        plan1 = new PlanBasico(usuario1,2,500.0);
        plan2 = new PlanFamiliar(usuario2,2,700.0);
        
    }
    @Test 
    void testDeCostoDePlanParaElUsuario1QueCambiaAPlanFamiliar(){
        usuario1.setPlanSucripcion(plan2);
        usuario1.consumirContenido(peli2);
        usuario1.consumirContenido(peli1);
        usuario1.consumirContenido(peli3);
        assertEquals(1180.0, usuario1.getPlanSucripcion().costoPlan(usuario1));
    }

}
