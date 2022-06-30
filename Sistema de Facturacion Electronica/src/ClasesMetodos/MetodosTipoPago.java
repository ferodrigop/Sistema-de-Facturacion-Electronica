/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesMetodos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Familia Portillo
 */
/**
 * Metodo para agregar el metodo de pago*
 */
public class MetodosTipoPago {

    private Connection Cn;
    private Integer Id;
    private String Nombre;
    private String Descripcion;

    /**
     * @return the Cn
     */
    public Connection getCn() {
        return Cn;
    }

    /**
     * @param Cn the Cn to set
     */
    public void setCn(Connection Cn) {
        this.Cn = Cn;
    }

    /**
     * @return the Id
     */
    public Integer getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * Metodo para hacer la conexion con las tablas *
     */
    public MetodosTipoPago() {
        Clases.Conexion con = new Clases.Conexion();
        Cn = con.Conectar();
    }

    /**
     * Metodo para poder agregar un tipo de factura*
     */
    public boolean AgregarTipoFactura() {
        boolean resp = false;
        try {
            String sql = "INSERT INTO tipo_pago (tipo_pago, detalles, id_estado) VALUES (?,?,1)";
            PreparedStatement cmd = Cn.prepareStatement(sql);
            cmd.setString(1, Nombre);
            cmd.setString(2, Descripcion);
            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();;
            Cn.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return resp;
    }

    /**
     * Metodo para eliminar un tipo de factura*
     */
    public boolean EliminarTipoFactura() {
        boolean resp = false;
        try {
            String sql = "update tipo_pago set id_estado = 3 WHERE id_tpago = ?";
            PreparedStatement cmd = Cn.prepareStatement(sql);
            cmd.setInt(1, Id);
            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();;
            Cn.close();

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return resp;
    }

    /**
     * Metodo para modificar un tipo de factura*
     */
    public boolean ModificarTipoFactura() {
        boolean resp = false;
        try {
            String sql = "UPDATE tipo_pago SET tipo_pago = ?, detalles = ? WHERE id_tpago = ?";
            PreparedStatement cmd = Cn.prepareStatement(sql);

            cmd.setString(1, Nombre);
            cmd.setString(2, Descripcion);
            cmd.setInt(3, Id);

            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();;
            Cn.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return resp;
    }

    /**
     * Metodo para buscar por tipo de factura*
     */
    public boolean BuscarTipoFactura(ClasesMetodos.MetodosTipoPago o) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM tipo_pago WHERE tipo_pago=? ";

        try {
            PreparedStatement cmd = Cn.prepareStatement(sql);
            ps = Cn.prepareStatement(sql);
            ps.setString(1, o.getNombre());
            rs = ps.executeQuery();

            if (rs.next()) {
                o.setId(Integer.parseInt(rs.getString("id_tpago")));
                o.setNombre(rs.getString("tipo_pago"));
                o.setDescripcion(rs.getString("detalles"));
                return true;
            }
            return false;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                Cn.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    /**
     * @return the Descripcion
     */
    /**
     * Metodo para obtener la descripcion de un producto *
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

}
