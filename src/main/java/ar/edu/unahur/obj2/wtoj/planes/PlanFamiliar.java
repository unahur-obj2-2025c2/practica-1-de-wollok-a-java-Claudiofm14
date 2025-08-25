package ar.edu.unahur.obj2.wtoj.planes;

import ar.edu.unahur.obj2.wtoj.usuarios.Usuario;

public class PlanFamiliar extends PlanBasico {

    public PlanFamiliar(Usuario usuario, Integer limiteDeConsumo, Double valorFijo) {
        super(usuario, limiteDeConsumo, valorFijo);
    }
    @Override
    public double costoPlan(Usuario usuario ){
        return super.costoPlan(usuario)*0.85;
       /*  if (this.cantidadConsumo()<=this.getLimiteDeConsumo()){
            return this.getValorFijo()*0.85;
        }
        else{
            return (this.getValorFijo() +  this.contenidosExcedentes().stream().mapToDouble(c->c.costoLicencia()).sum())*0.85;
        }
        */
        
    }
}
