
package Controlador;

import Modelo.*;
import Vista.Clientes;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class ControlClientes implements MouseListener, KeyListener {

    Clientes vista;
    Miscelanea modelo;
/**
 * Se llama a la tabla y el modelo respectivamente
 */
    public ControlClientes(Clientes vista, Miscelanea modelo) {
        this.vista = vista;
        vista.setControlador(this);
        this.modelo = modelo;
        actualizarTabla("");
    }
/**
 * Se revisa que los campos estén llenos con la información  que se le pide al usuario, luego de esto, dependiendo del botón seleccionado, se realiza una acción (Editar, Registrar, Eliminar)
 * @param e 
 * Guarda el evento que se quiere realizar
 */
    @Override
    public void mouseClicked(MouseEvent e) {
        Object o = e.getSource();
        if (vista.btnRegistrar.equals(o)) {
            if ((validarCampos())) {
                agregarCliente();
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, llena todos los campos.");
            }
        } else if (vista.btnEditar.equals(o)) {
            int i = vista.tablaClientes.getSelectedRow();
            if (i != -1) {
                if (modelo.getUserLogin() instanceof Administrador) {
                    llenarCamposConFilaTabla(i);
                    vista.btnEditarPanel.setVisible(true);
                    vista.btnRegistrar.setVisible(false);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, seleccione el cliente de la tabla que desea editar.");
            }

        } else if (vista.btnEditarPanel.equals(o)) {
            if (validarCampos()) {
                long id = (long) vista.tablaClientes.getValueAt(vista.tablaClientes.getSelectedRow(), 0);
                long idNuevo = Long.parseLong(vista.txtId.getText());
                if (id != idNuevo && modelo.getCliente(idNuevo) != null) {
                    JOptionPane.showMessageDialog(null, "Número de identificación ya existente.");
                } else {
                    Cliente cliente = modelo.getCliente(id);
                    if (cliente != null) {
                        cliente.setId(idNuevo);
                        cliente.setNombre(vista.txtNombre.getText());
                        cliente.setTelefono(Long.parseLong(vista.txtTelefono.getText()));
                        cliente.setGenero(Genero.getGenero(vista.comboBoxGenero.getSelectedIndex()));
                        actualizarArchivo(modelo.getClientes());
                        actualizarTabla(vista.txtBuscarCliente.getText());
                        JOptionPane.showMessageDialog(null, "Cliente editado correctamente.");
                        vista.btnRegistrar.setVisible(true);
                        vista.btnEditarPanel.setVisible(false);
                        vaciarCampos();
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "Por favor, llena todos los campos.");
            }

        } else if (vista.btnEliminar.equals(o)) {
            int i = vista.tablaClientes.getSelectedRow();
            if (i != -1) {
                String nombre = (String) vista.tablaClientes.getValueAt(vista.tablaClientes.getSelectedRow(), 1);
                if (JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar el cliente " + nombre + "?", "Eliminar cliente",
                        JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
                    modelo.eliminarCliente(modelo.getCliente((long) vista.tablaClientes.getValueAt(vista.tablaClientes.getSelectedRow(), 0)));
                    actualizarArchivo(modelo.getClientes());
                    actualizarTabla(vista.txtBuscarCliente.getText());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, seleccione el producto de la tabla que desea eliminar.");
            }

        } else if (vista.tablaClientes.equals(o)) {
            if (vista.btnEditarPanel.isVisible()) {
                llenarCamposConFilaTabla(vista.tablaClientes.getSelectedRow());
            }
        }

    }

    public void mouseEntered(JLabel lbl, String ruta) {
        lbl.setIcon(new ImageIcon("src/Vista/resources/" + ruta));

    }

    public void mouseExited(JLabel lbl, String ruta) {
        lbl.setIcon(new ImageIcon("src/Vista/resources/" + ruta));

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
        if (vista.btnEditar.equals(o)) {
            mouseEntered(vista.btnEditar, "editColor.png");
        } else if (vista.btnRegistrar.equals(o)) {
            mouseEntered(vista.btnRegistrar, "saveazul.png");
        } else if (vista.btnEliminar.equals(o)) {
            mouseEntered(vista.btnEliminar, "deleteColor.png");
        } else if (vista.btnEliminar.equals(o)) {
            mouseEntered(vista.btnEliminar, "deleteColor.png");
        } else if (vista.btnEliminar.equals(o)) {
            mouseEntered(vista.btnEliminar, "deleteColor.png");
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object o = e.getSource();
        if (vista.btnRegistrar.equals(o)) {
            mouseExited(vista.btnRegistrar, "savenegro.png");
        } else if (vista.btnEditar.equals(o)) {
            mouseExited(vista.btnEditar, "edit.png");
        } else if (vista.btnEliminar.equals(o)) {
            mouseExited(vista.btnEliminar, "delete.png");
        }
    }
/**
 * Se agrega un cliente
 */
    private void agregarCliente() {
        long id = Integer.parseInt(vista.txtId.getText());
        String nombre = vista.txtNombre.getText();
        long tel = Integer.parseInt(vista.txtTelefono.getText());
        Genero genero = Genero.getGenero(vista.comboBoxGenero.getSelectedIndex());
        if (modelo.getCliente(id) == null) {
            modelo.addCliente(new Cliente(id, nombre, tel, genero));
            actualizarArchivo(modelo.getClientes());
            actualizarTabla(vista.txtBuscarCliente.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Número de identificación ya existente.");
        }

        vista.txtId.setText("");
        vista.txtNombre.setText("");
        vista.txtTelefono.setText("");

    }
/**
 * Se validan los campos para registrar un cliente
 * @return 
 */
    private boolean validarCampos() {
        return !(vista.txtId.getText().isEmpty() || vista.txtNombre.getText().isEmpty()
                || vista.txtTelefono.getText().isEmpty() || vista.comboBoxGenero.getSelectedIndex() == -1);
    }
/**
 * Se actualiza el archivo donde se almacenan los clientes
 * @param clientes 
 */
    private void actualizarArchivo(ArrayList<Cliente> clientes) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File("src/Modelo/files/Clientes.txt")))) {
            for (Cliente c : clientes) {
                bw.write(c.getId() + "," + c.getNombre() + "," + c.getTelefono() + "," + vista.comboBoxGenero.getSelectedIndex());
                bw.newLine();
            }
        } catch (Exception e) {
            System.out.println("Error al actualizar archivo Clientes");
        }
    }
/**
 * Se actualiza la tabla de la ventana abierta (clientes, empleados, productos, facturas) para buscarlo en la tabla y sólo mostrarlo a el o lo más parecido al texto que se ingresa
 * @param texto 
 *  es el Usuario que se busa
 */
    public void actualizarTabla(String texto) {
        DefaultTableModel model = (DefaultTableModel) vista.tablaClientes.getModel();
        model.setRowCount(0);
        for (Cliente pr : modelo.getClientes()) {
            String nom = pr.getNombre();
            if (busq(texto, nom) == true) {
                model.addRow(new Object[]{pr.getId(), pr.getNombre(), pr.getTelefono(), pr.getGenero()});
            }
        }
    }
/**
 * Se realiza una búsqueda del cliente
 * @param texto el texto que ingresa el usuario
 * @param nombre Nombre del cliente en la tabla
 * @return 
 */
    public boolean busq(String texto, String nombre) {
        if (texto.length() > nombre.length()) {
            return false;
        }
        for (int i = 0; i < texto.length(); i++) {
            if (Character.toLowerCase(texto.charAt(i)) != Character.toLowerCase(nombre.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        Object o = ke.getSource();
        if (vista.txtId.equals(o)) {
            if (!Character.isDigit(ke.getKeyChar())) {
                ke.consume();
            }
        } else if (vista.txtNombre.equals(o)) {
            if (ke.getKeyChar() != 32 && !Character.isLetter(ke.getKeyChar())) {
                ke.consume();
            }
        } else if (vista.txtTelefono.equals(o)) {
            if (!Character.isDigit(ke.getKeyChar())) {
                ke.consume();
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        Object o = ke.getSource();
        if (vista.txtBuscarCliente.equals(o)) {
            actualizarTabla(vista.txtBuscarCliente.getText());
        }
    }
/**
 * Se ingresa la información del cliente a la tabla
 * @param i Información del cliente
 */
    private void llenarCamposConFilaTabla(int i) {
        vista.txtId.setText(vista.tablaClientes.getValueAt(i, 0) + "");
        vista.txtNombre.setText(vista.tablaClientes.getValueAt(i, 1) + "");
        vista.txtTelefono.setText(vista.tablaClientes.getValueAt(i, 2) + "");
    }
/**
 * Se vacían los campos al completar la acción
 */
    private void vaciarCampos() {
        vista.txtId.setText("");
        vista.txtNombre.setText("");
        vista.txtTelefono.setText("");

    }

}
