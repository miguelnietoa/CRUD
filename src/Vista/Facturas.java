/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControlFacturas;
import java.awt.Font;

/**
 *
 * @author harri
 */
public class Facturas extends javax.swing.JPanel {

    /**
     * Se crea la ventana de Facturas
     */
    public Facturas() {
        initComponents();
        tablaCarrito.getTableHeader().setFont(new Font("Century Gothic", 1, 14));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoFacturas = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        txtTotalPago = new javax.swing.JTextField();
        panel = new javax.swing.JPanel();
        btnGuardarFactura = new javax.swing.JLabel();
        usuario1 = new javax.swing.JLabel();
        separadordenombre1 = new javax.swing.JSeparator();
        btnExplorarFacturas = new javax.swing.JLabel();
        btnEliminarProducto = new javax.swing.JLabel();
        txtClienteId = new javax.swing.JTextField();
        iconoID = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCarrito = new javax.swing.JTable();
        tablaFacturas1 = new javax.swing.JScrollPane();
        TablaF1 = new javax.swing.JTable();
        btnCerrar = new javax.swing.JLabel();
        total1 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        total2 = new javax.swing.JLabel();
        txtIva = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondoFacturas.setBackground(new java.awt.Color(153, 153, 153));
        fondoFacturas.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        fondoFacturas.setText(" Facturas");
        fondoFacturas.setOpaque(true);
        add(fondoFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 60));

        total.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        total.setText("Total a pagar:");
        total.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, 160, -1));

        txtTotalPago.setEditable(false);
        txtTotalPago.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTotalPago.setToolTipText("");
        txtTotalPago.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTotalPago.setOpaque(false);
        add(txtTotalPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, 210, 30));

        panel.setBackground(new java.awt.Color(204, 204, 204));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardarFactura.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnGuardarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/resources/savenegro.png"))); // NOI18N
        btnGuardarFactura.setText("Generar factura");
        btnGuardarFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel.add(btnGuardarFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 160, 50));

        usuario1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        usuario1.setText("Identificación del cliente:");
        panel.add(usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));
        panel.add(separadordenombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 180, 10));

        btnExplorarFacturas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnExplorarFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/resources/edit.png"))); // NOI18N
        btnExplorarFacturas.setText("Explorar facturas");
        btnExplorarFacturas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel.add(btnExplorarFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 160, -1));

        btnEliminarProducto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/resources/delete.png"))); // NOI18N
        btnEliminarProducto.setText("Eliminar producto");
        btnEliminarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel.add(btnEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 160, -1));

        txtClienteId.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtClienteId.setBorder(null);
        txtClienteId.setOpaque(false);
        panel.add(txtClienteId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 180, 30));
        panel.add(iconoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 32, 32));

        add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 820, -1));

        tablaCarrito.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        tablaCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Precio unitario", "Unidades", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.Double.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaCarrito);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 820, 220));

        TablaF1.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        TablaF1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID factura", "Cliente", "Vendedor", "Precio Total", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaFacturas1.setViewportView(TablaF1);

        add(tablaFacturas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 820, 180));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/resources/close.png"))); // NOI18N
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 160, -1, -1));

        total1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        total1.setText("Subtotal:");
        total1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(total1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 160, -1));

        txtSubtotal.setEditable(false);
        txtSubtotal.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtSubtotal.setToolTipText("");
        txtSubtotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtSubtotal.setOpaque(false);
        add(txtSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 210, 30));

        total2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        total2.setText("IVA 19% :");
        total2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(total2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 160, -1));

        txtIva.setEditable(false);
        txtIva.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtIva.setToolTipText("");
        txtIva.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtIva.setOpaque(false);
        add(txtIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 210, 30));
    }// </editor-fold>//GEN-END:initComponents

/**
 * Se crean las acciones de ls botones al hacer clic en ellos más las tablas 
 */
     public void setControlador(ControlFacturas c) {
        btnExplorarFacturas.addMouseListener(c);
        btnEliminarProducto.addMouseListener(c);
        txtTotalPago.addKeyListener(c);
        tablaCarrito.addMouseListener(c);
        btnGuardarFactura.addMouseListener(c);
        txtClienteId.addKeyListener(c);         
        TablaF1.addMouseListener(c);
        jScrollPane1.addMouseListener(c);
        tablaFacturas1.addMouseListener(c);
        btnCerrar.addMouseListener(c);
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TablaF1;
    public javax.swing.JLabel btnCerrar;
    public javax.swing.JLabel btnEliminarProducto;
    public javax.swing.JLabel btnExplorarFacturas;
    public javax.swing.JLabel btnGuardarFactura;
    private javax.swing.JLabel fondoFacturas;
    public javax.swing.JLabel iconoID;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JPanel panel;
    private javax.swing.JSeparator separadordenombre1;
    public javax.swing.JTable tablaCarrito;
    public javax.swing.JScrollPane tablaFacturas1;
    public javax.swing.JLabel total;
    public javax.swing.JLabel total1;
    public javax.swing.JLabel total2;
    public javax.swing.JTextField txtClienteId;
    public javax.swing.JTextField txtIva;
    public javax.swing.JTextField txtSubtotal;
    public javax.swing.JTextField txtTotalPago;
    private javax.swing.JLabel usuario1;
    // End of variables declaration//GEN-END:variables

   
}
