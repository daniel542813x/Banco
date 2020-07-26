/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprint1;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class registrar_cuentas  extends javax.swing.JFrame  {

     Connection con = null; 
    Statement stmt = null;
    PreparedStatement ps;
    ResultSet rs = null;
    FileInputStream fis;
    int longitudBytes;

    public registrar_cuentas() {
        initComponents();
    }

     public void Conexion() {
        if(con != null) {
            return;
        }
        
        String url = "jdbc:postgresql://localhost/banco1";
        String password = "postgres1";
        
        try {
            Class.forName("org.postgresql.Driver");
            
            con = DriverManager.getConnection(url, "postgres",password);
            
            if (con != null) {
                System.out.println("Conectando a Base de Datos...");
            }           
        } catch (Exception e) {
            System.out.println("Problemas de conexion");
        }
    }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtcod_e = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtusr = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcon = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbtipo = new javax.swing.JComboBox<>();
        btn_g = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("jButton1");

        setTitle("crear cuentas");

        jLabel1.setText("codigo empleado");

        txtcod_e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcod_eActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre de usuario");

        txtusr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusrActionPerformed(evt);
            }
        });

        jLabel3.setText("contraseña");

        jLabel4.setText("tipo de cuenta");

        cmbtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "jefe", "auxiliar" }));
        cmbtipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbtipoActionPerformed(evt);
            }
        });

        btn_g.setText("registrar");
        btn_g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gActionPerformed(evt);
            }
        });

        jButton2.setText("buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("cancelar ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("modificar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/General/banco mano amiga.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 105, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtcod_e, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton2))
                    .addComponent(txtusr, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcon, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(162, 162, 162))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(277, 277, 277))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(btn_g)
                        .addGap(61, 61, 61)
                        .addComponent(jButton4)
                        .addGap(88, 88, 88)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jLabel45)))
                .addContainerGap(203, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(txtcod_e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtusr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_g)
                            .addComponent(jButton4)
                            .addComponent(jButton3))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(115, 115, 115))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcod_eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcod_eActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcod_eActionPerformed

    private void cmbtipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbtipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbtipoActionPerformed

    private void txtusrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusrActionPerformed

    private void btn_gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gActionPerformed
        // TODO add your handling code here:
        Conexion();
        if((txtcod_e.getText().equals(""))   || 
          (txtusr.getText().equals(""))  || 
          (txtcon.getText().equals("")) )
          {   
            JOptionPane.showMessageDialog(this, "Rellene todos los campos \n¡Verifique! \n " , "ADVERTENCIA!", JOptionPane.INFORMATION_MESSAGE );       
        }else{
        try{
            
            String cadena,cadena1,cadena2,cadena3;
        
                cadena = txtcod_e.getText();
                cadena1 = txtusr.getText();
                cadena2 = txtcon.getText();
               cadena3 = (String) cmbtipo.getSelectedItem();
             
               
              
          
                stmt =  con.createStatement();
                stmt.executeUpdate("INSERT INTO usuarios VALUES('"+cadena+"','"+cadena1+"','"+cadena2+"','"+cadena3+"')");            
                JOptionPane.showMessageDialog(this, "Guardado Correctamente");
                
            // si hay algun error en el codigo de postgres se mostrara este mensaje 
       } catch (Exception e) {
            
             JOptionPane.showMessageDialog(this, "empleado no exixte ");
        }

         
        
        
        
               
        }
    }//GEN-LAST:event_btn_gActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           try {           
            Conexion();
            ps= con.prepareStatement("SELECT * FROM usuarios WHERE empleado = ?");            
            ps.setString(1, txtcod_e.getText());
            
            rs = ps.executeQuery();
            
            if(rs.next()){
             
                txtusr.setText(rs.getString("usuario"));
                
                txtcon.setText(rs.getString("contraseña"));
                
                cmbtipo.setSelectedItem(rs.getString("tipo_de_cuenta"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe un empleado con este codigo");
            }
                       
        } catch (SQLException ex) {
            Logger.getLogger(JUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       Conexion();
        
        try {
            ps = con.prepareStatement("UPDATE usuarios SET usuario=?, contraseña=?, tipo_de_cuenta=? WHERE empleado=?");
           
          
            ps.setString(1, txtusr.getText());
            ps.setString(2, txtcon.getText());
            ps.setString(3, cmbtipo.getSelectedItem().toString());
             ps.setString(4, txtcod_e.getText());
            
            int res = ps.executeUpdate();
            
            if(res > 0){
                 
            } else {
                 JOptionPane.showMessageDialog(null, "Error al Modificar el registro");
                
            }
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Administrador vista = new Administrador();
        vista.setVisible(true);
        this.dispose();
       
      
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_g;
    private javax.swing.JComboBox<String> cmbtipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtcod_e;
    private javax.swing.JTextField txtcon;
    private javax.swing.JTextField txtusr;
    // End of variables declaration//GEN-END:variables
}