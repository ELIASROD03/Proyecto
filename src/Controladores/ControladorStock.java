
package Controladores;

import java.awt.List;
import modelo.Stock;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Pedido;
import modelo.PersistenciaGeneral;


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
      
      
          public void procesarIngredientes(ArrayList<Pedido> listaPedidos) {
        for (Pedido pedido : listaPedidos) {
            procesarIngredientePedido(pedido);
        }
    }

        public void procesarIngredientePedido(Pedido pedido) {
            for (Stock stockPedido : pedido.getListaIngredientes()) {
            String nombreIngrediente = stockPedido.getNombreIngrediente();
            double cantidadIngredientePedido = Double.parseDouble(stockPedido.getCantidadIngrediente());

        Stock stockEnLista = buscarStock(nombreIngrediente);

        if (stockEnLista != null) {
            double cantidadIngredienteStock = Double.parseDouble(stockEnLista.getCantidadIngrediente());

            if (cantidadIngredienteStock >= cantidadIngredientePedido) {
                stockEnLista.setCantidadIngrediente(String.valueOf(cantidadIngredienteStock - cantidadIngredientePedido));
            } else {
                mostrarAlerta("¡Atención! Faltan ingredientes: " + nombreIngrediente);
            }

            if (cantidadIngredienteStock < 2) {
                mostrarAlerta("¡Atención! Bajo stock de: " + nombreIngrediente);
            }
        } else {
            mostrarAlerta("¡Atención! No hay existencias de: " + nombreIngrediente);
        }
       
    }
        PersistenciaGeneral.guardarListaStock(listaStock, "listaStock.dat");
}

    private Stock buscarStock(String nombreIngrediente) {
        for (Stock stock : listaStock) {
            if (stock.getNombreIngrediente().equals(nombreIngrediente)) {
                return stock;
            }
        }
        return null;
    }

    private void mostrarAlerta(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
     
     
     
}
