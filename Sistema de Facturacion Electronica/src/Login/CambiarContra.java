
package Login;

import Login.login;
import Clases.SqlUsuarios;
import Clases.hash;
import Clases.usuarios;
import Formularios.Menus.Menu_admin;
import Formularios.Menus.Menu_usuario;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.sql.Connection;
import java.sql.PreparedStatement;
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

public class CambiarContra extends javax.swing.JFrame {
    Connection cn = null;
    
    public CambiarContra() {
        initComponents();
        setLocationRelativeTo(null);
        
    }
/**Metodo para el cambio de dontraseña del login**/
    public void cambiarPassword(){
    
        String Clavevacio = newClave.getText();
        String ConFirClave = ConClave.getText();
        
        if(("".equals(Clavevacio)) || ("".equals(ConFirClave))){
        
        new rojerusan.RSNotifyFade("ERROR","No se puede cambiar con campos vacios",7,RSNotifyFade.PositionNotify.TopLef,RSNotifyFade.TypeNotify.ERROR).setVisible(true);
        newClave.requestFocus();
        }else{
        
        if (newClave.getText().equals(ConClave.getText())){
        ClaseLogin.Conexion cc = new ClaseLogin.Conexion();
        int resp= JOptionPane.showConfirmDialog(null,"¿Desea cambiar la contraseña?","pregunta",0);
        
           if(resp == 0){
           
                  String cont = newClave.getText();
           } try{
           
           String sql = "UPDATE usuario set contrasena_usuario=? where nombre_usuario=?";
           PreparedStatement pst = cn.prepareCall(sql);
           
           int a = pst.executeUpdate();
           new rojerusan.RSNotifyFade("CORRECTO","Contra guardada correctamente",7,RSNotifyFade.PositionNotify.TopRight,RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
           
               
           }catch(SQLException |  HeadlessException e){
           
               dispose();
               login a = new login();
               a.setVisible(true);
           
           }
        }else{
                   JOptionPane.showConfirmDialog(null,"La contraseña no coincide");
                   
                   }
            
        }
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rSPanelGradiente1 = new rspanelgradiente.RSPanelGradiente();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        newClave = new javax.swing.JPasswordField();
        ConClave = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelGradiente1.setColorPrimario(new java.awt.Color(0, 0, 0));
        rSPanelGradiente1.setColorSecundario(new java.awt.Color(0, 0, 0));
        rSPanelGradiente1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RECUPERAR CONTRASEÑA");
        rSPanelGradiente1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 460, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CONFIRMAR CONTRASEÑA:");
        rSPanelGradiente1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconfinder_secure-server-px-png_63474.png"))); // NOI18N
        rSPanelGradiente1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 120, -1));

        newClave.setBackground(new java.awt.Color(0, 0, 0));
        newClave.setForeground(new java.awt.Color(255, 255, 255));
        newClave.setBorder(null);
        newClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newClaveActionPerformed(evt);
            }
        });
        rSPanelGradiente1.add(newClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 180, 30));

        ConClave.setBackground(new java.awt.Color(0, 0, 0));
        ConClave.setForeground(new java.awt.Color(255, 255, 255));
        ConClave.setBorder(null);
        rSPanelGradiente1.add(ConClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 170, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CAMBIAR CONTRASEÑA:");
        rSPanelGradiente1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        jButton1.setBackground(new java.awt.Color(136, 136, 62));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_lock_25px_1.png"))); // NOI18N
        jButton1.setText("CONFIRMAR");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 0), new java.awt.Color(102, 102, 0), new java.awt.Color(102, 102, 0), new java.awt.Color(102, 102, 0)));
        jButton1.setContentAreaFilled(false);
        jButton1.setOpaque(true);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        rSPanelGradiente1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 200, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Facturacion Electronica.PNG"))); // NOI18N
        rSPanelGradiente1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 290));

        jSeparator1.setBackground(new java.awt.Color(153, 153, 0));
        rSPanelGradiente1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 180, 10));

        jSeparator2.setBackground(new java.awt.Color(153, 153, 0));
        rSPanelGradiente1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 102, 180, 10));

        getContentPane().add(rSPanelGradiente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newClaveActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        cambiarPassword();
        dispose();
        login a = new login();
        a.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambiarContra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ConClave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField newClave;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente1;
    // End of variables declaration//GEN-END:variables
}
