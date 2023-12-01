/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import Controladores.ControladorPrincipal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import modelo.Pedido;

/**
 *
 * @author blanc
 */
public class Reporte extends javax.swing.JPanel {
     private ControladorPrincipal controlador;
    private ArrayList<Pedido> listaPedidos;
    Set<LocalDate> fechasUnicas = new HashSet<>();
    
    public Reporte(ControladorPrincipal controlador) {
        initComponents();
        this.controlador = controlador;
        this.listaPedidos = controlador.obtenerPersistenciaGeneral().cargarListaRegistro("listaPedidos.dat");
       
       
        jTableFechas.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    // Obtener la fila seleccionada en la tabla de fechas
                    int filaSeleccionada = jTableFechas.getSelectedRow();

                    // Si hay una fila seleccionada, mostrar detalles en la otra tabla
                    if (filaSeleccionada != -1) {
                        LocalDate fechaSeleccionada = listaPedidos.get(filaSeleccionada).getFecha();
                        mostrarDetallesPorFecha(fechaSeleccionada);
                    }
                }
            }
        });
         actualizarTablaFechas();
    }
    private void actualizarTablaFechas() {
    DefaultTableModel modeloTablaFechas = (DefaultTableModel) jTableFechas.getModel();
    modeloTablaFechas.setRowCount(0);

    for (Pedido pedido : listaPedidos) {
        boolean fechaExistente = false;

        // Buscar si la fecha ya está en la tabla
        for (int i = 0; i < modeloTablaFechas.getRowCount(); i++) {
            LocalDate fechaTabla = (LocalDate) modeloTablaFechas.getValueAt(i, 0);
            if (fechaTabla.equals(pedido.getFecha())) {
                fechaExistente = true;
                // Actualizar otros datos del pedido en la fila existente
                modeloTablaFechas.setValueAt(pedido.getTotalVenta(), i, 1);
                break;
            }
        }

        // Si la fecha no está en la tabla, agregarla como nueva fila
        if (!fechaExistente) {
            modeloTablaFechas.addRow(new Object[]{pedido.getFecha(), /* Otros datos del pedido */});
        }
    }
}


    
    

    // Método para mostrar detalles en la tabla de platillos según la fecha seleccionada
    private void mostrarDetallesPorFecha(LocalDate fechaSeleccionada) {
        DefaultTableModel modeloTablaDetalles = (DefaultTableModel) jTableDetalles.getModel();
        modeloTablaDetalles.setRowCount(0); // Limpiar la tabla antes de agregar nuevas filas

        // Agregar filas a la tabla de detalles con los datos de los pedidos para la fecha seleccionada
        for (Pedido pedido : listaPedidos) {
            if (pedido.getFecha().equals(fechaSeleccionada)) {
                modeloTablaDetalles.addRow(new Object[]{
                        pedido.getNombrePlatillo(),
                        pedido.getCantidadPlt(),
                        pedido.getTotalPorPlatillo()
                });
            }
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFechas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDetalles = new javax.swing.JTable();

        setBackground(new java.awt.Color(192, 232, 192));
        setForeground(new java.awt.Color(192, 232, 192));

        jLabel1.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel1.setText("Registro de ventas");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha del Pedido"));

        jTableFechas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Día", "Total Vendido"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableFechas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Platillos consumido esa Fecha"));

        jTableDetalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre del Platillo", "Cantidad", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableDetalles);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(442, 442, 442))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableDetalles;
    private javax.swing.JTable jTableFechas;
    // End of variables declaration//GEN-END:variables
}
