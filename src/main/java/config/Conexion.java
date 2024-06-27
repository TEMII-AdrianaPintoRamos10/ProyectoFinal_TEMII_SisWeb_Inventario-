package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static final String user = "root";
    private static final String password = "";
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/bd_inventario"; 
    private static Connection conexion = null;
//    private static Conexion instancia;

    private Conexion() {

    }

    public static Connection Conectar() {
        try {
            Class.forName(driver);
            conexion = (Connection) DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            System.out.println("Algo ha salido mal");
        } catch (SQLException ex) {
            System.out.println("No se ha podido conectar");
        }
        return conexion;
    }
    
    public static void cerrarConexion() {
        try {
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("No se ha podido cerrar la conexion");
        }
    }


}
