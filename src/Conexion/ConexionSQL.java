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
    static String password = "cello";
    static String url = "jdbc:mysql://localhost:3306/" + bd;
    Connection connection = null;

    public ConexionSQL() {
        try {
            connection = DriverManager.getConnection(url, login, password);
            if (connection != null) {
                System.out.println("Conexion a bd " + bd + " OK\n");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
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
