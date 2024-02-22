/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package admredes;

import Conexion.ConexionSQL;
import Conexion.bdSQL;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author pakit
 */
public class RegYSeg extends javax.swing.JFrame {

    private DefaultTableModel modeloTablaSol;

    ConexionSQL con = new ConexionSQL();
    Connection conection = con.getConnection();
    Boolean modificar = false;

    /**
     * Creates new form RegYSeg
     */
    public RegYSeg() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrarDatosFallasSol();
    }

    public void mostrarDatosFallasSol() {
        DefaultTableModel tfallas = new DefaultTableModel();
        tfallas.addColumn("Id");
        tfallas.addColumn("Nombre de la Falla");
        tfallas.addColumn("Descripción");
        tablaFallas.setModel(tfallas);

        String[] datos = new String[3];

        try {
            Statement leer = conection.createStatement();
            ResultSet resultado = leer.executeQuery("SELECT * FROM fallas");

            while (resultado.next()) {
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                tfallas.addRow(datos);
            }
            tablaFallas.setModel(tfallas);
            TableColumnModel columnModel = tablaFallas.getColumnModel();
            columnModel.getColumn(1).setPreferredWidth(500);
            columnModel.getColumn(2).setPreferredWidth(900);
            tablaFallas.setColumnModel(columnModel);
            modeloTablaSol = tfallas;
        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSolucionar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        panelTabla = new javax.swing.JScrollPane();
        tablaFallas = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSolucionar.setText("Solucionada");
        btnSolucionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolucionarActionPerformed(evt);
            }
        });

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Registrar Falla");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Fallas Solucionadas");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tablaFallas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        panelTabla.setViewportView(tablaFallas);
        if (tablaFallas.getColumnModel().getColumnCount() > 0) {
            tablaFallas.getColumnModel().getColumn(0).setPreferredWidth(1000);
        }

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(102, 204, 255));
        jTextField3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Registro y Seguimiento de Fallas");
        jTextField3.setFocusable(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSolucionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addComponent(jButton3)
                    .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE))
                .addGap(16, 16, 16))
            .addComponent(jTextField3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(btnSolucionar)
                    .addComponent(btnEliminar)
                    .addComponent(btnModificar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Menu men = new Menu();
        men.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        FallasSol fasol = new FallasSol();
        fasol.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Registro regis = new Registro();
        regis.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int fila = tablaFallas.getSelectedRow();
        if (fila != -1) {
            String id = modeloTablaSol.getValueAt(fila, 0).toString();
            int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro que sea continuar?", "No podrá revertir esta opcion", JOptionPane.YES_NO_OPTION);;
            if (opcion == JOptionPane.YES_OPTION) {
                try {
                    PreparedStatement sentencia = conection.prepareStatement("DELETE FROM fallas WHERE id = '" + id + "'");
                    int filas = sentencia.executeUpdate();
                    if (filas > 0) {
                        JOptionPane.showMessageDialog(null, "Se eliminó el registro seleccionado", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                        modeloTablaSol.removeRow(fila);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Operacion cancelada", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSolucionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolucionarActionPerformed
        // TODO add your handling code here:
        int fila = tablaFallas.getSelectedRow();
        bdSQL s = new bdSQL();
        int codigo = s.auto_increment("SELECT MAX(id) FROM fallassol;");
        String id = String.valueOf(codigo);
        if (fila != -1) {
            String nombre = modeloTablaSol.getValueAt(fila, 1).toString();
            String descripcion = modeloTablaSol.getValueAt(fila, 2).toString();
            String id2 = modeloTablaSol.getValueAt(fila, 0).toString();
            
            int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro que sea continuar?", "No podrá revertir esta opcion", JOptionPane.YES_NO_OPTION);;
            if (opcion == JOptionPane.YES_OPTION) {
                try {
                    PreparedStatement guardar = conection.prepareStatement("INSERT  fallassol (id,nombre,descripcion) VALUES (?,?,?)");
                    guardar.setString(1, id);
                    guardar.setString(2, nombre);
                    guardar.setString(3, descripcion);
                    guardar.executeUpdate();
                    PreparedStatement sentencia = conection.prepareStatement("DELETE FROM fallas WHERE id = ?");
                    sentencia.setString(1, id2);
                    int filas = sentencia.executeUpdate();
                    if (filas > 0) {
                        JOptionPane.showMessageDialog(null, "Se ha solucionado la falla", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                        modeloTablaSol.removeRow(fila);
                        mostrarDatosFallasSol();
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Operacion cancelada", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSolucionarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        int fila = tablaFallas.getSelectedRow();
        
        int id = Integer.parseInt(this.tablaFallas.getValueAt(fila, 0).toString());
        
        String nombre = tablaFallas.getValueAt(fila, 1).toString();
        String des = tablaFallas.getValueAt(fila, 2).toString();
        
        try {
            PreparedStatement actu = conection.prepareStatement("UPDATE fallas SET nombreF='"+nombre+"',descripcionF='"+des+"' WHERE id= '"+id+"'");
            actu.executeUpdate();
            JOptionPane.showMessageDialog(null,"Falla " + id + " Modificada");
            mostrarDatosFallasSol();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + " No se logró actualizar los datos");
        }
        
//        String nombre = modeloTablaSol.getValueAt(fila, 0).toString();
//        String id="";
//        try {
//            Statement leer = conection.createStatement();
//            ResultSet a = leer.executeQuery("SELECT id FROM fallas WHERE nombreF='"+nombre+"'");
//            id=String.valueOf(a);
//        } catch (SQLException e) {
//        }
//        
//        String nom = tablaFallas.getValueAt(fila, 0).toString();
//        String des = tablaFallas.getValueAt(fila, 1).toString();
//        
//        try {
//            PreparedStatement actu = conection.prepareStatement("UPDATE fallas SET nombreF='"+nom+"', descripcionF='"+des+"' WHERE id='"+id+"'");
//            actu.executeUpdate();
//            mostrarDatosFallasSol();
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, e + " No se logró actualizar los datos");
//        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegYSeg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegYSeg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegYSeg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegYSeg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegYSeg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSolucionar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JScrollPane panelTabla;
    private javax.swing.JTable tablaFallas;
    // End of variables declaration//GEN-END:variables
}
