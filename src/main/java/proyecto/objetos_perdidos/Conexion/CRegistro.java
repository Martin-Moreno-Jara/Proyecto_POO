/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.objetos_perdidos.Conexion;

import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class CRegistro {
    boolean cerrar = false;
    
    public boolean cerrar_ventana(){
        return cerrar;
    }
    
    public void registrar_usuario(JTextField nombre, JTextField apellido, JTextField correo, JTextField numero, JTextField documento, JPasswordField password){
        try{
            
        CConexion conexion = new CConexion();
        
        String str_nombre = nombre.getText();
        String str_apellido = apellido.getText();
        String str_correo = correo.getText();
        String str_numero = numero.getText();
        String str_documento = documento.getText();
        String str_password = String.valueOf(password.getPassword());
       
       Statement consulta = conexion.establecer_conexion().createStatement();
       consulta.executeUpdate("Insert into usuarios (nombre, apellido, correo, numero, documento, password) values ('"
               +str_nombre
               +"','"
               +str_apellido
               +"','"
               +str_correo
               +"','"
               + str_numero
               +"','"
               + str_documento
               +"','"
               + str_password+ "')");
 
      
        JOptionPane.showMessageDialog(null,"usuario creado correctamente" );
        cerrar = true;
        conexion.establecer_conexion().close();
        
        }
        catch(Exception e ){
            JOptionPane.showMessageDialog(null,"No se ha podido crear usuario : "+e.toString() );
        }
        
       
        
        
    }
}
