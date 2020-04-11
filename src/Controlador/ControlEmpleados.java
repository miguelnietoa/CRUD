/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import Vista.Empleados;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ControlEmpleados implements MouseListener, KeyListener {

    Empleados vista;
    Miscelanea modelo;
/**
 * Se crean los objetos vista y empleados
 */
    public ControlEmpleados(Empleados vista, Miscelanea modelo) {
        this.vista = vista;
        vista.setControlador(this);
        this.modelo = modelo;
        actualizarTabla("");
    }
/**
 * El programa se asegura que la información necesaria del empleado esté completa, y dependiendo del botón al que se le haya hecho clic, se registra, edita o elimina un empleado
 * @param e 
 */
    @Override
    public void mouseClicked(MouseEvent e) {
        Object o = e.getSource();
        if (vista.btnRegistrar.equals(o)) {
            if (validarCampos()) {
                registrarEmpleado();
            }
        } else if (vista.btnEditar.equals(o)) {
            int i = vista.tablaEmpleados.getSelectedRow();
            if (i != -1) {
                if (modelo.getUserLogin() instanceof Administrador) {
                    llenarCamposConFilaTabla(i);
                    vista.comboBoxTipo.setEnabled(false);
                    vista.btnEditarPanel.setVisible(true);
                    vista.btnRegistrar.setVisible(false);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Por favor, seleccione el empleado de la tabla que desea editar.");
            }
        } else if (vista.btnEditarPanel.equals(o)) {
            if (validarCampos()) {
                long id = (long) vista.tablaEmpleados.getValueAt(vista.tablaEmpleados.getSelectedRow(), 0);
                long idNuevo = Long.parseLong(vista.txtID.getText());
                if (id != idNuevo && modelo.getEmpleado(idNuevo) != null) {
                    JOptionPane.showMessageDialog(null, "Código de producto ya existente.");

                } else {
                    Empleado empleado = modelo.getEmpleado(id);
                    if (empleado != null) {
                        empleado.setId(idNuevo);
                        empleado.setNombre(vista.txtNombre.getText());
                        empleado.setUsername(vista.txtUsername.getText());
                        empleado.setPassword(String.valueOf(vista.passwordField.getPassword()));
                        actualizarArchivo(modelo.getEmpleados());
                        actualizarTabla(vista.txtBuscarEmpleado.getText());
                        JOptionPane.showMessageDialog(null, "Empleado editado correctamente.");
                        vista.comboBoxTipo.setEnabled(true);
                        vista.btnRegistrar.setVisible(true);
                        vista.btnEditarPanel.setVisible(false);
                        vaciarCampos();
                    }

                }

            } else {
                JOptionPane.showMessageDialog(null, "Por favor, llena todos los campos.");
            }
        } else if (vista.btnEliminar.equals(o)) {
            int i = vista.tablaEmpleados.getSelectedRow();
            if (i != -1) {
                String nombre = (String) vista.tablaEmpleados.getValueAt(vista.tablaEmpleados.getSelectedRow(), 1);
                if (JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar el empleado " + nombre + "?", "Eliminar empleado",
                        JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
                    modelo.eliminarEmpleado(modelo.getEmpleado((long) vista.tablaEmpleados.getValueAt(vista.tablaEmpleados.getSelectedRow(), 0)));
                    actualizarArchivo(modelo.getEmpleados());
                    actualizarTabla(vista.txtBuscarEmpleado.getText());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, seleccione el empleado de la tabla que desea eliminar.");
            }
        } else if (vista.tablaEmpleados.equals(o)) {
            if (vista.btnEditarPanel.isVisible()) {
                llenarCamposConFilaTabla(vista.tablaEmpleados.getSelectedRow());
            }
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
        if (vista.btnEditar.equals(o)) {
            mouseEntered(vista.btnEditar, "editColor.png");
        } else if (vista.btnRegistrar.equals(o)) {
            mouseEntered(vista.btnRegistrar, "saveazul.png");
        } else if (vista.btnEliminar.equals(o)) {
            mouseEntered(vista.btnEliminar, "deleteColor.png");
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {

        Object o = e.getSource();
        if (vista.btnEditar.equals(o)) {
            System.out.println("entro en empleados");
            mouseEntered(vista.btnEditar, "edit.png");
        } else if (vista.btnRegistrar.equals(o)) {
            mouseEntered(vista.btnRegistrar, "savenegro.png");
        } else if (vista.btnEliminar.equals(o)) {
            mouseEntered(vista.btnEliminar, "delete.png");
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        Object o = e.getSource();
        if (vista.txtBuscarEmpleado.equals(o)) {
            actualizarTabla(vista.txtBuscarEmpleado.getText());
        }
    }
/**
 * Se valida que los campos no estén vacíos
 * @return 
 */
    private boolean validarCampos() {
        return !(vista.txtID.getText().isEmpty() || vista.txtNombre.getText().isEmpty()
                || vista.txtUsername.getText().isEmpty() || String.valueOf(vista.passwordField.getPassword()).isEmpty());
    }
/**
 * Se registra un empleado nuevo
 */
    private void registrarEmpleado() {
        long id = Long.parseLong(vista.txtID.getText());
        String nombre = vista.txtNombre.getText();
        String username = vista.txtUsername.getText();
        String password = String.valueOf(vista.passwordField.getPassword());
        if (modelo.getCliente(id) == null) {
            Empleado empleado;
            switch (vista.comboBoxTipo.getSelectedIndex()) {
                case 0:
                default:
                    empleado = new Vendedor(nombre, id, username, password);
                    break;
                case 1:
                    empleado = new Administrador(nombre, id, username, password);
                    break;
            }
            modelo.addEmpleado(empleado);
            actualizarArchivo(modelo.getEmpleados());
            actualizarTabla(vista.txtBuscarEmpleado.getText());
        }

        vista.txtID.setText("");
        vista.txtNombre.setText("");
        vista.txtUsername.setText("");
        vista.passwordField.setText("");
    }
/**
 * Se actualiza el archivo donde están los empleados con su respectiva información
 * @param empleados 
 */
    private void actualizarArchivo(ArrayList<Empleado> empleados) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File("src/Modelo/files/Empleados.txt")))) {
            for (Empleado emp : empleados) {
                String tipoEmpleado;
                if (emp instanceof Administrador) {
                    tipoEmpleado = "admin";
                } else {
                    tipoEmpleado = "vendedor";
                }
                bw.write(emp.getNombre() + "," + emp.getId() + "," + tipoEmpleado + "," + emp.getUsername() + "," + emp.getPassword());
                bw.newLine();
            }
        } catch (Exception e) {
            System.out.println("Error al actualizar archivo Empleados");
        }
    }
/**
 * Se actualiza la tabla después de una acción
 * @param texto 
 */
    private void actualizarTabla(String texto) {
        DefaultTableModel model = (DefaultTableModel) vista.tablaEmpleados.getModel();
        model.setRowCount(0);
        for (Empleado e : modelo.getEmpleados()) {
            String nom = e.getNombre();
            if (busq(texto, nom) == true) {
                String tipo;
                if (e instanceof Administrador) {
                    tipo = "Administrador";
                } else {
                    tipo = "Vendedor";
                }
                model.addRow(new Object[]{e.getId(), e.getNombre(), tipo});
            }
        }
    }
/**
 * Se hace una búsqueda de un empleado
 * @param texto
 * @param nombre
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

    public void mouseEntered(JLabel lbl, String ruta) {
        lbl.setIcon(new ImageIcon("src/Vista/resources/" + ruta));

    }
/**
 * Se llena la tabla con los empleados y su respectiva información
 * @param i 
 */
    private void llenarCamposConFilaTabla(int i) {
        vista.txtID.setText(vista.tablaEmpleados.getValueAt(i, 0) + "");
        vista.txtNombre.setText(vista.tablaEmpleados.getValueAt(i, 1) + "");
        Empleado emp = modelo.getEmpleado((long) vista.tablaEmpleados.getValueAt(i, 0));
        System.out.println("entra sin !0nill");
        if (emp != null) {
            System.out.println("entra emp != null");
            vista.txtUsername.setText(emp.getUsername());
            vista.passwordField.setText(emp.getPassword());
        }
    }
/**
 * Se vacían los campos para registrar un empleado
 */
    private void vaciarCampos() {
        vista.txtID.setText("");
        vista.txtNombre.setText("");
        vista.txtUsername.setText("");
        vista.passwordField.setText("");
    }
}
