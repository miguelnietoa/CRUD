
package Controlador;

import Modelo.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import Vista.Productos;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class ControlProductos implements MouseListener, KeyListener {

    Productos vista;
    Miscelanea modelo;
/**
 * Se crea la tabla de los productos en la respectiva ventana 
 */
    public ControlProductos(Productos vista, Miscelanea modelo) {
        this.vista = vista;
        vista.setControlador(this);
        this.modelo = modelo;
        actualizarTabla("");
    }
/**
 * Se confirma todos los datos requeridos para registrar, editar o eliminar estén completos
 */
    @Override
    public void mouseClicked(MouseEvent e) {
        Object o = e.getSource();
        if (vista.btnRegistrar.equals(o)) {
            if (validarCampos()) {
                agregarProducto();
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, llena todos los campos.");
            }
        } else if (vista.btnEditar.equals(o)) {
            int i = vista.tablaProductos.getSelectedRow();
            if (i != -1) {
                if (modelo.getUserLogin() instanceof Administrador) {
                    llenarCamposConFilaTabla(i);
                    vista.btnEditarPanel.setVisible(true);
                    vista.btnRegistrar.setVisible(false);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Por favor, seleccione el producto de la tabla que desea editar.");
            }
        } else if (vista.btnEditarPanel.equals(o)) {
            if (validarCampos()) {
                long cod = (long) vista.tablaProductos.getValueAt(vista.tablaProductos.getSelectedRow(), 0);
                long codNuevo = Long.parseLong(vista.txtCodigo.getText());
                if (codNuevo != cod && modelo.getProducto(codNuevo) != null) {
                    JOptionPane.showMessageDialog(null, "Código de producto ya existente.");

                } else {
                    Producto producto = modelo.getProducto(cod);
                    if (producto != null) {
                        producto.setCodigo(codNuevo);
                        producto.setNombre(vista.txtNombre.getText());
                        producto.setPrecio(Float.parseFloat(vista.txtPrecio.getText()));
                        producto.setExistencias(Long.parseLong(vista.txtExistencias.getText()));
                        actualizarArchivo(modelo.getProductos());
                        actualizarTabla(vista.txtBuscarProducto.getText());
                        JOptionPane.showMessageDialog(null, "Producto editado correctamente.");
                        vista.btnRegistrar.setVisible(true);
                        vista.btnEditarPanel.setVisible(false);
                        vaciarCampos();
                    }

                }

            } else {
                JOptionPane.showMessageDialog(null, "Por favor, llena todos los campos.");
            }

        } else if (vista.btnEliminar.equals(o)) {
            int i = vista.tablaProductos.getSelectedRow();
            if (i != -1) {
                String nombre = (String) vista.tablaProductos.getValueAt(i, 1);
                if (JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar el producto " + nombre + "?", "Eliminar producto",
                        JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
                    modelo.eliminarProducto(modelo.getProducto((long) vista.tablaProductos.getValueAt(i, 0)));
                    actualizarArchivo(modelo.getProductos());
                    actualizarTabla(vista.txtBuscarProducto.getText());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, seleccione el producto de la tabla que desea eliminar.");
            }

        } else if (vista.btnAddCart.equals(o)) {
            if (vista.txtCantidadComprar.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, ingresa la cantidad.");
            } else {
                int cantComprar = Integer.parseInt(vista.txtCantidadComprar.getText());
                int index = vista.tablaProductos.getSelectedRow();
                long cod = (long) vista.tablaProductos.getValueAt(index, 0);
                if (modelo.getProductoCarrito(cod) == null) { // Si no está dentro del carrito
                    Producto productoComprar = modelo.getProducto(cod);
                    if (cantComprar <= 0) {
                        JOptionPane.showMessageDialog(null, "Cantidad inválida.");
                    } else {
                        if (productoComprar != null && cantComprar <= productoComprar.getExistencias()) {
                            modelo.addProductoCarrito(new ProductoDetalle(productoComprar, cantComprar));
                            productoComprar.setExistencias(productoComprar.getExistencias() - cantComprar);
                            JOptionPane.showMessageDialog(null, "Añadido al carro correctamente.");
                        } else {
                            JOptionPane.showMessageDialog(null, "La cantidad ingresada supera el número de existencias del producto.");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Este producto ya ha sido añadido al carrito, si desea modificar la "
                            + "cantidad a comprar puede hacerlo en el apartado de Facturas.");
                }
            }
            /*
            String nombreP = (String) vista.tablaProductos.getValueAt(index, 1);
            float precioP = (float) vista.tablaProductos.getValueAt(index, 2);
            long cantf = (long) vista.tablaProductos.getValueAt(index, 3);
            if (cant > 0 && cantf > cant) {
                if (cantf == 0) {
                    JOptionPane.showMessageDialog(null, "el producto no se encuentra disponible");
                } else {
                    cantf = cantf - cant;
                    System.out.println(cantf);
                    vista.tablaProductos.setValueAt(cantf, index, 3); // cambiar el valor, disminuir la cantidad de productos que hay, problema es que la tabla y el archivo se actualizan por medio de vector
                    actualizarArchivo(modelo.getProductos());
                    actualizarTabla(vista.txtBuscarProducto.getText());
                    modelo.addProductoCar(new ProductoDetalle(nombreP, cant, precioP));
                }
            } else {
                JOptionPane.showMessageDialog(null, "la cantidad deseada no se encuentra disponible, porfavor eliga una cantidad menor");
            }*/
        } else if (vista.tablaProductos.equals(o)) {
            if (vista.btnEditarPanel.isVisible()) {
                llenarCamposConFilaTabla(vista.tablaProductos.getSelectedRow());
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
        } else if (vista.btnAddCart.equals(o)) {
            mouseEntered(vista.btnAddCart, "cartColor.png");
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
        } else if (vista.btnAddCart.equals(o)) {
            mouseEntered(vista.btnAddCart, "cart.png");
        } else if (vista.btnEliminar.equals(o)) {
            mouseEntered(vista.btnEliminar, "delete.png");
        }
    }
/**
 * Se llena la tabla con la información
 * @param i 
 */
    private void llenarCamposConFilaTabla(int i) {
        vista.txtCodigo.setText(vista.tablaProductos.getValueAt(i, 0) + "");
        vista.txtNombre.setText(vista.tablaProductos.getValueAt(i, 1) + "");
        vista.txtPrecio.setText(vista.tablaProductos.getValueAt(i, 2) + "");
        vista.txtExistencias.setText(vista.tablaProductos.getValueAt(i, 3) + "");
    }
/**
 * Se valida el que los campos no estén vacios
 * @return 
 */
    private boolean validarCampos() {
        return !(vista.txtCodigo.getText().isEmpty() || vista.txtNombre.getText().isEmpty()
                || vista.txtPrecio.getText().isEmpty() || vista.txtExistencias.getText().isEmpty());
    }
/**
 * Se actualiza el archivo donde se guardan los productos y su información
 * @param productos 
 */
    private void actualizarArchivo(ArrayList<Producto> productos) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File("src/Modelo/files/Productos.txt")))) {
            for (Producto prod : productos) {
                bw.write(prod.getCodigo() + "," + prod.getNombre() + "," + prod.getPrecio() + "," + prod.getExistencias());
                bw.newLine();
            }
        } catch (Exception e) {
            System.out.println("Error al actualizar archivo Productos");
        }
    }
/**
 * Se agrega un producto al programa
 */
    private void agregarProducto() {
        long cod = Long.parseLong(vista.txtCodigo.getText());
        String nombre = vista.txtNombre.getText();
        float precio = Float.parseFloat(vista.txtPrecio.getText());
        long existencias = Long.parseLong(vista.txtExistencias.getText());
        if (modelo.getProducto(cod) == null) {
            modelo.addProducto(new Producto(cod, nombre, precio, existencias));
            actualizarArchivo(modelo.getProductos());
            actualizarTabla(vista.txtBuscarProducto.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Código de producto ya existente.");
        }

        vista.txtCodigo.setText("");
        vista.txtNombre.setText("");
        vista.txtPrecio.setText("");
        vista.txtExistencias.setText("");

    }
/**
 * Se actualiza la tabla con la información modificada
 */
    public void actualizarTabla(String texto) {
        DefaultTableModel model = (DefaultTableModel) vista.tablaProductos.getModel();
        model.setRowCount(0);
        for (Producto pr : modelo.getProductos()) {
            String nom = pr.getNombre();
            if (busq(texto, nom) == true) {
                model.addRow(new Object[]{pr.getCodigo(), pr.getNombre(), pr.getPrecio(), pr.getExistencias()});
            }
        }
    }
/**
 * Se realiza la Busqueda del producto
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
        if (vista.txtCodigo.equals(o) || vista.txtCantidadComprar.equals(o) || vista.txtExistencias.equals(o)) {
            if (!Character.isDigit(ke.getKeyChar())) {
                ke.consume();
            }
        } else if (vista.txtNombre.equals(o)) {
            if (ke.getKeyChar() != 32 && !Character.isLetter(ke.getKeyChar())) {
                ke.consume();
            }
        } else if (vista.txtPrecio.equals(o)) {
            if (ke.getKeyChar() != 46 && !Character.isDigit(ke.getKeyChar())) {
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
        if (vista.txtBuscarProducto.equals(o)) {
            actualizarTabla(vista.txtBuscarProducto.getText());
        }
    }

    public void mouseEntered(JLabel lbl, String ruta) {
        lbl.setIcon(new ImageIcon("src/Vista/resources/" + ruta));
    }

    public void mouseExited(JLabel lbl, String ruta) {
        lbl.setIcon(new ImageIcon("src/Vista/resources/" + ruta));
    }

    private void vaciarCampos() {
        vista.txtCodigo.setText("");
        vista.txtNombre.setText("");
        vista.txtPrecio.setText("");
        vista.txtExistencias.setText("");
    }

}
