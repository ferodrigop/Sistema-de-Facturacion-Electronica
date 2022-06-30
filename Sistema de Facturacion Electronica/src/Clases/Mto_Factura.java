package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Mto_Factura {

    private Connection cn;
    private Integer numerodefactura;
    private Integer stock_activo;
    private String codigo_barras;
    private String fecha_factura;
    private Integer id_cliente;
    private Integer id_tpago;
    private Integer id_estado_factura;
    private Integer id_tipo_factura;
    private Double monto;
    private Double impuesto_factura;
    private Double monto_con_imp;
    private Double monto_total;

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    public Integer getNumerodefactura() {
        return numerodefactura;
    }

    public void setNumerodefactura(Integer numerodefactura) {
        this.numerodefactura = numerodefactura;
    }

    public String getCodigo_barras() {
        return codigo_barras;
    }

    public void setCodigo_barras(String codigo_barras) {
        this.codigo_barras = codigo_barras;
    }

    public Integer getStock_activo() {
        return stock_activo;
    }

    public void setStock_activo(Integer stock_activo) {
        this.stock_activo = stock_activo;
    }

    public String getFecha_factura() {
        return fecha_factura;
    }

    public void setFecha_factura(String fecha_factura) {
        this.fecha_factura = fecha_factura;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Integer getId_tpago() {
        return id_tpago;
    }

    public void setId_tpago(Integer id_tpago) {
        this.id_tpago = id_tpago;
    }

    public Integer getId_estado_factura() {
        return id_estado_factura;
    }

    public void setId_estado_factura(Integer id_estado_factura) {
        this.id_estado_factura = id_estado_factura;
    }

    public Integer getId_tipo_factura() {
        return id_tipo_factura;
    }

    public void setId_tipo_factura(Integer id_tipo_factura) {
        this.id_tipo_factura = id_tipo_factura;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Double getImpuesto_factura() {
        return impuesto_factura;
    }

    public void setImpuesto_factura(Double impuesto_factura) {
        this.impuesto_factura = impuesto_factura;
    }

    public Double getMonto_con_imp() {
        return monto_con_imp;
    }

    public void setMonto_con_imp(Double monto_con_imp) {
        this.monto_con_imp = monto_con_imp;
    }

    public Double getMonto_total() {
        return monto_total;
    }

    public void setMonto_total(Double monto_total) {
        this.monto_total = monto_total;
    }

    public Mto_Factura() {
        Conexion con = new Conexion();
        cn = con.Conectar();
    }

    public Boolean NoFactura() {
        boolean resp = false;
        try {
            String sql = "SELECT COUNT(*) FROM factura";
            PreparedStatement cmd = cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            if (rs.next()) {
                resp = true;
                numerodefactura = rs.getInt(1);
                numerodefactura = numerodefactura + 1;
            }
            cmd.close();
            cn.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return resp;
    }

    public Boolean SumarStock() {
        boolean resp = false;
        try {
            String sql = "update producto set stock_activo = stock_activo + ? where codigo_barras = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1, stock_activo);
            cmd.setString(2, codigo_barras);
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

    public Boolean RestarStock() {
        boolean resp = false;
        try {
            String sql = "UPDATE producto SET stock_activo = stock_activo - ? WHERE codigo_barras = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1, stock_activo);
            cmd.setString(2, codigo_barras);
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

    public Boolean InsertarFactura() {
        boolean resp = false;
        try {
            String sql = "insert into factura(fecha_factura, id_cliente, id_tpago, id_estado_factura, "
                    + "id_tipo_factura, monto, impuesto_factura, monto_con_imp, monto_total)\n"
                    + "values(?, ?, ?, 1, ?, ?, ?, ?, ?)";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, fecha_factura);
            cmd.setInt(2, id_cliente);
            cmd.setInt(3, id_tpago);
            cmd.setInt(4, id_tipo_factura);
            cmd.setDouble(5, monto);
            cmd.setDouble(6, impuesto_factura);
            cmd.setDouble(7, monto_con_imp);
            cmd.setDouble(8, monto_total);
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
    
    private Integer id_detalle_factura;
    private Integer id_factura;
    private Integer id_producto;
    private Double precio_venta_detalle;
    private Integer cantidad_vendida;

    /**
     * @return the id_detalle_factura
     */
    public Integer getId_detalle_factura() {
        return id_detalle_factura;
    }

    /**
     * @param id_detalle_factura the id_detalle_factura to set
     */
    public void setId_detalle_factura(Integer id_detalle_factura) {
        this.id_detalle_factura = id_detalle_factura;
    }

    /**
     * @return the id_factura
     */
    public Integer getId_factura() {
        return id_factura;
    }

    /**
     * @param id_factura the id_factura to set
     */
    public void setId_factura(Integer id_factura) {
        this.id_factura = id_factura;
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
     * @return the precio_venta_detalle
     */
    public Double getPrecio_venta_detalle() {
        return precio_venta_detalle;
    }

    /**
     * @param precio_venta_detalle the precio_venta_detalle to set
     */
    public void setPrecio_venta_detalle(Double precio_venta_detalle) {
        this.precio_venta_detalle = precio_venta_detalle;
    }

    /**
     * @return the cantidad_vendida
     */
    public Integer getCantidad_vendida() {
        return cantidad_vendida;
    }

    /**
     * @param cantidad_vendida the cantidad_vendida to set
     */
    public void setCantidad_vendida(Integer cantidad_vendida) {
        this.cantidad_vendida = cantidad_vendida;
    }
    /*insert into detalle_factura
    values (1, 1, 10.99, 100)

    id_detalle_factura int not null primary key identity, 
    id_factura int not null references factura(id_factura),
    id_producto int not null references producto(id_producto),
    precio_venta_detalle numeric(9,2) check(precio_venta_detalle>0),
    cantidad_vendida int not null
    
    private Integer id_detalle_factura;
    private Integer id_factura;
    private Integer id_producto;
    private Double precio_venta_detalle;
    private Integer cantidad_vendida;*/
    
    public Boolean InsertarDetalleFactura() {
        boolean resp = false;
        try {
            String sql = "insert into detalle_factura(id_factura, id_producto, precio_venta_detalle, cantidad_vendida)" 
                         +"values (?, ?, ?, ?)";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1, id_factura);
            cmd.setInt(2, id_producto);
            cmd.setDouble(3, precio_venta_detalle);
            cmd.setInt(4, cantidad_vendida);           
            if (!cmd.execute()) {
                resp = true;
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return resp;
    }
    
    
    public Boolean EliminarProductodeDetalleFactura() {
        boolean resp = false;
        try{
            String sql = "delete from detalle_factura where id_detalle_factura = ?";
    
            PreparedStatement cmd = cn.prepareStatement (sql);
            cmd.setInt(1, id_detalle_factura);
            if(!cmd.execute()){
                resp = true;
            }
            cmd.close();
            cn.close();
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
        return resp;
    }
}
