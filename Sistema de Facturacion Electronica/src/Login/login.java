/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;


import Clases.SqlUsuarios;
import Clases.hash;
import Clases.usuarios;
import Formularios.Menus.Menu_admin;
import Formularios.Menus.Menu_usuario;
import Login.CambiarContra;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import rojerusan.RSNotifyFade;


/**
 *
 * @author samue
 */
public class login extends javax.swing.JFrame {
    private boolean minimiza;
    int x, y;
    ClaseLogin.Conexion cc = new ClaseLogin.Conexion();
    
    public login() {
        initComponents();       
        this.setLocationRelativeTo(null);           
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jblUsuario = new javax.swing.JLabel();
        jblContraseña = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        msj1 = new javax.swing.JLabel();
        min = new javax.swing.JButton();
        txtuser = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        Pn1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Inicio de sesion.PNG"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 500, 80));

        jblUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jblUsuario.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jblUsuario.setText("        USUARIO:");
        jPanel2.add(jblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 155, 39));

        jblContraseña.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jblContraseña.setText("CONTRASEÑA:");
        jPanel2.add(jblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 129, 36));

        btnIngresar.setBackground(new java.awt.Color(204, 255, 204));
        btnIngresar.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        btnIngresar.setText("INGRESAR");
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
        });
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel2.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 130, 40));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 311, 21));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 311, 21));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_user_25px.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 47, 48));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_lock_25px_1.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 30, 50));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_xbox_x_50px.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 80, 70));

        msj1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        msj1.setForeground(new java.awt.Color(255, 255, 255));
        msj1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        msj1.setText("¿Olvidaste tú usuario o contraseña?, has clic");
        jPanel2.add(msj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, -1, -1));

        min.setToolTipText("<html> <head> <style> #contenedor{background:#00688B;color:white; padding-left:10px;padding-right:10px;margin:0; padding-top:5px;padding-bottom:5px;} </style> </head> <body> <h4 id=\"contenedor\">Minimizar</h4> </body> </html>");
        min.setBorder(null);
        min.setBorderPainted(false);
        min.setContentAreaFilled(false);
        min.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minActionPerformed(evt);
            }
        });
        jPanel2.add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 118, 39, 40));

        txtuser.setBackground(new java.awt.Color(0, 0, 0));
        txtuser.setForeground(new java.awt.Color(255, 255, 255));
        txtuser.setBorder(null);
        jPanel2.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 240, 40));

        txtpass.setBackground(new java.awt.Color(0, 0, 0));
        txtpass.setForeground(new java.awt.Color(255, 255, 255));
        txtpass.setBorder(null);
        txtpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpassKeyTyped(evt);
            }
        });
        jPanel2.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 250, 40));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 255));
        jButton2.setText("aquí");
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 570, 70, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 560, 610));

        Pn1.setBackground(new java.awt.Color(0, 0, 0));
        Pn1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Facturacion Electronica.PNG"))); // NOI18N

        javax.swing.GroupLayout Pn1Layout = new javax.swing.GroupLayout(Pn1);
        Pn1.setLayout(Pn1Layout);
        Pn1Layout.setHorizontalGroup(
            Pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        Pn1Layout.setVerticalGroup(
            Pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pn1Layout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(144, 144, 144))
        );

        getContentPane().add(Pn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked

    }//GEN-LAST:event_btnIngresarMouseClicked

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        ClaseLogin.Metodos obj = new ClaseLogin.Metodos();
        String usuario = txtuser.getText();
        String pass = new String(obj.MD5(txtpass.getText()));        
        obj.verificarSesionUsuarios(usuario, pass);
        
        
        if (obj.getT_Usuario().trim().equals("Administrador") && obj.getE_Usuario().trim().equals("Activo")) {            
            Formularios.Menus.Menu_admin menuAdmin= new   Formularios.Menus.Menu_admin();
            menuAdmin.setVisible(true);
            menuAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose(); 
            JOptionPane.showMessageDialog(this,"Bienvenido Administrador");
        }else if (obj.getT_Usuario().trim().equals("Empleado") && obj.getE_Usuario().trim().equals("Activo")) {            
            Menu_usuario menuUser = new Menu_usuario();
            menuUser.setVisible(true);
            menuUser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
            JOptionPane.showMessageDialog(this,"Bienvenido Empleado");
        }else{
            if (txtuser.getText().equals("") || txtpass.getText().equals("")) {
                JOptionPane.showMessageDialog(this,"Campos vacios");
            } else {
                JOptionPane.showMessageDialog(this,"Usuario invalido");                                         
            }
            
        } 
       

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        Point mueve = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(mueve.x - x, mueve.y - y);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minActionPerformed
        this.setExtendedState(ICONIFIED);
        if (!minimiza) {
            minimiza = false;
        } else {
            minimiza = true;
        }
    }//GEN-LAST:event_minActionPerformed

    private void txtpassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CambiarContra a = new CambiarContra ();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pn1;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jblContraseña;
    private javax.swing.JLabel jblUsuario;
    private javax.swing.JButton min;
    private javax.swing.JLabel msj1;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables

    }

