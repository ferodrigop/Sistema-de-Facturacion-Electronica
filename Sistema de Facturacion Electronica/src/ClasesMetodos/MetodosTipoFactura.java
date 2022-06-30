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
public class MetodosTipoFactura {

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

    public MetodosTipoFactura() {
        Clases.Conexion con = new Clases.Conexion();
        Cn = con.Conectar();
    }

    public boolean AgregarTipoFactura() {
        boolean resp = false;
        try {
            String sql = "INSERT INTO tipo_factura (tipo_factura, id_estado) VALUES (?, 1)";
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

    public boolean EliminarTipoFactura() {
        boolean resp = false;
        try {
            String sql = "update tipo_factura set id_estado = 3 WHERE id_tipo_factura = ?";
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

    public boolean ModificarTipoFactura() {
        boolean resp = false;
        try {
            String sql = "UPDATE tipo_factura SET tipo_factura = ? WHERE id_tipo_factura = ?";
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

    public boolean BuscarTipoFactura(ClasesMetodos.MetodosTipoFactura o) {
        boolean resp = false;
        try {
            String sql = "SELECT * FROM tipo_factura WHERE tipo_factura=? ";
            PreparedStatement cmd = Cn.prepareStatement(sql);
            cmd.setString(1, Nombre);
            ResultSet rs = cmd.executeQuery();
            if (rs.next()) {
                resp = true;
                Id = rs.getInt(1);
                Nombre = rs.getString(2);
            }
            cmd.close();
            Cn.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return resp;
    }    
}
