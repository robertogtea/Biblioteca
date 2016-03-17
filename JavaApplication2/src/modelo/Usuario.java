/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Usuario {
    
    private String  identificacion;
    private String nombre;
    private String tipo;
    private String telefono;
    private static String[] etiquetas={"Identificación","Nombre","Tipo Usuario","Teléfono"};

    public Usuario(String identificacion, String nombre, String tipo, String telefono) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.tipo = tipo;
        this.telefono = telefono;
    }

    public static String[] getEtiquetas(){
       return etiquetas;
    
    }
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getDato(int tipoDato)
    {
     String dato="";
     switch(tipoDato)
     {
        case 0:
             dato= getIdentificacion();
            break;
         case 1:
             dato= getNombre();
             break;
         case 2:
             dato= getTelefono();
             break;
         case 3:
             dato= getTipo();
             break;
     }
     return dato;
    }
    public static int getCantidadAtributos(){
        return etiquetas.length;
    }
}
