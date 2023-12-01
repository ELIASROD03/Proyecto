
package Controladores;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class ControladorPedido {

    public ControladorPedido() {
        
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
    
}
