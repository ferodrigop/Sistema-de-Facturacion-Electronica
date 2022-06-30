package Clases;

import Clases.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
/** Metodo para conectar a la base y retornar si no se puede realizar
 
 
 **/
public class Llenar_Tablas {

    public ResultSet consulta(String sql) {
        Connection cn = Conexion.Conectar();
        ResultSet rs = null;
        try {
            PreparedStatement pe = cn.prepareStatement(sql);
            rs = pe.executeQuery();
        } catch (Exception e) {
            System.err.println("Error, no se pueden cargar los datos de la base de datos, consulte con un Administrador" + e.getMessage());
        }
        return rs;
    }

    /** metodo para poder extraer informacion de tablas hijas a padres 
     *@autor rodrigo pineda
     */
    public DefaultComboBoxModel obt_estado() {

        DefaultComboBoxModel jComboBox_categoria = new DefaultComboBoxModel();
        jComboBox_categoria.addElement("Seleccione un estado");
        ResultSet rs = this.consulta("select * from estados");

        try {
            while (rs.next()) {
                jComboBox_categoria.addElement(rs.getString("estado"));
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return jComboBox_categoria;
    }
    /**Metodo para el combobox de la presentacion del producto**/
    public DefaultComboBoxModel obt_presentacion() {

        DefaultComboBoxModel txtPresentacion = new DefaultComboBoxModel();
        txtPresentacion.addElement("Seleccione la presentacion del producto");
        ResultSet rs = this.consulta("select * from presentacion where id_estado = 1");

        try {
            while (rs.next()) {
                txtPresentacion.addElement(rs.getString("presentacion_producto"));
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return txtPresentacion;
    }
     /**Metodo para el combobox de la unidad de medida del producto**/
    public DefaultComboBoxModel obt_unidad() {

        DefaultComboBoxModel txtUnidadmedida = new DefaultComboBoxModel();
        txtUnidadmedida.addElement("Seleccione la unidad de medida del producto");
        ResultSet rs = this.consulta("select * from unidad where id_estado = 1");

        try {
            while (rs.next()) {
                txtUnidadmedida.addElement(rs.getString("unidad_producto"));
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return txtUnidadmedida;
    }
     /**Metodo para el combobox de la categoria del producto**/
    public DefaultComboBoxModel obt_categoria() {

        DefaultComboBoxModel jComboBox_categoria = new DefaultComboBoxModel();
        jComboBox_categoria.addElement("Seleccione una categoria");
        ResultSet rs = this.consulta("select * from categoria where id_estado = 1");

        try {
            while (rs.next()) {
                jComboBox_categoria.addElement(rs.getString("nombre_categoria"));
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return jComboBox_categoria;
    }
 /**Metodo para el combobox del tipo de usuario **/
    public DefaultComboBoxModel obt_tipo_usuario() {

        DefaultComboBoxModel jComboBoxTipo_usuario = new DefaultComboBoxModel();
        jComboBoxTipo_usuario.addElement("Seleccione un tipo de usuario");
        ResultSet rs = this.consulta("select * from tipo_usuario where id_estado = 1");

        try {
            while (rs.next()) {
                jComboBoxTipo_usuario.addElement(rs.getString("tipo_usuario"));
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return jComboBoxTipo_usuario;
    }
 /**Metodo para el combobox del tipo de factura a realizar**/
    public DefaultComboBoxModel obt_tipo_factura() {
        DefaultComboBoxModel jComboBoxTipoFactura = new DefaultComboBoxModel();
        jComboBoxTipoFactura.addElement("Seleccione el tipo de factura");
        ResultSet rs = this.consulta("select * from tipo_factura where id_estado = 1");

        try {
            while (rs.next()) {
                jComboBoxTipoFactura.addElement(rs.getString("tipo_factura"));
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return jComboBoxTipoFactura;
    }
 /**Metodo para el combobox del tipo de pago**/
    public DefaultComboBoxModel obt_tipo_pago() {
        DefaultComboBoxModel jComboBoxTipoPago = new DefaultComboBoxModel();
        jComboBoxTipoPago.addElement("Seleccione una forma de pago");
        ResultSet rs = this.consulta("select * from tipo_pago where id_estado = 1");

        try {
            while (rs.next()) {
                jComboBoxTipoPago.addElement(rs.getString("tipo_pago"));
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return jComboBoxTipoPago;
    }
 /**Metodo para el combobox del cliente**/
    public DefaultComboBoxModel obt_cliente() {
        DefaultComboBoxModel jComboBoxCliente = new DefaultComboBoxModel();
        jComboBoxCliente.addElement("Seleccione a un cliente");
        ResultSet rs = this.consulta("select * from cliente");

        try {
            while (rs.next()) {
                jComboBoxCliente.addElement(rs.getString("nombre_cliente"));
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return jComboBoxCliente;
    }
 /**Metodo para el combobox del codigo de barras del producto**/
    public DefaultComboBoxModel obt_codigobarras() {
        DefaultComboBoxModel jComboBoxCodigoBarras = new DefaultComboBoxModel();
        jComboBoxCodigoBarras.addElement("Seleccione el codigo de barras de un producto");
        ResultSet rs = this.consulta("select * from producto");

        try {
            while (rs.next()) {
                jComboBoxCodigoBarras.addElement(rs.getString("codigo_barras"));
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return jComboBoxCodigoBarras;
    }
}
