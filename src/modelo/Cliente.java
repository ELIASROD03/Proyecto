package modelo;

import java.io.Serializable;



/**
 * La clase Cliente representa a un cliente que tiene un nombre, un número de teléfono y una preferencia.
 */
public class Cliente implements Serializable {
    private String nombre;
    private String numeroTel;
    private String preferencia;

    /**
     * Constructor de la clase Cliente.
     *
     * @param nombre El nombre del cliente.
     * @param numeroTel El número de teléfono del cliente.
     * @param preferencia La preferencia del cliente.
     */
    public Cliente(String nombre, String numeroTel, String preferencia) {
        this.nombre = nombre;
        this.numeroTel = numeroTel;
        this.preferencia = preferencia;
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente.
     *
     * @param nombre El nombre del cliente a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de teléfono del cliente.
     *
     * @return El número de teléfono del cliente.
     */
    public String getNumeroTel() {
        return numeroTel;
    }

    /**
     * Establece el número de teléfono del cliente.
     *
     * @param numeroTel El número de teléfono del cliente a establecer.
     */
    public void setNumeroTel(String numeroTel) {
        this.numeroTel = numeroTel;
    }

    /**
     * Obtiene la preferencia del cliente.
     *
     * @return La preferencia del cliente.
     */
    public String getPreferencia() {
        return preferencia;
    }

    /**
     * Establece la preferencia del cliente.
     *
     * @param preferencia La preferencia del cliente a establecer.
     */
    public void setPreferencia(String preferencia) {
        this.preferencia = preferencia;
    }

}
