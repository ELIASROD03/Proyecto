
package GUI;

import Controladores.ControladorPrincipal;
import java.util.ArrayList;

import modelo.Platillos;

public class ControladorVentanas {
    private ControladorPrincipal controladorPrincipal;
    private PantallaPrincipal pantallaPrincipal;
    private VentanaClientes ventanaClientes;
    private GestionDeMenu gestiondemenu;
   

    public ControladorVentanas() {
        controladorPrincipal = new ControladorPrincipal();
        pantallaPrincipal = new PantallaPrincipal(controladorPrincipal);
        ventanaClientes = new VentanaClientes(controladorPrincipal);
        gestiondemenu = new GestionDeMenu(controladorPrincipal);
        

        
    }

    public void iniciar() {
        pantallaPrincipal.setVisible(true);
        pantallaPrincipal.setLocationRelativeTo(null);
    }

}

