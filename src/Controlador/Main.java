
package Controlador;

import Modelo.Miscelanea;
import Vista.Login;


public class Main {
    /**
 * Clase Main del programa, empieza iniciando la ventana Login
 */
    public static void main(String[] args) {
        Login l = new Login();
        Miscelanea m = new Miscelanea();
        
        ControlLogin c = new ControlLogin(l, m);
        l.setVisible(true);
    }
}
