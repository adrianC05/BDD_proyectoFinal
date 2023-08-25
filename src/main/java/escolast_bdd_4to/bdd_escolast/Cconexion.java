package escolast_bdd_4to.bdd_escolast;

//@author Adrian Carrion

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class  Cconexion {
   public static Connection estblecerConexion(){
        Connection conectar = null;
        
        String serverName = "ADRIANCARRION\\SQLSERVER1";
        String usuario = "sa";
        String contrasenia = "1982";
        String bd = "escolast";
        String ip = "192.168.1.2";
        String puerto = "1433";

        String cadena = "jdbc:sqlserver://" + ip + ":" + puerto + ";databaseName=" + bd + ";serverName=" + serverName;

        try {
            conectar = DriverManager.getConnection(cadena, usuario, contrasenia);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar la base de datos PUCTA HERMANO UN GENIO: " + e.toString());
        }
        return conectar;
        }
}