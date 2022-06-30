
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

 /**Metodo para Registrar Usuarios**/
public class SqlUsuarios extends Conexion{
    
    public boolean registrar(usuarios usr){
    
        PreparedStatement ps=null;
        Connection con= Conexion.Conectar();
        
        String sql = "INSERT INTO usuario(usuario,nombre,apellido,codigo,contrasena,email,dui,telefono,id_tipo,id_estado)VALUES(?,?,?,?,?,?,?,?,?,?))";
        
            try {
                ps= con.prepareStatement(sql);
                ps.setString(1, usr.getUsuario());
                 ps.setString(2, usr.getNombre());
                ps.setString(3, usr.getApellido());
                ps.setString(4, usr.getCodigo());
                ps.setString(5, usr.getContrasena());
                ps.setString(6, usr.getEmail());
                ps.setString(7, usr.getDui());
                ps.setString(8, usr.getTelefono());
                ps.setInt(9, usr.getId_tipo());
                ps.setInt(10, usr.getId_estado());
                ps.execute();
                return true;
                
                
            } catch (SQLException ex) {
                Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }     
    }
     /**Metodo para validar el inicio de sesion por niveles de usuario**/
    public boolean login(usuarios usr){
    
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con= Conexion.Conectar();
        
        String sql = "select usuario, contrasena_usuario FROM usuario WHERE usuario= ?";
        
            try {
                ps= con.prepareStatement(sql);
                ps.setString(1, usr.getUsuario());
                rs=ps.executeQuery();
                
                if(rs.next()){
                    if(usr.getContrasena().equals(rs.getString(2))){
                    return true;
                    }else{
                    return false;
                    }
                
                }
                return false;
                
            } catch (SQLException ex) {
                Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }     
    }
    
     /**Metodo para validar si el usuario existe o no**/
    public int Existencia(String usuario){
    
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con= Conexion.Conectar();
        
        String sql = "select count(id_usuario)FROM usuario WHERE usuario=?";
        
            try {
                ps= con.prepareStatement(sql);
                ps.setString(1, usuario);
                rs=ps.executeQuery();
                
                if(rs.next()){
                return rs.getInt(1);
                }
                return 1;
                
            } catch (SQLException ex) {
                Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                return 1;
            }     
    }
    
    public boolean esEmail(String correo){
    
    Pattern pattern = Pattern.compile("^[_A-Za-z-0-9-\\+]+(\\.[_A-Za-z-0-9-]+)*@"+"[_A-Za-z-0-9-]+(\\.[_A-Za-z-0-9-]+)*(\\.[A-Za-z]{2,})$");
    
    Matcher matcher = pattern.matcher(correo);
    
    return matcher.find();
    }
    
}
