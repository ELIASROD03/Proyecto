
package Controladores;

import modelo.Cliente;
import java.util.ArrayList;



import java.util.ArrayList;

/**
 * La clase ControladorClientes se encarga de gestionar la lista de clientes.
 */
public class ControladorClientes {
    private ArrayList<Cliente> listaClientes;  // Lista que almacena objetos de la clase Cliente.

    /**
     * Constructor de la clase ControladorClientes. Inicializa la lista de clientes.
     */
    public ControladorClientes() {
        listaClientes = new ArrayList<>();
    }

    /**
     * Agrega un nuevo cliente a la lista de clientes.
     * Debes proporcionar los datos del cliente a agregar como argumentos a este método.
     * 
     * @see Cliente
     */
    public void agregarCliente() {
        // Implementa la lógica para agregar un nuevo cliente a la lista de clientes.
    }
    
    
     public void eliminarCliente(ArrayList<Cliente> listaClientes, String nombreCliente) {
        for (int i = 0; i < listaClientes.size(); i++) {
            if (listaClientes.get(i).getNombre().equals(nombreCliente)) {
                listaClientes.remove(i);
                break;
            }
        }
    }
}

