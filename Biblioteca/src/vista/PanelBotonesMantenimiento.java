/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.ActionListener;

/**
 *
 * @author Administrador
 */
public class PanelBotonesMantenimiento extends javax.swing.JPanel {

    /**
     * Creates new form PanelBotonesMantenimiento
     */
    public PanelBotonesMantenimiento() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void init(){
       jbAgregar.setActionCommand(Integer.toString(PanelBotonesMantenimiento.BOTON_AGREGAR));
       jbEditar.setActionCommand(Integer.toString(PanelBotonesMantenimiento.BOTON_EDITAR));
       jbEliminar.setActionCommand(Integer.toString(PanelBotonesMantenimiento.BOTON_ELIMINAR));
       jbFiltrar.setActionCommand(Integer.toString(PanelBotonesMantenimiento.BOTON_FILTRAR));
       jbSalir.setActionCommand(Integer.toString(PanelBotonesMantenimiento.BOTON_SALIR
       ));
    }
       
       public void setControlador(ActionListener manejador)
       {
           jbAgregar.addActionListener(manejador);
           jbEditar.addActionListener(manejador);
           jbEliminar.addActionListener(manejador);
           jbFiltrar.addActionListener(manejador);
           jbSalir.addActionListener(manejador);
       
       }
    
       public void setCamposClave(String [] campos)
       {
       jcCampoClave.setModel(new javax.swing.DefaultComboBoxModel(campos));
       }
       
       public String getTextoClave(){
           return jtTextoClave.getText();
       }
       
       public String getCampoClave(){
          return jcCampoClave.getSelectedItem().toString(); //Se debe pasar a String porque lo que devuelve es un object
       }
    public static final int BOTON_AGREGAR=1;
    public static final int BOTON_EDITAR=2;
    public static final int BOTON_ELIMINAR=3;
    public static final int BOTON_SALIR=4;
    public static final int BOTON_FILTRAR=5;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbAgregar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jcCampoClave = new javax.swing.JComboBox();
        jtTextoClave = new javax.swing.JTextField();
        jbFiltrar = new javax.swing.JButton();
        jlCampoClave = new javax.swing.JLabel();
        jlTextoClave = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 255));

        jbAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jbEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/editar.png"))); // NOI18N

        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N

        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/salir.png"))); // NOI18N

        jcCampoClave.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "item 2", "Item  3", "item 4" }));

        jtTextoClave.setColumns(20);
        jtTextoClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTextoClaveActionPerformed(evt);
            }
        });

        jbFiltrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/filtro.png"))); // NOI18N

        jlCampoClave.setText("Filtrar por:");

        jlTextoClave.setText("Texto Clave");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlCampoClave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jcCampoClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlTextoClave)
                        .addGap(18, 18, 18)
                        .addComponent(jtTextoClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbEliminar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbAgregar)
                                .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbSalir)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcCampoClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlCampoClave)
                            .addComponent(jtTextoClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlTextoClave))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jtTextoClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTextoClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTextoClaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbFiltrar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox jcCampoClave;
    private javax.swing.JLabel jlCampoClave;
    private javax.swing.JLabel jlTextoClave;
    private javax.swing.JTextField jtTextoClave;
    // End of variables declaration//GEN-END:variables
}
