package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mto_Clientes {
private Connection cn;    
private Integer id_cliente; 
private String nombre_cliente; 
private String apellidos_cliente;
private String fecha_nacimiento;
private String compania; 
private String direccion1;
private String direccion2; 
private String telefono1; 
private String telefono2; 
private String email_cliente; 
private String nit_c;
private String dui_c;
private String ruc_C ;
private Integer id_estado;
private String id_estado_igualando;        

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
     * @return the id_cliente
     */
    public Integer getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * @return the nombre_cliente
     */
    public String getNombre_cliente() {
        return nombre_cliente;
    }

    /**
     * @param nombre_cliente the nombre_cliente to set
     */
    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    /**
     * @return the apellidos_cliente
     */
    public String getApellidos_cliente() {
        return apellidos_cliente;
    }

    /**
     * @param apellidos_cliente the apellidos_cliente to set
     */
    public void setApellidos_cliente(String apellidos_cliente) {
        this.apellidos_cliente = apellidos_cliente;
    }

    /**
     * @return the fecha_nacimiento
     */
    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    /**
     * @param fecha_nacimiento the fecha_nacimiento to set
     */
    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    /**
     * @return the compania
     */
    public String getCompania() {
        return compania;
    }

    /**
     * @param compania the compania to set
     */
    public void setCompania(String compania) {
        this.compania = compania;
    }

    /**
     * @return the direccion1
     */
    public String getDireccion1() {
        return direccion1;
    }

    /**
     * @param direccion1 the direccion1 to set
     */
    public void setDireccion1(String direccion1) {
        this.direccion1 = direccion1;
    }

    /**
     * @return the direccion2
     */
    public String getDireccion2() {
        return direccion2;
    }

    /**
     * @param direccion2 the direccion2 to set
     */
    public void setDireccion2(String direccion2) {
        this.direccion2 = direccion2;
    }

    /**
     * @return the telefono1
     */
    public String getTelefono1() {
        return telefono1;
    }

    /**
     * @param telefono1 the telefono1 to set
     */
    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    /**
     * @return the telefono2
     */
    public String getTelefono2() {
        return telefono2;
    }

    /**
     * @param telefono2 the telefono2 to set
     */
    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    /**
     * @return the email_cliente
     */
    public String getEmail_cliente() {
        return email_cliente;
    }

    /**
     * @param email_cliente the email_cliente to set
     */
    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }

    /**
     * @return the nit_c
     */
    public String getNit_c() {
        return nit_c;
    }

    /**
     * @param nit_c the nit_c to set
     */
    public void setNit_c(String nit_c) {
        this.nit_c = nit_c;
    }

    /**
     * @return the dui_c
     */
    public String getDui_c() {
        return dui_c;
    }

    /**
     * @param dui_c the dui_c to set
     */
    public void setDui_c(String dui_c) {
        this.dui_c = dui_c;
    }

    /**
     * @return the ruc_C
     */
    public String getRuc_C() {
        return ruc_C;
    }

    /**
     * @param ruc_C the ruc_C to set
     */
    public void setRuc_C(String ruc_C) {
        this.ruc_C = ruc_C;
    }

    /**
     * @return the id_estado
     */
    public Integer getId_estado() {
        return id_estado;
    }

    /**
     * @param id_estado the id_estado to set
     */
    public void setId_estado(Integer id_estado) {
        this.id_estado = id_estado;
    }

    /**
     * @return the id_estado_igualando
     */
    public String getId_estado_igualando() {
        return id_estado_igualando;
    }

    /**
     * @param id_estado_igualando the id_estado_igualando to set
     */
    public void setId_estado_igualando(String id_estado_igualando) {
        this.id_estado_igualando = id_estado_igualando;
    }
    
     
    public Mto_Clientes() {
        Conexion con = new Conexion();
        cn = con.Conectar();
    }
    
    public Boolean GuardarCliente() {
        boolean resp = false;
        try{
            String sql = "insert  into cliente(nombre_cliente, apellidos_cliente, fecha_nacimiento, compania,	"
                    + "direccion1, direccion2, telefono1, telefono2, email_cliente, nit_c, dui_c, ruc_C, "
                    + "id_estado)\n" 
                    +"values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 1)";
            PreparedStatement cmd = cn.prepareStatement(sql);              
            cmd.setString(1, nombre_cliente);
            cmd.setString(2, apellidos_cliente);
            cmd.setString(3, fecha_nacimiento);           
            cmd.setString(4, compania);
            cmd.setString(5, direccion1);
            cmd.setString(6, direccion2);
            cmd.setString(7, telefono1);           
            cmd.setString(8, telefono2);
            cmd.setString(9, email_cliente);
            cmd.setString(10, nit_c);
            cmd.setString(11, dui_c);           
            cmd.setString(12, ruc_C);          
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
    
    public Boolean ModificarCliente() {
        boolean resp = false;
        try{
            String sql = "update cliente set nombre_cliente = ?, apellidos_cliente = ?, fecha_nacimiento = ?, "
                    + "compania = ?,	direccion1 = ?, direccion2= ?, telefono1 = ?, telefono2 = ?, email_cliente = ?,"
                    + " nit_c = ?, dui_c = ?, ruc_C = ?, id_estado = ? where id_cliente = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);              
            cmd.setString(1, nombre_cliente);
            cmd.setString(2, apellidos_cliente);
            cmd.setString(3, fecha_nacimiento);           
            cmd.setString(4, compania);
            cmd.setString(5, direccion1);
            cmd.setString(6, direccion2);
            cmd.setString(7, telefono1);           
            cmd.setString(8, telefono2);
            cmd.setString(9, email_cliente);
            cmd.setString(10, nit_c);
            cmd.setString(11, dui_c);           
            cmd.setString(12, ruc_C);
            cmd.setInt(13, id_cliente);
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
    
    public Boolean EliminarCliente() {
        boolean resp = false;
        try{
            String sql = "update cliente set id_estado = 2 where id_cliente = ?";
    
            PreparedStatement cmd = cn.prepareStatement (sql);
            cmd.setInt(1, id_cliente);
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
            String sql = "select id_cliente, nombre_cliente as \"Nombre\", apellidos_cliente as \"Apellidos\", fecha_nacimiento as "
                    + "\"Fecha de Nacimiento\", compania as \"Nombre de Empresa\", direccion1 as \"Dirección 1\", "
                    + "direccion2 as \"Dirección 1\", telefono1 as \"Telefono 1\", telefono2 as \"Telefono 2\", "
                    + "email_cliente as \"Email\", nit_c as \"NIT\", dui_c as \"DUI\", ruc_C as \"RUC\" from cliente, "
                    + "estado where cliente.id_estado=estado.id_estado and estado.id_estado = 1 and "
                    + "cliente.nombre_cliente = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, nombre_cliente);
            ResultSet rs = cmd.executeQuery();
            if (rs.next())
            {               
                resp = true;
                id_cliente = rs.getInt(1);
                nombre_cliente = rs.getString(2);
                apellidos_cliente = rs.getString(3);
                fecha_nacimiento = rs.getString(4);
                compania = rs.getString(5);
                direccion1 = rs.getString(6);
                direccion2 = rs.getString(7);
                telefono1 = rs.getString(8);
                telefono2 = rs.getString(9);
                email_cliente = rs.getString(10);
                nit_c = rs.getString(11);
                dui_c = rs.getString(12);
                ruc_C = rs.getString(13);
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
