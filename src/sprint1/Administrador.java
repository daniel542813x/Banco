
package sprint1;

import General.Principal;
import General.login;


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
        jMenuItem2 = new javax.swing.JMenuItem();
        visualizar_c = new javax.swing.JMenu();
        activar_c = new javax.swing.JMenuItem();
        men_vis_cuenta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador");

        btnPrincipal.setBackground(new java.awt.Color(153, 255, 255));
        btnPrincipal.setFont(new java.awt.Font("Sitka Small", 1, 16)); // NOI18N
        btnPrincipal.setForeground(new java.awt.Color(0, 51, 51));
        btnPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/retorno.png"))); // NOI18N
        btnPrincipal.setText("salir");
        btnPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPrincipal.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
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
                .addContainerGap(426, Short.MAX_VALUE)
                .addComponent(btnPrincipal)
                .addGap(27, 27, 27))
        );
        Desktop_ALayout.setVerticalGroup(
            Desktop_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Desktop_ALayout.createSequentialGroup()
                .addContainerGap(282, Short.MAX_VALUE)
                .addComponent(btnPrincipal)
                .addGap(22, 22, 22))
        );

        jMenuBar1.setForeground(new java.awt.Color(153, 255, 255));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        registrar_c.setBackground(new java.awt.Color(0, 0, 0));
        registrar_c.setForeground(new java.awt.Color(0, 51, 51));
        registrar_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/archivom.png"))); // NOI18N
        registrar_c.setText("registrar");
        registrar_c.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(0, 51, 51));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/registro.png"))); // NOI18N
        jMenuItem1.setText("registrar empleados");
        jMenuItem1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jMenuItem1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        registrar_c.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(0, 51, 51));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/regsecion.png"))); // NOI18N
        jMenuItem2.setText("registrar cuentas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        registrar_c.add(jMenuItem2);

        jMenuBar1.add(registrar_c);

        visualizar_c.setBackground(new java.awt.Color(0, 0, 0));
        visualizar_c.setForeground(new java.awt.Color(0, 51, 51));
        visualizar_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cuentas.png"))); // NOI18N
        visualizar_c.setText("cuentas");
        visualizar_c.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N

        activar_c.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N
        activar_c.setForeground(new java.awt.Color(0, 51, 51));
        activar_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/eliminarm.png"))); // NOI18N
        activar_c.setText("Eliminar cuentas ");
        activar_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activar_cActionPerformed(evt);
            }
        });
        visualizar_c.add(activar_c);

        men_vis_cuenta.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N
        men_vis_cuenta.setForeground(new java.awt.Color(0, 51, 51));
        men_vis_cuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/visualizarms.png"))); // NOI18N
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
        registrar_cuentas reg =new registrar_cuentas();
      reg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_activar_cActionPerformed

    private void btnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalActionPerformed
        login vista  = new login();
        vista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPrincipalActionPerformed

    private void jMenuItem1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jMenuItem1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1AncestorAdded

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       registrar_cuentas reg =new registrar_cuentas();
      reg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem men_vis_cuenta;
    private javax.swing.JMenu registrar_c;
    private javax.swing.JMenu visualizar_c;
    // End of variables declaration//GEN-END:variables
}
