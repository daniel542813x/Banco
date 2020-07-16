package sprint1;
import javax.swing.*;
import java.sql.*;

 public class conectividad{
   Connection conexion=null;
   
   String pass ="";
   String user= "estevan" ;
 
   public void conectarme(){
       
        try {
            conexion
= DriverManager.getConnection("jdbc:postgresql://localhost:5432/banco1",user,pass);
          JOptionPane.showMessageDialog(null,"estas conectado");
        }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,ex);
       }
   
   }
  public void ingreso(String script)  {
  PreparedStatement p= null;
       conectarme();
    try {
          p=conexion.prepareStatement(script);
          p.executeUpdate();
        }catch(SQLException ex){

                JOptionPane.showMessageDialog(null,ex);
       }
   
  
  }
 
 }

