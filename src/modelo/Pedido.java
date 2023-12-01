/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author elias
 */
public class Pedido implements Serializable{
    private LocalDate fecha;
    private String numeroPedido;
    private String totalPorPlatillo;
    private String nombrePlatillo;
    private String totalVenta;
    private String cantidadPlt;
    private String nombreClienteVenta;

    public Pedido(LocalDate fecha, String numeroPedido, String totalPorPlatillo, String nombrePlatillo, String totalVenta, String cantidadPlt, String nombreClienteVenta) {
        this.fecha = fecha;
        this.numeroPedido = numeroPedido;
        this.totalPorPlatillo = totalPorPlatillo;
        this.nombrePlatillo = nombrePlatillo;
        this.totalVenta = totalVenta;
        this.cantidadPlt = cantidadPlt;
        this.nombreClienteVenta = nombreClienteVenta;
    }

    public String getTotalPorPlatillo() {
        return totalPorPlatillo;
    }

    public void setTotalPorPlatillo(String totalPorPlatillo) {
        this.totalPorPlatillo = totalPorPlatillo;
    }

    public String getNombrePlatillo() {
        return nombrePlatillo;
    }

    public void setNombrePlatillo(String nombrePlatillo) {
        this.nombrePlatillo = nombrePlatillo;
    }

    

   

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = LocalDate.now();
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(String totalVenta) {
        this.totalVenta = totalVenta;
    }

    public String getCantidadPlt() {
        return cantidadPlt;
    }

    public void setCantidadPlt(String cantidadPlt) {
        this.cantidadPlt = cantidadPlt;
    }

    

    public String getNombreClienteVenta() {
        return nombreClienteVenta;
    }

    public void setNombreClienteVenta(String nombreClienteVenta) {
        this.nombreClienteVenta = nombreClienteVenta;
    }

   

    
    
   
    
    
    
}


    
    