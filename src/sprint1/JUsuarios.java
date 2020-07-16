package sprint1;

import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class JUsuarios extends javax.swing.JFrame {

    //metodo Conexion()
    Connection con = null; 
    Statement stmt = null;
    PreparedStatement ps;
    ResultSet rs = null;
    FileInputStream fis;
    int longitudBytes;
    
    //Solo para los metodos de guardar imagen y consultar
    //Conexion con = new Conexion(); 
       
    public JUsuarios() {
        initComponents();
        this.setTitle("Registros Empleados");
        setLocationRelativeTo(null);
        btnConsultar.setVisible(false);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_num_documento = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_aceptar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_cod_empleado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbx_sexo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txt_nacionalidad = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_fec_nacimiento = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cbx_est_civil = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txt_fec_ingreso = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cbx_cargo = new javax.swing.JComboBox<>();
        txt_telefono = new javax.swing.JTextField();
        cbx_tipo_docu = new javax.swing.JComboBox<>();
        lbl_foto = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JButton();
        lblAvisoCorreo3 = new javax.swing.JLabel();
        lblAvisoCorreo = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnMenuPrin = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre y Apellidos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 20));

        txt_nombre.setBackground(new java.awt.Color(204, 204, 255));
        txt_nombre.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(0, 0, 0));
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 180, -1));

        jLabel2.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo Documento");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 130, 20));

        jLabel3.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nº documento");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 120, 20));

        txt_num_documento.setBackground(new java.awt.Color(204, 204, 255));
        txt_num_documento.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        txt_num_documento.setForeground(new java.awt.Color(0, 0, 0));
        txt_num_documento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_num_documentoActionPerformed(evt);
            }
        });
        txt_num_documento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_num_documentoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_num_documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 180, 20));

        txt_direccion.setBackground(new java.awt.Color(204, 204, 255));
        txt_direccion.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        txt_direccion.setForeground(new java.awt.Color(0, 0, 0));
        txt_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccionActionPerformed(evt);
            }
        });
        getContentPane().add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 180, -1));

        jLabel4.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dirección");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 90, 20));

        jLabel5.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefono");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 130, 20));

        jLabel6.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Correo Electronico");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 140, 20));

        btn_aceptar.setBackground(new java.awt.Color(255, 102, 0));
        btn_aceptar.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        btn_aceptar.setText("Aceptar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 110, 40));

        jLabel7.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Codigo empleado");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        txt_cod_empleado.setBackground(new java.awt.Color(153, 102, 255));
        txt_cod_empleado.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        txt_cod_empleado.setForeground(new java.awt.Color(255, 255, 255));
        txt_cod_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cod_empleadoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_cod_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 110, 30));

        jLabel8.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sexo");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, -1, 20));

        cbx_sexo.setBackground(new java.awt.Color(0, 102, 255));
        cbx_sexo.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        cbx_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Femenino", "Masculino" }));
        getContentPane().add(cbx_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, 140, 30));

        jLabel10.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Pais de Origen");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 120, 20));

        txt_nacionalidad.setBackground(new java.awt.Color(204, 204, 255));
        txt_nacionalidad.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        txt_nacionalidad.setForeground(new java.awt.Color(0, 0, 0));
        txt_nacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nacionalidadActionPerformed(evt);
            }
        });
        txt_nacionalidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nacionalidadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nacionalidadKeyTyped(evt);
            }
        });
        getContentPane().add(txt_nacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 180, -1));

        txt_email.setBackground(new java.awt.Color(204, 204, 255));
        txt_email.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        txt_email.setForeground(new java.awt.Color(0, 0, 0));
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        txt_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_emailKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_emailKeyTyped(evt);
            }
        });
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 180, -1));

        jLabel9.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fecha de Nacimiento ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 140, 20));

        txt_fec_nacimiento.setBackground(new java.awt.Color(204, 204, 255));
        txt_fec_nacimiento.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        txt_fec_nacimiento.setForeground(new java.awt.Color(0, 0, 0));
        txt_fec_nacimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_fec_nacimientoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_fec_nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 180, -1));

        jLabel11.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Estado Civil");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 140, 20));

        cbx_est_civil.setBackground(new java.awt.Color(0, 102, 255));
        cbx_est_civil.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        cbx_est_civil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Soltero", "Casado" }));
        getContentPane().add(cbx_est_civil, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 170, 30));

        jLabel12.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Fecha de Ingreso");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, -1, 20));

        txt_fec_ingreso.setBackground(new java.awt.Color(204, 204, 255));
        txt_fec_ingreso.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        txt_fec_ingreso.setForeground(new java.awt.Color(0, 0, 0));
        txt_fec_ingreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_fec_ingresoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_fec_ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, 140, 30));

        jLabel13.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Cargo");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, 70, 20));

        cbx_cargo.setBackground(new java.awt.Color(0, 102, 255));
        cbx_cargo.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        cbx_cargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Auxiliar de Credito e Inversion", "Jefe de Credito e Inversion" }));
        getContentPane().add(cbx_cargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, 140, 30));

        txt_telefono.setBackground(new java.awt.Color(204, 204, 255));
        txt_telefono.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(0, 0, 0));
        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });
        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 180, -1));

        cbx_tipo_docu.setBackground(new java.awt.Color(0, 102, 255));
        cbx_tipo_docu.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        cbx_tipo_docu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Cedula de Ciudadania", "Pasaporte", "Cedula de Extranjeria" }));
        getContentPane().add(cbx_tipo_docu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 180, 30));

        lbl_foto.setBackground(new java.awt.Color(51, 51, 255));
        lbl_foto.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lbl_foto.setForeground(new java.awt.Color(153, 0, 0));
        lbl_foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empleado.png"))); // NOI18N
        lbl_foto.setAutoscrolls(true);
        lbl_foto.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        getContentPane().add(lbl_foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 230, 220));

        btn_agregar.setBackground(new java.awt.Color(0, 204, 204));
        btn_agregar.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(0, 0, 0));
        btn_agregar.setText("Agregar Foto");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, -1, -1));

        lblAvisoCorreo3.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblAvisoCorreo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 140, 10));

        lblAvisoCorreo.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblAvisoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 140, 10));

        btnCancelar.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelar.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 130, 40));

        btnBuscar.setBackground(new java.awt.Color(0, 102, 255));
        btnBuscar.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 80, 20));

        btnModificar.setBackground(new java.awt.Color(0, 102, 102));
        btnModificar.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 130, 40));

        btnConsultar.setBackground(new java.awt.Color(0, 51, 255));
        btnConsultar.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, 130, 40));

        btnMenuPrin.setBackground(new java.awt.Color(0, 204, 204));
        btnMenuPrin.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        btnMenuPrin.setForeground(new java.awt.Color(0, 0, 0));
        btnMenuPrin.setText("Menu Principal");
        btnMenuPrin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrinActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenuPrin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo usuarios cuentas.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void validacionCaracteres(java.awt.event.KeyEvent evento){
        // vAMOS A CREAR UN EVENTO QUE TENGA TODOS LOS CARACTERES         
        if (evento.getKeyChar()>=33 && evento.getKeyChar()<=64 //Validacion para que no contenenga esos caracteres de codigo ASCII de 33 que contiene (!) hasta 64 que contiene (@)           
                || evento.getKeyChar()>=91 && evento.getKeyChar()<=96 //de 91 qu contiene -(- hasta 96 que contiene (-)
                || evento.getKeyChar()>=123 && evento.getKeyChar()<=208 // de 123 que contiene ({) hasta 208 que contiene (simbolo extraño)
                || evento.getKeyChar()>=210 && evento.getKeyChar()<=240 // de 210 a 240 contienen (simbolos raros)
                || evento.getKeyChar()>=242 && evento.getKeyChar()<=255) { // de 242 a 255 contienen (simbolos raros)            
        
            evento.consume();
            JOptionPane.showMessageDialog(this, "Ha ingresado datos erróneos, \nPor favor verifique que solo haya letras");
        }
        
//        System.out.print("Soy la letra:  " + evento.getKeyChar()+ " y mi numero ASCCI pertenece a "); //Nos muestra que letra se esta pulsando 
//       System.out.println(evento.getKeyChar()+ 0);
        
    }
    
    public void validarCamposErroneosCorreo(){
               
        if(txt_email.getText().isEmpty()){
            lblAvisoCorreo.setText("");
        }else if(!txt_email.getText().contains("@")
                || !txt_email.getText().contains(".")){
            lblAvisoCorreo.setText("*Correo no Valido");
        }else{
            lblAvisoCorreo.setText("");
        }
        
    }
    
    public void validarFechas(java.awt.event.KeyEvent evento){
        if (evento.getKeyChar() >=32 && evento.getKeyChar() <=46      
            || evento.getKeyChar() >=58 && evento.getKeyChar() <=255) {
            
            evento.consume();
            JOptionPane.showMessageDialog(this, "Fecha invalida por favor verifique \nEjemplo: dd/MM/yyyy");
            
        }
    }
    
    public void validarNumeros(java.awt.event.KeyEvent evento){
        if (evento.getKeyChar() >=33 && evento.getKeyChar() <=39
            || evento.getKeyChar() >=42 && evento.getKeyChar() <=47      
            || evento.getKeyChar() >=58 && evento.getKeyChar() <=255) {
            
            evento.consume();
            JOptionPane.showMessageDialog(this, "Ha ingresado datos erróneos, \nPor favor verifique que solo haya numeros");
            
        }
    }
    
    public void validarCorreo(java.awt.event.KeyEvent evento){
        if (evento.getKeyChar() >=32 && evento.getKeyChar() <=44
            || evento.getKeyChar() ==47
            || evento.getKeyChar() >=58 && evento.getKeyChar() <=63 
            || evento.getKeyChar() >=91 && evento.getKeyChar() <=94
            || evento.getKeyChar() ==96   
            || evento.getKeyChar() >=123 && evento.getKeyChar() <=255) {
            
            evento.consume();
            JOptionPane.showMessageDialog(this, "Este no es un correo valido por favor \nverifique que solo haya letras o números");
            
        }
    }
    
    private void limpiar(){
        
        this.txt_cod_empleado.setText("");
        this.txt_nombre.setText("");
        this.txt_num_documento.setText("");
        this.txt_nacionalidad.setText("");
        this.txt_direccion.setText("");
        this.txt_telefono.setText(""); 
        this.txt_email.setText("");
        this.txt_fec_nacimiento.setText("");
        this.txt_fec_ingreso.setText("");
        this.cbx_cargo.setSelectedIndex(0);
        this.cbx_est_civil.setSelectedIndex(0);
        this.cbx_sexo.setSelectedIndex(0);
        this.cbx_tipo_docu.setSelectedIndex(0);
        
    }
    
    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccionActionPerformed

    /*Aqui añadimos los campos ingresados por el usuario a la base de datos
    */
    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        // Aqui obtenemos los datos de las variables en el frame y los guardamos en cadenas        
        
        /*Aqui validamos los campos vacios, si al ingresar un dato y los demas no son digitados
        este enviara un mensaje que le pedira llenar los mensajes
        se debe mejorar como metodo para que su llamado no sea tan complicado
        */
        Conexion();
        
        if((txt_cod_empleado.getText().equals(""))    || //1
          (txt_nombre.getText().equals(""))            || //2
          (cbx_tipo_docu.getSelectedItem().equals("")) || //3
          (txt_num_documento.getText().equals(""))     || //4
          (txt_nacionalidad.getText().equals(""))      || //5     
          (cbx_sexo.getSelectedItem().equals(""))      || //6      
          (txt_direccion.getText().equals(""))         || //7 
          (txt_telefono.getText().equals(""))          || //8 
          (txt_email.getText().equals(""))             || //9      
          (txt_fec_nacimiento.getText().equals(""))    || //10 
          (cbx_est_civil.getSelectedItem().equals("")) || //11
          (txt_fec_ingreso.getText().equals(""))       || //12                     
          (cbx_cargo.getSelectedItem().equals(""))) {     //13
            JOptionPane.showMessageDialog(this, "Rellene todos los campos \n¡Verifique! \n " , "ADVERTENCIA!", JOptionPane.INFORMATION_MESSAGE );       
        }else{
        
            try {  
                
               /*Aqui se añaden los campos a la base de datos 
                */
                
                String cadena1,cadena2, cadena3, cadena4, cadena5, cadena6, cadena7,cadena8, cadena9, cadena10, cadena11, cadena12, cadena13;
        
                cadena1 = txt_cod_empleado.getText();
                cadena2 = txt_nombre.getText();
                cadena3 = cbx_tipo_docu.getSelectedItem().toString();
                cadena4 = txt_num_documento.getText();
                cadena5 = txt_nacionalidad.getText();
                cadena6 = cbx_sexo.getSelectedItem().toString(); 
                cadena7 = txt_direccion.getText(); 
                cadena8 = txt_telefono.getText();
                cadena9 = txt_email.getText();
                cadena10 = txt_fec_nacimiento.getText();
                cadena11 = cbx_est_civil.getSelectedItem().toString();
                cadena12 = txt_fec_ingreso.getText();
                cadena13 = cbx_cargo.getSelectedItem().toString();
                
                int z;
                stmt =  con.createStatement();
                z = stmt.executeUpdate("INSERT INTO registrar_cuentas_empleados VALUES('"+cadena1+"','"+cadena2+"','"+cadena3+"','"+cadena4
                                                                                    +"','"+cadena5+"','"+cadena6+"','"+cadena7+"','"+cadena8
                                                                                    +"','"+cadena9+"','"+cadena10+"','"+cadena11+"','"+cadena12
                                                                                    +"','"+cadena13+"')");            
                if (z == 1) {
                    System.out.println("Se agrego el registro a la base de datos");
                }else if(z == 0){
                    System.out.println("Ocurrio un problema al agregar el registro");                     
                }
                
            // si hay algun error en el codigo de postgres se mostrara este mensaje 
            } catch (SQLException ex) {                                   
            System.out.println("Error de Conexion");
            Logger.getLogger(JUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        } 

         javax.swing.JOptionPane.showMessageDialog(this,"La cuenta de empleado se registro correctamente! \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
         limpiar();
        }
               
    }//GEN-LAST:event_btn_aceptarActionPerformed

    /*
    Esta linea de codigo se refiere el metodo limpiar despues de que un registro ha sido ingresado
    y tambien uno que no fue ingrsado
    */
    
    
    /*
    Esta linea de codigo se refiere al ingreo inavelido de numeros para el caracter de nombre, 
    el metodo no permite ingreasar numeros al momento de digitar 
    */
    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
         validacionCaracteres(evt);
 //           javax.swing.JOptionPane.showMessageDialog(this,
 //           "POR FAVOR SOLO INGRESE LETRAS! \n","ADVERTENCIA!",javax.swing.JOptionPane.INFORMATION_MESSAGE);        
    }//GEN-LAST:event_txt_nombreKeyTyped

    
    /*
    Esta linea de codigo se refiere al ingreo inavelido de letrar para el caracter de numero documento, 
    el metodo no permite ingreasar letras al momento de digitar 
    */
    private void txt_num_documentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_num_documentoKeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_txt_num_documentoKeyTyped

    /*
    Esta linea de codigo se refiere a que la imagen del empleado que dese visualizar puede obtener cualquiera de su dispositivo
    o tomar las que dejo en la carpeta imagenes de este proyecto
    */
    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        lbl_foto.setIcon(null);
        JFileChooser j=new JFileChooser();
        j.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int estado = j.showOpenDialog(null);
        if (estado== JFileChooser.APPROVE_OPTION) {
            try {
                fis = new FileInputStream(j.getSelectedFile());
                
                this.longitudBytes=(int) j.getSelectedFile().length();
                try {
                    Image icono =ImageIO.read(j.getSelectedFile()).getScaledInstance(lbl_foto.getWidth(),
                                      lbl_foto.getHeight(), Image.SCALE_DEFAULT);
                    
                    lbl_foto.setIcon(new ImageIcon(icono));
                    lbl_foto.updateUI();
                    
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(rootPane, "imagen: "+ex);
                }
                
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
            
        }
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed

    /*
    Esta linea de codigo se refiere al ingreo inavelido de letrar para el caracter de telefono, 
    el metodo no permite ingreasar letras al momento de digitar 
    */
    private void txt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyTyped
        validarNumeros(evt);
        
    }//GEN-LAST:event_txt_telefonoKeyTyped

    private void txt_nacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nacionalidadActionPerformed

    }//GEN-LAST:event_txt_nacionalidadActionPerformed

    private void txt_nacionalidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nacionalidadKeyTyped
        validacionCaracteres(evt);
    }//GEN-LAST:event_txt_nacionalidadKeyTyped

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
         
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_emailKeyTyped
        validarCorreo(evt);
    }//GEN-LAST:event_txt_emailKeyTyped

    private void txt_nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyReleased
        
        
    }//GEN-LAST:event_txt_nombreKeyReleased

    private void txt_nacionalidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nacionalidadKeyReleased
      
    }//GEN-LAST:event_txt_nacionalidadKeyReleased

    private void txt_emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_emailKeyReleased
        validarCamposErroneosCorreo();
        
    }//GEN-LAST:event_txt_emailKeyReleased

    private void txt_fec_nacimientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fec_nacimientoKeyTyped
        validarFechas(evt);
    }//GEN-LAST:event_txt_fec_nacimientoKeyTyped

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        JOptionPane.showMessageDialog(this, "No ha terminado de diligenciar la \ninformacion del empleado \n" +
                                            "\n¡Está seguro de que desea \nCancelar el registro!");
        limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
                
        try {           
            Conexion();
            ps= con.prepareStatement("SELECT * FROM registrar_cuentas_empleados WHERE cod_empleado = ?");            
            ps.setString(1, txt_cod_empleado.getText());
            
            rs = ps.executeQuery();
            
            if(rs.next()){
       //         txt_cod_empleado.setText(rs.getString("cod_empleado"));
                txt_nombre.setText(rs.getString("nombre"));
                
                txt_num_documento.setText(rs.getString("num_documento"));
                txt_nacionalidad.setText(rs.getString("nacionalidad"));       
                txt_direccion.setText(rs.getString("direccion"));
                txt_telefono.setText(rs.getString("telefono"));
                txt_email.setText(rs.getString("email"));
                txt_fec_nacimiento.setText(rs.getString("fec_nacimiento"));              
                txt_fec_ingreso.setText(rs.getString("fec_ingreso"));   
                cbx_tipo_docu.setSelectedItem(rs.getString("tipo_documento"));
                cbx_sexo.setSelectedItem(rs.getString("sexo"));                
                cbx_cargo.setSelectedItem(rs.getString("cargo"));
                cbx_est_civil.setSelectedItem(rs.getString("est_civil"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe un empleado con este codigo");
            }
                       
        } catch (SQLException ex) {
            Logger.getLogger(JUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
       
        Conexion();
        
        try {
            ps = con.prepareStatement("UPDATE registrar_cuentas_empleados SET nombre=?, tipo_documento=?, num_documento=?, nacionalidad=?,"
                                                                          + " sexo=?, direccion=?, telefono=?, email=?, fec_nacimiento=?,"
                                                                          + " est_civil=?, fec_ingreso=?, cargo=? WHERE cod_empleado=?");
            ps.setString(1, txt_nombre.getText());
            ps.setString(2, cbx_tipo_docu.getSelectedItem().toString());
            ps.setString(3, txt_num_documento.getText());
            ps.setString(4, txt_nacionalidad.getText());
            ps.setString(5, cbx_sexo.getSelectedItem().toString());
            ps.setString(6, txt_direccion.getText());
            ps.setString(7, txt_telefono.getText());
            ps.setString(8, txt_email.getText());
            ps.setString(9, txt_fec_nacimiento.getText());
            ps.setString(10, cbx_est_civil.getSelectedItem().toString());
            ps.setString(11, txt_fec_ingreso.getText());
            ps.setString(12, cbx_cargo.getSelectedItem().toString());
            ps.setString(13, txt_cod_empleado.getText());
            
            int res = ps.executeUpdate();
            
            if(res > 0){
                 
            } else {
                 JOptionPane.showMessageDialog(null, "Error al Modificar el registro");
                
            }
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txt_fec_ingresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fec_ingresoKeyTyped
        validarFechas(evt);
    }//GEN-LAST:event_txt_fec_ingresoKeyTyped

    public void consulta(JTable tabla, String script) throws Exception{
        Statement codigoSQL = null;
        ResultSet resultados = null;
        
        DefaultTableModel t = new DefaultTableModel();
        tabla.setModel(t);
        
        Conexion();
        
        try {
            codigoSQL = con.createStatement();
            resultados = codigoSQL.executeQuery(script);
            ResultSetMetaData datos = resultados.getMetaData();
            
            int numeroColumna = datos.getColumnCount();
            
            for(int i = 1; i<=numeroColumna; i++){
                t.addColumn(datos.getColumnLabel(1));            
        }
            
            while(resultados.next()){
                Object [] f = new Object[numeroColumna];
                
                for(int i=0; i<numeroColumna; i++){
                    f[i] = resultados.getObject(i+1);
                    
                }
                t.addRow(f);
                
            }                        
        } catch (SQLException ex) {
            Logger.getLogger(JUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        ConsultarCuentas vista = new ConsultarCuentas();
        vista.setVisible(true);
        this.dispose();       
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnMenuPrinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrinActionPerformed
        Administrador vista = new Administrador();
        vista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuPrinActionPerformed

    private void txt_cod_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cod_empleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cod_empleadoActionPerformed

    private void txt_num_documentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_num_documentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_num_documentoActionPerformed

    
    /*
    Esta linea de codigo se refiere a la conexion como metodo por favor no elimine 
    el atributo conn ya que las demas funciones dependen de esta como metodo ni 
    tampoco elimine sus declaraciones
    */
    public void Conexion() {
        if(con != null) {
            return;
        }
        
        String url = "jdbc:postgresql://localhost/banco1";
        String password = "";
        
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
            java.util.logging.Logger.getLogger(JUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnMenuPrin;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JComboBox<String> cbx_cargo;
    private javax.swing.JComboBox<String> cbx_est_civil;
    private javax.swing.JComboBox<String> cbx_sexo;
    private javax.swing.JComboBox<String> cbx_tipo_docu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAvisoCorreo;
    private javax.swing.JLabel lblAvisoCorreo3;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lbl_foto;
    private javax.swing.JTextField txt_cod_empleado;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_fec_ingreso;
    private javax.swing.JTextField txt_fec_nacimiento;
    private javax.swing.JTextField txt_nacionalidad;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_num_documento;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
