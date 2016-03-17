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
public class Libro {
    
    private String isbn;
    private String titulo;
    private String autor;
    private static String[] etiquetas={"ISBN","Titulo","Autor"};
    
    public Libro(String isbn, String titulo, String autor)
    {
       this.isbn= isbn;
       this.autor= autor;
       this.titulo=titulo;
    
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
       public static String[] getEtiquetas(){
       return etiquetas;
    
    }
    public String getDato(int tipoDato)
    {
     String dato="";
     switch(tipoDato)
     {
        case 0:
             dato= getIsbn();
            break;
         case 1:
             dato= getTitulo();
             break;
         case 2:
             dato= getAutor();
             break;
    
     }
     return dato;
    }
    
    public static int getCantidadAtributos(){
        return etiquetas.length;
    }
    
}
