package Mantenimientos;

import Clases.*;
import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import Atxy2k.CustomTextField.RestrictedTextField;
import java.text.DecimalFormat;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.JTableUpdateDb;
import rojerusan.RSNotifyFade;

public class Inventario extends javax.swing.JPanel {

    Clases.Llenar_Tablas con = new Llenar_Tablas();
    Clases.Conexion cn = new Clases.Conexion();
/**Metodo para crear el mantenimiento de inventario**/
    public Inventario() {
        initComponents();
        this.txtUnidadmedida.setModel(con.obt_unidad());
        this.txtPresentacion.setModel(con.obt_presentacion());
        this.jComboBox_categoria.setModel(con.obt_categoria());
        showTableData();
        label_id.setVisible(false);
        txt_id_producto.setVisible(false);
        txt_id_producto.setEnabled(false);
        txt_id_producto.setEditable(false);
        RestrictedTextField restricted = new RestrictedTextField(txtCodigodebarras);
        restricted.setLimit(8);
        RestrictedTextField restricted1 = new RestrictedTextField(txtStock_Activo);
        restricted1.setLimit(6);
        RestrictedTextField restricted2 = new RestrictedTextField(txtPrecio);
        restricted2.setLimit(9);
        RestrictedTextField restricted3 = new RestrictedTextField(txtStock_Minimo);
        restricted3.setLimit(6);
    }

    @SuppressWarnings("unchecked")

