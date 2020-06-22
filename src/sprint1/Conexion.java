
package sprint1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    
    private final String user = "postgres";
    private final String password = "postgres1";
    private final String url = "jdbc:postgresql://localhost/BANCOsf";
    private Connection con = null;
    
    public Connection getConexion()
    {
        
        try{
            Class.forName("org.postgresql.Driver");
            con = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
            
        } catch(SQLException e)
        {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
      return con;  
    }

}
