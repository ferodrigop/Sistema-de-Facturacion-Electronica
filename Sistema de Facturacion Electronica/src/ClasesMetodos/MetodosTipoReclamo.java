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
 * Metodo para crear "Metodo tipo reclamo"*
 */
public class MetodosTipoReclamo {

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
     * Metodo para conectar a la clase de tipo reclamo*
     */
    public MetodosTipoReclamo() {
        Clases.Conexion con = new Clases.Conexion();
        Cn = con.Conectar();
    }

    /**
     * Metodo para agregar un tipo de factura*
     */
    public boolean AgregarTipoFactura() {
        boolean resp = false;
        try {
            String sql = "INSERT INTO tipo_reclamo (tipo_r, descripcion_tipor, id_estado) VALUES (?,?,1)";
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
            String sql = "update tipo_reclamo set id_estado = 3  WHERE id_tipo_r = ?";
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
            String sql = "UPDATE tipo_reclamo SET tipo_r = ?, descripcion_tipor = ? WHERE id_tipo_r = ?";
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
    public boolean BuscarTipoFactura(ClasesMetodos.MetodosTipoReclamo o) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM tipo_reclamo WHERE tipo_r =? ";

        try {
            PreparedStatement cmd = Cn.prepareStatement(sql);
            ps = Cn.prepareStatement(sql);
            ps.setString(1, o.getNombre());
            rs = ps.executeQuery();

            if (rs.next()) {
                o.setId(Integer.parseInt(rs.getString("id_tipo_r")));
                o.setNombre(rs.getString("tipo_r"));
                o.setDescripcion(rs.getString("descripcion_tipor"));
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
