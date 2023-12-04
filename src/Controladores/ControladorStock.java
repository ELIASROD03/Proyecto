
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
    private ArrayList<Platillos> listaPlatillos;
    /**
     * Constructor de la clase ControladorStock. Inicializa la lista de elementos de inventario (stock).
     */
    public ControladorStock() {
        this.listaPlatillos = PersistenciaGeneral.cargarListaPlatillos("listaPlatillos.dat");
        
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
      
        public void buscarIngredientePlatillo(String nombrePlatillo,ArrayList<Stock>listaStock) {
        for (Platillos platillo : listaPlatillos) {
            if (platillo.getNombrePlatillo().equals(nombrePlatillo)) {
                String nombreIngrediente = platillo.getNombreIngrediente();
                // Realizar acciones con el nombre del ingrediente si es necesario
                System.out.println("Ingrediente del platillo encontrado: " + nombreIngrediente);
                restarStockPorIngrediente(nombreIngrediente,listaStock);
                return; // Terminamos el método una vez que encontramos el platillo
            }
        }

        System.out.println("Ingrediente del platillo no encontrado.");
    }
        
        
   private void restarStockPorIngrediente(String nombreIngrediente,ArrayList<Stock>listaStock) {
    for (Stock stock : listaStock) {
        if (stock.getNombreIngrediente().equals(nombreIngrediente)) {
            int cantidadActual = Integer.parseInt(stock.getCantidadIngrediente());
            if (cantidadActual > 0) {
                int nuevaCantidad = cantidadActual - 1;
                stock.setCantidadIngrediente(String.valueOf(nuevaCantidad));

                // Mostrar mensaje en una ventana
                JOptionPane.showMessageDialog(null, "Stock restado para " + stock.getNombreIngrediente());

                // Guardar la lista actualizada en el archivo
                PersistenciaGeneral.guardarListaStock(listaStock, "listaStock.dat");

                // Mostrar alerta si la cantidad restante es menor a 5
                if (nuevaCantidad < 5) {
                    JOptionPane.showMessageDialog(null, "¡Atención! La cantidad de " + nombreIngrediente + " es baja.");
                }

                return; // Terminamos el método una vez que se actualiza el stock
            } else {
                // Mostrar alerta si no hay ingredientes disponibles
                JOptionPane.showMessageDialog(null, "¡Atención! No hay stock disponible para " + nombreIngrediente + ".");
                return;
            }
        }
    }

    // Mostrar mensaje en una ventana
    JOptionPane.showMessageDialog(null, "Ingrediente no encontrado en la lista de stock.");
}

      
      
      
    
    
      
      
    

      
        
}
