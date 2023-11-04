
package GUI;

import Controladores.ControladorPrincipal;


public class ControladorVentanas {
    private ControladorPrincipal controladorPrincipal;
    private PantallaPrincipal pantallaPrincipal;
    private VentanaClientes ventanaClientes;

    public ControladorVentanas() {
        controladorPrincipal = new ControladorPrincipal();
        pantallaPrincipal = new PantallaPrincipal(controladorPrincipal);
        ventanaClientes = new VentanaClientes(controladorPrincipal);
        
    }
    
    public void iniciar(){
        pantallaPrincipal.setVisible(true);
        pantallaPrincipal.setLocationRelativeTo(null);
    }
     
    
    
    
}


