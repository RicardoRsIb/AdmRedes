/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nancy
 */
public class ConexionSQL {
    static String bd = "adminredes";
    static String login = "root";
    static String password = "pass";
    static String url = "jdbc:mysql://localhost/" + bd;
    Connection connection = null;

    public ConexionSQL() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, login, password);
            if (connection != null) {
                System.out.println("Conexión a bd " + bd + " OK\n");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            //holi
            
            
            
            
            
            
            System.out.println(ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }
    public void desconectar() {
        try {
            
            connection.close();
        } catch (Exception ex) {
        }
    }
}