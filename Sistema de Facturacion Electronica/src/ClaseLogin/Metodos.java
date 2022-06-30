/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseLogin;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/** metodos get y set 
 * @rutrun the current version
 * @author Samuel Rivera
 */
public class Metodos {

    private Connection Cn;
    private String N_Usuario;
    private String C_Usuario;
    private String T_Usuario = "";
    private String E_Usuario = "";

    public Connection getCn() {
        return Cn;
    }

    public void setCn(Connection Cn) {
        this.Cn = Cn;
    }

    public String getN_Usuario() {
        return N_Usuario;
    }

    public void setN_Usuario(String N_Usuario) {
        this.N_Usuario = N_Usuario;
    }

    public String getC_Usuario() {
        return C_Usuario;
    }

    public void setC_Usuario(String C_Usuario) {
        this.C_Usuario = C_Usuario;
    }

    public String getT_Usuario() {
        return T_Usuario;
    }

    public void setT_Usuario(String T_Usuario) {
        this.T_Usuario = T_Usuario;
    }

    public String getE_Usuario() {
        return E_Usuario;
    }

    public void setE_Usuario(String E_Usuario) {
        this.E_Usuario = E_Usuario;
    }

    public Metodos() {
        Clases.Conexion con = new Clases.Conexion();
        Cn = con.Conectar();
    }

    /** metodo de validaciones
     * @autor Samuel Rivera
     */
    public static String MD5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            String hashtext = number.toString(16);

            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /** metodo para identificar sesion 
     *@autor Rodrigo Pineda
     */
    
    public boolean verificarInicioSecion() {
        boolean resp = false;
        try {
            String sql = "SELECT usuario, contrasena_usuario FROM usuario Where usuario = ? and contrasena_usuario = ?";
            PreparedStatement cmd = Cn.prepareCall(sql);
            cmd.setString(1, N_Usuario);
            cmd.setString(2, C_Usuario);
            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();
            Cn.close();
        } catch (SQLException e) {
        }
        return resp;

    }
    /** metodo para identificar sesion 
     *@autor Rodrigo Pineda
     */
    public void verificarSesionUsuarios(String Usuario, String Contraseña) {
        boolean resp = false;
        try {
            String sql = "Select tipo_usuario,estado FROM usuario "
                    + "INNER JOIN tipo_usuario on usuario.id_tipo=tipo_usuario.id_tipo "
                    + "INNER JOIN estado on usuario.id_estado=estado.id_estado "
                    + "WHERE usuario.usuario = '" + Usuario + "' "
                    + "and usuario.contrasena_usuario ='" + Contraseña + "' ";
            PreparedStatement cmd = Cn.prepareCall(sql);
            ResultSet rs = cmd.executeQuery();
            if (rs.next()) {
                T_Usuario = rs.getString(1);
                E_Usuario = rs.getString(2);
            }
            cmd.close();
            Cn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        obtenerUsuario_Contraseña(Usuario, Contraseña);
    }
  /** metodos para identeficar el usuario y su password 
   *@autor Samuel Rivera
   */
    public void obtenerUsuario_Contraseña(String Usuario, String Contraseña) {
        N_Usuario = Usuario;
        C_Usuario = Contraseña;
    }
}
