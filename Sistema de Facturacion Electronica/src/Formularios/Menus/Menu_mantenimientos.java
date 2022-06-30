
package Formularios.Menus;
import Mantenimientos.MantenimientoUnidadMedida;
import Mantenimientos.MantenimientoTipoUsuario;
import Mantenimientos.MantenimientoTipoReclamo;
import Mantenimientos.MantenimientoEstadoUsuario;
import Mantenimientos.MantenimientoEstadoReclamo;
import Mantenimientos.MantenimientoPresentacion;
import Mantenimientos.MantenimientoTipoFactura;
import Mantenimientos.MantenimientoEstadoFactura;
import Mantenimientos.MantenimientoTipoPago;
import Clases.CambiaPanel;
import Login.login;
import Mantenimientos.MantenimientoCategoria;


public class Menu_mantenimientos extends javax.swing.JFrame {

    
    public Menu_mantenimientos() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new javax.swing.JPanel();
        rSPanelGradiente1 = new rspanelgradiente.RSPanelGradiente();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnTFM = new rojerusan.RSButtonIconD();
        btnTUM = new rojerusan.RSButtonIconD();
        btnPM = new rojerusan.RSButtonIconD();
        btnTPM = new rojerusan.RSButtonIconD();
        btncategoria = new rojerusan.RSButtonIconD();
        btnUMM = new rojerusan.RSButtonIconD();
        btnEFM = new rojerusan.RSButtonIconD();
        btnEUM = new rojerusan.RSButtonIconD();
        btnTRM = new rojerusan.RSButtonIconD();
        btnERM1 = new rojerusan.RSButtonIconD();
        rSPanelGradiente3 = new rspanelgradiente.RSPanelGradiente();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        rSButtonCircle1 = new rojerusan.RSButtonCircle();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Contenedor.setBackground(new java.awt.Color(255, 255, 255));
        Contenedor.setLayout(new javax.swing.BoxLayout(Contenedor, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(Contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 1100, 600));

        rSPanelGradiente1.setColorPrimario(new java.awt.Color(153, 255, 204));
        rSPanelGradiente1.setColorSecundario(new java.awt.Color(51, 102, 255));
        rSPanelGradiente1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Factura");
        rSPanelGradiente1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("  Electronica ");
        rSPanelGradiente1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_munus/favicon.png"))); // NOI18N
        rSPanelGradiente1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 179, -1));

        btnTFM.setBackground(new java.awt.Color(204, 204, 255));
        btnTFM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_munus/iconfinder_receipt_3339034.png"))); // NOI18N
        btnTFM.setText("Tipo Factura ");
        btnTFM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTFMActionPerformed(evt);
            }
        });
        rSPanelGradiente1.add(btnTFM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 220, 40));

        btnTUM.setBackground(new java.awt.Color(204, 204, 255));
        btnTUM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_munus/iconfinder_group-customers-team-contacts-family_3209291.png"))); // NOI18N
        btnTUM.setText("Tipo Usuario");
        btnTUM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTUMActionPerformed(evt);
            }
        });
        rSPanelGradiente1.add(btnTUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 220, 40));

        btnPM.setBackground(new java.awt.Color(204, 204, 255));
        btnPM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_munus/iconfinder_Artboard_5_3915318.png"))); // NOI18N
        btnPM.setText("Presentacion");
        btnPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPMActionPerformed(evt);
            }
        });
        rSPanelGradiente1.add(btnPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 220, 40));

        btnTPM.setBackground(new java.awt.Color(204, 204, 255));
        btnTPM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_munus/iconfinder_193_coins_money_cash_ghold_money_4308105.png"))); // NOI18N
        btnTPM.setText("Tipo Pago");
        btnTPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTPMActionPerformed(evt);
            }
        });
        rSPanelGradiente1.add(btnTPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 220, 40));

        btncategoria.setBackground(new java.awt.Color(204, 204, 255));
        btncategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_munus/iconfinder_git-pull-request_298789.png"))); // NOI18N
        btncategoria.setText("Categoria");
        btncategoria.setColorHover(new java.awt.Color(51, 204, 255));
        btncategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncategoriaActionPerformed(evt);
            }
        });
        rSPanelGradiente1.add(btncategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 220, 40));

        btnUMM.setBackground(new java.awt.Color(204, 204, 255));
        btnUMM.setForeground(new java.awt.Color(0, 0, 0));
        btnUMM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_munus/iconfinder_MUE_1175284.png"))); // NOI18N
        btnUMM.setText("Unidad Medida");
        btnUMM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUMMActionPerformed(evt);
            }
        });
        rSPanelGradiente1.add(btnUMM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 220, 40));

        btnEFM.setBackground(new java.awt.Color(204, 204, 255));
        btnEFM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_munus/iconfinder_receipt_3339034.png"))); // NOI18N
        btnEFM.setText("Estado Factura ");
        btnEFM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEFMActionPerformed(evt);
            }
        });
        rSPanelGradiente1.add(btnEFM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 220, 40));

        btnEUM.setBackground(new java.awt.Color(204, 204, 255));
        btnEUM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_munus/iconfinder_group-customers-team-contacts-family_3209291.png"))); // NOI18N
        btnEUM.setText("Estado Usuario");
        btnEUM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEUMActionPerformed(evt);
            }
        });
        rSPanelGradiente1.add(btnEUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 220, 40));

        btnTRM.setBackground(new java.awt.Color(204, 204, 255));
        btnTRM.setForeground(new java.awt.Color(0, 0, 0));
        btnTRM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_munus/iconfinder_git-pull-request_298789.png"))); // NOI18N
        btnTRM.setText("Tipo Reclamo");
        btnTRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTRMActionPerformed(evt);
            }
        });
        rSPanelGradiente1.add(btnTRM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 220, -1));

        btnERM1.setBackground(new java.awt.Color(204, 204, 255));
        btnERM1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_munus/iconfinder_git-pull-request_298789.png"))); // NOI18N
        btnERM1.setText("Estado Reclamo");
        btnERM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnERM1ActionPerformed(evt);
            }
        });
        rSPanelGradiente1.add(btnERM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 220, -1));

        getContentPane().add(rSPanelGradiente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 248, 790));

        rSPanelGradiente3.setColorPrimario(new java.awt.Color(153, 255, 204));
        rSPanelGradiente3.setColorSecundario(new java.awt.Color(51, 102, 255));
        rSPanelGradiente3.setGradiente(rspanelgradiente.RSPanelGradiente.Gradiente.ESQUINA_4);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/claros/x64-home.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/claros/x64-grafica.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/claros/x64-clock.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/claros/x64-usuario.png"))); // NOI18N

        rSButtonCircle1.setBackground(new java.awt.Color(255, 0, 0));
        rSButtonCircle1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_munus/iconfinder_close_981077.png"))); // NOI18N
        rSButtonCircle1.setContentAreaFilled(true);
        rSButtonCircle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonCircle1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rSPanelGradiente3Layout = new javax.swing.GroupLayout(rSPanelGradiente3);
        rSPanelGradiente3.setLayout(rSPanelGradiente3Layout);
        rSPanelGradiente3Layout.setHorizontalGroup(
            rSPanelGradiente3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelGradiente3Layout.createSequentialGroup()
                .addContainerGap(703, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rSButtonCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        rSPanelGradiente3Layout.setVerticalGroup(
            rSPanelGradiente3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rSPanelGradiente3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSButtonCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rSPanelGradiente3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(rSPanelGradiente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 1110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTFMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTFMActionPerformed
        new CambiaPanel (Contenedor, new MantenimientoTipoFactura());
    }//GEN-LAST:event_btnTFMActionPerformed

    private void btnTUMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTUMActionPerformed
        // TODO add your handling code here:
        new CambiaPanel(Contenedor, new MantenimientoTipoUsuario());
    }//GEN-LAST:event_btnTUMActionPerformed

    private void btnPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPMActionPerformed
        // TODO add your handling code here:
        new CambiaPanel(Contenedor, new MantenimientoPresentacion());
    }//GEN-LAST:event_btnPMActionPerformed

    private void btnUMMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUMMActionPerformed
        // TODO add your handling code here:
        new CambiaPanel(Contenedor, new MantenimientoUnidadMedida());       
    }//GEN-LAST:event_btnUMMActionPerformed

    private void btnEFMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEFMActionPerformed

        new CambiaPanel(Contenedor, new MantenimientoEstadoFactura());
    }//GEN-LAST:event_btnEFMActionPerformed

    private void btnEUMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEUMActionPerformed
        // TODO add your handling code here:
        new CambiaPanel(Contenedor, new MantenimientoEstadoUsuario());
    }//GEN-LAST:event_btnEUMActionPerformed

    private void btnTRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTRMActionPerformed
        // TODO add your handling code here:
         new CambiaPanel(Contenedor, new MantenimientoTipoReclamo());
    }//GEN-LAST:event_btnTRMActionPerformed

    private void btncategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncategoriaActionPerformed
        new CambiaPanel(Contenedor, new MantenimientoCategoria());
    }//GEN-LAST:event_btncategoriaActionPerformed

    private void rSButtonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonCircle1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
       Menu_admin c = new Menu_admin();
       c.setVisible(true);
        
    }//GEN-LAST:event_rSButtonCircle1ActionPerformed

    private void btnTPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTPMActionPerformed
        // TODO add your handling code here:
        new CambiaPanel(Contenedor,new MantenimientoTipoPago());
    }//GEN-LAST:event_btnTPMActionPerformed

    private void btnERM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnERM1ActionPerformed
        new CambiaPanel(Contenedor, new MantenimientoEstadoReclamo());
    }//GEN-LAST:event_btnERM1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_mantenimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_mantenimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_mantenimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_mantenimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_mantenimientos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private rojerusan.RSButtonIconD btnEFM;
    private rojerusan.RSButtonIconD btnERM1;
    private rojerusan.RSButtonIconD btnEUM;
    private rojerusan.RSButtonIconD btnPM;
    private rojerusan.RSButtonIconD btnTFM;
    private rojerusan.RSButtonIconD btnTPM;
    private rojerusan.RSButtonIconD btnTRM;
    private rojerusan.RSButtonIconD btnTUM;
    private rojerusan.RSButtonIconD btnUMM;
    private rojerusan.RSButtonIconD btncategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private rojerusan.RSButtonCircle rSButtonCircle1;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente1;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente3;
    // End of variables declaration//GEN-END:variables
}
