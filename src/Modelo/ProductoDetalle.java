
package Modelo;


public class ProductoDetalle {

    Producto producto;
    int cantComprada;
/**
 * Se crean los objetos de producto y cantidad comprada 
 */
    public ProductoDetalle(Producto producto, int cantComprada) {
        this.producto = producto;
        this.cantComprada = cantComprada;
    }
/**
 * Se obtiene la cantidad comprada
 * @return 
 */
    public int getCantComprada() {
        return cantComprada;
    }
/**
 * Se obtiene la cantidad del producto
 * @return 
 */
    public Producto getProducto() {
        return producto;
    }
}
