
package Controlador;

import Modelo.*;
import static java.awt.Frame.ICONIFIED;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import Vista.Login;
import Vista.Menu;
import java.awt.Color;
import javax.swing.ImageIcon;


public class ControlLogin implements MouseListener {

    
    Miscelanea modelo;
    Login vista;
    
/**
 * Se crea la ventana Login con su respectiva información
 * @param vista
 * @param modelo 
 */
    public ControlLogin(Login vista, Miscelanea modelo) {
        this.vista = vista;
        vista.setControlador(this);
        this.modelo = modelo;
        
    }
/**
 * Se confirma el usuario y contraseña hayan sido ingresados en el caso de que el usuario quiera ingresar al programa, también confirma si el quiere salir de el
 * @param e 
 */
    @Override
    public void mouseClicked(MouseEvent e) {
        Object o = e.getSource();
        if (o.equals(vista.btnIngresar)) {
            String user = vista.txtUsuario.getText();
            String pass = String.valueOf(vista.txtPassword.getPassword());
            if (user.isEmpty() || pass.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, llena los campos.");
            } else if (modelo.iniciarSesion(user, pass)) {
                System.out.println("Ingresado correctamente");
                Menu m = new Menu();
                ControlMenu c = new ControlMenu(m, modelo);
                if (!(modelo.getUserLogin() instanceof Administrador)) {
                    m.cargarModoVendedor();
                } 
                m.setVisible(true);
                vista.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
            }
        } else if (o.equals(vista.btnCerrar)) {
            if (JOptionPane.showConfirmDialog(null, "¿Está seguro que desea salir?", "Cerrar",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
                System.exit(0);
            }
        } else if (o.equals(vista.btnMinimize)) {
            vista.setExtendedState(ICONIFIED);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Object o = e.getSource();
        if (vista.btnIngresar.equals(o)) {
            vista.btnIngresar.setIcon(new ImageIcon("src/vista/resources/loginEntered.png"));
            vista.btnIngresar.setBackground(new Color(85, 96, 128));
            vista.btnIngresar.setForeground(Color.WHITE);
            vista.btnIngresar.setOpaque(true);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object o = e.getSource();
        if (vista.btnIngresar.equals(o)) {
            vista.btnIngresar.setIcon(new ImageIcon("src/vista/resources/loginExited.png"));
            vista.btnIngresar.setForeground(Color.BLACK);
            vista.btnIngresar.setOpaque(false);
        }
    }

}
