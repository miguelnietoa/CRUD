
package Modelo;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;


public class Miscelanea {

    Empleado userLogin;
    ArrayList<Factura> facturas;
    ArrayList<Empleado> empleados;
    ArrayList<Producto> productos;
    ArrayList<Cliente> clientes;
    ArrayList<ProductoDetalle> productosCarrito;
    /**
 * Se crea la clase de miscelanea y las Arraylist de facturas, empleados, productos, clientes y de los productos en el carrito
 * @author Harry Cepeda, Miguel Nieto, Mateo Arcieri, Juan Pablo Mendez
 */
/**
 * Se crean los ArrayList de las ventanas
 */
    public Miscelanea() {
        facturas = new ArrayList<>();
        empleados = new ArrayList<>();
        productos = new ArrayList<>();
        clientes = new ArrayList<>();
        productosCarrito = new ArrayList<>();
        cargarEstructuras();
    }
/**
 * Acción par añadir un producto al carrito 
 */
    public void addProductoCarrito(ProductoDetalle pr) {
        productosCarrito.add(pr);
    }
/**
 * Acción para añadir un producto 
 */
    public void addProducto(Producto p) {
        productos.add(p);
    }
/**
 * Acción par añadir una factura 
 */
    public void addFactura(Factura f) {
        facturas.add(f);
    }
/**
 * Acción para añadir un empleado 
 */
    public void addEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }
/**
 * Acción para añadir un cliente 
 */
    public void addCliente(Cliente c) {
        clientes.add(c);
    }
/**
 * se confirma el inicio de sesión con los archivos para confirmar si el usuario y contraseña se encuentran registrados
 * @param user recibe el usuario
 * @param password recibe la contraseña
 * @return 
 */
    public boolean iniciarSesion(String user, String password) {
        for (Empleado empleado : empleados) {
            if (empleado.getUsername().equals(user) && empleado.getPassword().equals(password)) {
                userLogin = empleado;
                return true;
            }
        }
        return false;
    }
/**
 * Se carga la información de las tablas
 */
    private void cargarEstructuras() {
        cargarEmpleados();
        cargarProductos();
        cargarClientes();
        cargarFacturas();
    }
/**
 * Se cargan los Empleados a su respectiva tabla
 */
    private void cargarEmpleados() {
        try (Scanner lector = new Scanner(new File("src/Modelo/files/Empleados.txt"))) {
            while (lector.hasNextLine()) {
                String line = lector.nextLine();
                String[] datos = line.split(",");
                Empleado emp;
                if (datos[2].equalsIgnoreCase("admin")) {
                    System.out.println("yess");
                    emp = new Administrador(datos[0], Long.parseLong(datos[1]), datos[3], datos[4]);
                } else {
                    emp = new Vendedor(datos[0], Long.parseLong(datos[1]), datos[3], datos[4]);
                }
                addEmpleado(emp);
            }
        } catch (Exception e) {

        }
    }
/**
 * Se cargan los productos a su respectiva tabla
 */
    private void cargarProductos() {
        try (Scanner lector = new Scanner(new File("src/Modelo/files/Productos.txt"))) {
            while (lector.hasNextLine()) {
                String line = lector.nextLine();
                String[] datos = line.split(",");
                addProducto(new Producto(Long.parseLong(datos[0]), datos[1], Float.parseFloat(datos[2]), Long.parseLong(datos[3])));
            }
        } catch (Exception e) {

        }
    }
/**
 * Se cargan los clientes a su respectiva tabla
 */
    private void cargarClientes() {
        try (Scanner lector = new Scanner(new File("src/Modelo/files/Clientes.txt"))) {
            while (lector.hasNextLine()) {
                String line = lector.nextLine();
                String[] datos = line.split(",");
                addCliente(new Cliente(Long.parseLong(datos[0]), datos[1], Long.parseLong(datos[2]), Genero.getGenero(Integer.parseInt(datos[3]))));
            }
        } catch (Exception e) {

        }
    }
/**
 * Se cargan las facturas a su respectiva tabla
 */
    private void cargarFacturas() {
        try (Scanner lector = new Scanner(new File("src/Modelo/files/Facturas.txt"))) {
            while (lector.hasNextLine()) {
                String line = lector.nextLine();
                String[] datos = line.split(",");
                addFactura(new Factura(getCliente(Long.parseLong(datos[2])), getEmpleado(Long.parseLong(datos[1])), Float.parseFloat(datos[3]), new ArrayList<ProductoDetalle>(), String.valueOf(datos[4])));
            }
        } catch (Exception e) {

        }
    }
/**
 * Se pide el usuario en la ventana Login
 * @return 
 */
    public Empleado getUserLogin() {
        return userLogin;
    }
/**
 * Se piden las facturas
 * @return 
 */
    public ArrayList<Factura> getFacturas() {
        return facturas;
    }
/**
 * Se piden los empleados
 * @return 
 */
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
/**
 * Se piden los productos
 * @return 
 */
    public ArrayList<Producto> getProductos() {
        return productos;
    }
/**
 * Se piden los clientes
 * @return 
 */
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
/**
 * Se piden los productos almacenados en el carrito
 * @return 
 */
    public ArrayList<ProductoDetalle> getProductosCarrito() {
        return productosCarrito;
    }
/**
 * Se pide el producto enviando el código con el cual está registrado
 * @param cod código del producto
 * @return 
 */
    public Producto getProducto(long cod) {
        for (Producto producto : productos) {
            if (producto.getCodigo() == cod) {
                return producto;
            }
        }
        return null;
    }
/**
 * Se pide el producto almacenado en el carrito ingresando su código 
 * @param cod código del producto
 * @return 
 */
    public ProductoDetalle getProductoCarrito(long cod) {
        for (ProductoDetalle productoDetalle : productosCarrito) {
            if (productoDetalle.getProducto().getCodigo() == cod) {
                return productoDetalle;
            }
        }
        return null;
    }
/**
 * Se pide el cliente a partir de su Identificación
 * @param id identificación del cliente
 * @return 
 */
    public Cliente getCliente(long id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }
/**
 * Se pide el empleado a partir de su identificación    
 * @param id identificación del empleado
 * @return 
 */
    public Empleado getEmpleado(long id) {
        for (Empleado empleado : empleados) {
            if (empleado.getId() == id) {
                return empleado;
            }
        }
        return null;
    }
/**
 * Se busca y elimina un cliente de la tabla
 * @param cliente Nombre del cliente
 */
    public void eliminarCliente(Cliente cliente) {
        Collection<Cliente> toDelete = new ArrayList<>();
        toDelete.add(cliente);
        clientes.removeAll(toDelete);
    }
/**
 * Se busca y elimina un producto de la tabla
 * @param producto Nombre del producto
 */
    public void eliminarProducto(Producto producto) {
        Collection<Producto> toDelete = new ArrayList<>();
        toDelete.add(producto);
        productos.removeAll(toDelete);
    }
/**
 * Se busca y elimina un empleado de la tabla
 * @param empleado Nombre del empleado 
 */
    public void eliminarEmpleado(Empleado empleado) {
        Collection<Empleado> toDelete = new ArrayList<>();
        toDelete.add(empleado);
        empleados.removeAll(toDelete);
    }
/**
 * Se busca y elimina un producto del carrito
 * @param pd Nombre del producto almacenado en el carrito
 */
    public void eliminarProductoCarrito(ProductoDetalle pd) {
        Collection<ProductoDetalle> toDelete = new ArrayList<>();
        toDelete.add(pd);
        productosCarrito.removeAll(toDelete);
    }

}
