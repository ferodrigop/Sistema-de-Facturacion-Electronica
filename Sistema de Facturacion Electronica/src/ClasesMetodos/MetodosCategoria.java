/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesMetodos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Luis
 */
public class MetodosCategoria {
    
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
     * Metodo para obtener la descripcion del producto*
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
    /**
     * Metodo para el estado en el que se encuentra la factura*
     */
    public MetodosCategoria() {
        Clases.Conexion con = new Clases.Conexion();
        Cn = con.Conectar();
    }

    /**
     * Metodo para agregar un tipo de factura*
     */
    public boolean AgregarTipoFactura() {
        boolean resp = false;
        try {
            String sql = "INSERT INTO categoria (nombre_categoria, descripcion_categoria, id_estado) VALUES (?,?, 1)";
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
            String sql = "update categoria set id_estado = 3 where id_categoria = ?";
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
     * Metodo para modificar el tipo de factura*
     */
    public boolean ModificarTipoFactura() {
        boolean resp = false;
        try {
            String sql = "UPDATE categoria SET nombre_categoria = ?, descripcion_categoria = ? WHERE id_categoria = ?";
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
     * Metodo para Buscar un factura por si tipo*
     */
    public boolean BuscarTipoFactura(ClasesMetodos.MetodosCategoria o) {
        boolean resp = false;
        try {
            String sql = "select * from categoria where nombre_categoria = ?";
            PreparedStatement cmd = Cn.prepareStatement(sql);
            cmd.setString(1, Nombre);
            ResultSet rs = cmd.executeQuery();
            if (rs.next()) {
                resp = true;
                Id = rs.getInt(1);
                Nombre = rs.getString(3);
                Descripcion = rs.getString(4);
            }
            cmd.close();
            Cn.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return resp;
    }

}
