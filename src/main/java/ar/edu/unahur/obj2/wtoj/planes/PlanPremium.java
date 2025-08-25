package ar.edu.unahur.obj2.wtoj.planes;

import ar.edu.unahur.obj2.wtoj.usuarios.Usuario;

public class PlanPremium implements Suscribible {
    private double valorFijo= 12;

    public PlanPremium() {}
   
    @Override
    public double costoPlan(Usuario usuario){
        return valorFijo;

    }
    
}
