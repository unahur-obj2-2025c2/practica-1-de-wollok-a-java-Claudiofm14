package ar.edu.unahur.obj2.wtoj.contenido.series.tempordas.episodios;

public class Episodio {
    private Double numero;
    private String titulo;
    private Double costo;

    public Double getNumero() {
        return numero;
    }
    public String getTitulo() {
        return titulo;
    }
    public Double getCosto() {
        return costo;
    }
    public Episodio(Double numero, String titulo, Double costo){
        this.numero=numero;
        this.titulo=titulo;
        this.costo=costo;

    }
}
