package ar.edu.unahur.obj2.wtoj.plataforma;

import java.util.HashSet;
import java.util.Set;

import ar.edu.unahur.obj2.wtoj.usuarios.Usuario;

public class Plataforma {
    private static Plataforma instance =new Plataforma();
    private Set<Usuario> usuarios= new HashSet<>();
    
    private Plataforma(){}
    public static Plataforma getInstance() {
        return instance;
    }
    public double costoMensualDelUsuario(Usuario usuario){
        return usuario.getPlanSucripcion().costoPlan(usuario);
    }
    public double facturacionTotal(){
        return usuarios.stream().mapToDouble(u->u.getPlanSucripcion().costoPlan(u)).sum();
    }
   
    public void vaciarListaDeContenidos(){
        usuarios.stream().forEach(u->u.vaciarContenidos());
    }
    public void agregarUsuario(Usuario unUsuario){
        usuarios.add(unUsuario);
    }
}
