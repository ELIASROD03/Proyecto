/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;
import modelo.Cliente;
import Controladores.ControladorPrincipal;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import modelo.PersistenciaGeneral;



/**
 *
 * @author blanc
 */
public class GestionClientes extends javax.swing.JPanel {
    private ControladorPrincipal controlador;
    private ArrayList<Cliente> listaClientes;
    /**
     * Creates new form GestionClientes
     */
    public GestionClientes(ControladorPrincipal controlador) {
        initComponents();
        this.controlador = controlador;
        this.listaClientes = PersistenciaGeneral.cargarListaClientes("listaClientes.dat");
        
        actualizarTablaClientes();
    }
    //poner este metodo en su controlador correspondiente
     private void actualizarTablaClientes() {
        DefaultTableModel modeloTabla = (DefaultTableModel) jTableClientes.getModel();
        modeloTabla.setRowCount(0); // Limpiar la tabla antes de agregar nuevas filas

        for (Cliente cliente : listaClientes) {
            modeloTabla.addRow(new Object[]{cliente.getNombre(),cliente.getNumeroTel(),cliente.getPreferencia()});
        }
        
        
        
        
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        editar_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nombreC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        telefonoC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        preferenciaC = new javax.swing.JTextField();
        agregarclt_btn = new javax.swing.JButton();
        borrarclt_btn = new javax.swing.JButton();

        setBackground(new java.awt.Color(192, 232, 192));

        jLabel5.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel5.setText("Gestión de Clientes");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Clientes"));

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre del Cliente", "Número Teléfonico", "Preferencia"
            }
        ));
        jScrollPane1.setViewportView(jTableClientes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                .addContainerGap())
        );

        editar_btn.setText("Editar");
        editar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar_btnActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre del Cliente:");

        jLabel2.setText("Número Teléfonico:");

        jLabel3.setText("Preferencia:");

        agregarclt_btn.setText("Agregar");
        agregarclt_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarclt_btnActionPerformed(evt);
            }
        });

        borrarclt_btn.setText("Eliminar");
        borrarclt_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarclt_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefonoC, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(preferenciaC, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(agregarclt_btn)
                        .addGap(18, 18, 18)))
                .addComponent(borrarclt_btn)
                .addGap(18, 18, 18)
                .addComponent(editar_btn)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(416, 416, 416))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarclt_btn)
                    .addComponent(borrarclt_btn)
                    .addComponent(editar_btn)
                    .addComponent(jLabel1)
                    .addComponent(nombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(telefonoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(preferenciaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void agregarclt_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarclt_btnActionPerformed
        try {
            if(nombreC.getText().equals("")|| telefonoC.getText().equals("")|| preferenciaC.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Por favor Ingresa todos los datos");
            }else{
               Cliente cliente = new Cliente(nombreC.getText(), telefonoC.getText(), preferenciaC.getText());
               listaClientes.add(cliente);
                // Mostrar un mensaje de éxito
               JOptionPane.showMessageDialog(this, "Datos agregados correctamente");
               
               // Limpiar los campos de entrada
               nombreC.setText("");
               telefonoC.setText("");
               preferenciaC.setText("");
               
               PersistenciaGeneral.guardarListaClientes(listaClientes, "listaClientes.dat");
               DefaultTableModel tblModel = (DefaultTableModel) jTableClientes.getModel();
                tblModel.addRow(new Object[]{cliente.getNombre(), cliente.getNumeroTel(),cliente.getPreferencia()});
               }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                System.out.println(ex.getMessage());
        }
                        
    }//GEN-LAST:event_agregarclt_btnActionPerformed

    private void borrarclt_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarclt_btnActionPerformed
      DefaultTableModel tblModel = (DefaultTableModel)jTableClientes.getModel();
        
        if(jTableClientes.getSelectedRowCount() == 1){
             String nombreCliente = tblModel.getValueAt(jTableClientes.getSelectedRow(), 0).toString();
            tblModel.removeRow(jTableClientes.getSelectedRow());
            controlador.obtenerControladorClientes().eliminarCliente(listaClientes, nombreCliente);
 
            PersistenciaGeneral.guardarListaClientes(listaClientes, "listaClientes.dat");
            
            
            
        }else{
            if(jTableClientes.getRowCount()==0){
                JOptionPane.showMessageDialog(this, "Datos vacíos o incompletos.");
            }else{
                JOptionPane.showMessageDialog(this, "Por favor selecciona un dato.");
            }
        }
    }//GEN-LAST:event_borrarclt_btnActionPerformed

    private void editar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar_btnActionPerformed
        controlador.obtenerControladorClientes().editarCliente((DefaultTableModel) jTableClientes.getModel(), jTableClientes, listaClientes);
    }//GEN-LAST:event_editar_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarclt_btn;
    private javax.swing.JButton borrarclt_btn;
    private javax.swing.JButton editar_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTextField nombreC;
    private javax.swing.JTextField preferenciaC;
    private javax.swing.JTextField telefonoC;
    // End of variables declaration//GEN-END:variables
}
