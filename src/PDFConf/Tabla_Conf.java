package PDFConf;

import PDFConf.PdfObtenerSQL;
import PDFConf.BotonesPDF;
import java.awt.Image;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Tabla_Conf {

    BotonesPDF obt = null;

    public void visualizar_Pdf(JTable tabla) {
        tabla.setDefaultRenderer(Object.class, new TablaPDFConf());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dt.addColumn("Numero");
        dt.addColumn("Nombre");
        dt.addColumn("Archivo");

        ImageIcon icono = null;
        if (get_Image("imagenes/32pdf.png") != null) {
            icono = new ImageIcon(get_Image("imagenes/32pdf.png"));
        }

        obt = new BotonesPDF();
        PdfObtenerSQL vo = new PdfObtenerSQL();
        ArrayList<PdfObtenerSQL> list = obt.Listar_Pdf();

        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[3];
                vo = list.get(i);
                fila[0] = vo.getNumeropdf();
                fila[1] = vo.getNombrepdf();
                if (vo.getArchivopdf() != null) {
                    fila[2] = new JButton(icono);
                } else {
                    fila[2] = new JButton("Vacio");
                }

                dt.addRow(fila);
            }
            tabla.setModel(dt);
            tabla.setRowHeight(32);
        }
    }

    public Image get_Image(String ruta) {
        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getResource(ruta));
            Image mainIcon = imageIcon.getImage();
            return mainIcon;
        } catch (Exception e) {
        }
        return null;
    }
}
