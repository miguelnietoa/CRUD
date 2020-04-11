/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

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
public class ProductoDetalleTest {
  
    public ProductoDetalleTest() {
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
     * Test of getCantComprada method, of class ProductoDetalle.
     */
    @Test
    public void testGetCantComprada() {
        System.out.println("getCantComprada");
        ProductoDetalle instance = new ProductoDetalle(new Producto(1234, "hoja", 200, 1000), 3);
        int expResult = 3;
        int result = instance.getCantComprada();
        
        // TODO review the generated test code and remove the default call to fail.
        if (expResult != result){
        System.out.println("no se obtuvo ninguna cantidad");
        fail("The test case is a prototype.");
        }else{
        System.out.println("la cantidad comprada es: "+expResult);
        }
    }

    /**
     * Test of getProducto method, of class ProductoDetalle.
     */
    @Test
    public void testGetProducto() {
        System.out.println("getProducto");
        ProductoDetalle instance = new ProductoDetalle(new Producto(1234, "hoja", 200, 1000), 3);
        Producto expResult = instance.producto;
        Producto result = instance.getProducto();
        // TODO review the generated test code and remove the default call to fail.
        if (expResult != result){
        System.out.println("no se obtuvo ningun producto");
        fail("The test case is a prototype.");
        }else{
        System.out.println("se encontro el producto: "+expResult.getNombre());
        }
    }
    
}
