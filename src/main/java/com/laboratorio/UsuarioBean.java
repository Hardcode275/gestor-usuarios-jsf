package com.laboratorio;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class UsuarioBean {

    private Usuario usuario = new Usuario(); 
private List<Usuario> usuarios = new ArrayList<>(); 
public Usuario getUsuario() { return usuario; } 
public List<Usuario> getUsuarios() { return usuarios; } 
public void registrar() { 
usuarios.add(usuario); 
usuario = new Usuario(); // Limpiar formulario 

} 
public void eliminar(Usuario u) { 
    usuarios.remove(u); 
}

}
