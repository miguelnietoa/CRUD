
package Modelo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class Factura {

    static long cont = 0;
    long id;
    float precioTotal;
    float subtotal;
    float iva;
    Empleado vendedor;
    Cliente cliente;
    ArrayList<ProductoDetalle> productos;
    String fecha;
/**
 * Se crea la factura y sus componentes (tabla de productos, precio total, subtotal, IVA, vendedor que está efectuando la compra, etc)
 */
    public Factura(Cliente cliente, Empleado vendedor, float precioTotal, ArrayList<ProductoDetalle> productos, String fecha) {
        this.cliente = cliente;
        cliente.addFactura(this);
        this.vendedor = vendedor;
        vendedor.addFactura(this);
        this.precioTotal = precioTotal;
        this.iva = precioTotal * 0.19f;
        this.subtotal = precioTotal + iva;
        this.productos = new ArrayList<>();
        this.productos = productos;
        id = ++cont;
        this.fecha = fecha;
    }
/**
 * Se declara la fecha
 * @return 
 */
    public String getFecha() {
        return fecha;
    }
/**
 * Se pide el ID del cliente
 * @return 
 */
    public long getId() {
        return id;
    }
/**
 * Se declara el ID del cliente
 * @param id 
 */
    public void setId(int id) {
        this.id = id;
    }
/**
 * Se pide el precio total
 * @return 
 */
    public float getPrecioTotal() {
        return precioTotal;
    }
/**
 * Se declara el precio total
 * @param precioTotal Precio total de los productos almacenados en el carrito más el IVA
 */
    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }
/**
 * Se pide el subtotal
 * @return 
 */
    public float getSubtotal() {
        return subtotal;
    }
/**
 * Se declara el subtotal
 * @param subtotal subtotal del precio que es únicamente de los productos sin el IVA
 */
    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }
/**
 * Se pide el IVA
 * @return 
 */
    public float getIva() {
        return iva;
    }
/**
 * Se declara el IVA
 * @param iva Adición al precio adquirido en el subtotal
 */
    public void setIva(float iva) {
        this.iva = iva;
    }
/**
 * Se obtiene al vendedor
 * @return 
 */
    public Empleado getVendedor() {
        return vendedor;
    }
/**
 * Se declara al vendedor   
 * @param vendedor Nombre del vendedor que está realizando la factura y venta de los productos
 */
    public void setVendedor(Empleado vendedor) {
        this.vendedor = vendedor;
    }
/**
 * Se obtiene al cliente
 * @return 
 */
    public Cliente getCliente() {
        return cliente;
    }
/**
 * Se declara al cliente
 * @param cliente Nombre del cliente el cual está efectuando la compra
 */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
/**
 * se añade un producto
 * @param fd 
 */
    public void addProducto(ProductoDetalle fd) {
        productos.add(fd);
    }
/**
 * Se piden los productos
 * @return 
 */
    public ArrayList<ProductoDetalle> getProductos() {
        return productos;
    }

}
