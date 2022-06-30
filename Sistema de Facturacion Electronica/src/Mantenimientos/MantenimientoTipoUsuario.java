package Mantenimientos;

import Clases.Llenar_Tablas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import rojerusan.RSNotifyFade;

/**
 * Metodo para la conexion del mantenimiento con su clase *
 */
public class MantenimientoTipoUsuario extends javax.swing.JPanel {

    Clases.Llenar_Tablas con = new Llenar_Tablas();
    Clases.Conexion cn = new Clases.Conexion();

    public MantenimientoTipoUsuario() {
        initComponents();
        showTableData();
        jLabel10.setVisible(false);
        txt_ITU.setVisible(false);
        txt_ITU.setEnabled(false);
        txt_ITU.setEditable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    public void limpiar() {
        txt_ITU.setText("");
        TXTnTU.setText("");
    }

    private void showTableData() {
        try {
            String sql = "select tipo_usuario as \"Nombre\" From tipo_usuario where id_estado = 1";
            PreparedStatement ps = cn.Conectar().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Tabla_cliente.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TXTnTU = new javax.swing.JTextField();
        txt_ITU = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_cliente = new javax.swing.JTable();
        btn_Agregar = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JLabel();
        btn_actualizar = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JLabel();
        txt_buscar_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Tipo Usuario");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        TXTnTU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXTnTUKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTnTUKeyTyped(evt);
            }
        });
        add(TXTnTU, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 170, 30));
        add(txt_ITU, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 34, -1));

        jLabel10.setText("ID");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        Tabla_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabla_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_clienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla_cliente);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 520, 410));

        btn_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/claros/x64-add.png"))); // NOI18N
        btn_Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AgregarMouseClicked(evt);
            }
        });
        add(btn_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, -1, -1));

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/claros/x64-delete.png"))); // NOI18N
        btn_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eliminarMouseClicked(evt);
            }
        });
        add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, -1, -1));

        btn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/claros/x64-update.png"))); // NOI18N
        btn_actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_actualizarMouseClicked(evt);
            }
        });
        add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, -1, -1));

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/claros/x64-buscar.png"))); // NOI18N
        btn_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_buscarMouseClicked(evt);
            }
        });
        add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, -1, -1));

        txt_buscar_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_buscar_nombreKeyTyped(evt);
            }
        });
        add(txt_buscar_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 148, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Nombre:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AgregarMouseClicked

        if (TXTnTU.getText().equals("")) {

            new rojerusan.RSNotifyFade("WARNING", "Para agregar un tipo de usuario, no debe exitir campos vacios", 7, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.WARNING).setVisible(true);
        } else {
            ClasesMetodos.MetodosTipoUsuario obj = new ClasesMetodos.MetodosTipoUsuario();
            obj.setNombre(TXTnTU.getText());

            if (obj.AgregarTipoFactura()) {
                new rojerusan.RSNotifyFade("CORRECTO", "Tipo de usuario guardado correctamente", 7, RSNotifyFade.PositionNotify.TopRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                showTableData();
                limpiar();
            } else {
                new rojerusan.RSNotifyFade("ERROR", "Error al guardar tipo de usuario", 7, RSNotifyFade.PositionNotify.TopLef, RSNotifyFade.TypeNotify.ERROR).setVisible(true);
            }
        }
    }//GEN-LAST:event_btn_AgregarMouseClicked

    private void btn_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseClicked
        ClasesMetodos.MetodosTipoUsuario obj = new ClasesMetodos.MetodosTipoUsuario();
        if (txt_ITU.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Para eliminar un mantenimiento, seleccione el mantenimiento a eliminar en la tabla");
        } else {
            obj.setId(Integer.parseInt(txt_ITU.getText()));
            int eliminar = JOptionPane.showConfirmDialog(this, "¿Desea eliminar el mantenimiento?", "Precacución", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (eliminar == 0) {
                if (obj.EliminarTipoFactura()) {
                    new rojerusan.RSNotifyFade("CORRECTO", "Tipo usuario eliminado correctamente", 7, RSNotifyFade.PositionNotify.TopRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                    showTableData();
                } else {
                    new rojerusan.RSNotifyFade("ERROR", "Error al eliminar tipo de usuario", 7, RSNotifyFade.PositionNotify.TopLef, RSNotifyFade.TypeNotify.ERROR).setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_btn_eliminarMouseClicked

    private void btn_actualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_actualizarMouseClicked
        if (TXTnTU.getText().equals("")) {

            new rojerusan.RSNotifyFade("WARNING", "Para actualizar un tipo de reclamo, no debe exitir campos vacios", 7, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.WARNING).setVisible(true);
        } else {
            ClasesMetodos.MetodosTipoUsuario obj = new ClasesMetodos.MetodosTipoUsuario();
            obj.setNombre(TXTnTU.getText());
            obj.setId(Integer.parseInt(txt_ITU.getText()));
            if (obj.ModificarTipoFactura()) {
                new rojerusan.RSNotifyFade("CORRECTO", "Tipo de usuario modificado correctamente", 7, RSNotifyFade.PositionNotify.TopRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                showTableData();
                limpiar();
            } else {
                new rojerusan.RSNotifyFade("ERROR", "Error al modificar el tipo de cliente", 7, RSNotifyFade.PositionNotify.TopLef, RSNotifyFade.TypeNotify.ERROR).setVisible(true);
            }
        }
    }//GEN-LAST:event_btn_actualizarMouseClicked

    private void btn_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscarMouseClicked
        ClasesMetodos.MetodosTipoUsuario obj = new ClasesMetodos.MetodosTipoUsuario();
        if (txt_buscar_nombre.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Nombre vacio, Para realizar una busqueda inserte el nombre del cliente");
        } else {
            obj.setNombre(txt_buscar_nombre.getText());
            if (obj.BuscarTipoFactura(obj)) {
                TXTnTU.setText(obj.getNombre());
                txt_ITU.setText(String.valueOf(obj.getId()));
            } else {
                new rojerusan.RSNotifyFade("ERROR", "Tipo de usuario no encontrado", 7, RSNotifyFade.PositionNotify.TopLef, RSNotifyFade.TypeNotify.ERROR).setVisible(true);
            }
        }
    }//GEN-LAST:event_btn_buscarMouseClicked

    private void Tabla_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_clienteMouseClicked
        try {
            int row = Tabla_cliente.getSelectedRow();
            String Table_click = (Tabla_cliente.getModel().getValueAt(row, 0).toString());
            String sql = "select id_tipo as \"Id\", tipo_usuario as \"Nombre\" From tipo_usuario where tipo_usuario = '" + Table_click + "' ";
            PreparedStatement ps = cn.Conectar().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String add1 = rs.getString("Id");
                txt_ITU.setText(add1);
                String add2 = rs.getString("Nombre");
                TXTnTU.setText(add2);

            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_Tabla_clienteMouseClicked

    private void TXTnTUKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTnTUKeyPressed

    }//GEN-LAST:event_TXTnTUKeyPressed

    private void TXTnTUKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTnTUKeyTyped
        // TODO add your handling code here:

        char car = evt.getKeyChar();
        if (Character.isLetter(car) || Character.isWhitespace(car)) {
        } else {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_TXTnTUKeyTyped

    private void txt_buscar_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscar_nombreKeyTyped
        // TODO add your handling code here:

        char car = evt.getKeyChar();
        if (Character.isLetter(car) || Character.isWhitespace(car)) {
        } else {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txt_buscar_nombreKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TXTnTU;
    private javax.swing.JTable Tabla_cliente;
    private javax.swing.JLabel btn_Agregar;
    private javax.swing.JLabel btn_actualizar;
    private javax.swing.JLabel btn_buscar;
    private javax.swing.JLabel btn_eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_ITU;
    private javax.swing.JTextField txt_buscar_nombre;
    // End of variables declaration//GEN-END:variables
}