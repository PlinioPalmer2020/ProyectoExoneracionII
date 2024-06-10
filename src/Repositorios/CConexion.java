
package Repositorios;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class CConexion {
     Connection conectar = null;
    
    String usuario = "sa";
    String contrasena = "Sistema23.";
    String bd = "VENTASYSTEM";
    String ip = "localhost"; //LAPTOP-OQSR4U3M\SQLEXPRESS
    String puerto = "1433";
    
    public Connection establecerConexion(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String cadena = "jdbc:sqlserver://"+ip+":"+puerto+";"+"databaseName="+bd+";"+
            "encrypt=true;trustServerCertificate=true";
            
            conectar = DriverManager.getConnection(cadena,usuario,contrasena);
            
            //JOptionPane.showMessageDialog(null,"Se conecto");

        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"No Se conecto");
             return null;
        }
            return conectar;
    }

}
