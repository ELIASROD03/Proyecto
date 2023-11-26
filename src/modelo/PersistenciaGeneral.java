/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author sanre
 */
public class PersistenciaGeneral {
     public static void guardarListaPlatillos(ArrayList<Platillos> listaPlatillos, String nombreArchivo) {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            salida.writeObject(listaPlatillos);
            System.out.println("Lista de platillos guardada con éxito en " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Platillos> cargarListaPlatillos(String nombreArchivo) {
        ArrayList<Platillos> listaLeida = new ArrayList<>();
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            listaLeida = (ArrayList<Platillos>) entrada.readObject();
            System.out.println("Lista de platillos cargada con éxito desde " + nombreArchivo);
        } catch (FileNotFoundException e) {
            System.out.println("El archivo " + nombreArchivo + " no existe. Se creará uno nuevo.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return listaLeida;
    }
    
    public static void guardarListaClientes(ArrayList<Cliente> listaClientes, String nombreArchivo) {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            salida.writeObject(listaClientes);
            System.out.println("Lista de clientes guardada con éxito en " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Cliente> cargarListaClientes(String nombreArchivo) {
        ArrayList<Cliente> listaLeida = new ArrayList<>();
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            listaLeida = (ArrayList<Cliente>) entrada.readObject();
            System.out.println("Lista de clientes cargada con éxito desde " + nombreArchivo);
        } catch (FileNotFoundException e) {
            System.out.println("El archivo " + nombreArchivo + " no existe. Se creará uno nuevo.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return listaLeida;
    }
    
    
    public static void guardarListaStock(ArrayList<Stock> listaStock, String nombreArchivo) {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            salida.writeObject(listaStock);
            System.out.println("Lista de Stock guardada con éxito en " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Stock> cargarListaStock(String nombreArchivo) {
        ArrayList<Stock> listaLeida = new ArrayList<>();
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            listaLeida = (ArrayList<Stock>) entrada.readObject();
            System.out.println("Lista de Stock cargada con éxito desde " + nombreArchivo);
        } catch (FileNotFoundException e) {
            System.out.println("El archivo " + nombreArchivo + " no existe. Se creará uno nuevo.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return listaLeida;
    }
    
}
