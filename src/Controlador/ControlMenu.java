
package Controlador;

import Vista.*;
import Modelo.*;
import java.awt.Color;
import static java.awt.Frame.ICONIFIED;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ControlMenu implements MouseListener {

    Menu vista;
    Miscelanea modelo;
/**
 * Se crea el Menu
 * @param vista
 * @param modelo 
 */
    public ControlMenu(Menu vista, Miscelanea modelo) {
        this.vista = vista;
        vista.setControlador(this);
        this.modelo = modelo;
        mostrarPanelProductos();
    }
/**
 * Confirma si el usuario quiere cambiar de ventana o quiere salir del programa
 * @param e 
 */
    @Override
    public void mouseClicked(MouseEvent e) {
        Object o = e.getSource();
        if (o.equals(vista.btnCerrar)) {
            if (JOptionPane.showConfirmDialog(null, "¿Está seguro que desea salir?", "Cerrar",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
                System.exit(0);
            }
        } else if (o.equals(vista.btnMinimize)) {
            vista.setExtendedState(ICONIFIED);
        } else if (o.equals(vista.btnCerrarSesion)) {
            cerrarSesion();
        } else if (o.equals(vista.btnProductos)) {
            mostrarPanelProductos();
        } else if (o.equals(vista.btnClientes)) {
            mostrarPanelClientes();
        } else if (o.equals(vista.btnEmpleados)) {
            mostrarPanelEmpleados();
        } else if (o.equals(vista.btnFacturas)) {
            mostrarPanelFacturas();
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
        if (vista.btnProductos.equals(o)) {
            mouseEntered(vista.btnProductos, "productColor.png");
        } else if (vista.btnClientes.equals(o)) {
            mouseEntered(vista.btnClientes, "customerColor.png");
        } else if (vista.btnEmpleados.equals(o)) {
            mouseEntered(vista.btnEmpleados, "usersColor.png");
        } else if (vista.btnFacturas.equals(o)) {
            mouseEntered(vista.btnFacturas, "facturaColor.png");
        } else if (vista.btnCerrarSesion.equals(o)) {
            mouseEntered(vista.btnCerrarSesion, "exitColor.png");
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object o = e.getSource();
        if (vista.btnProductos.equals(o)) {
            mouseExited(vista.btnProductos, "product.png");
        } else if (vista.btnClientes.equals(o)) {
            mouseExited(vista.btnClientes, "customer.png");
        } else if (vista.btnEmpleados.equals(o)) {
            mouseExited(vista.btnEmpleados, "users.png");
        } else if (vista.btnFacturas.equals(o)) {
            mouseExited(vista.btnFacturas, "factura.png");
        } else if (vista.btnCerrarSesion.equals(o)) {
            mouseExited(vista.btnCerrarSesion, "exit.png");
        }
    }

    public void mouseEntered(JLabel lbl, String ruta) {
        lbl.setIcon(new ImageIcon("src/Vista/resources/" + ruta));
        lbl.setBackground(new Color(85, 96, 128));
        lbl.setForeground(Color.WHITE);
        lbl.setOpaque(true);
    }

    public void mouseExited(JLabel lbl, String ruta) {
        lbl.setIcon(new ImageIcon("src/Vista/resources/" + ruta));
        lbl.setBackground(new Color(153, 153, 153));
        lbl.setForeground(Color.BLACK);
        lbl.setOpaque(true);
    }
/**
 * Muestra la ventana de productos
 */
    private void mostrarPanelProductos() {
        Productos p = new Productos();
        new ControlProductos(p, modelo);
        if (!(modelo.getUserLogin() instanceof Administrador)) {
            p.cargarModoVendedor();
        }
        vista.mostrarPanel(p);
    }
/**
 * Cierra la sesión del uusario y devuelve a la ventana de Login
 */
    private void cerrarSesion() {
        int salida = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cerrar sesión?", "Cerrar Sesión",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (salida == 0) {
            Login login = new Login();
            new ControlLogin(login, modelo);
            login.setVisible(true);
            vista.dispose();
        }
    }
/**
 * Muestra la ventana de clientes
 */
    private void mostrarPanelClientes() {
        Clientes c = new Clientes();
        new ControlClientes(c, modelo);
        if (!(modelo.getUserLogin() instanceof Administrador)) {
            c.cargarModoVendedor();
        }
        vista.mostrarPanel(c);
    }
/**
 * Muestra la ventana de empleados
 */
    private void mostrarPanelEmpleados() {
        Empleados e = new Empleados();
        new ControlEmpleados(e, modelo);
        vista.mostrarPanel(e);
    }
/**
 * Muestra la ventana de facturas
 */
    private void mostrarPanelFacturas() {
        Facturas f = new Facturas();
        new ControlFacturas(f, modelo);
        if (!(modelo.getUserLogin() instanceof Administrador)) {
            f.btnExplorarFacturas.setVisible(false);
        }
        vista.mostrarPanel(f);
    }

   
    
  
    
    
}
