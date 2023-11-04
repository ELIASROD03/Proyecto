
package Controladores;


public class ControladorPrincipal {
    private ControladorClientes controladorClt;
    private ControladorPlatillos controladorPlt;
    private ControladorStock controladorStk;

    public ControladorPrincipal() {
        controladorClt = new ControladorClientes();
        controladorPlt = new ControladorPlatillos();
        controladorStk = new ControladorStock();
    }
    
    public ControladorClientes obtenerControladorClientes() {
        return controladorClt;
    }

    public ControladorPlatillos obtenerControladorPlatillos() {
        return controladorPlt;
    }

    public ControladorStock obtenerControladorStock() {
        return controladorStk;
    }
    
    
    
}
