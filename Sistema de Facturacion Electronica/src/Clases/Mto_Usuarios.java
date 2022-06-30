
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mto_Usuarios {
    private Connection cn;
    private Integer id_usuario;
    private String usuario;
    private String nombre_usuario;
    private String apellido_usuario;
    private String contrasena_usuario;
    private String email_usuario;
    private Integer dui_usuario;
    private Integer telefono_usuario;
    private Integer id_tipo;
    private String id_tipo_igualando;

    /**
     * @return the cn
     */
    public Connection getCn() {
        return cn;
    }

    /**
     * @param cn the cn to set
     */
    public void setCn(Connection cn) {
        this.cn = cn;
    }
    
    /**
     * @return the id_usuario
     */
    public Integer getId_usuario() {
        return id_usuario;
    }

    /**
     * @param id_usuario the id_usuario to set
     */
    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }
    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the nombre_usuario
     */
    public String getNombre_usuario() {
        return nombre_usuario;
    }

    /**
     * @param nombre_usuario the nombre_usuario to set
     */
    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    /**
     * @return the apellido_usuario
     */
    public String getApellido_usuario() {
        return apellido_usuario;
    }

    /**
     * @param apellido_usuario the apellido_usuario to set
     */
    public void setApellido_usuario(String apellido_usuario) {
        this.apellido_usuario = apellido_usuario;
    }

    /**
     * @return the contrasena_usuario
     */
    public String getContrasena_usuario() {
        return contrasena_usuario;
    }

    /**
     * @param contrasena_usuario the contrasena_usuario to set
     */
    public void setContrasena_usuario(String contrasena_usuario) {
        this.contrasena_usuario = contrasena_usuario;
    }

    /**
     * @return the email_usuario
     */
    public String getEmail_usuario() {
        return email_usuario;
    }

    /**
     * @param email_usuario the email_usuario to set
     */
    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    /**
     * @return the dui_usuario
     */
    public Integer getDui_usuario() {
        return dui_usuario;
    }

    /**
     * @param dui_usuario the dui_usuario to set
     */
    public void setDui_usuario(Integer dui_usuario) {
        this.dui_usuario = dui_usuario;
    }

    /**
     * @return the telefono_usuario
     */
    public Integer getTelefono_usuario() {
        return telefono_usuario;
    }

    /**
     * @param telefono_usuario the telefono_usuario to set
     */
    public void setTelefono_usuario(Integer telefono_usuario) {
        this.telefono_usuario = telefono_usuario;
    }

    /**
     * @return the id_tipo
     */
    public Integer getId_tipo() {
        return id_tipo;
    }

    /**
     * @param id_tipo the id_tipo to set
     */
    public void setId_tipo(Integer id_tipo) {
        this.id_tipo = id_tipo;
    }

    /**
     * @return the id_tipo_igualando
     */
    public String getId_tipo_igualando() {
        return id_tipo_igualando;
    }

    /**
     * @param id_tipo_igualando the id_tipo_igualando to set
     */
    public void setId_tipo_igualando(String id_tipo_igualando) {
        this.id_tipo_igualando = id_tipo_igualando;
    }
    
    public Mto_Usuarios() {
        Conexion con = new Conexion();
        cn = con.Conectar();
    }
    
    public Boolean GuardarUsuario() {
        boolean resp = false;
        try{
            String sql = "insert into usuario (usuario, nombre_usuario, apellido_usuario, contrasena_usuario, "
                    + "email_usuario, dui_usuario, telefono_usuario, id_tipo, id_estado)"
            +"values (?, ?, ?, ?, ?, ?, ?, ?, 1)";
            PreparedStatement cmd = cn.prepareStatement(sql);              
            cmd.setString(1, usuario);
            cmd.setString(2, nombre_usuario);
            cmd.setString(3, apellido_usuario);           
            cmd.setString(4, contrasena_usuario);
            cmd.setString(5, email_usuario);
            cmd.setInt(6, dui_usuario);
            cmd.setInt(7, telefono_usuario);
            cmd.setInt(8, id_tipo);
            if(!cmd.execute()){
                resp = true;
            }         
            cmd.close();
            cn.close();
        }
        catch (SQLException e) {
            System.out.println(e.toString());
        }
        return resp;
    }
    
    public Boolean ModificarUsuario() {
        boolean resp = false;
        try{
            String sql = "update usuario set usuario = ?, nombre_usuario = ?, apellido_usuario = ?, contrasena_usuario = ?, "
                    + "email_usuario = ?, dui_usuario = ?, telefono_usuario = ?, id_tipo = ? where id_usuario = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);              
            cmd.setString(1, usuario);
            cmd.setString(2, nombre_usuario);
            cmd.setString(3, apellido_usuario);           
            cmd.setString(4, contrasena_usuario);
            cmd.setString(5, email_usuario);
            cmd.setInt(6, dui_usuario);
            cmd.setInt(7, telefono_usuario);
            cmd.setInt(8, id_tipo);
            cmd.setInt(9, id_usuario);
            if(!cmd.execute()){
                resp = true;
            }           
            cmd.close();
            cn.close();
        }
        catch (SQLException e) {
            System.out.println(e.toString());
        }
        return resp;
    }
    
    public Boolean EliminarUsuario() {
        boolean resp = false;
        try{
            String sql = "update usuario set id_estado = 2 where id_usuario = ?";
    
            PreparedStatement cmd = cn.prepareStatement (sql);
            cmd.setInt(1, id_usuario);
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
    
    public Boolean ConsultarProducto() {
        boolean resp = false;
        try {
            String sql = "select id_usuario, usuario as \"Usuario\", contrasena_usuario as \"Contrasena\", "
                    + "tipo_usuario as \"Tipo Usuario\", nombre_usuario as \"Nombre\", apellido_usuario as \"Apellido\","
                    + "  email_usuario as \"Email\", dui_usuario as \"Dui\", telefono_usuario as \"Telefono\" "
                    + "from usuario, tipo_usuario, estado where usuario.id_tipo=tipo_usuario.id_tipo and "
                    + "estado.id_estado = 1 and usuario.usuario = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, usuario);
            ResultSet rs = cmd.executeQuery();
            if (rs.next())
            {               
                resp = true;
                id_usuario = rs.getInt(1);
                usuario = rs.getString(2);
                contrasena_usuario = rs.getString(3);
                id_tipo_igualando = rs.getString(4);
                nombre_usuario = rs.getString(5);
                apellido_usuario = rs.getString(6);
                email_usuario = rs.getString(7);
                dui_usuario = rs.getInt(8);
                telefono_usuario = rs.getInt(9);  
            }
            cmd.close();
            cn.close();
        }catch (Exception e){
            System.out.println(e.toString());
        }
        return resp;
    }
    
    public boolean esEmail(String correo){   
        Pattern pattern = Pattern.compile("^[_A-Za-z-0-9-\\+]+(\\.[_A-Za-z-0-9-]+)*@"+"[_A-Za-z-0-9-]+(\\.[_A-Za-z-0-9-]+)*(\\.[A-Za-z]{2,})$");    
        Matcher matcher = pattern.matcher(correo);
        return matcher.find();
    }
    
}
