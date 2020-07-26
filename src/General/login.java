
package General;

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
import sprint1.Administrador;

    
public class login extends javax.swing.JFrame {
    Connection con = null; 
    Statement stmt = null;
    PreparedStatement ps;
    ResultSet rs = null;
    FileInputStream fis;
    int longitudBytes;

    public login() {
        
        
        
        initComponents();
    }

      void acceder (String usr,String pass){
        try {
            String tip= "";
           
            Conexion();
            String sql= "SELECT * FROM  usuarios WHERE usuario='"+usr+"' and contraseña='"+pass+"' ";
            Statement stm = con.createStatement();
            ResultSet rsl = stm.executeQuery(sql);
           
            while (rsl.next()){
                tip=rsl.getString("tipo_de_cuenta");
               
               }
           
            
             if (tip.equals("Administrador" ) ){
              this.setVisible(false);
                JOptionPane.showMessageDialog(null, "Bienvenido\n"+" Administrador");
                Administrador ing= new Administrador();
                ing.setVisible(true);
                ing.pack();
                
             }
              if (tip.equals("jefe")){
              this.setVisible(false);
                JOptionPane.showMessageDialog(null, "Bienvenido\n"+"  Jefe de credito");
                Principalj ing= new Principalj();
                ing.setVisible(true);
                ing.pack();
                
             }
                if (tip.equals("auxiliar")){ 
              
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, "Bienvenido\n"+" Auxiliar de credito");
                Principal ing= new Principal();
                
                ing.setVisible(true);
               
                ing.pack();
                
               
             }
                if((!tip.equals("Administrador"))&&(!tip.equals("jefe"))&& ( !tip.equals("auxiliar"))){
             JOptionPane.showMessageDialog(null, "cuenta no valida\n"+"verifique! sus datos");
                }
                
                
             
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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

        lblusr = new javax.swing.JLabel();
        lblcon = new javax.swing.JLabel();
        txtusr = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        btningr = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblusr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/name usr.png"))); // NOI18N
        lblusr.setText("Usuario");
        lblusr.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/contraseña.png"))); // NOI18N
        lblcon.setText("contraseña");
        lblcon.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        txtusr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusrActionPerformed(evt);
            }
        });

        btningr.setBackground(new java.awt.Color(204, 255, 255));
        btningr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ingresar _flech.png"))); // NOI18N
        btningr.setText("Ingresar");
        btningr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 255)));
        btningr.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btningr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningrActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/userr.png"))); // NOI18N
        jLabel2.setText("login");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/General/banco mano amiga.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 166, Short.MAX_VALUE)
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btningr, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblcon)
                            .addComponent(lblusr))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtusr, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45)
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblusr)
                    .addComponent(txtusr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcon)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btningr)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusrActionPerformed
     
    }//GEN-LAST:event_txtusrActionPerformed

    private void btningrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningrActionPerformed
        String usu=txtusr.getText();
        String pas=new String(txtpass.getPassword());
        acceder(usu,pas);
    }//GEN-LAST:event_btningrActionPerformed

    
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btningr;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel lblcon;
    private javax.swing.JLabel lblusr;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtusr;
    // End of variables declaration//GEN-END:variables
}
