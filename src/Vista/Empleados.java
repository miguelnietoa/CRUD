
package Vista;

import Controlador.ControlEmpleados;
import java.awt.Font;
import javax.swing.ImageIcon;


public class Empleados extends javax.swing.JPanel {

    /**
     * Se crea una nueva ventana de Empleados
     */
    public Empleados() {
        initComponents();
        tablaEmpleados.getTableHeader().setFont(new Font("Century Gothic", 1, 14));
        btnEditarPanel.setText("Editar");
        btnEditarPanel.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegistrarEmpleados = new javax.swing.JPanel();
        usuario = new javax.swing.JLabel();
        contraseña1 = new javax.swing.JLabel();
        contraseña = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JLabel();
        separadordecontraseña1 = new javax.swing.JSeparator();
        separadordecontraseña = new javax.swing.JSeparator();
        separadordenombre = new javax.swing.JSeparator();
        passwordField = new javax.swing.JPasswordField();
        txtNombre = new javax.swing.JTextField();
        usuario1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        separadordenombre1 = new javax.swing.JSeparator();
        txtUsername = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        comboBoxTipo = new javax.swing.JComboBox<String>();
        btnEditarPanel = new javax.swing.JLabel();
        fondousuarios = new javax.swing.JLabel();
        panelBuscar = new javax.swing.JPanel();
        productos2 = new javax.swing.JLabel();
        separadordeproducto = new javax.swing.JSeparator();
        txtBuscarEmpleado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        btnEditar = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(820, 535));

        panelRegistrarEmpleados.setBackground(new java.awt.Color(204, 204, 204));
        panelRegistrarEmpleados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        usuario.setText("Nombre");
        panelRegistrarEmpleados.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        contraseña1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        contraseña1.setText("Nombre de usuario");
        panelRegistrarEmpleados.add(contraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        contraseña.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        contraseña.setText("Contraseña");
        panelRegistrarEmpleados.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, -1));

        btnRegistrar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/resources/savenegro.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelRegistrarEmpleados.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 100, 50));
        panelRegistrarEmpleados.add(separadordecontraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 120, 10));
        panelRegistrarEmpleados.add(separadordecontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 130, 10));
        panelRegistrarEmpleados.add(separadordenombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 130, 10));

        passwordField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        passwordField.setBorder(null);
        passwordField.setOpaque(false);
        panelRegistrarEmpleados.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 130, 30));

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNombre.setBorder(null);
        txtNombre.setOpaque(false);
        panelRegistrarEmpleados.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 130, 30));

        usuario1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        usuario1.setText("Identificación");
        panelRegistrarEmpleados.add(usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        txtID.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtID.setBorder(null);
        txtID.setOpaque(false);
        panelRegistrarEmpleados.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 100, 30));
        panelRegistrarEmpleados.add(separadordenombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 100, 10));

        txtUsername.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtUsername.setBorder(null);
        txtUsername.setOpaque(false);
        panelRegistrarEmpleados.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 120, 30));

        lblTipo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTipo.setText("Tipo");
        panelRegistrarEmpleados.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, -1));

        comboBoxTipo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        comboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vendedor", "Administrador" }));
        panelRegistrarEmpleados.add(comboBoxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 100, 30));

        btnEditarPanel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnEditarPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/resources/savenegro.png"))); // NOI18N
        btnEditarPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelRegistrarEmpleados.add(btnEditarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 100, 50));

        fondousuarios.setBackground(new java.awt.Color(153, 153, 153));
        fondousuarios.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        fondousuarios.setText("  Empleados");
        fondousuarios.setOpaque(true);

        panelBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productos2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        productos2.setText("Buscar empleado");
        panelBuscar.add(productos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 131, 40));
        panelBuscar.add(separadordeproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 270, 10));

        txtBuscarEmpleado.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtBuscarEmpleado.setBorder(null);
        txtBuscarEmpleado.setOpaque(false);
        panelBuscar.add(txtBuscarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 270, 30));

        jScrollPane1.setBorder(null);

        tablaEmpleados.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num ID", "Nombre", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaEmpleados.getTableHeader().setResizingAllowed(false);
        tablaEmpleados.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaEmpleados);

        panelBuscar.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 56, 800, 318));

        btnEditar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/resources/edit.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelBuscar.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 80, 40));

        btnEliminar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/resources/delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelBuscar.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 90, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondousuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelRegistrarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondousuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelRegistrarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
/**
 * Genera las acciones al hacer clic encima de un botón dentro de esta ventana, además de la tabla y campos de texto
 * @param c Recoge el boton en el cual se hace clic 
 */
    public void setControlador(ControlEmpleados c) {
        btnRegistrar.addMouseListener(c);
        btnEliminar.addMouseListener(c);
        btnEditar.addMouseListener(c);
        btnEditarPanel.addMouseListener(c);
        txtBuscarEmpleado.addKeyListener(c);
        txtNombre.addKeyListener(c);
        txtID.addKeyListener(c);
        txtUsername.addKeyListener(c);
        passwordField.addKeyListener(c);
        tablaEmpleados.addMouseListener(c);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel btnEditar;
    public javax.swing.JLabel btnEditarPanel;
    public javax.swing.JLabel btnEliminar;
    public javax.swing.JLabel btnRegistrar;
    public javax.swing.JComboBox<String> comboBoxTipo;
    private javax.swing.JLabel contraseña;
    private javax.swing.JLabel contraseña1;
    private javax.swing.JLabel fondousuarios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JPanel panelBuscar;
    public javax.swing.JPanel panelRegistrarEmpleados;
    public javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel productos2;
    private javax.swing.JSeparator separadordecontraseña;
    private javax.swing.JSeparator separadordecontraseña1;
    private javax.swing.JSeparator separadordenombre;
    private javax.swing.JSeparator separadordenombre1;
    private javax.swing.JSeparator separadordeproducto;
    public javax.swing.JTable tablaEmpleados;
    public javax.swing.JTextField txtBuscarEmpleado;
    public javax.swing.JTextField txtID;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtUsername;
    private javax.swing.JLabel usuario;
    private javax.swing.JLabel usuario1;
    // End of variables declaration//GEN-END:variables

}
