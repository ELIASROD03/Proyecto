
package Controladores;

import modelo.PersistenciaGeneral;



/**
 * La clase ControladorPrincipal es responsable de gestionar los controladores de clientes, platillos y stock en una aplicación.
 */
public class ControladorPrincipal {
    private ControladorClientes controladorClt;  // Controlador de clientes
    private ControladorPlatillos controladorPlt;  // Controlador de platillos
    private ControladorStock controladorStk;  // Controlador de stock
    private PersistenciaGeneral persistenciageneral;
    private ControladorPedido controladorPed;
    /**
     * Constructor de la clase ControladorPrincipal. Inicializa los controladores de clientes, platillos y stock.
     */
    public ControladorPrincipal() {
        controladorClt = new ControladorClientes();
        controladorPlt = new ControladorPlatillos();
        controladorStk = new ControladorStock();
        persistenciageneral = new PersistenciaGeneral();
        controladorPed = new ControladorPedido();
    }
    
    public ControladorPedido obtenerControladorRegistro(){
        return controladorPed;
    }
    
    public PersistenciaGeneral obtenerPersistenciaGeneral(){
        return persistenciageneral;
    }

    /**
     * Obtiene el controlador de clientes.
     *
     * @return El controlador de clientes.
     */
    public ControladorClientes obtenerControladorClientes() {
        return controladorClt;
    }

    /**
     * Obtiene el controlador de platillos.
     *
     * @return El controlador de platillos.
     */
    public ControladorPlatillos obtenerControladorPlatillos() {
        return controladorPlt;
    }

    /**
     * Obtiene el controlador de stock.
     *
     * @return El controlador de stock.
     */
    public ControladorStock obtenerControladorStock() {
        return controladorStk;
    }
    
    
}

