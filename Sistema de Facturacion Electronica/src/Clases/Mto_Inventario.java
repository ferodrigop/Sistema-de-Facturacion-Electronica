package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

public class Mto_Inventario {

    private Connection cn;
    private Integer id_producto;
    private String imagen;
    private String Codigo_barras;
    private String nombre;
    private String descripcion;
    private Integer Stock_minimo;
    private Integer Stock_activo;
    private Double Valor_stock;
    private Double Precio_venta;
    private Integer Presentacion;
    private String Presentacion_igualando;
    private Integer Unidad;
    private String Unidad_igualando;
    private Integer usuario;
    private String usuario_igualando;
    private Integer categoria;
    private String categoria_igualando;
    private Integer estado;
    private String estado_igualando;

    public Connection getCn() {
        return cn;
    }

    /**
     * @param cn the cn to set
     */
    public void setCn(Connection cn) {
        this.cn = cn;
    }

    /**
     * @return the id_producto
     */
    public Integer getId_producto() {
        return id_producto;
    }

    /**
     * @param id_producto the id_producto to set
     */
    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    /**
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    /**
     * @return the Codigo_barras
     */
    public String getCodigo_barras() {
        return Codigo_barras;
    }

    /**
     * @param Codigo_barras the Codigo_barras to set
     */
    public void setCodigo_barras(String Codigo_barras) {
        this.Codigo_barras = Codigo_barras;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the Valor_stock
     */
    public Double getValor_stock() {
        return Valor_stock;
    }

    /**
     * @param Valor_stock the Valor_stock to set
     */
    public void setValor_stock(Double Valor_stock) {
        this.Valor_stock = Valor_stock;
    }

    public Double getPrecio_venta() {
        return Precio_venta;
    }

    /**
     * @return the Stock_minimo
     */
    public Integer getStock_minimo() {
        return Stock_minimo;
    }

    /**
     * @param Stock_minimo the Stock_minimo to set
     */
    public void setStock_minimo(Integer Stock_minimo) {
        this.Stock_minimo = Stock_minimo;
    }

    /**
     * @return the Stock_activo
     */
    public Integer getStock_activo() {
        return Stock_activo;
    }

    /**
     * @return the Unidad_igualando
     */
    public String getUnidad_igualando() {
        return Unidad_igualando;
    }

    /**
     * @param Unidad_igualando the Unidad_igualando to set
     */
    public void setUnidad_igualando(String Unidad_igualando) {
        this.Unidad_igualando = Unidad_igualando;
    }

    /**
     * @param Stock_activo the Stock_activo to set
     */
    public void setStock_activo(Integer Stock_activo) {
        this.Stock_activo = Stock_activo;
    }

    /**
     * @param Precio_venta the Precio_venta to set
     */
    public void setPrecio_venta(Double Precio_venta) {
        this.Precio_venta = Precio_venta;
    }

    /**
     * @return the Presentacion
     */
    public Integer getPresentacion() {
        return Presentacion;
    }

    /**
     * @param Presentacion the Presentacion to set
     */
    public void setPresentacion(Integer Presentacion) {
        this.Presentacion = Presentacion;
    }

    /**
     * @return the Unidad
     */
    public Integer getUnidad() {
        return Unidad;
    }

    /**
     * @param Unidad the Unidad to set
     */
    public void setUnidad(Integer Unidad) {
        this.Unidad = Unidad;
    }

    /**
     * @return the usuario
     */
    public Integer getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Integer usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the usuario_igualando
     */
    public String getUsuario_igualando() {
        return usuario_igualando;
    }

    /**
     * @param usuario_igualando the usuario_igualando to set
     */
    public void setUsuario_igualando(String usuario_igualando) {
        this.usuario_igualando = usuario_igualando;
    }

    /**
     * @return the categoria
     */
    public Integer getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the categoria_igualando
     */
    public String getCategoria_igualando() {
        return categoria_igualando;
    }

    /**
     * @param categoria_igualando the categoria_igualando to set
     */
    public void setCategoria_igualando(String categoria_igualando) {
        this.categoria_igualando = categoria_igualando;
    }

    /**
     * @return the estado
     */
    public Integer getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    /**
     * @return the estado_igualando
     */
    public String getEstado_igualando() {
        return estado_igualando;
    }

    /**
     * @param estado_igualando the estado_igualando to set
     */
    public void setEstado_igualando(String estado_igualando) {
        this.estado_igualando = estado_igualando;
    }

    public Mto_Inventario() {
        Conexion con = new Conexion();
        cn = con.Conectar();
    }

    public Boolean GuardarProducto() {
        boolean resp = false;
        try {
            String sql = "insert into producto (codigo_barras, nombre_producto, descripcion_producto, stock_activo, "
                    + "stock_minimo, precio_venta_producto, id_presentacion_producto, id_unidad_producto, id_categoria, id_estado)"
                    + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, 1)";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, Codigo_barras);
            cmd.setString(2, nombre);
            cmd.setString(3, descripcion);
            cmd.setInt(4, Stock_activo);
            cmd.setInt(5, Stock_minimo);
            cmd.setDouble(6, Precio_venta);
            cmd.setInt(7, Presentacion);
            cmd.setInt(8, Unidad);
            cmd.setInt(9, categoria);
            if (!cmd.execute()) {
                resp = true;
            }

            cmd.close();
            cn.close();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return resp;
    }

    public Boolean ModificarProducto() {
        boolean resp = false;
        try {
            String sql = "update producto set codigo_barras = ?, nombre_producto = ?, "
                    + "descripcion_producto = ?, stock = ?, precio_venta_producto = ?, presentacion = ?, "
                    + "unidad = ?, id_categoria = ? where id_producto = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, Codigo_barras);
            cmd.setString(2, nombre);
            cmd.setString(3, descripcion);
            cmd.setInt(4, Stock_activo);
            cmd.setInt(5, Stock_minimo);
            cmd.setDouble(6, Precio_venta);
            cmd.setInt(7, Presentacion);
            cmd.setInt(8, Unidad);
            cmd.setInt(9, categoria);
            cmd.setInt(10, id_producto);
            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();
            cn.close();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return resp;
    }

    public Boolean EliminarProducto() {
        boolean resp = false;
        try {
            String sql = "update producto set id_estado = 2 where id_producto = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1, id_producto);
            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();
            cn.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return resp;
    }

    public Boolean ConsultarProducto() {
        boolean resp = false;
        try {
            String sql = "select id_producto, codigo_barras as \"Codigo de Barras\", nombre_producto as \"Producto\", "
                    + "descripcion_producto as \"Descripcion\", precio_venta_producto as \"Precio\", "
                    + "stock_activo as \"Stock\", valor_stock as \"Valor del Stock\", stock_minimo as \"Stock Minímo\", "
                    + "presentacion_producto as \"Presentación\", unidad_producto as  \"Unidad de Medida\", "
                    + "nombre_categoria as \"Categoria\" from producto, categoria, estado, unidad, presentacion "
                    + "where unidad.id_unidad_producto=producto.id_unidad_producto and "
                    + "producto.id_presentacion_producto=presentacion.id_presentacion_producto and "
                    + "producto.id_categoria=categoria.id_categoria and producto.id_estado=estado.id_estado and "
                    + "estado.id_estado = 1 and nombre_producto = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, nombre);
            ResultSet rs = cmd.executeQuery();
            if (rs.next()) {
                resp = true;
                id_producto = rs.getInt(1);
                Codigo_barras = rs.getString(2);
                nombre = rs.getString(3);
                descripcion = rs.getString(4);
                Precio_venta = rs.getDouble(5);
                Stock_activo = rs.getInt(6);
                Valor_stock = rs.getDouble(7);
                Stock_minimo = rs.getInt(8);
                Presentacion = rs.getInt(9);
                Unidad = rs.getInt(10);
                categoria_igualando = rs.getString(11);
            }
            cmd.close();
            cn.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return resp;
    }
}
