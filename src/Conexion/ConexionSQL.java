/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nancy
 */
public class ConexionSQL {
    

    // Librería de MySQL
    public String driver = "com.mysql.jdbc.Driver";

    // Nombre de la base de datos
    public String database = "adminredes";

    // Host
    public String hostname = "localhost";

    // Puerto
    public String port = "3306";

    // Ruta de nuestra base de datos (desactivamos el uso de SSL con "?useSSL=false")
    public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false";

    // Nombre de usuario
    public String username = "root";

    // Clave de usuario
    public String password = "pass";
    Connection conn = null;

    public Connection getConnection() {
        

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        

        return conn;
    }
    public void desconectar() {
        try {
            
            conn.close();
        } catch (Exception ex) {
        }
    }
}
//    static String bd = "adminredes";
//    static String login = "root";
//    static String password = "pass";
//    static String url = "jdbc:mysql://localhost:3306/" + bd;
//    Connection connection = null;
//
//    public ConexionSQL() {
//        try {
//            connection = DriverManager.getConnection(url, login, password);
//            if (connection != null) {
//                System.out.println("Conexion a bd " + bd + " OK\n");
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
//
//    public Connection getConnection() {
//        return connection;
//    }
//    public void desconectar() {
//        try {
//            
//            connection.close();
//        } catch (Exception ex) {
//        }
//    }

