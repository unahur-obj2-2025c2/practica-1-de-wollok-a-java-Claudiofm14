package ar.edu.unahur.obj2.wtoj.contenido.documentales;

import ar.edu.unahur.obj2.wtoj.contenido.Contenido;

public class Documental extends Contenido {
    
    public Documental (String titulo, Double costoBase){
        super(titulo, costoBase);
    }
    @Override
    public Double costoLicencia(){return super.costoLicencia() + Idra.getInstance().getCanon();}

}
