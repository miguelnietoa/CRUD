/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Miscelanea;
import Vista.Productos;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
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
public class ControlProductosTest {
    Productos vista = new Productos();
        Miscelanea Modelo = new Miscelanea();
    public ControlProductosTest() {
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
     * Test of busq method, of class ControlProductos.
     */
    @Test
    public void testBusq() {
        System.out.println("busq");
        String texto = "borrador"; // lo que se busca
        String nombre = "borrador"; // lo que se desea encontrar 
        ControlProductos instance = new ControlProductos(vista,Modelo);
        boolean expResult = true;
        boolean result = instance.busq(texto, nombre);
        // TODO review the generated test code and remove the default call to fail.
        if (expResult != result ){
            System.out.println("no se encontro el producto: "+texto);
            fail("The test case is a prototype.");
        }else{
            System.out.println("se encontro el producto: "+nombre);
        }
        
    }
     
}
