
package Modelo;

import java.util.ArrayList;


public abstract class Empleado {

    String nombre;
    long id; 
    String username;
    String password;
    ArrayList<Factura> facturas;
    
/**
 * Se crea el objeto empleado y sus características (Nombre, ID, Username, Password y facturas realizadas)
 */
    public Empleado(String nombre, long id, String username, String password) {
        this.nombre = nombre;
        this.id = id;
        this.username = username;
        this.password = password;
        facturas = new ArrayList<>();
    }
/**
 * Se pide el nombre de usuario del empleado
 * @return 
 */
    public String getUsername() {
        return username;
    }
/**
 * Se declara el nombre de usuario del empleado
 * @param username Nombre de usuario asignado al empleado
 */
    public void setUsername(String username) {
        this.username = username;
    }
/**
 * Se obtiene el nombre del empleado
 * @return 
 */
    public String getNombre() {
        return nombre;
    }
/**
 * Se declara el nombre del empleado
 * @param nombre Nombre del empleado
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * Se obtiene el ID
 * @return 
 */
    public long getId() {
        return id;
    }
/**
 * Se declara el ID
 * @param id ID del empleado
 */
    public void setId(long id) {
        this.id = id;
    }
/**
 * Obtener contraseña
 * @return 
 */
    public String getPassword() {
        return password;
    }
/**
 * Declarar contraseña
 * @param password contraseña definida para el empleado
 */
    public void setPassword(String password) {
        this.password = password;
    }
/**
 * Añadir factura al historial del empleado
 * @param factura 
 */
    public void addFactura(Factura factura) {
        facturas.add(factura);
    }

}
