package Clases;



/**
 * La clase Platillos representa un objeto que describe un platillo en un menú de restaurante.
 * Cada platillo tiene un nombre, una descripción y un precio asociado.
 */
public class Platillos {
    private String nombrePlatillo;
    private String descripcion;
    private double precio;

    /**
     * Constructor de la clase Platillos.
     *
     * @param nombrePlatillo El nombre del platillo.
     * @param descripcion La descripción del platillo.
     * @param precio El precio del platillo.
     */
    public Platillos(String nombrePlatillo, String descripcion, double precio) {
        this.nombrePlatillo = nombrePlatillo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    /**
     * Obtiene el nombre del platillo.
     *
     * @return El nombre del platillo.
     */
    public String getNombrePlatillo() {
        return nombrePlatillo;
    }

    /**
     * Establece el nombre del platillo.
     *
     * @param nombrePlatillo El nombre del platillo a establecer.
     */
    public void setNombrePlatillo(String nombrePlatillo) {
        this.nombrePlatillo = nombrePlatillo;
    }

    /**
     * Obtiene la descripción del platillo.
     *
     * @return La descripción del platillo.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del platillo.
     *
     * @param descripcion La descripción del platillo a establecer.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el precio del platillo.
     *
     * @return El precio del platillo.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del platillo.
     *
     * @param precio El precio del platillo a establecer.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}




