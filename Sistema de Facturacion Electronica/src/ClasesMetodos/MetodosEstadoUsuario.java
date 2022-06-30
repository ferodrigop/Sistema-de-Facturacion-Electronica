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
 * Metodo para la conexion de el metodo del estado de usuario*
 */
public class MetodosEstadoUsuario {

    private Connection Cn;
    private Integer Id;
    private String Nombre;

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
     * Metodo para la conexion con el estado usuario*
     */
    public MetodosEstadoUsuario() {
        Clases.Conexion con = new Clases.Conexion();
        Cn = con.Conectar();
    }

    /**
     * Metodo para agregar un tipo de factura*
     */
    public boolean AgregarTipoFactura() {
        boolean resp = false;
        try {
            String sql = "INSERT INTO estado (estado) VALUES (?)";
            PreparedStatement cmd = Cn.prepareStatement(sql);
            cmd.setString(1, Nombre);

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
            String sql = "DELETE FROM estado WHERE id_estado = ?";
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
     * Metodo para modificar factura*
     */
    public boolean ModificarTipoFactura() {
        boolean resp = false;
        try {
            String sql = "UPDATE estado SET estado = ? WHERE id_estado = ?";
            PreparedStatement cmd = Cn.prepareStatement(sql);

            cmd.setString(1, Nombre);
            cmd.setInt(2, Id);

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
     * Metodo para buscar un tipo de factura*
     */
    public boolean BuscarTipoFactura(ClasesMetodos.MetodosEstadoUsuario o) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM estado WHERE estado=? ";

        try {
            PreparedStatement cmd = Cn.prepareStatement(sql);
            ps = Cn.prepareStatement(sql);
            ps.setString(1, o.getNombre());
            rs = ps.executeQuery();

            if (rs.next()) {
                o.setId(Integer.parseInt(rs.getString("id_estado")));
                o.setNombre(rs.getString("estado"));

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

}
