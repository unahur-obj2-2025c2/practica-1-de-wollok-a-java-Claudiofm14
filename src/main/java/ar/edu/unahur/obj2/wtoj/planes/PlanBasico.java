package ar.edu.unahur.obj2.wtoj.planes;

import ar.edu.unahur.obj2.wtoj.usuarios.Usuario;

import java.util.List;

import ar.edu.unahur.obj2.wtoj.contenido.Contenido;

public class PlanBasico implements Suscribible{
    private Integer limiteDeConsumo;
    private Double valorFijo;
    private Usuario usuario;
    
    public Integer getLimiteDeConsumo() {
        return limiteDeConsumo;
    }
    public Double getValorFijo() {
        return valorFijo;
    }
    public PlanBasico(Usuario usuario,Integer limiteDeConsumo,Double valorFijo) {
        this.valorFijo = valorFijo;
        this.limiteDeConsumo = limiteDeConsumo;
        this.usuario=usuario;
    }
    public Integer cantidadConsumo(){
        return usuario.getContenidosConsumidos().size();
    }
    public List<Contenido> contenidosExcedentes(){
        return usuario.getContenidosConsumidos().subList(limiteDeConsumo+1, this.cantidadConsumo());
    }  

    @Override
    public double costoPlan(Usuario usuario) {
        if (this.cantidadConsumo()>limiteDeConsumo){
         return valorFijo +  this.contenidosExcedentes().stream().mapToDouble(c->c.costoLicencia()).sum();
        }
        else
        {return valorFijo;}
        
    }

}
