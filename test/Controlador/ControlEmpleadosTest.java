/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Miscelanea;
import Vista.Empleados;
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
public class ControlEmpleadosTest {
    Empleados vista = new Empleados();
    Miscelanea Modelo = new Miscelanea();
    public ControlEmpleadosTest() {
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
     * Test of busq method, of class ControlClientes.
     */
    @Test
    public void testBusq() {
        System.out.println("busq");
        String texto = "jaime"; 
        String nombre = "jaime";  
        ControlEmpleados instance = new ControlEmpleados(vista,Modelo);
        boolean expResult = true;
        boolean result = instance.busq(texto, nombre);
        // TODO review the generated test code and remove the default call to fail.
        if (expResult != result ){
            System.out.println("no se encontro el empleado: "+texto);
            fail("The test case is a prototype.");
        }else{
            System.out.println("se encontro el empleado: "+nombre);
        }
        
    }
    
    
}
