/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admredes;

import javax.swing.JOptionPane;

/**
 *
 * @author Juan CA
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Usuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        botonLogin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 248, 245));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        Usuario.setBackground(new java.awt.Color(51, 51, 51));
        Usuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Usuario.setForeground(new java.awt.Color(204, 204, 204));
        Usuario.setText("Usuario");
        Usuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 255)));
        Usuario.setCaretColor(new java.awt.Color(102, 102, 102));
        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 240, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jPassword.setBackground(new java.awt.Color(51, 51, 51));
        jPassword.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPassword.setForeground(new java.awt.Color(255, 255, 255));
        jPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 255)));
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 240, -1));

        botonLogin.setBackground(new java.awt.Color(255, 255, 255));
        botonLogin.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        botonLogin.setForeground(new java.awt.Color(51, 51, 51));
        botonLogin.setText("Iniciar sesión");
        botonLogin.setAutoscrolls(true);
        botonLogin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        botonLogin.setBorderPainted(false);
        botonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLoginActionPerformed(evt);
            }
        });
        jPanel2.add(botonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 80, 20));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Olvidó su contraseña?");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/background1.jpeg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 380, 170));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 330, 160));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, -40, 370, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
    
    }//GEN-LAST:event_UsuarioActionPerformed

    private void botonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLoginActionPerformed
        String user = Usuario.getText();
        String password = new String(jPassword.getPassword());
        if (user.equals("admin") && password.equals("secret")) {
            JOptionPane.showMessageDialog(this, "Bienvenido, " + user);
            Menu m= new Menu();
            m.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
            //Limpiar los campos de texto o realizar otra acción
        }
    }//GEN-LAST:event_botonLoginActionPerformed

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
   
    }//GEN-LAST:event_jPasswordActionPerformed

    
    public static void main(String args[]) {
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Usuario;
    private javax.swing.JButton botonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPassword;
    // End of variables declaration//GEN-END:variables
}
