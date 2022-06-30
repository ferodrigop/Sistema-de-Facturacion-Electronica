/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Fernando
 */
public class SQL {

    private static SQL id;

    public static SQL getId() {
        return id;
    }

    public static void setId(SQL id_consultar) {
        SQL.id = id_consultar;
    }

    static void prepare(PreparedStatement cmd, Object... values) throws SQLException {
        for (int i = 0; i < values.length; i++) {
            cmd.setObject(i + 1, values[i]);
        }
    }
 /**Metodo para obtener el ID de una consulta**/
    public static Integer getExecuteInt(String query, Object... values) {
        ResultSet rs;
        Integer i = -1;
        try {
            Connection Cn = Conexion.Conectar();
            PreparedStatement prepStmt = Cn.prepareStatement(query);
            prepare(prepStmt, values);
            rs = prepStmt.executeQuery();
            if (rs.next()) {
                i = rs.getInt(1);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return i;
    }
}
