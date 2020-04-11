/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author N.N
 */
public class MiscelaneaTest {
    
    public MiscelaneaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

  
 

    




    /**
     * Test of iniciarSesion method, of class Miscelanea.
     */
    @Test
    public void testIniciarSesion() {
        System.out.println("iniciarSesion");
        String user = "lucecita";
        String password = "12345";
        Miscelanea instance = new Miscelanea();
        boolean expResult = true;
        boolean result = instance.iniciarSesion(user, password);
         
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
            System.out.println("Usuario o contraseña incorrectos, verifique");
            fail("The test case is a prototype.");
            
        }else{
            System.out.println("se pudo iniciar sesion correctamente ");
             
        }
         System.out.println("");
        
    }

    /**
     * Test of getUserLogin method, of class Miscelanea.
     */
    @Test
    public void testGetUserLogin() {
        System.out.println("getUserLogin");
        Miscelanea instance = new Miscelanea();
        Empleado expResult = instance.userLogin;
        Empleado result = instance.getUserLogin();
        
        // TODO review the generated test code and remove the default call to fail.
        if (expResult != result){
            System.out.println("no se obtuvo usuario");
            fail("The test case is a prototype.");
        }else{
            System.out.println("se obtuvo el usuario");
        }
         System.out.println("");
    }

    /**
     * Test of getFacturas method, of class Miscelanea.
     */
    @Test
    public void testGetFacturas() {
        System.out.println("getFacturas");
        Miscelanea instance = new Miscelanea();
        ArrayList<Factura> expResult = instance.facturas;
        ArrayList<Factura> result = instance.getFacturas();
       
        // TODO review the generated test code and remove the default call to fail.
       if (expResult != result){
            System.out.println("no se obtuvo usuario");
            fail("The test case is a prototype.");
        }else{
            System.out.println("se obtuvo el usuario");
        }
         System.out.println("");
        
    }

    /**
     * Test of getEmpleados method, of class Miscelanea.
     */
    @Test
    public void testGetEmpleados() {
        System.out.println("getEmpleados");
        Miscelanea instance = new Miscelanea();
        ArrayList<Empleado> expResult = instance.empleados;
        ArrayList<Empleado> result = instance.getEmpleados();
        
        // TODO review the generated test code and remove the default call to fail.
        if (expResult != result){
            System.out.println("no se obtuvo el empleado");
            fail("The test case is a prototype.");
        }else{
            System.out.println("se obtuvo el empleado");
        }
         System.out.println("");
    }

    /**
     * Test of getProductos method, of class Miscelanea.
     */
    @Test
    public void testGetProductos() {
        System.out.println("getProductos");
        Miscelanea instance = new Miscelanea();
        ArrayList<Producto> expResult = instance.productos;
        ArrayList<Producto> result = instance.getProductos();
        
        // TODO review the generated test code and remove the default call to fail.
        if (expResult != result){
            System.out.println("no se obtuvo el producto");
            fail("The test case is a prototype.");
        }else{
            System.out.println("se obtuvo el producto");
        }
         System.out.println("");
    }

    /**
     * Test of getClientes method, of class Miscelanea.
     */
    @Test
    public void testGetClientes() {
        System.out.println("getClientes");
        Miscelanea instance = new Miscelanea();
        ArrayList<Cliente> expResult = instance.clientes;
        ArrayList<Cliente> result = instance.getClientes();
        
        // TODO review the generated test code and remove the default call to fail.
        if (expResult != result){
            System.out.println("no se obtuvo el cliente");
            fail("The test case is a prototype.");
        }else{
            System.out.println("se obtuvo el cliente");
        }
         System.out.println("");
    }

    /**
     * Test of getProductosCarrito method, of class Miscelanea.
     */
    @Test
    public void testGetProductosCarrito() {
        System.out.println("getProductosCarrito");
        Miscelanea instance = new Miscelanea();
        ArrayList<ProductoDetalle> expResult = instance.productosCarrito;
        ArrayList<ProductoDetalle> result = instance.getProductosCarrito();
        
        // TODO review the generated test code and remove the default call to fail.
        if (expResult != result){
            System.out.println("no se obtuvo el producto del carrito");
            fail("The test case is a prototype.");
        }else{
            System.out.println("se obtuvo el producto del carrito");
        }
         System.out.println("");
    }

    /**
     * Test of getProducto method, of class Miscelanea.
     */
    @Test
    public void testGetProducto() {
        System.out.println("getProducto");
        long cod = 123;
        Miscelanea instance = new Miscelanea();
        Producto expResult = instance.getProducto(cod);
        Producto result = instance.getProducto(123);
        
        // TODO review the generated test code and remove the default call to fail.
        if (expResult != result){
        System.out.println("no se obtuvo el producto");
        fail("The test case is a prototype.");
        }else{
            System.out.println("se obtuvo el producto: "+expResult.getNombre());
        }
         System.out.println("");
    }

    /**
     * Test of getProductoCarrito method, of class Miscelanea.
     */
    @Test
    public void testGetProductoCarrito() {
        System.out.println("getProductoCarrito");
        long cod = 123;   
        Miscelanea instance = new Miscelanea();
        instance.productosCarrito.add(new ProductoDetalle(new Producto(123, "borrador", 1000, 32), 2));
        ProductoDetalle expResult = instance.getProductoCarrito(cod);
        ProductoDetalle result = instance.getProductoCarrito(123);

        // TODO review the generated test code and remove the default call to fail.
        if (expResult != result){
        System.out.println("no se obtuvo el producto");
        fail("The test case is a prototype.");
        }else{
            System.out.println("se obtuvo el producto: "+expResult.getProducto().getNombre());
        }
     System.out.println("");
    }

    /**
     * Test of getCliente method, of class Miscelanea.
     */
    @Test
    public void testGetCliente() {
        System.out.println("getCliente");
        long id = 123;
        Miscelanea instance = new Miscelanea();
        Cliente expResult = instance.getCliente(id);
        Cliente result = instance.getCliente(123);
        
        // TODO review the generated test code and remove the default call to fail.
        if (expResult != result){
        System.out.println("no se obtuvo el cliente");
        fail("The test case is a prototype.");
        }else{
            System.out.println("se obtuvo el cliente: " +expResult.getNombre());
        }
         System.out.println("");
    }

    /**
     * Test of getEmpleado method, of class Miscelanea.
     */
    @Test
    public void testGetEmpleado() {
        System.out.println("getEmpleado");
        long id = 12345;
        Miscelanea instance = new Miscelanea();
        Empleado expResult = instance.getEmpleado(id);
        Empleado result = instance.getEmpleado(12345);
        
        // TODO review the generated test code and remove the default call to fail.
        if (expResult != result){
        System.out.println("no se obtuvo el empleado");
        fail("The test case is a prototype.");
        }else{
            System.out.println("se obtuvo el empleao:"+expResult.getNombre());
        }
         System.out.println("");
    }
}
