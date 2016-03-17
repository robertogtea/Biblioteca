/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author ronald
 */
public class Estudiante {
    private String nombre;
    private String carne;
    private String direccion;
    private String telefono;
    private int edad;
    private static String[] etiquetas={"Nombre","Carné","Dirección","Teléfono","Edad"};
    public Estudiante() {
    }

    public Estudiante(String nombre, String carne, String direccion, String telefono, int edad) {
        this.nombre = nombre;
        this.carne = carne;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
    }
   
    public static String[] getEtiquetas(){
    return etiquetas;}
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getDato(int tipoDato)
    {
     String dato="";
     switch(tipoDato)
     {
        case 0:
             dato= getNombre();
            break;
         case 1:
             dato= getCarne();
             break;
         case 2:
             dato= getDireccion();
             break;
         case 3:
             dato= getTelefono();
             break;
         case 4:
             dato=  ""+getEdad();   
             break;
     }
     return dato;
    }
    
    public static int getCantidadAtributos(){
        return etiquetas.length;
    }
    
}
