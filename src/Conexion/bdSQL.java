/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author nancy
 */
public class bdSQL {
    public int auto_increment(String sql) {
        int id=1;
        PreparedStatement prepa=null;
        ResultSet res=null;
        ConexionSQL db=new ConexionSQL();
        try {
            prepa=db.getConnection().prepareStatement(sql);
            res=prepa.executeQuery();
            while (res.next()) {
                id=res.getInt(1) + 1;
            }
        } catch (Exception ex) {
            System.out.println("idmax " + ex.getMessage());
            id=1;
        } finally {
            try {
                prepa.close();
                res.close();
                db.desconectar();
            } catch (Exception ex) {
            }
        }
        return id;
    }

}
