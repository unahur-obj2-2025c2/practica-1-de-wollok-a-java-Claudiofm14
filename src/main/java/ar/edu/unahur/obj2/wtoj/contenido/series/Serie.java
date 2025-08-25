package ar.edu.unahur.obj2.wtoj.contenido.series;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.wtoj.contenido.Contenido;
import ar.edu.unahur.obj2.wtoj.contenido.series.tempordas.Temporada;

public class Serie extends Contenido{
    private List<Temporada> temporadas= new ArrayList<>();
   
    public Serie(String titulo, Double costoBase) {
    super(titulo, costoBase);
    }
    public Serie(String titulo, Double costoBase,List<Temporada> temporadas) {
    super(titulo, costoBase);
    this.temporadas=temporadas;
    }
    public void agregarTemporada(Temporada unaTemporada){
        temporadas.add(unaTemporada);
    }
    public List<Temporada> getTemporadas() {
        return temporadas;
    }
    @Override
    public Double costoLicencia(){return super.costoLicencia()+ (this.costoTotalDeEpisodios()/this.cantidadDeEpisodios());}
    
    private Integer cantidadDeEpisodios(){
        return temporadas.stream().mapToInt(t->t.cantidadEpisodios()).sum();
    }
    private Double costoTotalDeEpisodios(){
        return temporadas.stream().mapToDouble(e->e.costoDeTemporada()).sum();
    }

   
}
 