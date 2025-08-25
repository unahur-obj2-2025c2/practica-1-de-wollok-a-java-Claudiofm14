package ar.edu.unahur.obj2.wtoj.contenido.documentales;

public class Idra {
    private static Idra instance= new Idra();
    private Double canon= 0.5; 

    public static Idra getInstance() {
        return instance;
    }
    private Idra (){}
    public Double getCanon() {
        return canon;
    }
    public void setCanon(Double canon) {
        this.canon = canon;
    }
    
}
