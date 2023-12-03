package modelo;

import java.io.Serializable;



/**
 * La clase Platillos representa un objeto que describe un platillo en un menú de restaurante.
 * Cada platillo tiene un nombre, una descripción y un precio asociado.
 */
public class Platillos extends Stock implements Serializable{
    private String nombrePlatillo;
    private String descripcion;
    private String precio;
    private String momentodia;



    public Platillos(String nombrePlatillo, String descripcion, String precio, String momentodia, String nombreIngrediente, String cantidadIngrediente) {
        super(nombreIngrediente, cantidadIngrediente);
        this.nombrePlatillo = nombrePlatillo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.momentodia = momentodia;
    }
    
    

    public String getNombrePlatillo() {
        return nombrePlatillo;
    }

    public void setNombrePlatillo(String nombrePlatillo) {
        this.nombrePlatillo = nombrePlatillo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getMomentodia() {
        return momentodia;
    }

    public void setMomentodia(String momentodia) {
        this.momentodia = momentodia;
    }
    
    
    
    

}




