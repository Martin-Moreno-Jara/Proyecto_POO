/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.objetos_perdidos.UI;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import proyecto.objetos_perdidos.Conexion.CLogin;
import proyecto.objetos_perdidos.Conexion.CConexion;
import proyecto.objetos_perdidos.Data.Usuario;

/**
 *
 * @author usuario
 */
public class login_frame extends javax.swing.JFrame {

    /**
     * Creates new form login_frame
     */
    public login_frame() {
        initComponents();
        setLocationRelativeTo(null);
        CConexion conexion = new CConexion();
        conexion.establecer_conexion();
    }
    Usuario usuario_logeado = new Usuario();
    String nombre_confirmacion;

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_correo_login = new javax.swing.JTextField();
        txt_pass_login = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        btn_ingresar = new javax.swing.JButton();
        btn_crear_usuario = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(118, 35, 47));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Objetos perdidos UNAL");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setText("Ingresa tu usuario para poder ingresar");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel3.setText("Correo");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel4.setText("Contraseña");

        txt_correo_login.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_correo_login.setBorder(null);
        txt_correo_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correo_loginActionPerformed(evt);
            }
        });

        txt_pass_login.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel5.setText("¿No estás registrado?");

        btn_ingresar.setBackground(new java.awt.Color(118, 35, 47));
        btn_ingresar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        btn_ingresar.setText("Ingresar");
        btn_ingresar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_ingresarFocusGained(evt);
            }
        });
        btn_ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ingresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ingresarMouseExited(evt);
            }
        });
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        btn_crear_usuario.setBackground(new java.awt.Color(118, 35, 47));
        btn_crear_usuario.setForeground(new java.awt.Color(255, 255, 255));
        btn_crear_usuario.setText("Crear usuario");
        btn_crear_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_crear_usuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_crear_usuarioMouseExited(evt);
            }
        });
        btn_crear_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crear_usuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator2)
                            .addComponent(txt_correo_login)
                            .addComponent(txt_pass_login, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_crear_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(21, 158, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(19, 19, 19)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(txt_correo_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_pass_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_crear_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_correo_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_correo_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_correo_loginActionPerformed
    public String buscar_nombre(){
    usuario_logeado.setCorreo(txt_correo_login.getText());
        try{
            String nombre;
            String apellido;
            ResultSet rs =null;           
            PreparedStatement ps =null;
            CConexion con = new CConexion();
            String consulta = "select nombre, apellido from usuarios where usuarios.correo ="+"'"+usuario_logeado.getCorreo()+"'";
            ps=con.establecer_conexion().prepareStatement(consulta);
            
            rs = ps.executeQuery();
            rs.next();
            nombre = rs.getString("nombre");
            apellido = rs.getString("apellido");
                    
            nombre_confirmacion= nombre+" "+apellido;
            
            
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return nombre_confirmacion;
}
    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        String texto_correo = txt_correo_login.getText();
        CLogin login = new CLogin(buscar_nombre(),texto_correo);
        login.validar_usuario(txt_correo_login, txt_pass_login);
        /*usuario_logeado.setCorreo(txt_correo_login.getText());
        try{
            String nombre;
            String apellido;
            ResultSet rs =null;           
            PreparedStatement ps =null;
            CConexion con = new CConexion();
            String consulta = "select nombre, apellido from usuarios where usuarios.correo ="+"'"+usuario_logeado.getCorreo()+"'";
            ps=con.establecer_conexion().prepareStatement(consulta);
            
            rs = ps.executeQuery();
            rs.next();
            nombre = rs.getString("nombre");
            apellido = rs.getString("apellido");
                    
            nombre_confirmacion= nombre+" "+apellido;
            
            System.out.println("login: "+nombre_confirmacion);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en: "+e.toString());
        }
        */
        if(login.cerrar_ventana()){
            this.setVisible(false);
        }
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_crear_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crear_usuarioActionPerformed
        register_frame registrar = new register_frame();
        registrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_crear_usuarioActionPerformed

    private void btn_ingresarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_ingresarFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ingresarFocusGained

    private void btn_ingresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresarMouseEntered
        // TODO add your handling code here:
        btn_ingresar.setBackground(Color.white);
        btn_ingresar.setForeground(Color.black);
    }//GEN-LAST:event_btn_ingresarMouseEntered

    private void btn_ingresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresarMouseExited
        // TODO add your handling code here:
        btn_ingresar.setBackground(new Color(118,35,47));
        btn_ingresar.setForeground(Color.white);
    }//GEN-LAST:event_btn_ingresarMouseExited

    private void btn_crear_usuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crear_usuarioMouseEntered
        // TODO add your handling code here:
        btn_crear_usuario.setBackground(Color.white);
        btn_crear_usuario.setForeground(Color.black);
    }//GEN-LAST:event_btn_crear_usuarioMouseEntered

    private void btn_crear_usuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crear_usuarioMouseExited
        // TODO add your handling code here:
        btn_crear_usuario.setBackground(new Color(118,35,47));
        btn_crear_usuario.setForeground(Color.white);
    }//GEN-LAST:event_btn_crear_usuarioMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_crear_usuario;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txt_correo_login;
    private javax.swing.JPasswordField txt_pass_login;
    // End of variables declaration//GEN-END:variables
}
