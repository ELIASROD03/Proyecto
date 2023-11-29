
package Controladores;

import modelo.Platillos;


import java.util.ArrayList;

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
    
}

    
