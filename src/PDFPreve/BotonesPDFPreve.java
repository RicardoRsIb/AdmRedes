package PDFPreve;

import Conexion.ConexionSQL;
import PDFPreve.PdfObtenerSQLPreve;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BotonesPDFPreve {

    /*Metodo listar*/
    public ArrayList<PdfObtenerSQLPreve> Listar_Pdf() {
        ArrayList<PdfObtenerSQLPreve> list = new ArrayList<PdfObtenerSQLPreve>();
        ConexionSQL conec = new ConexionSQL();
        String sql = "SELECT * FROM archivospreve;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                PdfObtenerSQLPreve obtener = new PdfObtenerSQLPreve();
                obtener.setNumeropdf(rs.getInt(1));
                obtener.setNombrepdf(rs.getString(2));
                obtener.setArchivopdf(rs.getBytes(3));
                list.add(obtener);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
        return list;
    }


    /*Metodo agregar*/
    public void Agregar_Pdf(PdfObtenerSQLPreve vo) {
        ConexionSQL conec = new ConexionSQL();
        String sql = "INSERT INTO archivospreve (id, nombrepdf, archivo) VALUES(?, ?, ?);";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getNumeropdf());
            ps.setString(2, vo.getNombrepdf());
            ps.setBytes(3, vo.getArchivopdf());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }


    /*Metodo Modificar*/
    public void Modificar_Pdf(PdfObtenerSQLPreve vo) {
        ConexionSQL conec = new ConexionSQL();
        String sql = "UPDATE archivospreve SET nombrepdf = ?, archivo = ? WHERE id = ?;";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getNombrepdf());
            ps.setBytes(2, vo.getArchivopdf());
            ps.setInt(3, vo.getNumeropdf());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }

    public void Modificar_Pdf2(PdfObtenerSQLPreve vo) {
        ConexionSQL conec = new ConexionSQL();
        String sql = "UPDATE archivospreve SET nombrepdf = ? WHERE id = ?;";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getNombrepdf());
            ps.setInt(2, vo.getNumeropdf());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }

    /*Metodo Eliminar*/
    public void Eliminar_Pdf(PdfObtenerSQLPreve vo) {
        ConexionSQL conec = new ConexionSQL();
        String sql = "DELETE FROM archivospreve WHERE id = ?;";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getNumeropdf());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }

    //Permite mostrar PDF contenido en la base de datos
    public void ejecutar_archivoPDF(int id) {

        ConexionSQL cn = new ConexionSQL();
        PreparedStatement ps = null;
        ResultSet rs = null;
        byte[] b = null;

        try {
            ps = cn.getConnection().prepareStatement("SELECT archivo from archivospreve WHERE id = ?;");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                b = rs.getBytes(1);
            }
            InputStream bos = new ByteArrayInputStream(b);

            int tamInput = bos.available();
            byte[] datosPDF = new byte[tamInput];
            bos.read(datosPDF, 0, tamInput);

            OutputStream out = new FileOutputStream("new.pdf");
            out.write(datosPDF);

            //abrir archivo
            out.close();
            bos.close();
            ps.close();
            rs.close();
            cn.desconectar();

        } catch (IOException | NumberFormatException | SQLException ex) {
            System.out.println("Error al abrir archivo PDF " + ex.getMessage());
        }
    }

}
