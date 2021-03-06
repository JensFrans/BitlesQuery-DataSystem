/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import FiveCodMover.FiveCodMoverJFrame;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.sql.*;
import clases.Conexion;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;



public class Login extends javax.swing.JFrame {

    public static String user = "";
    String pass = "";
    String passHashing = "";
    
 /**
 *
 * @author JensFrans JanfrancoParra@gmail.com-GitHub-JensFrans
 */
    
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setSize(800, 500);
        setResizable(false);
        setTitle("¬°Bienvenido de nuevo! - BitlesQuery");
        setLocationRelativeTo(null);
        
        
        ImageIcon wallpaper = new ImageIcon(getClass().getResource("/images/gui_login.png"));
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(),
                jLabel_Wallpaper.getHeight(), Image.SCALE_AREA_AVERAGING));
        
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();
              
    }
    
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon2.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel_Logo = new javax.swing.JLabel();
        jButton_Acceder = new javax.swing.JButton();
        txt_user = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        jButton_cerrar = new javax.swing.JButton();
        jButton_minimizar = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        jPasswordField2.setText("jPasswordField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_Acceder.setBackground(new java.awt.Color(244, 244, 244));
        jButton_Acceder.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        jButton_Acceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBTM/btm-login.png"))); // NOI18N
        jButton_Acceder.setBorder(null);
        jButton_Acceder.setBorderPainted(false);
        jButton_Acceder.setContentAreaFilled(false);
        jButton_Acceder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Acceder.setFocusPainted(false);
        jButton_Acceder.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBTM/btm-login.png"))); // NOI18N
        jButton_Acceder.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBTM/btm-login-over.png"))); // NOI18N
        jButton_Acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AccederActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Acceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 320, 270, 50));

        txt_user.setBackground(new java.awt.Color(240, 240, 240));
        txt_user.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_user.setForeground(java.awt.Color.gray);
        txt_user.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_user.setToolTipText("");
        txt_user.setBorder(null);
        txt_user.setName(""); // NOI18N
        txt_user.setOpaque(false);
        getContentPane().add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 186, 240, 31));

        txt_password.setBackground(new java.awt.Color(240, 240, 240));
        txt_password.setForeground(java.awt.Color.gray);
        txt_password.setBorder(null);
        txt_password.setOpaque(false);
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 263, 240, 31));

        jButton_cerrar.setBackground(new java.awt.Color(240, 240, 240));
        jButton_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CCC.png"))); // NOI18N
        jButton_cerrar.setBorder(null);
        jButton_cerrar.setBorderPainted(false);
        jButton_cerrar.setContentAreaFilled(false);
        jButton_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_cerrar.setFocusPainted(false);
        jButton_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cerrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(775, 1, -1, 20));

        jButton_minimizar.setBackground(new java.awt.Color(240, 240, 240));
        jButton_minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/descargar.png"))); // NOI18N
        jButton_minimizar.setBorder(null);
        jButton_minimizar.setBorderPainted(false);
        jButton_minimizar.setContentAreaFilled(false);
        jButton_minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_minimizar.setFocusPainted(false);
        jButton_minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_minimizarMouseClicked(evt);
            }
        });
        jButton_minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_minimizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 1, -1, 20));

        jLabel_Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gui_login.png"))); // NOI18N
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_AccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AccederActionPerformed
        
        user = txt_user.getText().trim();
        pass = txt_password.getText().trim();
        
        passHashing = DigestUtils.md5Hex(pass);
        
        
        if(!user.equals("") || !pass.equals("")){
            
            try {
                
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                    "select tipo_nivel, estatus from usuarios where username = '" + user
                        + "' and password = '" + passHashing + "'");
                
                ResultSet rs = pst.executeQuery();
                if(rs.next()){
                    
                    String tipo_nivel = rs.getString("tipo_nivel");
                    String estatus = rs.getString("estatus");
                    
                    if(tipo_nivel.equalsIgnoreCase("Administrador") && estatus.equalsIgnoreCase("Activo")){
                        dispose();
                        new Administrador().setVisible(true);
                        
                    } else if(tipo_nivel.equalsIgnoreCase("Coordinador") && estatus.equalsIgnoreCase("Activo")){
                        dispose();
                        new Capturista().setVisible(true);
                    } else if(tipo_nivel.equalsIgnoreCase("Maestro") && estatus.equalsIgnoreCase("Activo")){
                        dispose();
                        new Tecnico().setVisible(true);
                    }
                    
                    
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Usuario o contrase√Īa err√≥neos.");
                    txt_user.setText("");
                    txt_password.setText("");
                }
 
                
            } catch (SQLException e) {
                System.err.println("Error en el boton ingresar" + e);
                JOptionPane.showMessageDialog(null, "Error al iniciar sesion!!, contactar al administrador.");
            }
            
        } else{
        JOptionPane.showMessageDialog(null, "Todo bien?, asegurese de llenar todos los campos requeridos.");
    }
        
    }//GEN-LAST:event_jButton_AccederActionPerformed

    private void jButton_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cerrarActionPerformed

        System.exit(0);

    }//GEN-LAST:event_jButton_cerrarActionPerformed

    private void jButton_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_minimizarMouseClicked

        if (evt.getButton()==java.awt.event.MouseEvent.BUTTON1) {
            this.setExtendedState(ICONIFIED);
        }

    }//GEN-LAST:event_jButton_minimizarMouseClicked

    private void jButton_minimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_minimizarActionPerformed

        
        
    }//GEN-LAST:event_jButton_minimizarActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        
        FiveCodMoverJFrame.MousePressed(evt);
        
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        
        FiveCodMoverJFrame.MouseDraggedFrame(evt, this);
        
    }//GEN-LAST:event_formMouseDragged

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Acceder;
    private javax.swing.JButton jButton_cerrar;
    private javax.swing.JButton jButton_minimizar;
    private javax.swing.JLabel jLabel_Logo;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
