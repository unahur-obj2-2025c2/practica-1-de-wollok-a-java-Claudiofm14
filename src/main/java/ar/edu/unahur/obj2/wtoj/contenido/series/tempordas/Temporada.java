package ar.edu.unahur.obj2.wtoj.contenido.series.tempordas;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.wtoj.contenido.series.tempordas.episodios.Episodio;

public class Temporada{
    private Integer numero;
    private List<Episodio> episodios= new ArrayList<>();
    public Integer getNumero() {
        return numero;
    }
    public Temporada(Integer numero) {
        this.numero = numero;
    }
    public List<Episodio> getEpisodios() {
        return episodios;
    }
    public void agregarEpisodio(Episodio unEpisodio){
        episodios.add(unEpisodio);
    }
    
    public Integer cantidadEpisodios(){
        return episodios.size();
    }
    public Double costoDeTemporada(){
        return episodios.stream().mapToDouble(e->e.getCosto()).sum();
    }
}