    private void showTableData() {
        try {
            String sql = "select codigo_barras as \"Codigo de Barras\", nombre_producto as \"Producto\", descripcion_producto as \"Descripcion\", precio_venta_producto as \"Precio\", stock_activo as \"Stock\", valor_stock as \"Valor del Stock\", stock_minimo as \"Stock Minímo\", presentacion_producto as \"Presentación\", unidad_producto as  \"Unidad de Medida\", nombre_categoria as \"Categoria\" from producto, categoria, estado, unidad, presentacion where unidad.id_unidad_producto=producto.id_unidad_producto and producto.id_presentacion_producto=presentacion.id_presentacion_producto and producto.id_categoria=categoria.id_categoria and producto.id_estado=estado.id_estado and estado.id_estado = 1";
            PreparedStatement ps = cn.Conectar().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Tabla_producto.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Inventario = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_producto = new javax.swing.JTable();
        btn_buscar = new javax.swing.JLabel();
        txt_buscar_nombre = new javax.swing.JTextField();
        btn_Agregar = new javax.swing.JLabel();
        btn_actualizar = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JLabel();
        btn_limpiar = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jComboBox_categoria = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_id_producto = new javax.swing.JTextField();
        label_id = new javax.swing.JLabel();
        txtCodigodebarras = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPresentacion = new javax.swing.JComboBox<>();
        txtUnidadmedida = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        txtStock_Minimo = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtStock_Activo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();

        Inventario.setBackground(new java.awt.Color(255, 255, 255));

        Tabla_producto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "Title 2", "Title 3", "Title 4", "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_producto.getTableHeader().setReorderingAllowed(false);
        Tabla_producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_productoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabla_producto);
        if (Tabla_producto.getColumnModel().getColumnCount() > 0) {
            Tabla_producto.getColumnModel().getColumn(0).setResizable(false);
            Tabla_producto.getColumnModel().getColumn(1).setResizable(false);
            Tabla_producto.getColumnModel().getColumn(2).setResizable(false);
            Tabla_producto.getColumnModel().getColumn(3).setResizable(false);
            Tabla_producto.getColumnModel().getColumn(4).setResizable(false);
            Tabla_producto.getColumnModel().getColumn(5).setResizable(false);
            Tabla_producto.getColumnModel().getColumn(6).setResizable(false);
            Tabla_producto.getColumnModel().getColumn(7).setResizable(false);
        }

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/claros/x64-buscar.png"))); // NOI18N
        btn_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_buscarMouseClicked(evt);
            }
        });

        btn_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/claros/x64-add.png"))); // NOI18N
        btn_Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AgregarMouseClicked(evt);
            }
        });

        btn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/claros/x64-update.png"))); // NOI18N
        btn_actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_actualizarMouseClicked(evt);
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

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        jComboBox_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setText("Categoria: ");

        jLabel13.setText("Nombre del producto:");

        jLabel14.setText("Descripción:");

        jLabel16.setText("Precio: $");

        jLabel17.setText("Presentación: ");

        jLabel18.setText("Unidad de medida: ");

        label_id.setText("ID");

        txtCodigodebarras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigodebarrasKeyTyped(evt);
            }
        });

        jLabel1.setText("Codigo de barras:");

        txtPresentacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtUnidadmedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel19.setText("Stock Activo:");

        txtStock_Minimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStock_MinimoActionPerformed(evt);
            }
        });
        txtStock_Minimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStock_MinimoKeyTyped(evt);
            }
        });

        jLabel20.setText("Stock Minímo:");

        txtStock_Activo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStock_ActivoActionPerformed(evt);
            }
        });
        txtStock_Activo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStock_ActivoKeyTyped(evt);
            }
        });

        txtDescripcion.setColumns(20);
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtDescripcion);

        javax.swing.GroupLayout InventarioLayout = new javax.swing.GroupLayout(Inventario);
        Inventario.setLayout(InventarioLayout);
        InventarioLayout.setHorizontalGroup(
            InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InventarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InventarioLayout.createSequentialGroup()
                        .addGroup(InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InventarioLayout.createSequentialGroup()
                                .addComponent(label_id)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_id_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(InventarioLayout.createSequentialGroup()
                                .addComponent(btn_buscar)
                                .addGap(18, 18, 18)
                                .addComponent(txt_buscar_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 444, Short.MAX_VALUE)
                        .addComponent(btn_limpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Agregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_actualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_eliminar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(InventarioLayout.createSequentialGroup()
                        .addGroup(InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(114, 114, 114)
                        .addGroup(InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InventarioLayout.createSequentialGroup()
                                .addGroup(InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtStock_Activo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(InventarioLayout.createSequentialGroup()
                                .addGroup(InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(InventarioLayout.createSequentialGroup()
                                        .addComponent(txtStock_Minimo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InventarioLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel17))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InventarioLayout.createSequentialGroup()
                                        .addComponent(txtCodigodebarras, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                        .addComponent(jLabel18)))
                                .addGap(31, 31, 31)
                                .addGroup(InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPresentacion, 0, 189, Short.MAX_VALUE)
                                    .addComponent(jComboBox_categoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtUnidadmedida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        InventarioLayout.setVerticalGroup(
            InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InventarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStock_Minimo, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addGroup(InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20)
                        .addComponent(jLabel11)))
                .addGap(11, 11, 11)
                .addGroup(InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InventarioLayout.createSequentialGroup()
                        .addGroup(InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel19)
                            .addComponent(txtStock_Activo)
                            .addComponent(txtPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCodigodebarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(txtUnidadmedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_id)
                    .addComponent(txt_id_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InventarioLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_eliminar)
                            .addComponent(btn_actualizar)
                            .addComponent(btn_Agregar)
                            .addComponent(btn_limpiar)
                            .addComponent(btn_buscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InventarioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_buscar_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Inventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Inventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    private void btn_AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AgregarMouseClicked

        if (txtCodigodebarras.getText().equals("")
                || txtNombre.getText().equals("")
                || txtDescripcion.getText().equals("")
                || txtStock_Activo.getText().equals("")
                || txtStock_Minimo.getText().equals("")
                || txtPrecio.getText().equals("")
                || txtPresentacion.getSelectedItem().toString().equals("Seleccione la presentacion del producto")
                || txtUnidadmedida.getSelectedItem().toString().equals("Seleccione la unidad de medida del producto")
                || jComboBox_categoria.getSelectedItem().toString().equals("Seleccione una categoria")) {

            new rojerusan.RSNotifyFade("INFORMATION","Para agregar un producto, no debe de haber campos vacios",7,RSNotifyFade.PositionNotify.BottomRight,RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
        } else {
            Clases.Mto_Inventario obj = new Clases.Mto_Inventario();
            obj.setCodigo_barras(txtCodigodebarras.getText());
            obj.setNombre(txtNombre.getText());
            obj.setDescripcion(txtDescripcion.getText());
            obj.setStock_activo(Integer.parseInt(txtStock_Activo.getText()));
            obj.setStock_minimo(Integer.parseInt(txtStock_Minimo.getText()));
            obj.setPrecio_venta(Double.parseDouble(txtPrecio.getText()));
            obj.setPresentacion(Clases.SQL.getExecuteInt("select id_presentacion_producto from presentacion where presentacion_producto = ?", txtPresentacion.getSelectedItem().toString()));
            obj.setUnidad(Clases.SQL.getExecuteInt("select id_unidad_producto from unidad where unidad_producto = ?", txtUnidadmedida.getSelectedItem().toString()));
            obj.setCategoria(Clases.SQL.getExecuteInt("select id_categoria from categoria where nombre_categoria = ?", jComboBox_categoria.getSelectedItem().toString()));
            if (obj.GuardarProducto()) {
                new rojerusan.RSNotifyFade("CORRECTO","El producto ha sido guardado",7,RSNotifyFade.PositionNotify.BottomRight,RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                showTableData();
            } else {
                JOptionPane.showMessageDialog(this, "Error al modificar datos");
            }
        }
    }//GEN-LAST:event_btn_AgregarMouseClicked
/**Metodo para la accion del mouse de limpiar el campo**/
    private void btn_limpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_limpiarMouseClicked
        txtCodigodebarras.setText("");
        txtNombre.setText("");
        txt_buscar_nombre.setText("");
        txtDescripcion.setText("");
        txtStock_Activo.setText("");
        txtPrecio.setText("");
        txtPresentacion.setSelectedIndex(0);
        txtUnidadmedida.setSelectedIndex(0);
        jComboBox_categoria.setSelectedIndex(0);
    }//GEN-LAST:event_btn_limpiarMouseClicked

    /**Metodo para la accion del mouse de actualizar el campo **/
    private void btn_actualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_actualizarMouseClicked
        if (txtCodigodebarras.getText().equals("")
                || txtNombre.getText().equals("")
                || txtDescripcion.getText().equals("")
                || txtStock_Activo.getText().equals("")
                || txtPrecio.getText().equals("")
                || txtPresentacion.getSelectedItem().toString().equals("Seleccione la presentacion del producto")
                || txtUnidadmedida.getSelectedItem().toString().equals("Seleccione la unidad de medida del producto")
                || jComboBox_categoria.getSelectedItem().toString().equals("Seleccione una categoria")) {

            new rojerusan.RSNotifyFade("INFORMATION","Para actualizar un producto, no debe de haber campos vacios",7,RSNotifyFade.PositionNotify.BottomRight,RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
        } else {
            Clases.Mto_Inventario obj = new Clases.Mto_Inventario();
            obj.setId_producto(Integer.parseInt(txt_id_producto.getText()));
            obj.setCodigo_barras(txtCodigodebarras.getText());
            obj.setNombre(txtNombre.getText());
            obj.setDescripcion(txtDescripcion.getText());
            obj.setStock_activo(Integer.parseInt(txtStock_Activo.getText()));
            obj.setStock_minimo(Integer.parseInt(txtStock_Minimo.getText()));
            obj.setPrecio_venta(Double.parseDouble(txtPrecio.getText()));
            obj.setPresentacion(Clases.SQL.getExecuteInt("select id_presentacion_producto from presentacion where presentacion_producto = ?", txtPresentacion.getSelectedItem().toString()));
            obj.setUnidad(Clases.SQL.getExecuteInt("select id_unidad_producto from unidad where unidad_producto = ?", txtUnidadmedida.getSelectedItem().toString()));
            obj.setCategoria(Clases.SQL.getExecuteInt("select id_categoria from categoria where nombre_categoria = ?", jComboBox_categoria.getSelectedItem().toString()));
            if (obj.ModificarProducto()) {
                new rojerusan.RSNotifyFade("CORRECTO","El producto ha sido guardado",7,RSNotifyFade.PositionNotify.BottomRight,RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                showTableData();
            } else {
                new rojerusan.RSNotifyFade("ERROR","Error al guardar datos",7,RSNotifyFade.PositionNotify.TopLef,RSNotifyFade.TypeNotify.ERROR).setVisible(true);
            }
        }
    }//GEN-LAST:event_btn_actualizarMouseClicked

    /**Metodo para la accion del mouse de eliminar el campo o seleccion **/
    private void btn_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseClicked
        Clases.Mto_Inventario obj = new Clases.Mto_Inventario();
        if (txt_id_producto.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Para eliminar un producto seleccione el producto a eliminar en la tabla");
        } else {
            obj.setId_producto(Integer.parseInt(txt_id_producto.getText()));
            int eliminar = JOptionPane.showConfirmDialog(this, "¿Desea eliminar el producto?", "Precacución", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (eliminar == 0) {
                if (obj.EliminarProducto()) {
                    new rojerusan.RSNotifyFade("CORRECTO","El producto ha sido elimanado con exito",7,RSNotifyFade.PositionNotify.BottomRight,RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                    showTableData();
                } else {
                    new rojerusan.RSNotifyFade("ERROR","No se ha podido elimar el producto",7,RSNotifyFade.PositionNotify.TopLef,RSNotifyFade.TypeNotify.ERROR).setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_btn_eliminarMouseClicked

    /**Metodo para la accion del mouse de byscar en la base de datos **/
    private void btn_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscarMouseClicked
        Clases.Mto_Inventario obj = new Clases.Mto_Inventario();
        if (txt_buscar_nombre.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Nombre vacio, Para realizar una busqueda inserte el nombre del producto");
        } else {
            obj.setNombre(txt_buscar_nombre.getText());
            if (obj.ConsultarProducto()) {
                txt_id_producto.setText(String.valueOf(obj.getId_producto()));
                txtCodigodebarras.setText(String.valueOf(obj.getCodigo_barras()));
                txtNombre.setText(obj.getNombre());
                txtDescripcion.setText(obj.getDescripcion());
                txtStock_Activo.setText(String.valueOf(obj.getStock_activo()));
                txtStock_Minimo.setText(String.valueOf(obj.getStock_minimo()));
                txtPrecio.setText(String.valueOf(obj.getPrecio_venta()));
                txtPresentacion.setSelectedItem(obj.getPresentacion());
                txtUnidadmedida.setSelectedItem(obj.getUnidad());
                jComboBox_categoria.setSelectedItem(obj.getCategoria_igualando());
            } else {
                new rojerusan.RSNotifyFade("ERROR","no se ha encontrado el producto",7,RSNotifyFade.PositionNotify.TopLef,RSNotifyFade.TypeNotify.ERROR).setVisible(true);
            }
        }
    }//GEN-LAST:event_btn_buscarMouseClicked

    private void Tabla_productoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_productoMouseClicked
        try {
            int row = Tabla_producto.getSelectedRow();
            String Table_click = (Tabla_producto.getModel().getValueAt(row, 0).toString());
            String sql = "select id_producto, codigo_barras as \"Codigo de Barras\", nombre_producto as \"Producto\", descripcion_producto as \"Descripcion\", precio_venta_producto as \"Precio\", stock_activo as \"Stock\", valor_stock as \"Valor del Stock\", stock_minimo as \"Stock Minímo\", presentacion_producto as \"Presentación\", unidad_producto as  \"Unidad de Medida\", nombre_categoria as \"Categoria\" from producto, categoria, estado, unidad, presentacion where unidad.id_unidad_producto=producto.id_unidad_producto and producto.id_presentacion_producto=producto.id_presentacion_producto and producto.id_categoria=categoria.id_categoria and producto.id_estado=estado.id_estado and estado.id_estado = 1 and codigo_barras = '" + Table_click + "' ";
            PreparedStatement ps = cn.Conectar().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String add1 = rs.getString("id_producto");
                txt_id_producto.setText(add1);
                String add2 = rs.getString("Codigo de Barras");
                txtCodigodebarras.setText(add2);
                String add3 = rs.getString("Producto");
                txtNombre.setText(add3);
                String add4 = rs.getString("Descripcion");
                txtDescripcion.setText(add4);
                String add5 = rs.getString("Precio");
                txtPrecio.setText(add5);
                String add6 = rs.getString("Stock");
                txtStock_Activo.setText(add6);
                String add7 = rs.getString("Valor del Stock");
                txtStock_Minimo.setText(add7);
                String add8 = rs.getString("Stock Minímo");
                txtStock_Minimo.setText(add8);
                String add9 = rs.getString("Presentación");
                txtPresentacion.setSelectedItem(String.valueOf(add9));
                String add10 = rs.getString("Unidad de Medida");
                txtUnidadmedida.setSelectedItem(String.valueOf(add10));
                String add11 = rs.getString("Categoria");
                jComboBox_categoria.setSelectedItem(String.valueOf(add11));

            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_Tabla_productoMouseClicked

    /**Metodo para capturar el codigo de barras al ser escaneado mas las validaciones de los campos con datos minimos
     y cantidades en inventario**/
    private void txtCodigodebarrasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigodebarrasKeyTyped
        char car = evt.getKeyChar();
        if (Character.isDigit(car)) {
        } else {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtCodigodebarrasKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') & (car < '.' || car > '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyReleased

    }//GEN-LAST:event_txtPrecioKeyReleased

    private void txtStock_MinimoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStock_MinimoKeyTyped
         char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtStock_MinimoKeyTyped

    private void txtStock_MinimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStock_MinimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStock_MinimoActionPerformed

    private void txtStock_ActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStock_ActivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStock_ActivoActionPerformed

    private void txtStock_ActivoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStock_ActivoKeyTyped
         char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtStock_ActivoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char car = evt.getKeyChar();
        if (Character.isLetter(car) || Character.isWhitespace(car)) {
        } else {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        char car = evt.getKeyChar();
        if (Character.isLetter(car) || Character.isWhitespace(car)) {
        } else {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtDescripcionKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Inventario;
    private javax.swing.JTable Tabla_producto;
    private javax.swing.JLabel btn_Agregar;
    private javax.swing.JLabel btn_actualizar;
    private javax.swing.JLabel btn_buscar;
    private javax.swing.JLabel btn_eliminar;
    private javax.swing.JLabel btn_limpiar;
    private javax.swing.JComboBox<String> jComboBox_categoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_id;
    private javax.swing.JTextField txtCodigodebarras;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JComboBox<String> txtPresentacion;
    private javax.swing.JTextField txtStock_Activo;
    private javax.swing.JTextField txtStock_Minimo;
    private javax.swing.JComboBox<String> txtUnidadmedida;
    private javax.swing.JTextField txt_buscar_nombre;
    private javax.swing.JTextField txt_id_producto;
    // End of variables declaration//GEN-END:variables
}
