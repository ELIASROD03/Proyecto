package modelo;

import Controladores.ControladorPrincipal;
import GUI.ControladorVentanas;
import GUI.PantallaPrincipal;
import com.sun.java.accessibility.util.AWTEventMonitor;


public class App {
    public static void main(String[] args) {
        
        ControladorVentanas controladorVentanas = new ControladorVentanas();
        controladorVentanas.iniciar();
    
        
    }
}
