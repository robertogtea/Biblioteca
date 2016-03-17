/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class RegistroUsuario {
    
    private ArrayList<Usuario> listado;

    public RegistroUsuario() {
    
        listado = new ArrayList<>();
    }
    
    public void agregar(Usuario usuario)
    {
        listado.add(usuario);
    }
    
    public Usuario getUsuario(int indice)
    {
      return  listado.get(indice);
    }
    
    
    
    
}
