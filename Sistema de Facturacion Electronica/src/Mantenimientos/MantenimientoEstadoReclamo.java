
package Mantenimientos;

import Clases.Llenar_Tablas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import rojerusan.RSNotifyFade;

/**Metodo para la conexion del mantenimiento con su clase **/
public class MantenimientoEstadoReclamo extends javax.swing.JPanel {
    Clases.Llenar_Tablas con = new Llenar_Tablas();
    Clases.Conexion cn = new Clases.Conexion();

    public MantenimientoEstadoReclamo() {
        initComponents();
        showTableData();
        jLabel10.setVisible(false);
        txtId_cliente.setVisible(false);
        txtId_cliente.setEnabled(false);
        txtId_cliente.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void showTableData(){
    try{
        String sql = "select estado_reclamo as \"Nombre\" From estado_reclamo where id_estado = 1";
        PreparedStatement ps = cn.Conectar().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();   
        Tabla_cliente.setModel(DbUtils.resultSetToTableModel(rs));         
    }
    
    
    catch(SQLException ex){
    JOptionPane.showMessageDialog(null, ex);
    }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombre_usuario = new javax.swing.JTextField();
        txtId_cliente = new javax.swing.JTextField();
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
        jLabel1.setText("Estado Reclamo");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txtNombre_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombre_usuarioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombre_usuarioKeyTyped(evt);
            }
        });
        add(txtNombre_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 170, 30));
        add(txtId_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 34, -1));

        jLabel10.setText("ID");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

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
        add(txt_buscar_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 148, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Nombre:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AgregarMouseClicked

        if (txtNombre_usuario.getText().equals(""))
                    {

           new rojerusan.RSNotifyFade("INFORMATION","Para agregar un mantenimiento, no debe de haber campos vacios",7,RSNotifyFade.PositionNotify.BottomRight,RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
        }
        else{
            ClasesMetodos.MetodosEstadoReclamo obj = new ClasesMetodos.MetodosEstadoReclamo();
            obj.setNombre(txtNombre_usuario.getText());           
            if(obj.AgregarTipoFactura()){
                new rojerusan.RSNotifyFade("CORRECTO","Mantenimiento agregado correctamente",7,RSNotifyFade.PositionNotify.BottomRight,RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                showTableData();
            }else{
                new rojerusan.RSNotifyFade("ERROR","Error al guardar datos",7,RSNotifyFade.PositionNotify.TopLef,RSNotifyFade.TypeNotify.ERROR).setVisible(true);
            }
        }
    }//GEN-LAST:event_btn_AgregarMouseClicked

    private void btn_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseClicked
        ClasesMetodos.MetodosEstadoReclamo obj = new ClasesMetodos.MetodosEstadoReclamo();
        if(txtId_cliente.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Para eliminar un mantenimiento, seleccione el mantenimiento a eliminar en la tabla");
        }else {
            obj.setId(Integer.parseInt(txtId_cliente.getText()));
            int eliminar = JOptionPane.showConfirmDialog(this, "¿Desea eliminar el mantenimiento?", "Precacución", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(eliminar == 0){
                if(obj.EliminarTipoFactura()){
                    new rojerusan.RSNotifyFade("CORRECTO","Mantenimiento elimado correctamente",7,RSNotifyFade.PositionNotify.BottomRight,RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                    showTableData();
                }else{
                    new rojerusan.RSNotifyFade("ERROR","Error al eliminar estado reclamo ",7,RSNotifyFade.PositionNotify.TopLef,RSNotifyFade.TypeNotify.ERROR).setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_btn_eliminarMouseClicked

    private void btn_actualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_actualizarMouseClicked
        if (txtNombre_usuario.getText().equals(""))
        {

            new rojerusan.RSNotifyFade("INFORMATION","Para modificar un mantenimiento, no debe de haber campos vacios",7,RSNotifyFade.PositionNotify.BottomRight,RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
        }
        else{
                 ClasesMetodos.MetodosEstadoReclamo obj = new ClasesMetodos.MetodosEstadoReclamo();
                obj.setNombre(txtNombre_usuario.getText());
                obj.setId(Integer.parseInt(txtId_cliente.getText()));
                if(obj.ModificarTipoFactura()){
                    new rojerusan.RSNotifyFade("CORRECTO","Mantenimiento modificado correctamente",7,RSNotifyFade.PositionNotify.BottomRight,RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                    showTableData();
                }else{
                    new rojerusan.RSNotifyFade("ERROR","Error al modificar datos",7,RSNotifyFade.PositionNotify.TopLef,RSNotifyFade.TypeNotify.ERROR).setVisible(true);
                }
            }
    }//GEN-LAST:event_btn_actualizarMouseClicked

    private void btn_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscarMouseClicked
       ClasesMetodos.MetodosEstadoReclamo obj = new ClasesMetodos.MetodosEstadoReclamo();
        if (txt_buscar_nombre.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Nombre vacio, Para realizar una busqueda inserte el nombre del cliente");
        }else {
            obj.setNombre(txt_buscar_nombre.getText());
            if(obj.BuscarTipoFactura(obj)){              
                txtNombre_usuario.setText(obj.getNombre());             
            } else {
               new rojerusan.RSNotifyFade("ERROR","No se ha podido encontrar el estado reclamo",7,RSNotifyFade.PositionNotify.TopLef,RSNotifyFade.TypeNotify.ERROR).setVisible(true);
            }
        }
    }//GEN-LAST:event_btn_buscarMouseClicked

    private void Tabla_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_clienteMouseClicked
     try{
            int row = Tabla_cliente.getSelectedRow();
            String Table_click=(Tabla_cliente.getModel().getValueAt(row, 0).toString());
            String sql= "select id_estado_reclamo as \"Id\", estado_reclamo as \"Nombre\" From estado_reclamo where estado_reclamo = '"+Table_click+"' ";
            PreparedStatement ps = cn.Conectar().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
            String add1 = rs.getString("Id");
            txtId_cliente.setText(add1);
            String add2 = rs.getString("Nombre");
            txtNombre_usuario.setText(add2);
                     
            }
        }catch(Exception e){
     System.out.println(e.toString());
    }
    }//GEN-LAST:event_Tabla_clienteMouseClicked

    private void txtNombre_usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre_usuarioKeyPressed
        
    }//GEN-LAST:event_txtNombre_usuarioKeyPressed

    private void txtNombre_usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre_usuarioKeyTyped
        char car = evt.getKeyChar();
        if (Character.isLetter(car) || Character.isDigit(car)|| Character.isWhitespace(car)) {

        } else {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtNombre_usuarioKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla_cliente;
    private javax.swing.JLabel btn_Agregar;
    private javax.swing.JLabel btn_actualizar;
    private javax.swing.JLabel btn_buscar;
    private javax.swing.JLabel btn_eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtId_cliente;
    private javax.swing.JTextField txtNombre_usuario;
    private javax.swing.JTextField txt_buscar_nombre;
    // End of variables declaration//GEN-END:variables
}
