
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
    boolean c_ventana = false;
    
    public boolean cerrar_ventana(){
        return c_ventana;
    }

    public void validar_usuario(JTextField correo,JPasswordField contrasena){
        try{
            ResultSet rs =null;           
            PreparedStatement ps =null;
            
            Conexion conexion = new Conexion();
            
            String consulta ="select * from usuarios where usuarios.correo = (?) and usuarios.contrasena = (?)";
            ps=conexion.establecer_conexion().prepareStatement(consulta);
            
            String contra = String.valueOf(contrasena.getPassword());
            
            ps.setString(1, correo.getText());
            ps.setString(2,contra);
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "El usuario es correcto");
                c_ventana = true;
                main_frame main = new main_frame();
                main.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "El usuario es incorrecto");

            }
         
           
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error: "+e.toString());
        }
        
    }
}
