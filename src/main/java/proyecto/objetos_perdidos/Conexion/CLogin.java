
package proyecto.objetos_perdidos.Conexion;

import com.mysql.cj.protocol.Resultset;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import proyecto.objetos_perdidos.UI.login_frame;
import proyecto.objetos_perdidos.UI.main_frame;


public class CLogin {
    String nombre;
    String correo_usuario;
    public CLogin(String n,String c){
        this.nombre = n;
        this.correo_usuario = c;
    }
    boolean c_ventana = false;
    
    
    public boolean cerrar_ventana(){
        return c_ventana;
    }

    public void buscar_datos(){
        try{
            ResultSet rs =null;           
            PreparedStatement ps =null;
            
            CConexion conexion = new CConexion();
            
            String consulta ="select nombre, numero from usuarios where ('"
               + correo_usuario+ "')";
            ps=conexion.establecer_conexion().prepareStatement(consulta);
            
     
            rs = ps.executeQuery();            
           
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error: "+e.toString());
        }
    }

    public void validar_usuario(JTextField correo,JPasswordField contrasena){
        try{
            ResultSet rs =null;           
            PreparedStatement ps =null;
            
            CConexion conexion = new CConexion();
            
            String consulta ="select * from usuarios where usuarios.correo = (?) and usuarios.password = (?)";
            ps=conexion.establecer_conexion().prepareStatement(consulta);
            
            String contra = String.valueOf(contrasena.getPassword());
            
            ps.setString(1, correo.getText());
            ps.setString(2,contra);
            
            rs = ps.executeQuery();
            System.out.println("login2: "+nombre);
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "El usuario es correcto");
                c_ventana = true;
                main_frame main = new main_frame(nombre, correo_usuario);
                main.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "No existe ese usuario\nVerificar correo o contraseña");

            }
         
           
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error: "+e.toString());
        }
        
    }
}
