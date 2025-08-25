package ar.edu.unahur.obj2.wtoj.usuarios;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.wtoj.contenido.Contenido;
import ar.edu.unahur.obj2.wtoj.planes.Suscribible;

public class Usuario {
    private Suscribible planSucripcion;
    private List<Contenido> contenidosConsumidos= new ArrayList<>();
    
    public Usuario(Suscribible planSucripcion) {
        this.planSucripcion = planSucripcion;
    }

    public Suscribible getPlanSucripcion() {
        return planSucripcion;
    }

    public List<Contenido> getContenidosConsumidos() {
        return contenidosConsumidos;
    }

    public void setPlanSucripcion(Suscribible planSucripcion) {
        this.planSucripcion = planSucripcion;
    }
    public void consumirContenido(Contenido unContenido){
        contenidosConsumidos.add(unContenido);
    }
    public void vaciarContenidos(){
        contenidosConsumidos.clear();
    }
    
}
