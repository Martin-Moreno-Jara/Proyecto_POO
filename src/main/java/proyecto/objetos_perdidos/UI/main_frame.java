/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.objetos_perdidos.UI;

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
        btn_agg_obj = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_objetos = new javax.swing.JTable();
        btn_verinfo = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        lb_nombre_usuario = new javax.swing.JLabel();

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

        jPanel2.setBackground(new java.awt.Color(118, 35, 47));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Objetos perdidos UNAL");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btn_logout.setBackground(new java.awt.Color(118, 35, 47));
        btn_logout.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(255, 255, 255));
        btn_logout.setText("Cerrar sesión");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setText("Bienvenido/a");

        btn_agg_obj.setBackground(new java.awt.Color(118, 35, 47));
        btn_agg_obj.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn_agg_obj.setForeground(new java.awt.Color(255, 255, 255));
        btn_agg_obj.setText("Agregar objeto perdido");
        btn_agg_obj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agg_objActionPerformed(evt);
            }
        });

        tabla_objetos.setBackground(new java.awt.Color(255, 255, 0));
        tabla_objetos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
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
        tabla_objetos.setGridColor(new java.awt.Color(255, 255, 102));
        jScrollPane1.setViewportView(tabla_objetos);

        btn_verinfo.setBackground(new java.awt.Color(118, 35, 47));
        btn_verinfo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn_verinfo.setForeground(new java.awt.Color(255, 255, 255));
        btn_verinfo.setText("Ver información");
        btn_verinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verinfoActionPerformed(evt);
            }
        });

        btn_editar.setBackground(new java.awt.Color(118, 35, 47));
        btn_editar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn_editar.setForeground(new java.awt.Color(255, 255, 255));
        btn_editar.setText("Editar objeto");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_eliminar.setBackground(new java.awt.Color(118, 35, 47));
        btn_eliminar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setText("Eliminar objeto");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        lb_nombre_usuario.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lb_nombre_usuario.setText("jLabel4");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_nombre_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_agg_obj, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(btn_verinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lb_nombre_usuario)))
                    .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_agg_obj, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_verinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(247, 247, 247))
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
        tabla.addColumn("ID");
        tabla.addColumn("Tipo");
        tabla.addColumn("Objeto");
        tabla.addColumn("Encontrado en");
        tabla.addColumn("Descripción");
        tabla.addColumn("Encontrado por");
        tabla_objetos.setModel(tabla);
        
        
        CConexion con = new CConexion();
        
        PreparedStatement ps = null;
        ResultSet rs =null;
 
        String[] datos = new String[6];
        try{
            String consulta = "SELECT ID, tipo, objeto, ubicacion, descripcion, encontradopor FROM objetos";
            ps = con.establecer_conexion().prepareStatement(consulta);
            rs = ps.executeQuery();
                        
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                tabla.addRow(datos);
                
            }
            tabla_objetos.setModel(tabla);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en1: "+e.toString());
        }
    }
    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
       login_frame login = new login_frame();
       login.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_agg_objActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agg_objActionPerformed
        agregar_objeto objeto = new agregar_objeto(this, true,correo_referencia,false);
        objeto.setVisible(true);
        if(objeto.getConfirmacion()){
            llenar_tabla();
        }
    }//GEN-LAST:event_btn_agg_objActionPerformed
public void eliminar_datos(){
    try{
        int row = tabla_objetos.getSelectedRow();
        CConexion con = new CConexion();

        String consulta = "delete from objetos where ID="+tabla_objetos.getValueAt(row, 0);
        
        Statement st = con.establecer_conexion().createStatement();
        int n= st.executeUpdate(consulta);
        if(n>0){
            JOptionPane.showMessageDialog(null, "Se eliminó correctamente el registro");
                    
        }
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Error en2: "+e.toString());
    }
}
    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        int row = tabla_objetos.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro para hacer la acción");
        }
        else{
            if(!correo_referencia.equalsIgnoreCase(tabla_objetos.getValueAt(row, 5).toString())){
                JOptionPane.showMessageDialog(null, "No puedes eliminar un registro creado por otro usuario");
            }
            else{
                Confirmacion confi = new Confirmacion(this, true);
                confi.setVisible(true);
                if(confi.getConfirmacion()){
                    eliminar_datos();
                    llenar_tabla();
                }
                
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
            
            String consulta ="select nombre, numero, apellido from usuarios where usuarios.correo = '"
               + tabla_objetos.getValueAt(row, 5).toString()+ "'";
            
            //String consulta ="select nombre, numero from usuarios where ";
            ps=conexion.establecer_conexion().prepareStatement(consulta);
            
     
            rs = ps.executeQuery();
            rs.next();
            name_eu = rs.getString("nombre")+" "+rs.getString("apellido");
            cel_eu = rs.getString("numero");
           
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error: "+e.toString());
        }
            Informacion info = new Informacion(this,true);
            info.llenar_info(tabla_objetos.getValueAt(row, 1).toString(),tabla_objetos.getValueAt(row,2).toString(),tabla_objetos.getValueAt(row, 3).toString(),tabla_objetos.getValueAt(row, 4).toString(),name_eu,cel_eu,tabla_objetos.getValueAt(row, 5).toString());
            info.setVisible(true);
        }
    }//GEN-LAST:event_btn_verinfoActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        int row = tabla_objetos.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro para hacer la acción");
        }else{
            if(!correo_referencia.equalsIgnoreCase(tabla_objetos.getValueAt(row, 5).toString())){
                JOptionPane.showMessageDialog(null, "No puedes editar un registro creado por otro usuario");
            }
            else{
                agregar_objeto obj = new agregar_objeto(this, true, nombre_label,true);
                String tipo = tabla_objetos.getValueAt(row, 1).toString();
                String objeto = tabla_objetos.getValueAt(row, 2).toString();
                String ubicacion = tabla_objetos.getValueAt(row, 3).toString();
                String descrip = tabla_objetos.getValueAt(row, 4).toString();
                String identification = tabla_objetos.getValueAt(row, 0).toString();
                int idf = Integer.parseInt(identification);
                
                obj.llenar_editar(tipo,objeto,ubicacion,descrip,idf);
                obj.setVisible(true);
                if(obj.getConfirmacion()){
                    llenar_tabla();
                }
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
