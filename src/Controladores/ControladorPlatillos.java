
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
                String nuevoMomento = tblModel.getValueAt(selectedRow, 2).toString();
                String nuevaDescripcion = tblModel.getValueAt(selectedRow, 3).toString();

                Platillos platillo = listaPlatillos.get(selectedRow);
                platillo.setNombrePlatillo(nuevoNombre);
                platillo.setPrecio(nuevoPrecio);
                platillo.setDescripcion(nuevaDescripcion);
                platillo.setMomentodia(nuevoMomento);

                // Guarda la lista actualizada en el archivo
                PersistenciaGeneral.guardarListaPlatillos(listaPlatillos, "listaPlatillos.dat");

                JOptionPane.showMessageDialog(null, "Editado correctamente");
            } else {
                if (jTablePlatillos.getRowCount() == 0) {
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
        
    public void actualizarTablaSegunCategoria(JTable tablaPlatillos, ArrayList<Platillos> listaPlatillos, String categoriaSeleccionada) {
        ArrayList<Platillos> platillosFiltrados = filtrarPlatillosPorCategoria(listaPlatillos, categoriaSeleccionada);
        actualizarTablaPlatillos(tablaPlatillos, platillosFiltrados);
    }

    private ArrayList<Platillos> filtrarPlatillosPorCategoria(ArrayList<Platillos> listaPlatillos, String categoria) {
        ArrayList<Platillos> platillosFiltrados = new ArrayList<>();

        for (Platillos platillo : listaPlatillos) {
            if (platillo.getMomentodia().equalsIgnoreCase(categoria)) {
                platillosFiltrados.add(platillo);
            }
        }

        return platillosFiltrados;
    }

    public void actualizarTablaPlatillos(JTable tablaPlatillos, ArrayList<Platillos> platillos) {
        DefaultTableModel tblModel = (DefaultTableModel) tablaPlatillos.getModel();
        tblModel.setRowCount(0);

        for (Platillos platillo : platillos) {
            tblModel.addRow(new Object[]{platillo.getNombrePlatillo(), platillo.getPrecio(),platillo.getMomentodia(), platillo.getDescripcion(),platillo.getNombreIngrediente()+(";")+platillo.getCantidadIngrediente()});
        }
    }
    
}

    
