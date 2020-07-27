
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
                Principal_jefe_decredito ing= new Principal_jefe_decredito();
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
        
        String url = "jdbc:postgresql://localhost:5432/banco1?";
        String password = "postgres1";
        
        try {
            Class.forName("org.postgresql.Driver");
            
            con = DriverManager.getConnection(url, "estevan","");
            
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

        jLabel45 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblusr = new javax.swing.JLabel();
        lblcon = new javax.swing.JLabel();
        txtusr = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        btningr = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("iniciar sesión");
        setResizable(false);

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/General/banco mano amiga.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/userr.png"))); // NOI18N
        jLabel2.setText("Login");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblusr.setForeground(new java.awt.Color(0, 0, 0));
        lblusr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/name usr.png"))); // NOI18N
        lblusr.setText("Usuario");
        lblusr.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblcon.setForeground(new java.awt.Color(0, 0, 0));
        lblcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/contrasena.png"))); // NOI18N
        lblcon.setText("Contraseña");
        lblcon.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        txtusr.setForeground(new java.awt.Color(0, 0, 0));
        txtusr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusrActionPerformed(evt);
            }
        });

        txtpass.setForeground(new java.awt.Color(0, 0, 0));

        btningr.setBackground(new java.awt.Color(204, 255, 255));
        btningr.setForeground(new java.awt.Color(0, 0, 0));
        btningr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ingresar _flech.png"))); // NOI18N
        btningr.setText("Ingresar");
        btningr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 255)));
        btningr.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btningr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningrActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/walpaper cuentas empleados.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblcon, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblusr, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtusr, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel2))))
                            .addComponent(btningr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel45)))
                .addGap(144, 144, 144))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblusr)
                    .addComponent(txtusr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcon)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(btningr)
                .addGap(36, 36, 36))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel lblcon;
    private javax.swing.JLabel lblusr;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtusr;
    // End of variables declaration//GEN-END:variables
}
