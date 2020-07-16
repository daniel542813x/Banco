
package sprint1;

import General.Principal;


public class Administrador extends javax.swing.JFrame {

    public Administrador() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop_A = new javax.swing.JDesktopPane();
        btnPrincipal = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        registrar_c = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        visualizar_c = new javax.swing.JMenu();
        activar_c = new javax.swing.JMenuItem();
        men_vis_cuenta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador");

        btnPrincipal.setBackground(new java.awt.Color(0, 102, 255));
        btnPrincipal.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        btnPrincipal.setText("Principal");
        btnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalActionPerformed(evt);
            }
        });

        Desktop_A.setLayer(btnPrincipal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout Desktop_ALayout = new javax.swing.GroupLayout(Desktop_A);
        Desktop_A.setLayout(Desktop_ALayout);
        Desktop_ALayout.setHorizontalGroup(
            Desktop_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Desktop_ALayout.createSequentialGroup()
                .addContainerGap(422, Short.MAX_VALUE)
                .addComponent(btnPrincipal)
                .addContainerGap())
        );
        Desktop_ALayout.setVerticalGroup(
            Desktop_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Desktop_ALayout.createSequentialGroup()
                .addContainerGap(318, Short.MAX_VALUE)
                .addComponent(btnPrincipal)
                .addContainerGap())
        );

        jMenuBar1.setForeground(new java.awt.Color(153, 255, 255));

        registrar_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/system_file_manager_wallet_22488.png"))); // NOI18N
        registrar_c.setText("registrar");

        jMenuItem1.setText("registrar cuenta");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        registrar_c.add(jMenuItem1);

        jMenuBar1.add(registrar_c);

        visualizar_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/loginmanager_10029.png"))); // NOI18N
        visualizar_c.setText("cuentas");

        activar_c.setText("activar o desactivar cuentas");
        activar_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activar_cActionPerformed(evt);
            }
        });
        visualizar_c.add(activar_c);

        men_vis_cuenta.setText("visualizar cuentas");
        men_vis_cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_vis_cuentaActionPerformed(evt);
            }
        });
        visualizar_c.add(men_vis_cuenta);

        jMenuBar1.add(visualizar_c);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop_A)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Desktop_A)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JUsuarios vista = new JUsuarios();
        vista.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void men_vis_cuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_vis_cuentaActionPerformed
//        consultar_c con_c=new consultar_c();
//        Desktop_A.add(con_c);
//        con_c.show();
        
        ConsultarCuentas vista = new ConsultarCuentas();
        vista.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_men_vis_cuentaActionPerformed

    private void activar_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activar_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_activar_cActionPerformed

    private void btnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalActionPerformed
        Principal vista = new Principal();
        vista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPrincipalActionPerformed

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
            
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop_A;
    private javax.swing.JMenuItem activar_c;
    private javax.swing.JButton btnPrincipal;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem men_vis_cuenta;
    private javax.swing.JMenu registrar_c;
    private javax.swing.JMenu visualizar_c;
    // End of variables declaration//GEN-END:variables
}
