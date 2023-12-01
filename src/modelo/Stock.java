package modelo;

import java.io.Serializable;



public class Stock implements Serializable {
    private String nombreIngrediente; // Nombre del ingrediente
    private String  cantidadIngrediente;  // Cantidad del ingrediente en stock

    public Stock(String nombreIngrediente, String cantidadIngrediente) {
        this.nombreIngrediente = nombreIngrediente;
        this.cantidadIngrediente = cantidadIngrediente;
    }
    
    
    

    /**
     * Obtiene el nombre del ingrediente.
     *
     * @return El nombre del ingrediente.
     */
    public String getNombreIngrediente() {
        return nombreIngrediente;
    }

    /**
     * Establece el nombre del ingrediente.
     *
     * @param nombreIngrediente El nombre del ingrediente a establecer.
     */
    public void setNombreIngrediente(String nombreIngrediente) {
        this.nombreIngrediente = nombreIngrediente;
    }

    /**
     * Obtiene la cantidad del ingrediente en stock.
     *
     * @return La cantidad del ingrediente en stock.
     */
    public String getCantidadIngrediente() {
        return cantidadIngrediente;
    }

    /**
     * Establece la cantidad del ingrediente en stock.
     *
     * @param cantidadIngrediente La cantidad del ingrediente en stock a establecer.
     */
    public void setCantidadIngrediente(String cantidadIngrediente) {
        this.cantidadIngrediente = cantidadIngrediente;
    }

    /**
     * Realiza una operación para contar los ingredientes en stock.
     * Este método puede ser implementado según las necesidades específicas del inventario.
     */
    public void contarIngredientes() {
        // Implementa la lógica de conteo de ingredientes si es necesario.
    }
}

