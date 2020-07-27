
package General;




import java.awt.Font;
import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class consultar_jefe extends javax.swing.JInternalFrame {
    
     //metodo Conexion()
    Connection con = null; 
    Statement stmt = null;
    PreparedStatement ps;
    ResultSet rs = null;
    FileInputStream fis;
    int longitudBytes;
    
    static InversionSolicitud objCreditoSolicitud;
    int seleccionar=-1;
    DefaultTableModel modelo,modelo1;
    
    public consultar_jefe() {
        initComponents();
        grupo_botones.add(rbtcreditos);
        grupo_botones.add(rbtinversiones);
        
        this.getContentPane().setBackground(java.awt.Color.white);
        
        Conexion();
        
        
        
        modelo = new DefaultTableModel();
        modelo.addColumn("Numero Solicitud");
        modelo.addColumn("Día Solicitud");
        modelo.addColumn("Mes Solicitud");
        modelo.addColumn("Año Solicitud");
        modelo.addColumn("Nombre");
        modelo.addColumn("Identificación");
        modelo.addColumn("Día nacimiento");
        modelo.addColumn("Mes Nacimiento");
        modelo.addColumn("Año Nacimiento");
        modelo.addColumn("Sexo");
        modelo.addColumn("Edad");
        modelo.addColumn("Inversion");
        modelo.addColumn("Timpo de Inversion") ;
        modelo.addColumn("Ciudad") ;
        modelo.addColumn("Dirección");
        modelo.addColumn("Celular");
        modelo.addColumn("Email") ;
        modelo.addColumn("Estado") ;

        modelo1 = new DefaultTableModel();
        modelo1.addColumn("Numero Solicitud");
        modelo1.addColumn("Día Solicitud");
        modelo1.addColumn("Mes Solicitud");
        modelo1.addColumn("Año Solicitud");
        modelo1.addColumn("Codigo Garantia");
        modelo1.addColumn("Nombre");
        modelo1.addColumn("Identificación");
        modelo1.addColumn("Día nacimiento");
        modelo1.addColumn("Mes Nacimiento");
        modelo1.addColumn("Año Nacimiento");
        modelo1.addColumn("Sexo");
        modelo1.addColumn("Edad");
        modelo1.addColumn("Estrato");
        modelo1.addColumn("Estado Civil");
        modelo1.addColumn("Personas a Cargo");
        modelo1.addColumn("Ingresos");
        modelo1.addColumn("Egresos") ;
        modelo1.addColumn("Ciudad") ;
        modelo1.addColumn("Dirección");
        modelo1.addColumn("Celular");
        modelo1.addColumn("Email") ;
        modelo1.addColumn("Estado") ;
        
        this.jTable1.setModel(modelo);
        this.jTable1.setModel(modelo1);
        
         
         SolicitudInversion ventana = new SolicitudInversion();
         
         this.getContentPane().setBackground(java.awt.Color.WHITE);
         
         jLabel1.setFont(new Font("arial", Font.BOLD, 18));
       
         
        
    
     
    }
    
     void bloquear(){
     btnaprob.setEnabled(false);
     btnrech.setEnabled(false);
    
    }
    
    public static String texto1 ="";
    public static String texto2 ="";
    public static String texto3="";
    public static String texto4 ="";
    
    public void Conexion() {
        if(con != null) {
            return;
        }
        
        String url = "jdbc:postgresql://localhost/banco1";
        String password = "postgres1";
        
        try {
            Class.forName("org.postgresql.Driver");
            
            con = DriverManager.getConnection(url, "estevan",password);
            
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

        grupo_botones = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnrech = new javax.swing.JButton();
        btnaprob = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        txt_cod = new javax.swing.JTextField();
        rbtinversiones = new javax.swing.JRadioButton();
        rbtcreditos = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1294, 912));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/General/credito_compra_cartera (1).png"))); // NOI18N
        jLabel1.setText("Aprobar Solicitudes Inversion");

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/buscar.png"))); // NOI18N
        jButton1.setText("Consultar solicitud");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.setBackground(new java.awt.Color(51, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        btnrech.setBackground(new java.awt.Color(204, 255, 255));
        btnrech.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        btnrech.setForeground(new java.awt.Color(0, 51, 51));
        btnrech.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/rechazado.png"))); // NOI18N
        btnrech.setText("Rechazar Solicitud de Inversion");
        btnrech.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnrech.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnrech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrechActionPerformed(evt);
            }
        });

        btnaprob.setBackground(new java.awt.Color(204, 255, 255));
        btnaprob.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        btnaprob.setForeground(new java.awt.Color(0, 51, 51));
        btnaprob.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/aprobado.png"))); // NOI18N
        btnaprob.setText("Aprobar Solicitud de Inversion");
        btnaprob.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnaprob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaprobActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(204, 255, 255));
        salir.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        salir.setForeground(new java.awt.Color(0, 51, 51));
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/retorno.png"))); // NOI18N
        salir.setText("regresar");
        salir.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnrech, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnaprob, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaprob)
                    .addComponent(btnrech)
                    .addComponent(salir))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/General/banco mano amiga.png"))); // NOI18N

        txt_cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codActionPerformed(evt);
            }
        });
        txt_cod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_codKeyTyped(evt);
            }
        });

        rbtinversiones.setBackground(new java.awt.Color(204, 255, 255));
        rbtinversiones.setForeground(new java.awt.Color(255, 255, 255));
        rbtinversiones.setText("Inversiones");

        rbtcreditos.setBackground(new java.awt.Color(204, 255, 255));
        rbtcreditos.setForeground(new java.awt.Color(255, 255, 255));
        rbtcreditos.setText("Creditos");
        rbtcreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtcreditosActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese identificacion");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo usuarios cuentas.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(175, 175, 175)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 871, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbtinversiones)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(rbtcreditos))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton1)
                                            .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(674, 674, 674))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1674, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel30))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_cod))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtcreditos)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbtinversiones)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1142, 1142, 1142))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 729, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          
        if((txt_cod.getText().equals(""))){
                  JOptionPane.showMessageDialog(this, "campo vacio  \n¡Verifique! \n " , "ADVERTENCIA!", JOptionPane.INFORMATION_MESSAGE );
          }
          else{
          Conexion();
       
        try {
          
            if (rbtinversiones.isSelected()){
               int cantfila = jTable1.getRowCount();
             for (int i = cantfila - 1; i >= 0; i--) {
                modelo.removeRow(i);
                
             } 
                
                
            List<InversionSolicitud> lista = new ArrayList<>();
            InversionSolicitud objCs;
            //    Long id = 0l;
            
            
            ps= con.prepareStatement("SELECT * FROM solicitud_inversion WHERE numero_identificacion = ?");            
            ps.setString(1, txt_cod.getText());
            
            rs = ps.executeQuery();
           if(rs.next()) {
                
                objCs= new InversionSolicitud();
                
                objCs.setNumsolc(rs.getInt("numero_sol"));
                objCs.setDiasolicitud(rs.getInt("dia_solicitud"));
                objCs.setMessolicitud(rs.getInt("mes_solicitud"));
                objCs.setAñosolicitud(rs.getInt("ano_solicitud"));
                objCs.setNombrec(rs.getString("nombre_cliente"));
                objCs.setCedulac(rs.getInt("numero_identificacion"));
                objCs.setDianacimiento(rs.getInt("dia_nacimiento"));
                objCs.setMesnacimiento(rs.getInt("mes_nacimiento"));
                objCs.setAñonacimiento(rs.getInt("ano_nacimiento"));
                objCs.setSexoc(rs.getString("sexo_cliente"));
                objCs.setEdadc(rs.getInt("edad_cliente"));
                objCs.setInversion(rs.getInt("dinero_invertir"));
               objCs.setTim_iv(rs.getInt("tiem_inv"));
               objCs.setCiudadc(rs.getString("ciudad"));
                objCs.setDireccionc(rs.getString("direccion"));
               objCs.setCelularc(rs.getInt("numero_celular"));
                objCs.setEmailc(rs.getString("email"));
               objCs.setEstado(rs.getString("estado"));

                lista.add(objCs);
            }else {
                JOptionPane.showMessageDialog(null, "No existe la solicitud de inversion");
            }
            String[] datos;

            for (InversionSolicitud elem : lista) {
                datos = new String[18];
                
                datos[0] = Integer.toString(elem.numsolc);
                datos[1]= Integer.toString(elem.diasolicitud);
                datos[2]= Integer.toString(elem.messolicitud);
                datos[3]= Integer.toString(elem.añosolicitud);
                datos[4] = elem.nombrec;
                datos[5] = Integer.toString(elem.cedulac);
                datos[6]= Integer.toString(elem.dianacimiento);
                datos[7]= Integer.toString(elem.mesnacimiento);
                datos[8]= Integer.toString(elem.añonacimiento);
                datos[9] = elem.sexoc;
                datos[10] = Integer.toString(elem.edadc);
                datos[11] = Integer.toString(elem.inversion);
                datos[12] = Integer.toString(elem.tim_iv);
                datos[13] = elem.getCiudadc();
                datos[14] = elem.direccionc;
                datos[15] = Integer.toString(elem.celularc);
                datos[16] = elem.emailc;
                datos[17] = elem.estado;

                
                modelo.addRow(datos);
            }
            jTable1.setModel(modelo);
           }
            
            if (rbtcreditos.isSelected()){
           
           
            
                int cantfila1 = jTable1.getRowCount();
               
               for (int i = cantfila1 - 1; i >= 0; i--) {
                  modelo1.removeRow(i);
  
               } 
                List<CreditoSolicitud> lista = new ArrayList<>();
                 CreditoSolicitud objCreditoSolicitud;
                
            
            
            ps= con.prepareStatement("SELECT * FROM solicitud_creditos WHERE numero_identificacion = ?");            
            ps.setString(1, txt_cod.getText());
            
            rs = ps.executeQuery();
           
           
            if(rs.next()) {
                
                objCreditoSolicitud= new CreditoSolicitud();
                
                objCreditoSolicitud.setNumsolc(rs.getInt("numero_sol"));
                objCreditoSolicitud.setDiasolicitud(rs.getInt("dia_solicitud"));
                objCreditoSolicitud.setMesolicitud(rs.getInt("mes_solicitud"));
                objCreditoSolicitud.setAñosolicitud(rs.getInt("ano_solicitud"));
                objCreditoSolicitud.setCodigogarantia(rs.getInt("codigo_garantia"));
                objCreditoSolicitud.setNombrec(rs.getString("nombre_cliente"));
                objCreditoSolicitud.setCedulac(rs.getInt("numero_identificacion"));
                objCreditoSolicitud.setDianacimiento(rs.getInt("dia_nacimiento"));
                objCreditoSolicitud.setMesnacimiento(rs.getInt("mes_nacimiento"));
                objCreditoSolicitud.setAñonacimiento(rs.getInt("ano_nacimiento"));
                objCreditoSolicitud.setSexoc(rs.getString("sexo_cliente"));
                objCreditoSolicitud.setEdadc(rs.getInt("edad_cliente"));
                objCreditoSolicitud.setEstratoc(rs.getInt("estrato_cliente"));
                objCreditoSolicitud.setEstadocivil(rs.getString("estado_civil"));
                objCreditoSolicitud.setPersonascargo(rs.getInt("personas_cargo"));
                objCreditoSolicitud.setIngresos(rs.getInt("ingresos"));
                objCreditoSolicitud.setEgresos(rs.getInt("egresos"));
                objCreditoSolicitud.setCiudadc(rs.getString("ciudad"));
                objCreditoSolicitud.setDireccionc(rs.getString("direccion"));
                objCreditoSolicitud.setCelularc(rs.getInt("numero_celular"));
                objCreditoSolicitud.setEmailc(rs.getString("email"));
                objCreditoSolicitud.setEstado(rs.getString("estado"));

                
                lista.add(objCreditoSolicitud);
            }else {
                JOptionPane.showMessageDialog(null, "No existe  la solicitud de credito");
            }
            String[] datos;

            for (CreditoSolicitud elem : lista) {
                datos = new String[22];
                
                datos[0] = Integer.toString(elem.numsolc);
                datos[1]= Integer.toString(elem.diasolicitud);
                datos[2]= Integer.toString(elem.messolicitud);
                datos[3]= Integer.toString(elem.añosolicitud);
                datos[4] = Integer.toString(elem.codigogarantia);
                datos[5] = elem.nombrec;
                datos[6] = Integer.toString(elem.cedulac);
                datos[7]= Integer.toString(elem.dianacimiento);
                datos[8]= Integer.toString(elem.mesnacimiento);
                datos[9]= Integer.toString(elem.añonacimiento);
                datos[10] = elem.sexoc;
                datos[11] = Integer.toString(elem.edadc);
                datos[12] = Integer.toString(elem.estratoc);
                datos[13] = elem.estadocivil;
                datos[14] = Integer.toString(elem.personascargo);
                datos[15] = Integer.toString(elem.ingresos);
                datos[16] = Integer.toString(elem.egresos);
                datos[17] = elem.ciudadc;
                datos[18] = elem.direccionc;
                datos[19] = Integer.toString(elem.celularc);
                datos[20] = elem.emailc;
                datos[21] = elem.estado;

                
                modelo1.addRow(datos);
            }
            jTable1.setModel(modelo1);}
        } catch (SQLException ex) {
            Logger.getLogger(consultar_jefe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        seleccionar=jTable1.rowAtPoint(evt.getPoint());
         txt_cod.setText(String.valueOf(jTable1.getValueAt(seleccionar, 0)));
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnrechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrechActionPerformed
         if (rbtinversiones.isSelected()){
        try {
             stmt= con.createStatement();
            if(seleccionar!=-1){ rs = stmt.executeQuery("update solicitud_inversion set estado='Rechazado' where numero_identificacion='"+txt_cod.getText()+"';");
            }else{
                JOptionPane.showMessageDialog(this, "Debe seleccionar un registro");
            }
                
        } catch (Exception e) {
            if(e.getMessage().contains("No results")){
                JOptionPane.showMessageDialog(this, "Solicitud Rechazada");
            }
         } 
         
   
        } 
          if (rbtcreditos.isSelected()){
        try {
             stmt= con.createStatement();
            if(seleccionar!=-1){ rs = stmt.executeQuery("update solicitud_creditos set estado='Rechazado' where numero_identificacion='"+txt_cod.getText()+"';");
            }else{
                JOptionPane.showMessageDialog(this, "Debe seleccionar un registro");
            }
                
        } catch (Exception e) {
            if(e.getMessage().contains("No results")){
                JOptionPane.showMessageDialog(this, "Solicitud Rechazada");
            }
         } 
         
   
        }
    }//GEN-LAST:event_btnrechActionPerformed
    
    private void btnaprobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaprobActionPerformed
       
        if (rbtinversiones.isSelected()){
        try {
            
            stmt= con.createStatement();
            if(seleccionar!=-1){
                rs = stmt.executeQuery("update solicitud_inversion set estado='Aprobado' where numero_identificacion='"+txt_cod.getText()+"';");
            }else{
                JOptionPane.showMessageDialog(this, "Debe seleccionar un registro");
            }

           
        } catch (Exception e) {
            if(e.getMessage().contains("No results")){
                JOptionPane.showMessageDialog(this, "Solicitud Aceptada");
            }
           
                      }     
        
       }
      if (rbtcreditos.isSelected()){
        try {
            
            stmt= con.createStatement();
            if(seleccionar!=-1){
                rs = stmt.executeQuery("update solicitud_creditos set estado='Aprobado' where numero_identificacion='"+txt_cod.getText()+"';");
            }else{
                JOptionPane.showMessageDialog(this, "Debe seleccionar un registro");
            }

           
        } catch (Exception e) {
            if(e.getMessage().contains("No results")){
                JOptionPane.showMessageDialog(this, "Solicitud Aceptada");
            }
           
                      }     
        
       }
   
   
   
   
   
   
    }//GEN-LAST:event_btnaprobActionPerformed

    private void rbtcreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtcreditosActionPerformed
    
    }//GEN-LAST:event_rbtcreditosActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
         Principal vista = new Principal();
        vista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void txt_codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codActionPerformed
        
    }//GEN-LAST:event_txt_codActionPerformed

    private void txt_codKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codKeyTyped
      char validar=evt.getKeyChar();
      if(Character.isLetter(validar)){
      getToolkit().beep();
      evt.consume();
      JOptionPane.showMessageDialog(rootPane,"ingresar solo numeros" );
      
      }
    }//GEN-LAST:event_txt_codKeyTyped

    
//    public static void main(String args[]) {
//        
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new RegistroSolicitudInv().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaprob;
    private javax.swing.JButton btnrech;
    private javax.swing.ButtonGroup grupo_botones;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbtcreditos;
    private javax.swing.JRadioButton rbtinversiones;
    private javax.swing.JButton salir;
    private javax.swing.JTextField txt_cod;
    // End of variables declaration//GEN-END:variables

    private void validarid(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
