
package Controladores;

import modelo.Cliente;
import java.util.ArrayList;



import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.PersistenciaGeneral;

/**
 * La clase ControladorClientes se encarga de gestionar la lista de clientes.
 */
public class ControladorClientes {
    private ArrayList<Cliente> listaClientes;  // Lista que almacena objetos de la clase Cliente.

    /**
     * Constructor de la clase ControladorClientes. Inicializa la lista de clientes.
     */
    public ControladorClientes() {
        listaClientes = new ArrayList<>();
    }

    /**
     * Agrega un nuevo cliente a la lista de clientes.
     * Debes proporcionar los datos del cliente a agregar como argumentos a este método.
     * 
     * @see Cliente
     */
    public void agregarCliente() {
        // Implementa la lógica para agregar un nuevo cliente a la lista de clientes.
    }
    
    
     public void eliminarCliente(ArrayList<Cliente> listaClientes, String nombreCliente) {
        for (int i = 0; i < listaClientes.size(); i++) {
            if (listaClientes.get(i).getNombre().equals(nombreCliente)) {
                listaClientes.remove(i);
                break;
            }
        }
    }
     
    public void editarCliente(DefaultTableModel tblModel, JTable jTableClientes, ArrayList<Cliente> listaClientes) {
        try {
            if (jTableClientes.getSelectedRowCount() == 1) {
                int selectedRow = jTableClientes.getSelectedRow();
                String nuevoNombre = tblModel.getValueAt(selectedRow, 0).toString();
                String nuevoNumero = tblModel.getValueAt(selectedRow, 1).toString();
                String nuevaPreferencia = tblModel.getValueAt(selectedRow, 2).toString();

                Cliente cliente = listaClientes.get(selectedRow);
                cliente.setNombre(nuevoNombre);
                cliente.setNumeroTel(nuevoNumero);
                cliente.setPreferencia(nuevaPreferencia);

                // Guarda la lista actualizada en el archivo
                PersistenciaGeneral.guardarListaClientes(listaClientes, "listaClientes.dat");

                JOptionPane.showMessageDialog(null, "Editado correctamente.");
            } else {
                if (jTableClientes.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(null, "Tabla esta vacía.");
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor selecciona un dato.");
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());
        }
    }
}

