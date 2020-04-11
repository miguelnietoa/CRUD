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
public class ClienteTest {
    
    public ClienteTest() {
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
     * Test of getGenero method, of class Cliente.
     */
    @Test
    public void testGetGenero() {
        System.out.println("getGenero");
        Cliente instance = new Cliente(123, "juanito", 3128287, Genero.MASCULINO);
        Genero expResult = instance.genero;
        Genero result = instance.getGenero();
        // TODO review the generated test code and remove the default call to fail.
        if (expResult != result){
            System.out.println("no se obtuvo ningun genero, o el genero no es el esperado");
            fail("The test case is a prototype.");
        }else{
            System.out.println("se obtuvo el genero: "+expResult.name());
        }
        
    }

    /**
     * Test of getNombre method, of class Cliente.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Cliente instance = new Cliente(123, "laura", 31182392, Genero.FEMENINO);
        String expResult = "laura";
        String result = instance.getNombre();
        
        // TODO review the generated test code and remove the default call to fail.
        if (expResult != result){
            System.out.println("no se obtuvo ningun nombre, o el nombre no es el esperado");
            fail("The test case is a prototype.");
        }else{
            System.out.println("se obtuvo el nombre: "+expResult);
        }
    }

   

    /**
     * Test of getId method, of class Cliente.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Cliente instance = new Cliente(123, "martin", 31298434, Genero.MASCULINO) ;
        long expResult = 123;
        long result = instance.getId();
        
        // TODO review the generated test code and remove the default call to fail.
        if (expResult != result){
            System.out.println("no se obtuvo ningun ID, o el ID no era el esperado");
            fail("The test case is a prototype.");
        }else{
            System.out.println("se obtuvo el ID: "+expResult);
        }
    }



 

    /**
     * Test of getTelefono method, of class Cliente.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Cliente instance = new Cliente(123, "olga", 31222341, Genero.FEMENINO);
        long expResult = 31222341;
        long result = instance.getTelefono();
       
        // TODO review the generated test code and remove the default call to fail.
         if (expResult != result){
            System.out.println("no se obtuvo ningun telefono, o el telefono no era el esperado");
            fail("The test case is a prototype.");
        }else{
            System.out.println("se obtuvo el telefono: "+expResult);
        }
    }


   

    /**
     * Test of equals method, of class Cliente.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = new Cliente(123, "pedro", 31254365, Genero.MASCULINO);
        Cliente instance = new Cliente(123, "pedro", 31254365, Genero.MASCULINO);
        boolean expResult = true;
        boolean result = instance.equals(obj);
        
        // TODO review the generated test code and remove the default call to fail.
         if (expResult != result){
            System.out.println("no se obtuvo ningun Cliente, o no se encuentra en la lista de clientes");
            fail("The test case is a prototype.");
        }else{
            System.out.println("se encontro el cliente: "+instance.getNombre());
        }
    }
    
}
