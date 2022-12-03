
package proyecto.objetos_perdidos.Data;

public class Usuario {


   
    private String nombre;
    private String apellido;
    private String correo;
    private String numero;
    private String contrasena;
    private String documento;
    
    public Usuario(){
        
    }


       public Usuario(String nombre, String apellido, String correo, String numero, String contrasena, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.numero = numero;
        this.contrasena = contrasena;
        this.documento = documento;
    }
       public Usuario(String correo){
           this.correo = correo;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
        @Override
    public String toString() {
        return "Bienvenido " + nombre +" "+ apellido + "\nCorreo: " + correo + "\nnumero: " + numero + "\ndocumento: " + documento;
    }
   
    
}
