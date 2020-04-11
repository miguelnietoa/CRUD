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
public class FacturaTest {
     
    public FacturaTest() {
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
     * Test of getFecha method, of class Factura.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Factura instance = new Factura(new Cliente(123, "fernando", 31423441, Genero.MASCULINO), new Vendedor("duvan", 1234, "duva", "duv"), 12000, new ArrayList<ProductoDetalle>(), "27-may-2019");
        String expResult = "27-may-2019";
        String result = instance.getFecha();
        
        // TODO review the generated test code and remove the default call to fail.
         if (expResult != result){
            System.out.println("no se obtuvo ninguna fecha");
            fail("The test case is a prototype.");
        }else{
            System.out.println("se obtuvo la fecha: "+expResult);
        }
    }

    /**
     * Test of getId method, of class Factura.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Factura instance = new Factura(new Cliente(123, "fernando", 31423441, Genero.MASCULINO), new Vendedor("duvan", 1234, "duva", "duv"), 12000, new ArrayList<ProductoDetalle>(), "27-may-2019");
        long expResult = instance.id;
        long result = instance.getId();
        
        // TODO review the generated test code and remove the default call to fail.
         if (expResult != result){
            System.out.println("no se obtuvo ningun ID");
            fail("The test case is a prototype.");
        }else{
            System.out.println("se obtuvo el ID: "+expResult);
        }
    }
    

    /**
     * Test of getPrecioTotal method, of class Factura.
     */
    @Test
    public void testGetPrecioTotal() {
        System.out.println("getPrecioTotal");
        Factura instance = new Factura(new Cliente(123, "fernando", 31423441, Genero.MASCULINO), new Vendedor("duvan", 1234, "duva", "duv"), 12000, new ArrayList<ProductoDetalle>(), "27-may-2019");
        float expResult = 12000;
        float result = instance.getPrecioTotal();
   
        // TODO review the generated test code and remove the default call to fail.
         if (expResult != result){
            System.out.println("no se obtuvo ningun precio total");
            fail("The test case is a prototype.");
        }else{
            System.out.println("se obtuvo el precio total: "+expResult);
        }
    }


    /**
     * Test of getSubtotal method, of class Factura.
     */
    @Test
    public void testGetSubtotal() {
        System.out.println("getSubtotal");
        Factura instance = new Factura(new Cliente(123, "fernando", 31423441, Genero.MASCULINO), new Vendedor("duvan", 1234, "duva", "duv"), 12000, new ArrayList<ProductoDetalle>(), "27-may-2019");
        float expResult = 12000 + instance.getIva();
        float result = instance.getSubtotal();
        
        
        // TODO review the generated test code and remove the default call to fail.
         if (expResult != result){
            System.out.println("no se obtuvo ningun subtotal");
            fail("The test case is a prototype.");
        }else{
            System.out.println("se obtuvo el subtotal: "+expResult);
        }
    }


    /**
     * Test of getIva method, of class Factura.
     */
    @Test
    public void testGetIva() {
        System.out.println("getIva");
        Factura instance = new Factura(new Cliente(123, "fernando", 31423441, Genero.MASCULINO), new Vendedor("duvan", 1234, "duva", "duv"), 12000, new ArrayList<ProductoDetalle>(), "27-may-2019");
        float expResult = instance.getPrecioTotal()*0.19f;
        float result = instance.getIva();
        // TODO review the generated test code and remove the default call to fail.
         if (expResult != result){
            System.out.println("no se obtuvo ningun iva");
            fail("The test case is a prototype.");
        }else{
            System.out.println("se obtuvo el iva: "+expResult);
        }
    }


    /**
     * Test of getVendedor method, of class Factura.
     */
    @Test
    public void testGetVendedor() {
        System.out.println("getVendedor");
        Factura instance = new Factura(new Cliente(123, "fernando", 31423441, Genero.MASCULINO), new Vendedor("duvan", 1234, "duva", "duv"), 12000, new ArrayList<ProductoDetalle>(), "27-may-2019");
        Empleado expResult =  instance.vendedor;
        Empleado result = instance.getVendedor();
        // TODO review the generated test code and remove the default call to fail.
         if (expResult != result){
            System.out.println("no se obtuvo ningun vendedor");
            fail("The test case is a prototype.");
        }else{
            System.out.println("se obtuvo el vendedor: "+expResult.getNombre());
        }
    }


    /**
     * Test of getCliente method, of class Factura.
     */
    @Test
    public void testGetCliente() {
        System.out.println("getCliente");
        Factura instance = new Factura(new Cliente(123, "fernando", 31423441, Genero.MASCULINO), new Vendedor("duvan", 1234, "duva", "duv"), 12000, new ArrayList<ProductoDetalle>(), "27-may-2019");
        Cliente expResult = instance.cliente;
        Cliente result = instance.getCliente();
        // TODO review the generated test code and remove the default call to fail.
         if (expResult != result){
            System.out.println("no se obtuvo ningun cliente");
            fail("The test case is a prototype.");
        }else{
            System.out.println("se obtuvo el cliente: "+expResult.getNombre());
        }
    }

   

    /**
     * Test of getProductos method, of class Factura.
     */
    @Test
    public void testGetProductos() {
        System.out.println("getProductos");
        Factura instance = new Factura(new Cliente(123, "fernando", 31423441, Genero.MASCULINO), new Vendedor("duvan", 1234, "duva", "duv"), 12000, new ArrayList<ProductoDetalle>(), "27-may-2019");
        ArrayList<ProductoDetalle> expResult = instance.productos;
        ArrayList<ProductoDetalle> result = instance.getProductos();
        // TODO review the generated test code and remove the default call to fail.
         if (expResult != result){
            System.out.println("no se obtuvo ningun producto");
            fail("The test case is a prototype.");
        }else{
            System.out.println("se obtuvieron productos");
        }
    }
   
}
