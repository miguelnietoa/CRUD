/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControlLogin;

/**
 *
 * @author Harry Cepeda, Miguel Nieto, Mateo Arcieri, Juan Pablo Mendez
 */
public class Login extends javax.swing.JFrame {
/**
 * Se crea la ventana Login
 */
    public Login() {

        initComponents();
        this.setResizable(false);
        this.setSize(760, 580);
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        separadordecontraseña = new javax.swing.JSeparator();
        iconodecontraseña = new javax.swing.JLabel();
        separadorusuario = new javax.swing.JSeparator();
        txtUsuario = new javax.swing.JTextField();
        iconodeusuariologin = new javax.swing.JLabel();
        iconodeusuario = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JLabel();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        panelLogin.setBackground(new java.awt.Color(255, 255, 255));
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelLogin.add(separadordecontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 296, 220, 10));

        iconodecontraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/resources/lock.png"))); // NOI18N
        panelLogin.add(iconodecontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 270, 20, 20));
        panelLogin.add(separadorusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 236, 220, 10));

        txtUsuario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtUsuario.setBorder(null);
        txtUsuario.setOpaque(false);
        panelLogin.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 205, 180, 30));

        iconodeusuariologin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/resources/userlog.png"))); // NOI18N
        panelLogin.add(iconodeusuariologin, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 206, 20, 20));

        iconodeusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/resources/user.png"))); // NOI18N
        panelLogin.add(iconodeusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 128, 128));

        txtPassword.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtPassword.setBorder(null);
        txtPassword.setOpaque(false);
        panelLogin.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 266, 180, 30));

        btnIngresar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnIngresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/resources/loginExited.png"))); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelLogin.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 110, 30));

        getContentPane().add(panelLogin);
        panelLogin.setBounds(225, 130, 310, 390);

        btnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/resources/minimize.png"))); // NOI18N
        btnMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnMinimize);
        btnMinimize.setBounds(680, 10, 24, 24);

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/resources/close.png"))); // NOI18N
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnCerrar);
        btnCerrar.setBounds(720, 10, 24, 24);

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/resources/solidblue.jpg"))); // NOI18N
        getContentPane().add(labelFondo);
        labelFondo.setBounds(0, 0, 760, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Se define las acciones de los botones al hacerles clic
 */
    public void setControlador(ControlLogin c) {
        btnCerrar.addMouseListener(c);
        btnMinimize.addMouseListener(c);
        btnIngresar.addMouseListener(c);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel btnCerrar;
    public javax.swing.JLabel btnIngresar;
    public javax.swing.JLabel btnMinimize;
    private javax.swing.JLabel iconodecontraseña;
    private javax.swing.JLabel iconodeusuario;
    private javax.swing.JLabel iconodeusuariologin;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JSeparator separadordecontraseña;
    private javax.swing.JSeparator separadorusuario;
    public javax.swing.JPasswordField txtPassword;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
