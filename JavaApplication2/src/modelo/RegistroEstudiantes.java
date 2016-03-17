/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Informática
 */
public class RegistroEstudiantes {
    
    private ArrayList<Estudiante> listado;

    public RegistroEstudiantes() {
        listado = new ArrayList<>();
    }
    
    public void agregar(Estudiante estudiante)
    {
        listado.add(estudiante);
    }
    
    public Estudiante getEstudiante(int indice)
    {
      return  listado.get(indice);
    }
    
    public  String [][] getDatos(){
    
        String datos[][];
        datos=new String[listado.size()][Estudiante.getCantidadAtributos()];
        for (int fila=0;fila<listado.size();fila++)
        {
            for (int columna=0;columna<Usuario.getEtiquetas().length;columna++)
            {
                datos[fila][columna]=listado.get(fila).getDato(columna);
             }
        }
    return datos;
    }
   
}
