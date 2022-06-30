package Clases;

import ClaseLogin.*;
import Clases.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    /** metodo de conexion 
     * @autor fernando
     */
    
   public static Connection Conectar(){
        Connection cn = null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            /*importar import java.sql.DriverManager; para crear la conexion*/
            cn = DriverManager.getConnection("jdbc:sqlserver://192.168.0.4:1433;"
                    +"databaseName=factura_electronica","fa","123fa");
           /* cn = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-IVULOABT\\SQLEXPRESS;"
            + "databaseName=factura_electronica;integratedSecurity=true;");*/
        }  
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return cn;
    }
}
