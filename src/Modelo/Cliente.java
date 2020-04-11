
package Modelo;

import java.util.ArrayList;


public class Cliente {

    String nombre;
    long id;
    long telefono;
    Genero genero;
    ArrayList<Factura> facturas;
/**
 * Se crea el objeto cliente y sus características, además de agregarle las facturas en las que aparece
 */
    public Cliente(long id, String nombre, long telefono, Genero genero) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.genero = genero;
        facturas = new ArrayList<>();
    }
/**
 * Obtener género
 * @return 
 */
    public Genero getGenero() {
        return genero;
    }
/**
 * Obtener nombre de cliente
 * @return 
 */
    public String getNombre() {
        return nombre;
    }
/**
 * Declarar nombre del cliente
 * @param nombre Nombre del cliente
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * Obtener ID del cliente
 * @return 
 */
    public long getId() {
        return id;
    }
/**
 * Declarar telefono del cliente
 * @param telefono Número de teléfono del cliente
 */
    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
/**
 * Declarar el género del cliente
 * @param genero Género del cliente
 */
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
/**
 * Obtener teléfono del cliente
 * @return 
 */
    public long getTelefono() {
        return telefono;
    }
/**
 * Declarar ID del cliente
 * @param id Identificación del cliente
 */
    public void setId(long id) {
        this.id = id;
    }
/**
 * Añadir factura al cliente
 * @param f Factura generada para el cliente
 */
    public void addFactura(Factura f) {
        facturas.add(f);
    }
/**
 * Confirmación de que el cliente tenga todos los datos identicos a como está almacenado
 * @return 
 */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cliente) {
            Cliente c = (Cliente) obj;
            if (nombre.equals(c.getNombre()) && id == c.getId() && telefono == c.getTelefono() && genero.equals(c.getGenero())) {
                return true;
            }
        }
        return false;
    }

}
