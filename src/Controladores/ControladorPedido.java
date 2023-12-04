
package Controladores;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.PersistenciaGeneral;
import modelo.Stock;


public class ControladorPedido {
    private ArrayList<Stock> listaStock;
    private ControladorStock controladorStock;
    private PersistenciaGeneral persistencia;

    public ControladorPedido( ControladorStock controladorStock) {
        this.listaStock = persistencia.cargarListaStock("listaStock.dat");
        this.controladorStock = controladorStock;
    }

    
    
    
    
    
    
     public int encontrarFilaEnCarrito(DefaultTableModel modeloCarrito, String nombrePlatillo) {
        for (int i = 0; i < modeloCarrito.getRowCount(); i++) {
            if (modeloCarrito.getValueAt(i, 0).equals(nombrePlatillo)) {
                return i;
            }
        }
        return -1;
    }
     
    public void calcularTotal(DefaultTableModel modeloCarrito, JTextField total_txt) {
        double total = 0;
        for (int i = 0; i < modeloCarrito.getRowCount(); i++) {
            total += Double.parseDouble(modeloCarrito.getValueAt(i, 2).toString());
        }
        total_txt.setText("Total: " + total);
    }
    
    
    public void agregarAlCarrito(JTable tablaPlatillos,DefaultTableModel modeloPlatillos, DefaultTableModel modeloCarrito, JTextField total_txt) {
   

    // Obtener la fila seleccionada
     int filaSeleccionada = tablaPlatillos.getSelectedRow();
    String nombrePlatillo = null;
    double precio = 0.0;

    if (filaSeleccionada != -1) {
        try {
            nombrePlatillo = modeloPlatillos.getValueAt(filaSeleccionada, 0).toString();
            precio = Double.parseDouble(modeloPlatillos.getValueAt(filaSeleccionada, 1).toString());
              System.out.println("Antes de restar el stock - Lista Stock:");
            for (Stock stock : listaStock) {
                System.out.println(stock);
            }
                
          
           
            System.out.println("Después de restar el stock - Lista Stock:");
            for (Stock stock : listaStock) {
                System.out.println(stock);
            }
            int filaEnCarrito = encontrarFilaEnCarrito(modeloCarrito, nombrePlatillo);
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
            calcularTotal(modeloCarrito, total_txt);
            
             

        } catch (NullPointerException | NumberFormatException ex) {
            ex.printStackTrace(); // Otra acción apropiada para manejar la excepción
        }
    }
} 
    
}
