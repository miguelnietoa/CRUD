/*"
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControlMenu;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Harry Cepeda, Miguel Nieto, Mateo Arcieri, Juan Pablo Mendez
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Crea la ventana del Menu y define sus características
     */
    public Menu() {
        initComponents();
        this.setResizable(false);
        this.setSize(1000, 600);
        this.setLocationRelativeTo(null);
        btnProductos.setForeground(Color.BLACK);
        btnClientes.setForeground(Color.BLACK);
        btnEmpleados.setForeground(Color.BLACK);
        btnFacturas.setForeground(Color.BLACK);
        btnCerrarSesion.setForeground(Color.BLACK);
        /*
        
        ESTO ES PARA RODAR LAS OPCIONES DEL MENU EN CASO DE USUARIO/ADMIN
        
        System.out.println(btnUsuarios.getX()+", "+btnUsuarios.getY());
        btnNuevaFactura.setLocation(0, btnNuevaFactura.getY()-btnNuevaFactura.getHeight()-5);
        btnUsuarios.setVisible(false);
        this.revalidate();
        this.repaint();*/
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMinimize = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelFrames = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        btnProductos = new javax.swing.JLabel();
        btnClientes = new javax.swing.JLabel();
        btnEmpleados = new javax.swing.JLabel();
        btnFacturas = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        btnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/resources/minimize.png"))); // NOI18N
        btnMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/resources/close.png"))); // NOI18N
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setToolTipText("");
        jLabel1.setOpaque(true);

        panelFrames.setLayout(new java.awt.BorderLayout());

        panelMenu.setBackground(new java.awt.Color(153, 153, 153));

        btnProductos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/resources/product.png"))); // NOI18N
        btnProductos.setText("Productos");
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnClientes.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/resources/customer.png"))); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnEmpleados.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/resources/users.png"))); // NOI18N
        btnEmpleados.setText("Empleados");
        btnEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnFacturas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnFacturas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/resources/factura.png"))); // NOI18N
        btnFacturas.setText("Facturas");
        btnFacturas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnCerrarSesion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/resources/exit.png"))); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(960, 960, 960)
                .addComponent(btnCerrar))
            .addGroup(layout.createSequentialGroup()
                .addGap(920, 920, 920)
                .addComponent(btnMinimize))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelFrames, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCerrar)
                            .addComponent(btnMinimize))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelFrames, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

/**
 * Se encarga de que el panel principal sea creado sin error alguno, como el que se le sobreponga un JFrame
 * 
 */
    public void mostrarPanel(JPanel p) {
        panelFrames.removeAll();
        panelFrames.add(p);
        panelFrames.revalidate();
        panelFrames.repaint();
    }
/**
 * Define los controladores
 */
    public void setControlador(ControlMenu controlMenu) {
        btnCerrar.addMouseListener(controlMenu);
        btnMinimize.addMouseListener(controlMenu);
        btnProductos.addMouseListener(controlMenu);
        btnEmpleados.addMouseListener(controlMenu);
        btnClientes.addMouseListener(controlMenu);
        btnFacturas.addMouseListener(controlMenu);
        btnCerrarSesion.addMouseListener(controlMenu);
    }
/**
 * Carga el modo vendedor
 */
    public void cargarModoVendedor() {
        btnEmpleados.setVisible(false);
        btnCerrarSesion.setLocation(btnFacturas.getLocation());
        btnFacturas.setLocation(btnEmpleados.getLocation());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel btnCerrar;
    public javax.swing.JLabel btnCerrarSesion;
    public javax.swing.JLabel btnClientes;
    public javax.swing.JLabel btnEmpleados;
    public javax.swing.JLabel btnFacturas;
    public javax.swing.JLabel btnMinimize;
    public javax.swing.JLabel btnProductos;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JPanel panelFrames;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}
