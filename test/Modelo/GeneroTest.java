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
public class GeneroTest {
      
    public GeneroTest() {
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
     * Test of valueOf method, of class Genero.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "FEMENINO";
        Genero expResult = Genero.FEMENINO;
        Genero result = Genero.valueOf(name);
        // TODO review the generated test code and remove the default call to fail.
        if (expResult != result){
            System.out.println("no se obtuvo ningun genero");
            fail("The test case is a prototype.");
        }else{
            System.out.println("se obtuvo el genero: "+expResult.name());
        }
    }

    /**
     * Test of getGenero method, of class Genero.
     */
    @Test
    public void testGetGenero() {
        System.out.println("getGenero");
        int i = 0;
        Genero expResult = Genero.MASCULINO;
        Genero result = Genero.getGenero(i);
        // TODO review the generated test code and remove the default call to fail.
        if (expResult != result){
            System.out.println("no se obtuvo ningun genero");
            fail("The test case is a prototype.");
        }else{
            System.out.println("se obtuvo el genero: "+expResult.name());
        }
    }

    /**
     * Test of getIndex method, of class Genero.
     */
    @Test
    public void testGetIndex() {
        System.out.println("getIndex");
        String genero = "LGTBI";
        int expResult = 2;
        int result = Genero.getIndex(genero);
        // TODO review the generated test code and remove the default call to fail.
          if (expResult != result){
            System.out.println("no se obtuvo ningun index");
            fail("The test case is a prototype.");
           }else{
            System.out.println("se obtuvo el index: "+expResult);
         }
    }
    
}
