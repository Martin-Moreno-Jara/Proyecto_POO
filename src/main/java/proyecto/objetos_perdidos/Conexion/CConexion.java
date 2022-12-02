
package proyecto.objetos_perdidos.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class CConexion {
    Connection conectar;
    
    String usuario="root";
    String contrasena="rraxxerr420";
    String bd="objetos_perdidos";
    String ip="localhost";
    String puerto="3306";
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection establecer_conexion(){
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, contrasena);
                    //JOptionPane.showMessageDialog(null,"se conectó a la base de datos");

            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"problemas en la conexión: "+e.toString());
        }
        return conectar;
    }
    
}
