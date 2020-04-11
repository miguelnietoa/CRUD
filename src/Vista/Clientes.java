
package Vista;

import Controlador.ControlClientes;
import java.awt.Font;


public class Clientes extends javax.swing.JPanel {

    /**
     * Crea una nueva ventana de Clientes
     */
    public Clientes() {
        initComponents();
        tablaClientes.getTableHeader().setFont(new Font("Century Gothic", 1, 14));
        btnEditarPanel.setText("Editar");
        btnEditarPanel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegistrar = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        separadordeprecio = new javax.swing.JSeparator();
        separadordelnombredelproducto = new javax.swing.JSeparator();
        txtNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        separadordecodigo = new javax.swing.JSeparator();
        productos1 = new javax.swing.JLabel();
        btnEditarPanel = new javax.swing.JLabel();
        comboBoxGenero = new javax.swing.JComboBox<>();
        panelBuscar = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JLabel();
        btnEditar = new javax.swing.JLabel();
        productos2 = new javax.swing.JLabel();
        separadordeproducto = new javax.swing.JSeparator();
        txtBuscarCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        labelTitulo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(820, 530));

        panelRegistrar.setBackground(new java.awt.Color(204, 204, 204));
        panelRegistrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/resources/savenegro.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelRegistrar.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 100, 50));

        lblGenero.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblGenero.setText("Género");
        panelRegistrar.add(lblGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, -1, -1));

        lblTel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTel.setText("Teléfono/Celular");
        panelRegistrar.add(lblTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        txtTelefono.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTelefono.setBorder(null);
        txtTelefono.setOpaque(false);
        panelRegistrar.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 110, 30));
        panelRegistrar.add(separadordeprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 110, 10));
        panelRegistrar.add(separadordelnombredelproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 190, 10));

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNombre.setBorder(null);
        txtNombre.setOpaque(false);
        panelRegistrar.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 190, 30));

        lblNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNombre.setText("Nombre");
        panelRegistrar.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        lblId.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblId.setText("Identificación");
        panelRegistrar.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        txtId.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtId.setBorder(null);
        txtId.setOpaque(false);
        panelRegistrar.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 120, 30));
        panelRegistrar.add(separadordecodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 120, 10));

        productos1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        productos1.setText("Registrar");
        panelRegistrar.add(productos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -5, 80, 40));

        btnEditarPanel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnEditarPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/resources/savenegro.png"))); // NOI18N
        btnEditarPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarPanelMouseExited(evt);
            }
        });
        panelRegistrar.add(btnEditarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 100, 50));

        comboBoxGenero.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        comboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "LGTBI", "Otro" }));
        comboBoxGenero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelRegistrar.add(comboBoxGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 110, 30));

        btnEliminar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/resources/delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnEditar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/resources/edit.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        productos2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        productos2.setText("Buscar cliente");

        txtBuscarCliente.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtBuscarCliente.setBorder(null);
        txtBuscarCliente.setOpaque(false);

        jScrollPane1.setBorder(null);

        tablaClientes.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num ID", "Nombre", "Tel/Cel", "Genero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class
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
        tablaClientes.getTableHeader().setResizingAllowed(false);
        tablaClientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaClientes);

        javax.swing.GroupLayout panelBuscarLayout = new javax.swing.GroupLayout(panelBuscar);
        panelBuscar.setLayout(panelBuscarLayout);
        panelBuscarLayout.setHorizontalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(productos2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(separadordeproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(170, 170, 170)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelBuscarLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBuscarLayout.setVerticalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarLayout.createSequentialGroup()
                .addGroup(panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productos2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBuscarLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBuscarLayout.createSequentialGroup()
                                .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(separadordeproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addContainerGap())
        );

        labelTitulo.setBackground(new java.awt.Color(153, 153, 153));
        labelTitulo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelTitulo.setText("  Clientes");
        labelTitulo.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnEditarPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarPanelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarPanelMouseEntered

    private void btnEditarPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarPanelMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarPanelMouseExited
/**
 * Se carga el modo vendedor
 */
    public void cargarModoVendedor() {
        btnEditar.setVisible(false);
        btnEliminar.setVisible(false);
    }
/**
 * Se generan las acciones al hacer clic en los botones, además de la tabla de Clientes
 *
 */
    public void setControlador(ControlClientes c) {
        btnRegistrar.addMouseListener(c);
        txtBuscarCliente.addKeyListener(c);
        txtId.addKeyListener(c);
        txtNombre.addKeyListener(c);
        txtTelefono.addKeyListener(c);
        btnEditar.addMouseListener(c);
        btnEditarPanel.addMouseListener(c);
        btnEliminar.addMouseListener(c);
        tablaClientes.addMouseListener(c);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel btnEditar;
    public javax.swing.JLabel btnEditarPanel;
    public javax.swing.JLabel btnEliminar;
    public javax.swing.JLabel btnRegistrar;
    public javax.swing.JComboBox<String> comboBoxGenero;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTel;
    private javax.swing.JPanel panelBuscar;
    public javax.swing.JPanel panelRegistrar;
    private javax.swing.JLabel productos1;
    private javax.swing.JLabel productos2;
    private javax.swing.JSeparator separadordecodigo;
    private javax.swing.JSeparator separadordelnombredelproducto;
    private javax.swing.JSeparator separadordeprecio;
    private javax.swing.JSeparator separadordeproducto;
    public javax.swing.JTable tablaClientes;
    public javax.swing.JTextField txtBuscarCliente;
    public javax.swing.JTextField txtId;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

}
