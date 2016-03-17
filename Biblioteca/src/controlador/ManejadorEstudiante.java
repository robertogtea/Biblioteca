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
import vista.GUIAdministracionEstudiante;
import vista.GUIEstudiante;
import vista.PanelBotonesMantenimiento;
import vista.PanelDatosEstudiante;

/**
 *
 * @author ronald
 */
public class ManejadorEstudiante implements ActionListener {
    private PanelDatosEstudiante panelDatosEstudiante;
    private RegistroEstudiantes registroEstudiantes;
    private GUIAdministracionEstudiante administracionEstudiante;

 
//Es llamado para agregar
    public ManejadorEstudiante(PanelDatosEstudiante panelDatosEstudiante, RegistroEstudiantes registroEstudiantes, GUIAdministracionEstudiante administracionEstudiante) {
        this.panelDatosEstudiante = panelDatosEstudiante;
        this.registroEstudiantes = registroEstudiantes;
        this.administracionEstudiante = administracionEstudiante;
    }
//Es lla,ado para mantenimiento
    public ManejadorEstudiante(RegistroEstudiantes registroEstudiantes, GUIAdministracionEstudiante administracionEstudiante) {
        this.registroEstudiantes = registroEstudiantes;
        this.administracionEstudiante = administracionEstudiante;
    }


 
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getActionCommand().equals("Aceptar")) {
            registroEstudiantes.agregar(panelDatosEstudiante.getEstudiante());
            JOptionPane.showMessageDialog(null, "El nombre es:"+registroEstudiantes.getEstudiante(0).getNombre());
            administracionEstudiante.actualizarDatos();
        }
        else{
            if(evento.getActionCommand().equals(Integer.toString(PanelBotonesMantenimiento.BOTON_AGREGAR)))
            {
                GUIEstudiante gUIEstudiante = new GUIEstudiante();
                gUIEstudiante.init(registroEstudiantes,administracionEstudiante);
                gUIEstudiante.setVisible(true);
                
            
            }
        
        }
    }
    
}
