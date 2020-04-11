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
public class ProductoTest {
    
    public ProductoTest() {
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
     * Test of getExistencias method, of class Producto.
     */
    @Test
    public void testGetExistencias() {
        System.out.println("getExistencias");
        Producto instance = new Producto(123, "borrador", 1000, 32);
        long expResult = 32;
        long result = instance.getExistencias();
        // TODO review the generated test code and remove the default call to fail.
        if (expResult != result){
        System.out.println("no se obtuvieron las existencias");
        fail("The test case is a prototype.");
        }else{
            System.out.println("el producto: "+instance.getNombre()+ " tiene " + expResult+ " existencias");
        }
    }

  

    /**
     * Test of getNombre method, of class Producto.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Producto instance = new Producto(123, "borrador", 1000, 32);
        String expResult = "borrador";
        String result = instance.getNombre();
        // TODO review the generated test code and remove the default call to fail.
         if (expResult != result){
        System.out.println("no se obtuvo el nombre del producto");
        fail("The test case is a prototype.");
        }else{
            System.out.println("el nombre del producto es: "+expResult);
        }
    }

 

    /**
     * Test of getCodigo method, of class Producto.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Producto instance = new Producto(123, "borrador", 1000, 32);
        long expResult = 123;
        long result = instance.getCodigo();
        // TODO review the generated test code and remove the default call to fail.
         if (expResult != result){
        System.out.println("no se obtuvo el codigo del producto");
        fail("The test case is a prototype.");
        }else{
            System.out.println("el codigo del producto es: "+expResult);
        }
    }

  

    /**
     * Test of getPrecio method, of class Producto.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        Producto instance = new Producto(123, "borrador", 1000, 32);
        float expResult = 1000;
        float result = instance.getPrecio();
        // TODO review the generated test code and remove the default call to fail.
         if (expResult != result){
        System.out.println("no se obtuvo el precio del producto");
        fail("The test case is a prototype.");
        }else{
            System.out.println("el precio del producto es: "+expResult);
        }
    }

 

    /**
     * Test of equals method, of class Producto.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = new Producto(123, "borrador", 1000, 32);
        Producto instance = new Producto(123, "borrador", 1000, 32);
        boolean expResult = true;
        boolean result = instance.equals(obj);
        // TODO review the generated test code and remove the default call to fail.
         if (expResult != result){
        System.out.println("no se obtuvo ningun producto");
        fail("The test case is a prototype.");
        }else{
        System.out.println("se encontro el producto: "+instance.getNombre());
        }
    }
    
}
