
package Controlador;

import Modelo.Administrador;
import Modelo.Cliente;
import Modelo.Factura;
import Modelo.Miscelanea;
import Modelo.Producto;
import Modelo.ProductoDetalle;
import Vista.Facturas;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ControlFacturas implements MouseListener, KeyListener {

    Facturas vista;
    Miscelanea modelo;
/**
 * Se crea la ventana de facturas con la respectiva información
 * @param vista
 * @param modelo 
 */
    public ControlFacturas(Facturas vista, Miscelanea modelo) {
        this.vista = vista;
        vista.setControlador(this);
        this.modelo = modelo;
        actualizarTabla();
    }
/**
 * Se confirma la acción que quiere hacer el usuario, si la factura está vacía, el programa muestra un mensaje y no se puede realizar ninguna acción
 * @param e 
 */
    @Override
    public void mouseClicked(MouseEvent e) {

        Object o = e.getSource();
        if (vista.btnGuardarFactura.equals(o)) {
            if (modelo.getProductosCarrito().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Lista de productos vacía.");
            } else {
                if (vista.txtClienteId.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Ingresa el número de identificación del cliente.");
                } else {
                    Cliente cliente = modelo.getCliente(Long.parseLong(vista.txtClienteId.getText()));
                    if (cliente != null) {
                        Date fecha = new Date();
                        SimpleDateFormat formato = new SimpleDateFormat("dd-MMM-YYYY");
                        modelo.addFactura(new Factura(cliente, modelo.getUserLogin(), Float.parseFloat(vista.txtTotalPago.getText()), modelo.getProductosCarrito(), formato.format(fecha)));
                        actualizarArchivo(modelo.getFacturas());
                        modelo.getProductosCarrito().clear();
                        vista.txtClienteId.setText("");
                        actualizarTabla();
                    } else {
                        JOptionPane.showMessageDialog(null, "No existe un cliente con la identificación ingresada.");
                    }
                }
            }
        } else if (vista.btnEliminarProducto.equals(o)) {
            int i = vista.tablaCarrito.getSelectedRow();
            if (i != -1) {
                String nombre = (String) vista.tablaCarrito.getValueAt(i, 1);
                if (JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar el producto " + nombre + " ?", "Eliminar producto",
                        JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
                    long p = (long) vista.tablaCarrito.getValueAt(i, 0);
                    modelo.eliminarProductoCarrito(modelo.getProductoCarrito(p));
                    actualizarTabla();
                    actualizarArchivo(modelo.getFacturas());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, seleccione el producto de la tabla que desea eliminar.");
            }

        } else if (vista.btnExplorarFacturas.equals(o)) {
            if (modelo.getUserLogin() instanceof Administrador) {
                vista.jScrollPane1.setVisible(false);
                vista.txtTotalPago.setVisible(false);
                vista.total.setVisible(false);
                vista.tablaFacturas1.setVisible(true);
                vista.total1.setVisible(false);
                vista.total2.setVisible(false);
                vista.txtIva.setVisible(false);
                vista.txtSubtotal.setVisible(false);
                actualizarTablaF();
            }
        } else if (vista.btnCerrar.equals(o)) {
            vista.jScrollPane1.setVisible(true);
            vista.txtTotalPago.setVisible(true);
            vista.total.setVisible(true);
            vista.tablaFacturas1.setVisible(false);
            vista.total1.setVisible(true);
            vista.total2.setVisible(true);
            vista.txtIva.setVisible(true);
            vista.txtSubtotal.setVisible(true);
        }

    }
/**
 * Se coloca el ícono
 * @param lbl
 * @param ruta 
 */
    public void setIcon(JLabel lbl, String ruta) {
        lbl.setIcon(new ImageIcon("src/Vista/resources/" + ruta));

    }

    @Override
    public void mouseEntered(MouseEvent c) {

        Object o = c.getSource();
        if (vista.btnEliminarProducto.equals(o)) {
            setIcon(vista.btnEliminarProducto, "deleteColor.png");
        } else if (vista.btnGuardarFactura.equals(o)) {
            setIcon(vista.btnGuardarFactura, "saveazul.png");
        } else if (vista.btnExplorarFacturas.equals(o)) {
            setIcon(vista.btnExplorarFacturas, "editColor.png");
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {

        Object o = e.getSource();
        if (vista.btnEliminarProducto.equals(o)) {
            setIcon(vista.btnEliminarProducto, "delete.png");
        } else if (vista.btnGuardarFactura.equals(o)) {
            setIcon(vista.btnGuardarFactura, "savenegro.png");
        } else if (vista.btnExplorarFacturas.equals(o)) {
            setIcon(vista.btnExplorarFacturas, "edit.png");
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {

    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        Object o = ke.getSource();
        if (vista.txtClienteId.equals(o)) {
            if (vista.txtClienteId.getText().isEmpty()) {
                setIcon(vista.iconoID, "signerror.png");
            } else {
                if (modelo.getCliente(Long.parseLong(vista.txtClienteId.getText())) == null) {
                    setIcon(vista.iconoID, "signerror.png");
                } else {
                    setIcon(vista.iconoID, "correct.png");
                }

            }
        }
    }
/**
 * Se actualiza la ventana de la factura
 */
    private void actualizarTabla() {
        DefaultTableModel model = (DefaultTableModel) vista.tablaCarrito.getModel();
        model.setRowCount(0);
        float total = 0, precioTotal;
        for (ProductoDetalle pd : modelo.getProductosCarrito()) {
            Producto p = pd.getProducto();
            precioTotal = p.getPrecio() * pd.getCantComprada();
            total += precioTotal;
            model.addRow(new Object[]{p.getNombre(), p.getPrecio(), pd.getCantComprada(), precioTotal});
        }
        vista.txtTotalPago.setText(String.valueOf(total));
        float iva = total * 0.19f;
        vista.txtIva.setText(String.valueOf(iva));
        vista.txtSubtotal.setText(String.valueOf(total - iva));
    }

    private void actualizarTablaF() {
        DefaultTableModel modelf = (DefaultTableModel) vista.TablaF1.getModel();
        modelf.setRowCount(0);
        for (Factura f : modelo.getFacturas()) {
            modelf.addRow(new Object[]{f.getId(), f.getCliente().getNombre(), f.getVendedor().getNombre(), f.getPrecioTotal(), f.getFecha()});
        }
    }
/**
 * Se actualiza el respectivo archivo
 * @param facturas 
 */
    private void actualizarArchivo(ArrayList<Factura> facturas) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File("src/Modelo/files/Facturas.txt")))) {
            for (Factura f : facturas) {
                bw.write(f.getId() + "," + f.getVendedor().getId() + "," + f.getCliente().getId() + "," + f.getPrecioTotal() + "," + f.getFecha());
                bw.newLine();
            }
        } catch (Exception e) {
            System.out.println("Error al actualizar archivo Facturas");
        }
    }

}
