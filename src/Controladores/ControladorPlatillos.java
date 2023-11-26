
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
}

    
