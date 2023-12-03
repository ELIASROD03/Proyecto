
package Controladores;

import java.awt.List;
import modelo.Stock;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Pedido;
import modelo.PersistenciaGeneral;
import modelo.Platillos;


/**
 * La clase ControladorStock se encarga de gestionar la lista de elementos de inventario (stock).
 */
public class ControladorStock {
    private ArrayList<Stock> listaStock;  // Lista que almacena objetos de la clase Stock.
    private ArrayList<Pedido> listaPedidos;
    /**
     * Constructor de la clase ControladorStock. Inicializa la lista de elementos de inventario (stock).
     */
    public ControladorStock() {
        listaStock = new ArrayList<>();
    }

    /**
     * Agrega un nuevo elemento de inventario (stock) a la lista.
     * Debes proporcionar los datos del elemento de inventario a agregar como argumentos a este método.
     * 
     * @see Stock
     */
    public void agregarStock() {
        // Implementa la lógica para agregar un nuevo elemento de inventario a la lista de stock.
    }
    
    
     public void eliminarProductoStock(ArrayList<Stock> listaStock, String nombreStock) {
        for (int i = 0; i < listaStock.size(); i++) {
            if (listaStock.get(i).getNombreIngrediente().equals(nombreStock)) {
                listaStock.remove(i);
                break;
            }
        }
    }
     
      public void editarStock(DefaultTableModel tblModel, JTable tablaStock, ArrayList<Stock> listaStock) {
        try {
            if (tablaStock.getSelectedRowCount() == 1) {
                int selectedRow = tablaStock.getSelectedRow();
                String nuevoNombre = tblModel.getValueAt(selectedRow, 0).toString();
                String nuevaCantidad = tblModel.getValueAt(selectedRow, 1).toString();

                Stock stock = listaStock.get(selectedRow);
                stock.setNombreIngrediente(nuevoNombre);
                stock.setCantidadIngrediente(nuevaCantidad);

                // Guarda la lista actualizada en el archivo
                PersistenciaGeneral.guardarListaStock(listaStock, "listaStock.dat");

                JOptionPane.showMessageDialog(null, "Row edited successfully.");
            } else {
                if (tablaStock.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(null, "Table is Empty.");
                } else {
                    JOptionPane.showMessageDialog(null, "PLEASE SELECT SINGLE ROW FOR EDIT.");
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());
        }
    }
      
      
      public void pagarYGuardar(ArrayList<Platillo> platillosEnCarrito) {
        // Itera sobre los platillos en el carrito y actualiza la listaStock
        for (Platillos platillo : platillosEnCarrito) {
            
            String nombreIngrediente = platillo.getNombreIngrediente();
            int cantidadIngrediente = platillo.getCantidadIngrediente();

            // Actualiza la cantidad en listaStock
            actualizarCantidadEnListaStock(nombreIngrediente, cantidadIngrediente);
        }

        // Guarda la listaStock actualizada en un archivo
        //guardarListaStockEnArchivo();
    }

    private void actualizarCantidadEnListaStock(String nombrePlatillo, int cantidadPlatillo) {
        for (Platillos platillo : listaStock) {
            if (platillo.getNombre().equals(nombrePlatillo)) {
                platillo.setCantidad(platillo.getCantidad() - cantidadPlatillo);
                break; // Si encuentras el platillo, sal del bucle
            }
        }
    }

      
        
}
