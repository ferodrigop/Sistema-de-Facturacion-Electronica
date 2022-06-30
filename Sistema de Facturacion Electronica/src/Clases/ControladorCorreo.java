/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Properties;

/**
 * Metodo para el envio de correo elctronico
 * @author samuel
 */
public class ControladorCorreo {
    Correo c = new Correo();
    public boolean enviarcorreo(){
    
        
      try{
      
          Properties p = new Properties();
          p.put("mail.smtp.host","smtp.gmail.com");
          p.setProperty("mail.smtp.starttls.enable","true");
          p.setProperty("mail.smtp.port","587");
          p.setProperty("mail.smtp.auch","true");
      }catch(Exception e){
      
      
      }  
        return false;
    }
    
}
