/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import Controladores.ControladorPrincipal;
import Controladores.ControladorStock;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import modelo.Pedido;
import modelo.Platillos;
import modelo.Stock;

/**
 *
 * @author blanc
 */
public class RealizarPedido extends javax.swing.JPanel {
    ControladorPrincipal controlador;
    private ArrayList<Platillos> listaPlatillos;
    private ArrayList <Pedido> listaPedidos;
    
    public RealizarPedido(ControladorPrincipal controlador) {
        initComponents();
        this.controlador = controlador;
        this.listaPlatillos = controlador.obtenerPersistenciaGeneral().cargarListaPlatillos("listaPlatillos.dat");
        this.listaPedidos = controlador.obtenerPersistenciaGeneral().cargarListaRegistro("listaPedidos.dat");
        
        controlador.obtenerControladorPlatillos().actualizarTablaPlatillos(tablaPlatillos, listaPlatillos);
        
        tablaPlatillos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    agregarAlCarrito();
                }
            }
        });
        
    }
    
private void agregarAlCarrito() {
    DefaultTableModel modeloPlatillos = (DefaultTableModel) tablaPlatillos.getModel();
    DefaultTableModel modeloCarrito = (DefaultTableModel) tablaCarrito.getModel();

    // Obtener la fila seleccionada
    int filaSeleccionada = tablaPlatillos.getSelectedRow();
    String nombrePlatillo = null;
    double precio = 0.0;

    if (filaSeleccionada != -1) {
        try {
            nombrePlatillo = modeloPlatillos.getValueAt(filaSeleccionada, 0).toString();
            precio = Double.parseDouble(modeloPlatillos.getValueAt(filaSeleccionada, 1).toString());

            // Llama al método para reducir el stock
           
            int filaEnCarrito = controlador.obtenerControladorRegistro().encontrarFilaEnCarrito(modeloCarrito, nombrePlatillo);
            if (filaEnCarrito != -1) {
                // Si ya está en el carrito, incrementar la cantidad y actualizar el precio
                int cantidadActual = Integer.parseInt(modeloCarrito.getValueAt(filaEnCarrito, 1).toString()) + 1;
                double precioTotal = cantidadActual * precio;

                modeloCarrito.setValueAt(cantidadActual, filaEnCarrito, 1);
                modeloCarrito.setValueAt(precioTotal, filaEnCarrito, 2);
            } else {
                // Si no está en el carrito, agregar una nueva fila
                modeloCarrito.addRow(new Object[]{nombrePlatillo, 1, precio});
            }
            controlador.obtenerControladorRegistro().calcularTotal(modeloCarrito, total_txt);

        } catch (NullPointerException | NumberFormatException ex) {
            ex.printStackTrace(); // Otra acción apropiada para manejar la excepción
        }
    }
}
    
   
    
   

    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        total_txt = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Pagar_btn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCarrito = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPlatillos = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(192, 232, 192));

        jLabel1.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel1.setText("RealizarPedido");

        jLabel4.setText("Total: ");

        total_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_txtActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(192, 232, 192));

        jLabel2.setText("Número de Pedido");

        jLabel3.setText("Nombre del Cliente");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Agregar Pedido");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Eliminar Pedido");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addContainerGap())))
        );

        Pagar_btn.setText("Pagar");
        Pagar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pagar_btnActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro de Pedidos"));

        tablaCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Platillo", "Cantidad", "SubTotal"
            }
        ));
        tablaCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCarritoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaCarrito);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );

        tablaPlatillos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablaPlatillos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio", "Momento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaPlatillos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(769, 769, 769)
                .addComponent(Pagar_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(total_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(453, 453, 453))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(Pagar_btn))
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
     
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          if (jSpinner1.getValue().equals("") || jTextField1.getText().equals("")) {
        JOptionPane.showMessageDialog(this, "Por favor rellena todos los datos");
    } else {
        String spinnerValue = jSpinner1.getValue().toString(); // Convertir el valor del JSpinner a String
        String textFieldValue = jTextField1.getText();

        // Crear un array con los datos a agregar a la tabla
        String data[] = {spinnerValue, textFieldValue};

        DefaultTableModel tblModel = (DefaultTableModel) tablaCarrito.getModel();
        tblModel.addRow(data);

        JOptionPane.showMessageDialog(this, "Datos agregados correctamente");


          } 
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel)tablaCarrito.getModel();
        
        if(tablaCarrito.getSelectedRowCount() == 1){
            tblModel.removeRow(tablaCarrito.getSelectedRow());
        }else{
            if(tablaCarrito.getRowCount()==0){
                JOptionPane.showMessageDialog(this, "Table is Empty.");
            }else{
                JOptionPane.showMessageDialog(this, "PLEASE SELESCT sINGLE rOW FOR DELETE.");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tablaCarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCarritoMouseClicked
       
    }//GEN-LAST:event_tablaCarritoMouseClicked

    private void total_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_txtActionPerformed
      
    }//GEN-LAST:event_total_txtActionPerformed

    private void Pagar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pagar_btnActionPerformed
        DefaultTableModel modeloCarrito = (DefaultTableModel) tablaCarrito.getModel();
        

        System.out.println("Tamaño de la lista de pedidos antes de agregar: " + listaPedidos.size());
        for (Pedido pedido : listaPedidos) {
        System.out.println("Pedido existente: " + pedido);
        }

        String numeroPedido = String.valueOf(jSpinner1.getValue());
        String nombreCliente = jTextField1.getText();
        LocalDate fecha = LocalDate.now();
        String totalVenta = total_txt.getText();
        
       
    

       
        for (int i = 0; i < modeloCarrito.getRowCount(); i++) {
               String nombrePlatillo = modeloCarrito.getValueAt(i, 0).toString();
               String cantidadPlatillos = modeloCarrito.getValueAt(i, 1).toString();
               String cantidadPorPlatillo = modeloCarrito.getValueAt(i, 2).toString();
            Pedido pedido = new Pedido(fecha,
                    numeroPedido, 
                    cantidadPorPlatillo, 
                    nombrePlatillo, totalVenta,
                    cantidadPlatillos, 
                    nombreCliente);
                    listaPedidos.add(pedido);
        }
        
        System.out.println("Tamaño de la lista de pedidos después de agregar: " + listaPedidos.size());
        for (Pedido pedido : listaPedidos) {
        System.out.println("Pedido actualizado: " + pedido);
        }
        
        controlador.obtenerPersistenciaGeneral().guardarListaRegistro(listaPedidos,"listaPedidos.dat");
         modeloCarrito.setRowCount(0);
        total_txt.setText("0.0");
        
    }//GEN-LAST:event_Pagar_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Pagar_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tablaCarrito;
    private javax.swing.JTable tablaPlatillos;
    private javax.swing.JTextField total_txt;
    // End of variables declaration//GEN-END:variables
}
