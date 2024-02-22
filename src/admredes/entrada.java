/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package admredes;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo R. Ibarra
 */
public class entrada extends javax.swing.JFrame {

    /**
     * Creates new form entrada
     */
    public entrada() {
        initComponents();
        this.setLocationRelativeTo(null);
        JPanelImage mImage = new JPanelImage(pEntrada, "src/imagenes/entrada.png");
        pEntrada.add(mImage).repaint();
        pEntrada.setOpaque(false);
        pEntrada.setBorder(null);
        pEntrada.setBackground(new  Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pEntrada = new javax.swing.JPanel();
        bRouter = new javax.swing.JButton();
        bIpPhone = new javax.swing.JButton();
        bpc8 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout pEntradaLayout = new javax.swing.GroupLayout(pEntrada);
        pEntrada.setLayout(pEntradaLayout);
        pEntradaLayout.setHorizontalGroup(
            pEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );
        pEntradaLayout.setVerticalGroup(
            pEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );

        bRouter.setText("Wireless Router");
        bRouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRouterActionPerformed(evt);
            }
        });

        bIpPhone.setText("IP Phone");
        bIpPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIpPhoneActionPerformed(evt);
            }
        });

        bpc8.setText("PC8");
        bpc8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpc8ActionPerformed(evt);
            }
        });

        jButton4.setText("Cámara T2");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bRouter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bIpPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bpc8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(pEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(pEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(bRouter)
                        .addGap(18, 18, 18)
                        .addComponent(bIpPhone)
                        .addGap(18, 18, 18)
                        .addComponent(bpc8)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bRouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRouterActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Fabricante: TP-Link"
                + "\nModelo: Archer C20 W"
                + "\nEstado: Buen estado"
                + "\nUbicación: Entrada"
                + "\nDirección IP: 192.168.10.125/24");
    }//GEN-LAST:event_bRouterActionPerformed

    private void bIpPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIpPhoneActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Fabricante: Grandstream"
                + "\nModelo: GXP1610"
                + "\nEstado: Buen estado"
                + "\nUbicación: Entrada");
    }//GEN-LAST:event_bIpPhoneActionPerformed

    private void bpc8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpc8ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Fabricante: Dell"
                + "\nModelo: Optiplex 7010"
                + "\nEstado: Buen estado"
                + "\nUbicación: Entrada"
                + "\nDirección IP: 192.168.10.108/24");
    }//GEN-LAST:event_bpc8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Fabricante: Steren"
                + "\nModelo: CCTV-212"
                + "\nEstado: Buen estado"
                + "\nUbicación: Entrada"
                + "\nDirección IP: 192.168.10.22/24");
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new entrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bIpPhone;
    private javax.swing.JButton bRouter;
    private javax.swing.JButton bpc8;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel pEntrada;
    // End of variables declaration//GEN-END:variables
}
