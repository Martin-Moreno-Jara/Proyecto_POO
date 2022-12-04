/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.objetos_perdidos.UI;

import com.mysql.cj.protocol.Resultset;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyecto.objetos_perdidos.Conexion.CConexion;

public class main_frame extends javax.swing.JFrame {
    String nombre_label;
    String correo_referencia;
    public main_frame(String n, String c) {
        initComponents();
        llenar_tabla();
        setLocationRelativeTo(null);
        lb_nombre_usuario.setText(n);
        this.correo_referencia=c;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btn_logout = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lb_nombre_usuario = new javax.swing.JLabel();
        btn_agg_obj = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_objetos = new javax.swing.JTable();
        btn_verinfo = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();

        jLabel1.setText("Objetos perdidos UNAL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(240, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(232, 232, 232))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(352, Short.MAX_VALUE))
        );

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setText("Objetos perdidos UNAL");

        btn_logout.setText("Cerrar sesión");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        jLabel3.setText("Bienvenido/a");

        btn_agg_obj.setText("Agregar objeto perdido");
        btn_agg_obj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agg_objActionPerformed(evt);
            }
        });

        tabla_objetos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tipo", "Objeto", "Descripción", "Ubicación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_objetos);

        btn_verinfo.setText("Ver información");
        btn_verinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verinfoActionPerformed(evt);
            }
        });

        btn_editar.setText("Editar objeto");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar objeto");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_nombre_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_agg_obj, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(btn_verinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lb_nombre_usuario)
                    .addComponent(btn_logout))
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_agg_obj)
                        .addGap(18, 18, 18)
                        .addComponent(btn_verinfo)
                        .addGap(28, 28, 28)
                        .addComponent(btn_editar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void llenar_tabla(){
        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("Tipo");
        tabla.addColumn("Objeto");
        tabla.addColumn("Encontrado en");
        tabla.addColumn("Descripción");
        tabla.addColumn("Encontrado por");
        tabla_objetos.setModel(tabla);
        
        
        CConexion con = new CConexion();
        
        PreparedStatement ps = null;
        ResultSet rs =null;
 
        String[] datos = new String[5];
        try{
            String consulta = "SELECT tipo, objeto, ubicacion, descripcion, encontradopor FROM objetos";
            ps = con.establecer_conexion().prepareStatement(consulta);
            rs = ps.executeQuery();
                        
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                tabla.addRow(datos);
                
            }
            tabla_objetos.setModel(tabla);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en: "+e.toString());
        }
    }
    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
       login_frame login = new login_frame();
       login.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_agg_objActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agg_objActionPerformed
        agregar_objeto objeto = new agregar_objeto(this, true,correo_referencia);
        objeto.setVisible(true);
        if(objeto.getConfirmacion()){
            llenar_tabla();
        }
    }//GEN-LAST:event_btn_agg_objActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        int row = tabla_objetos.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro para hacer la acción");
        }
        else{
            if(!correo_referencia.equalsIgnoreCase(tabla_objetos.getValueAt(row, 4).toString())){
                JOptionPane.showMessageDialog(null, "No puedes eliminar un registro creado por otro usuario");
            }
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_verinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verinfoActionPerformed
        int row = tabla_objetos.getSelectedRow();
        String name_eu ="";
        String cel_eu ="";
        if(row<0){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro para hacer la acción");
        }else{
            
            try{
            ResultSet rs =null;           
            PreparedStatement ps =null;
            
            CConexion conexion = new CConexion();
            
            String consulta ="select nombre, numero from usuarios where usuarios.correo = '"
               + tabla_objetos.getValueAt(row, 4).toString()+ "'";
            
            //String consulta ="select nombre, numero from usuarios where ";
            ps=conexion.establecer_conexion().prepareStatement(consulta);
            
     
            rs = ps.executeQuery();
            rs.next();
            name_eu = rs.getString("nombre");
            cel_eu = rs.getString("numero");
           
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error: "+e.toString());
        }
            Informacion info = new Informacion(this,true);
            info.llenar_info(tabla_objetos.getValueAt(row, 0).toString(),tabla_objetos.getValueAt(row, 1).toString(),tabla_objetos.getValueAt(row, 2).toString(),tabla_objetos.getValueAt(row, 3).toString(),name_eu,cel_eu,tabla_objetos.getValueAt(row, 4).toString());
            info.setVisible(true);
        }
    }//GEN-LAST:event_btn_verinfoActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        int row = tabla_objetos.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro para hacer la acción");
        }else{
            if(!correo_referencia.equalsIgnoreCase(tabla_objetos.getValueAt(row, 4).toString())){
                JOptionPane.showMessageDialog(null, "No puedes editar un registro creado por otro usuario");
            }
        }
        
    }//GEN-LAST:event_btn_editarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agg_obj;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_verinfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_nombre_usuario;
    private javax.swing.JTable tabla_objetos;
    // End of variables declaration//GEN-END:variables
}
