package ar.edu.unahur.obj2.wtoj.contenido;

public abstract class Contenido {
    public String titulo;
    public Double costoBase;

   
    public Contenido (String titulo, Double costoBase){
        this.titulo=titulo;
        this.costoBase=costoBase;
    }
    public String getTitulo(){
        return titulo;
    }
    
    public Double getCostoBase() {
        return costoBase;
    }
    public Double costoLicencia(){ return costoBase;
    }
}
