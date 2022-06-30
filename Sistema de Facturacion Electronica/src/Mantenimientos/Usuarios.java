package Mantenimientos;

import Atxy2k.CustomTextField.RestrictedTextField;
import Clases.Llenar_Tablas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


/**Metodo para la conexion del mantenimiento con su clase **/
public class Usuarios extends javax.swing.JPanel {

    Clases.Llenar_Tablas con = new Llenar_Tablas();
    Clases.Conexion cn = new Clases.Conexion();

    public Usuarios() {

        initComponents();
        this.jComboBoxTipo_usuario.setModel(con.obt_tipo_usuario());
        showTableData();
        lblID.setVisible(false);
        txtid_usuario.setVisible(false);
        txtid_usuario.setEnabled(false);
        txtid_usuario.setEditable(false);
        RestrictedTextField restricted = new RestrictedTextField(txtDui);
        restricted.setLimit(9);
        RestrictedTextField restricted1 = new RestrictedTextField(txtTelefono);
        restricted1.setLimit(8);
    }

    @SuppressWarnings("unchecked")
    private void showTableData() {
        try {
            String sql = "select usuario as \"Usuario\", contrasena_usuario as \"Contrasena\", tipo_usuario as \"Tipo Usuario\", nombre_usuario as \"Nombre\", apellido_usuario as \"Apellido\",  email_usuario as \"Email\", dui_usuario as \"Dui\", telefono_usuario as \"Telefono\" from usuario, tipo_usuario, estado where usuario.id_tipo=tipo_usuario.id_tipo and usuario.id_estado=estado.id_estado and estado.id_estado = 1 ";
            PreparedStatement ps = cn.Conectar().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Tabla_Usuarios.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDui = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre_usuario = new javax.swing.JTextField();
        txtApellido_usuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        txtid_usuario = new javax.swing.JTextField();
        jComboBoxTipo_usuario = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Usuarios = new javax.swing.JTable();
        btn_Agregar = new javax.swing.JLabel();
        btn_Modificar = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JLabel();
        btn_limpiar = new javax.swing.JLabel();
        txt_buscar_usuario = new javax.swing.JTextField();
        btn_Buscar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Usuario:");

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });

        txtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });
        txtContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContrasenaKeyTyped(evt);
            }
        });

        jLabel2.setText("Contraseña:");

        txtDui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDuiActionPerformed(evt);
            }
        });
        txtDui.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDuiKeyTyped(evt);
            }
        });

        jLabel3.setText("Dui:");

        jLabel4.setText("Nombre:");

        txtNombre_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre_usuarioActionPerformed(evt);
            }
        });
        txtNombre_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombre_usuarioKeyTyped(evt);
            }
        });

        txtApellido_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellido_usuarioActionPerformed(evt);
            }
        });
        txtApellido_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellido_usuarioKeyTyped(evt);
            }
        });

        jLabel5.setText("Apellidos:");

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        jLabel6.setText("Telefono:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel7.setText("Email:");

        jLabel8.setText("Tipo de Usuario:");

        lblID.setText("ID");

        txtid_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtid_usuarioActionPerformed(evt);
            }
        });

        jComboBoxTipo_usuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxTipo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipo_usuarioActionPerformed(evt);
            }
        });

        Tabla_Usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_Usuarios.getTableHeader().setReorderingAllowed(false);
        Tabla_Usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_UsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla_Usuarios);
        if (Tabla_Usuarios.getColumnModel().getColumnCount() > 0) {
            Tabla_Usuarios.getColumnModel().getColumn(0).setResizable(false);
            Tabla_Usuarios.getColumnModel().getColumn(1).setResizable(false);
            Tabla_Usuarios.getColumnModel().getColumn(3).setResizable(false);
        }

        btn_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/claros/x64-add.png"))); // NOI18N
        btn_Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AgregarMouseClicked(evt);
            }
        });

        btn_Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/claros/x64-update.png"))); // NOI18N
        btn_Modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ModificarMouseClicked(evt);
            }
        });

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/claros/x64-delete.png"))); // NOI18N
        btn_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eliminarMouseClicked(evt);
            }
        });

        btn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/claros/x64-limpiar.png"))); // NOI18N
        btn_limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_limpiarMouseClicked(evt);
            }
        });

        txt_buscar_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_buscar_usuarioKeyTyped(evt);
            }
        });

        btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/claros/x64-buscar.png"))); // NOI18N
        btn_Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_BuscarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(lblID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtid_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDui, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtApellido_usuario)
                                .addComponent(txtNombre_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxTipo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 150, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_Buscar)
                        .addGap(18, 18, 18)
                        .addComponent(txt_buscar_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_limpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Agregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Modificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_eliminar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtApellido_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxTipo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtDui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtid_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblID))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(btn_Buscar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(txt_buscar_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_eliminar)
                                    .addComponent(btn_Modificar)
                                    .addComponent(btn_Agregar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_limpiar)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaActionPerformed

    private void txtDuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDuiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDuiActionPerformed

    private void txtNombre_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre_usuarioActionPerformed

    private void txtApellido_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellido_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellido_usuarioActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtid_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtid_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtid_usuarioActionPerformed

    private void jComboBoxTipo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipo_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipo_usuarioActionPerformed

    private void btn_AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AgregarMouseClicked
        ClaseLogin.Metodos E = new ClaseLogin.Metodos();
        if (txtUsuario.getText().equals("")
                || txtContrasena.getText().equals("")
                || txtDui.getText().equals("")
                || txtNombre_usuario.getText().equals("")
                || txtApellido_usuario.getText().equals("")
                || txtTelefono.getText().equals("")
                || txtEmail.getText().equals("")
                || jComboBoxTipo_usuario.getSelectedItem().toString().equals("Seleccione un tipo de usuario")) {

            JOptionPane.showMessageDialog(this, "Campos vacios");
        } else {
            Clases.Mto_Usuarios obj = new Clases.Mto_Usuarios();
            if (obj.esEmail(txtEmail.getText())) {
                obj.setUsuario(txtUsuario.getText());
                obj.setContrasena_usuario(E.MD5(txtContrasena.getText().trim()));
                obj.setNombre_usuario(txtNombre_usuario.getText().trim());
                obj.setApellido_usuario(txtApellido_usuario.getText().trim());
                obj.setEmail_usuario(txtEmail.getText());
                obj.setTelefono_usuario(Integer.parseInt(txtTelefono.getText()));
                obj.setDui_usuario(Integer.parseInt(txtDui.getText()));
                obj.setId_tipo(Clases.SQL.getExecuteInt("select id_tipo from tipo_usuario where tipo_usuario = ?", jComboBoxTipo_usuario.getSelectedItem().toString()));
                if (obj.GuardarUsuario()) {
                    JOptionPane.showMessageDialog(this, "Datos Guardados");
                    showTableData();
                } else {
                    JOptionPane.showMessageDialog(this, "Error al guardar datos");
                }
            } else {
                JOptionPane.showMessageDialog(null, "el correo electronico no es valido");
            }
        }
    }//GEN-LAST:event_btn_AgregarMouseClicked

    private void btn_ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ModificarMouseClicked
        ClaseLogin.Metodos E = new ClaseLogin.Metodos();
        if (txtUsuario.getText().equals("")
                || txtContrasena.getText().equals("")
                || txtDui.getText().equals("")
                || txtNombre_usuario.getText().equals("")
                || txtApellido_usuario.getText().equals("")
                || txtTelefono.getText().equals("")
                || txtEmail.getText().equals("")
                || jComboBoxTipo_usuario.getSelectedItem().toString().equals("Seleccione un tipo de usuario")) {

            JOptionPane.showMessageDialog(this, "Campos vacios");
        } else {
            Clases.Mto_Usuarios obj = new Clases.Mto_Usuarios();
            obj.setId_usuario(Integer.parseInt(txtid_usuario.getText().trim()));
            obj.setUsuario(txtUsuario.getText().trim());
            obj.setContrasena_usuario(E.MD5(txtContrasena.getText().trim()));
            obj.setNombre_usuario(txtNombre_usuario.getText().trim());
            obj.setApellido_usuario(txtApellido_usuario.getText().trim());
            obj.setEmail_usuario(txtEmail.getText().trim());
            obj.setTelefono_usuario(Integer.parseInt(txtTelefono.getText()));
            obj.setDui_usuario(Integer.parseInt(txtDui.getText()));
            obj.setId_tipo(Clases.SQL.getExecuteInt("select id_tipo from tipo_usuario where tipo_usuario = ?", jComboBoxTipo_usuario.getSelectedItem().toString()));
            if (obj.ModificarUsuario()) {
                JOptionPane.showMessageDialog(this, "Datos modificados");
                showTableData();
            } else {
                JOptionPane.showMessageDialog(this, "Error al modificar datos");
            }
        }
    }//GEN-LAST:event_btn_ModificarMouseClicked

    private void btn_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseClicked
        Clases.Mto_Usuarios obj = new Clases.Mto_Usuarios();
        if (txtid_usuario.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Para eliminar un usuario, seleccione el usuario a eliminar en la tabla");
        } else {
            obj.setId_usuario(Integer.parseInt(txtid_usuario.getText()));
            int eliminar = JOptionPane.showConfirmDialog(this, "¿Desea eliminar el usuario?", "Precacución", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (eliminar == 0) {
                if (obj.EliminarUsuario()) {
                    JOptionPane.showMessageDialog(this, "Usuario eliminado con exito");
                    showTableData();
                } else {
                    JOptionPane.showMessageDialog(this, "Error al eliminar el usuario, consulte con un Administrador");
                }
            }
        }
    }//GEN-LAST:event_btn_eliminarMouseClicked

    private void btn_limpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_limpiarMouseClicked
        txtid_usuario.setText("");
        txtUsuario.setText("");
        txtContrasena.setText("");
        txtDui.setText("");
        txtNombre_usuario.setText("");
        txtApellido_usuario.setText("");
        txtTelefono.setText("");
        txtEmail.setText("");
        jComboBoxTipo_usuario.setSelectedIndex(0);
    }//GEN-LAST:event_btn_limpiarMouseClicked

    private void btn_BuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BuscarMouseClicked
        Clases.Mto_Usuarios obj = new Clases.Mto_Usuarios();
        if (txt_buscar_usuario.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Nombre vacio, Para realizar una busqueda inserte el nombre del usuario");
        } else {
            obj.setUsuario(txt_buscar_usuario.getText());
            if (obj.ConsultarProducto()) {
                txtid_usuario.setText(String.valueOf(obj.getId_usuario()));
                txtUsuario.setText(obj.getUsuario());
                txtContrasena.setText(obj.getContrasena_usuario());
                txtDui.setText(String.valueOf(obj.getDui_usuario()));
                txtNombre_usuario.setText(obj.getNombre_usuario());
                txtApellido_usuario.setText(obj.getApellido_usuario());
                txtTelefono.setText(String.valueOf(obj.getTelefono_usuario()));
                txtEmail.setText(obj.getEmail_usuario());
                jComboBoxTipo_usuario.setSelectedItem(obj.getId_tipo_igualando());
            } else {
                JOptionPane.showMessageDialog(this, "Producto no encontrado");
            }
        }
    }//GEN-LAST:event_btn_BuscarMouseClicked

    private void Tabla_UsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_UsuariosMouseClicked
        try {
            int row = Tabla_Usuarios.getSelectedRow();
            String Table_click = (Tabla_Usuarios.getModel().getValueAt(row, 0).toString());
            String sql = "select id_usuario, usuario as \"Usuario\", contrasena_usuario as \"Contrasena\", tipo_usuario as \"Tipo Usuario\", nombre_usuario as \"Nombre\", apellido_usuario as \"Apellido\",  email_usuario as \"Email\", dui_usuario as \"Dui\", telefono_usuario as \"Telefono\" from usuario, tipo_usuario, estado where usuario.id_tipo=tipo_usuario.id_tipo and usuario.id_estado=estado.id_estado and estado.id_estado = 1 and usuario = '" + Table_click + "' ";
            PreparedStatement ps = cn.Conectar().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String add1 = rs.getString("id_usuario");
                txtid_usuario.setText(add1);
                String add2 = rs.getString("Usuario");
                txtUsuario.setText(add2);
                String add3 = rs.getString("Contrasena");
                txtContrasena.setText(add3);
                String add4 = rs.getString("Tipo Usuario");
                jComboBoxTipo_usuario.setSelectedItem(String.valueOf(add4));
                String add5 = rs.getString("Nombre");
                txtNombre_usuario.setText(add5);
                String add6 = rs.getString("Apellido");
                txtApellido_usuario.setText(add6);
                String add7 = rs.getString("Email");
                txtEmail.setText(add7);
                String add8 = rs.getString("Dui");
                txtDui.setText(add8);
                String add9 = rs.getString("Telefono");
                txtTelefono.setText(add9);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_Tabla_UsuariosMouseClicked

    private void txtDuiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuiKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDuiKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtContrasenaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrasenaKeyTyped
        char car = evt.getKeyChar();
        if (Character.isLetter(car) || Character.isDigit(car)) {

        } else {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtContrasenaKeyTyped

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        char car = evt.getKeyChar();
        if (Character.isLetter(car) || Character.isDigit(car)) {

        } else {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txt_buscar_usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscar_usuarioKeyTyped
        char car = evt.getKeyChar();
        if (Character.isLetter(car) || Character.isDigit(car)) {

        } else {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txt_buscar_usuarioKeyTyped

    private void txtNombre_usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre_usuarioKeyTyped
        char car = evt.getKeyChar();
        if (Character.isLetter(car) || Character.isWhitespace(car)) {
        } else {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtNombre_usuarioKeyTyped

    private void txtApellido_usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellido_usuarioKeyTyped
        char car = evt.getKeyChar();
        if (Character.isLetter(car) || Character.isWhitespace(car)) {
        } else {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtApellido_usuarioKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla_Usuarios;
    private javax.swing.JLabel btn_Agregar;
    private javax.swing.JLabel btn_Buscar;
    private javax.swing.JLabel btn_Modificar;
    private javax.swing.JLabel btn_eliminar;
    private javax.swing.JLabel btn_limpiar;
    private javax.swing.JComboBox<String> jComboBoxTipo_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblID;
    private javax.swing.JTextField txtApellido_usuario;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtDui;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre_usuario;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txt_buscar_usuario;
    private javax.swing.JTextField txtid_usuario;
    // End of variables declaration//GEN-END:variables
}
