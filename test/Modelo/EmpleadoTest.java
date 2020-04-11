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
public class EmpleadoTest {
     
    public EmpleadoTest() {
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
     * Test of getUsername method, of class Empleado.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        Empleado instance = new Vendedor("carolina", 123, "caro", "caro123");
        String expResult = "caro";
        String result = instance.getUsername();
       
        // TODO review the generated test code and remove the default call to fail.
         if (expResult != result){
            System.out.println("no se obtuvo ningun username");
            fail("The test case is a prototype.");
        }else{
            System.out.println("se obtuvo el usrname: "+expResult);
        }
    }

  

    /**
     * Test of getNombre method, of class Empleado.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Empleado instance = new Vendedor("carolina", 123, "caro", "caro123");
        String expResult = "carolina";
        String result = instance.getNombre();
        // TODO review the generated test code and remove the default call to fail.
         if (expResult != result){
            System.out.println("no se obtuvo ningun nombre");
            fail("The test case is a prototype.");
        }else{
            System.out.println("se obtuvo el nombre: "+expResult);
        }
    }

   

    /**
     * Test of getId method, of class Empleado.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Empleado instance = new Vendedor("carolina", 123, "caro", "caro123");
        long expResult = 123;
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
     * Test of getPassword method, of class Empleado.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Empleado instance = new Vendedor("carolina", 123, "caro", "caro123");
        String expResult = "caro123";
        String result = instance.getPassword();
        
        // TODO review the generated test code and remove the default call to fail.
         if (expResult != result){
            System.out.println("no se obtuvo ningun password");
            fail("The test case is a prototype.");
        }else{
            System.out.println("se obtuvo el password: "+expResult);
        }
    }

  
}
