/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.RegistroEstudiantes;
import modelo.RegistroLibro;
import vista.PanelBotonesAccion;
import vista.PanelDatosLibro;

/**
 *
 * @author Administrador
 */
public class ManejadorLibro implements ActionListener{
    private PanelDatosLibro panelDatosLibro;
    private RegistroLibro registroLibro;

    public ManejadorLibro(PanelDatosLibro panelDatosLibro) {
        this.panelDatosLibro= panelDatosLibro;
        registroLibro= new RegistroLibro();
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
           if (evento.getActionCommand().equals(PanelBotonesAccion.BOTON_ACEPTAR)) {
            registroLibro.agregar(panelDatosLibro.getLibro());
            JOptionPane.showMessageDialog(null, "El nombre es:"+registroLibro.getLibro(0).getTitulo());
           }
    }
    
    
    
    
}
