
package Clases;

import Clases.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class usuarios {
   
private String usuario;
private String nombre;
private String apellido;
private String codigo;
private String contrasena;
private String email;
private String dui;
private String telefono;
private int id_tipo;
private int id_estado;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }

    public int getId_estado() {
        return id_estado;
    }

    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }

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
    
    

}
