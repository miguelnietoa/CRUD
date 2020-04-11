
package Modelo;


public class Producto {

    String nombre;
    long codigo;
    float precio;
    long existencias;
/**
 * Se crea el objeto Producto y los datos que recibe (nombre, codigo, precio y existencias)
 */
    public Producto(long codigo, String nombre, float precio, long existencias) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.existencias = existencias;
    }
/**
 * Busca las existencias del producto
    */
    public long getExistencias() {
        return existencias;
    }
/**
 * Declara las existencias del producto
 * @param existencias 
 */
    public void setExistencias(long existencias) {
        this.existencias = existencias;
    }
/**
 * Busca el nombre del producto
 * @return 
 */
    public String getNombre() {
        return nombre;
    }
/**
 * Declara el nombre del producto
 * @param nombre 
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * Busca el codigo del producto
 * @return 
 */
    public long getCodigo() {
        return codigo;
    }
/**
 * Declara el codigo del producto
 * @param codigo 
 */
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }
/**
 * Busca el precio del producto
 * @return 
 */
    public float getPrecio() {
        return precio;
    }
/**
 * Declara el precio del producto
 * @param precio 
 */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
/**
 * Se confirma que el producto esté dentro de la lista y con los mismos datos
 * @param obj Producto que se va a confirmar
 * @return 
 */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Producto) {
            Producto p = (Producto) obj;
            if (nombre.equals(p.getNombre()) && codigo == p.getCodigo() && precio == p.getPrecio() && existencias == p.getExistencias()) {
                return true;
            }
        }
        return false;
    }

}
