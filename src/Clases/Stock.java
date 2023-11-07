package Clases;


/**
 * La clase Stock representa un elemento de inventario que contiene información sobre un ingrediente y su cantidad en stock.
 */
public class Stock {
    private String nombreIngrediente; // Nombre del ingrediente
    private int cantidadIngrediente;  // Cantidad del ingrediente en stock

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
    public int getCantidadIngrediente() {
        return cantidadIngrediente;
    }

    /**
     * Establece la cantidad del ingrediente en stock.
     *
     * @param cantidadIngrediente La cantidad del ingrediente en stock a establecer.
     */
    public void setCantidadIngrediente(int cantidadIngrediente) {
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

