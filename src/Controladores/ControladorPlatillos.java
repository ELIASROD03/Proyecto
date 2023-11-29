
package Controladores;

import modelo.Platillos;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.PersistenciaGeneral;

public class ControladorPlatillos {
    private ArrayList<Platillos> listaPlatillos;

    public ControladorPlatillos() {
        listaPlatillos = new ArrayList<>();
    }

    public void setListaPlatillos(ArrayList<Platillos> listaPlatillos) {
        this.listaPlatillos = listaPlatillos;
    }

    public ArrayList<Platillos> getListaPlatillos() {
        return listaPlatillos;
    }
    
     public void eliminarPlatillo(ArrayList<Platillos> listaPlatillos, String nombrePlatillo) {
        for (int i = 0; i < listaPlatillos.size(); i++) {
            if (listaPlatillos.get(i).getNombrePlatillo().equals(nombrePlatillo)) {
                listaPlatillos.remove(i);
                break;
            }
        }
    }
     
        public void editarPlatillo(DefaultTableModel tblModel, JTable jTablePlatillos, ArrayList<Platillos> listaPlatillos) {
        try {
            if (jTablePlatillos.getSelectedRowCount() == 1) {
                int selectedRow = jTablePlatillos.getSelectedRow();
                String nuevoNombre = tblModel.getValueAt(selectedRow, 0).toString();
                String nuevoPrecio = tblModel.getValueAt(selectedRow, 1).toString();
                String nuevaDescripcion = tblModel.getValueAt(selectedRow, 2).toString();
                String nuevoMomennto = tblModel.getValueAt(selectedRow, 2).toString();

                Platillos platillo = listaPlatillos.get(selectedRow);
                platillo.setNombrePlatillo(nuevoNombre);
                platillo.setPrecio(nuevoPrecio);
                platillo.setDescripcion(nuevaDescripcion);
                platillo.setMomentodia(nuevoMomennto);

                // Guarda la lista actualizada en el archivo
                PersistenciaGeneral.guardarListaPlatillos(listaPlatillos, "listaPlatillos.dat");

                JOptionPane.showMessageDialog(null, "Row edited successfully.");
            } else {
                if (jTablePlatillos.getRowCount() == 0) {
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
    
}

    
