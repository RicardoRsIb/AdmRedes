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
public class salaComputo2 extends javax.swing.JFrame {

    /**
     * Creates new form salaComputo2
     */
    public salaComputo2() {
        initComponents();
        this.setLocationRelativeTo(null);
        JPanelImage mImage = new JPanelImage(pSalaComputo2, "src/imagenes/salaC2.png");
        pSalaComputo2.add(mImage).repaint();
        pSalaComputo2.setOpaque(false);
        pSalaComputo2.setBorder(null);
        pSalaComputo2.setBackground(new  Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pSalaComputo2 = new javax.swing.JPanel();
        bComp4 = new javax.swing.JButton();
        bComp6 = new javax.swing.JButton();
        bComp5 = new javax.swing.JButton();
        bComp7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout pSalaComputo2Layout = new javax.swing.GroupLayout(pSalaComputo2);
        pSalaComputo2.setLayout(pSalaComputo2Layout);
        pSalaComputo2Layout.setHorizontalGroup(
            pSalaComputo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );
        pSalaComputo2Layout.setVerticalGroup(
            pSalaComputo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 315, Short.MAX_VALUE)
        );

        bComp4.setText("PC4");
        bComp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bComp4ActionPerformed(evt);
            }
        });

        bComp6.setText("PC6");
        bComp6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bComp6ActionPerformed(evt);
            }
        });

        bComp5.setText("PC5");
        bComp5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bComp5ActionPerformed(evt);
            }
        });

        bComp7.setText("PC7");
        bComp7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bComp7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bComp4)
                    .addComponent(bComp7)
                    .addComponent(bComp6)
                    .addComponent(bComp5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(pSalaComputo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(pSalaComputo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(bComp4)
                .addGap(18, 18, 18)
                .addComponent(bComp5)
                .addGap(18, 18, 18)
                .addComponent(bComp6)
                .addGap(18, 18, 18)
                .addComponent(bComp7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bComp5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComp5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Fabricante: Dell"
                + "\nModelo: Optiplex 7010"
                + "\nEstado: Buen estado"
                + "\nUbicación: Sala cómputo 2"
                + "\nDirección IP: 192.168.10.105/24");
    }//GEN-LAST:event_bComp5ActionPerformed

    private void bComp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComp4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Fabricante: Dell"
                + "\nModelo: Optiplex 7010"
                + "\nEstado: Buen estado"
                + "\nUbicación: Sala cómputo 2"
                + "\nDirección IP: 192.168.10.104/24");
    }//GEN-LAST:event_bComp4ActionPerformed

    private void bComp6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComp6ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Fabricante: Dell"
                + "\nModelo: Optiplex 7010"
                + "\nEstado: Buen estado"
                + "\nUbicación: Sala cómputo 2"
                + "\nDirección IP: 192.168.10.106/24");
    }//GEN-LAST:event_bComp6ActionPerformed

    private void bComp7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComp7ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Fabricante: Dell"
                + "\nModelo: Optiplex 7010"
                + "\nEstado: Buen estado"
                + "\nUbicación: Sala cómputo 2"
                + "\nDirección IP: 192.168.10.107/24");
    }//GEN-LAST:event_bComp7ActionPerformed

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
            java.util.logging.Logger.getLogger(salaComputo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(salaComputo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(salaComputo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(salaComputo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new salaComputo2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bComp4;
    private javax.swing.JButton bComp5;
    private javax.swing.JButton bComp6;
    private javax.swing.JButton bComp7;
    private javax.swing.JPanel pSalaComputo2;
    // End of variables declaration//GEN-END:variables
}
