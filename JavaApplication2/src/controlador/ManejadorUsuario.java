/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.RegistroUsuario;
import vista.PanelBotonesAccion;
import vista.PanelDatosUsuario;

/**
 *
 * @author Administrador
 */
public class ManejadorUsuario implements ActionListener {
    
    private PanelDatosUsuario panelDatosUsuario;
    private RegistroUsuario registroUsuario;

    public ManejadorUsuario(PanelDatosUsuario panelDatosUsuario) {
        this.panelDatosUsuario = panelDatosUsuario;
        registroUsuario= new RegistroUsuario();
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
         if (evento.getActionCommand().equals(PanelBotonesAccion.BOTON_ACEPTAR)) {
            registroUsuario.agregar(panelDatosUsuario.getUsuario());
            JOptionPane.showMessageDialog(null, "El nombre es:"+registroUsuario.getUsuario(0).getNombre());
            
        }
    }
    
    
    
    
    
}
