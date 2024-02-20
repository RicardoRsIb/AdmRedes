/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package admredes;

import java.awt.Color;
import javax.swing.JScrollPane;
/**
 *
 * @author Ricardo R. Ibarra
 */
public class Localizacion extends javax.swing.JFrame {

    /**
     * Creates new form Localizacion
     */
    saladecomputo1 loca = new saladecomputo1();
    Oficina1 of1 = new Oficina1();
    SalaReunion salaRe = new SalaReunion();
    Site sitee = new Site();
    SalaEspera salaespe = new SalaEspera();
    salaComputo2 sala2 = new salaComputo2();
    

    public Localizacion() {
        initComponents();
        this.setLocationRelativeTo(null);
        JPanelImage mImage = new JPanelImage(Croquis1, "src/imagenes/empresa.png");
        //Croquis1.add(scroll);
        Croquis1.add(mImage).repaint();
        Croquis1.setOpaque(false);
        Croquis1.setBorder(null);
        Croquis1.setBackground(new  Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Croquis1 = new javax.swing.JPanel();
        SC1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        SC2 = new javax.swing.JButton();
        SR = new javax.swing.JButton();
        Of1 = new javax.swing.JButton();
        Entrada = new javax.swing.JButton();
        bSite = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Localización de dispositivos");

        Croquis1.setPreferredSize(new java.awt.Dimension(800, 850));

        javax.swing.GroupLayout Croquis1Layout = new javax.swing.GroupLayout(Croquis1);
        Croquis1.setLayout(Croquis1Layout);
        Croquis1Layout.setHorizontalGroup(
            Croquis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 859, Short.MAX_VALUE)
        );
        Croquis1Layout.setVerticalGroup(
            Croquis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 739, Short.MAX_VALUE)
        );

        SC1.setText("Sala C. 1");
        SC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SC1ActionPerformed(evt);
            }
        });

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        SC2.setText("Sala C. 2");
        SC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SC2ActionPerformed(evt);
            }
        });

        SR.setText("Sala Reunión");
        SR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SRActionPerformed(evt);
            }
        });

        Of1.setText("Oficina");
        Of1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Of1ActionPerformed(evt);
            }
        });

        Entrada.setText("Entrada");

        bSite.setText("Site");
        bSite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSiteActionPerformed(evt);
            }
        });

        jButton2.setText("Sala Espera");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Pasillos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(355, 355, 355)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Croquis1, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bSite)
                        .addGap(18, 18, 18)
                        .addComponent(SC1)
                        .addGap(18, 18, 18)
                        .addComponent(SR)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(SC2)
                        .addGap(18, 18, 18)
                        .addComponent(Of1)
                        .addGap(18, 18, 18)
                        .addComponent(Entrada)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SC1)
                    .addComponent(SC2)
                    .addComponent(SR)
                    .addComponent(Of1)
                    .addComponent(Entrada)
                    .addComponent(bSite)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Croquis1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jButton1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SC1ActionPerformed
        // TODO add your handling code here:
        loca.setVisible(true);
    }//GEN-LAST:event_SC1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Menu men = new Menu();
        men.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Of1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Of1ActionPerformed
        // TODO add your handling code here:
        of1.setVisible(true);
    }//GEN-LAST:event_Of1ActionPerformed

    private void SC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SC2ActionPerformed
        // TODO add your handling code here:
        sala2.setVisible(true);
    }//GEN-LAST:event_SC2ActionPerformed

    private void SRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SRActionPerformed
        // TODO add your handling code here:
        salaRe.setVisible(true);
    }//GEN-LAST:event_SRActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void bSiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSiteActionPerformed
        // TODO add your handling code here:
        sitee.setVisible(true);
    }//GEN-LAST:event_bSiteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        salaespe.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Localizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Localizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Localizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Localizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Localizacion().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Croquis1;
    private javax.swing.JButton Entrada;
    private javax.swing.JButton Of1;
    private javax.swing.JButton SC1;
    private javax.swing.JButton SC2;
    private javax.swing.JButton SR;
    private javax.swing.JButton bSite;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
