 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import FiveCodMover.FiveCodMoverJFrame;
import java.sql.*;
import clases.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;


 /**
 *
 * @author JensFrans JanfrancoParra@gmail.com-GitHub-JensFrans
 */
public class InformacionUsuario extends javax.swing.JFrame {
    
    String user = "", user_update = "";
    int ID;
    

    /**
     * Creates new form InformacionUsuario
     */
    public InformacionUsuario() {
        initComponents();
        user = Login.user;
        user_update = GestionarUsuarios.user_update;

        setSize(400, 800);
        setResizable(false); 
        setTitle("Información del usuario " + user_update + " - Sesión de " + user);
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        ImageIcon wallpaper = new ImageIcon(getClass().getResource("/images/gui_iu.png"));
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(),
                jLabel_Wallpaper.getHeight(), Image.SCALE_AREA_AVERAGING));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();
        
        jLabel_Titulo.setText("Información del usuario " + user_update);  
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
            "select * from usuarios where username = '" + user_update + "'");
            
        ResultSet rs = pst.executeQuery();
        
            if (rs.next()) {
                ID = rs.getInt("id_usuario");
                
                txt_nombre.setText(rs.getString("nombre_usuario"));
                txt_mail.setText(rs.getString("email"));
                txt_telefono.setText(rs.getString("telefono"));
                txt_username.setText(rs.getString("username"));
                txt_RegistradorPor.setText(rs.getString("registrado_por"));
                
                cmb_niveles.setSelectedItem(rs.getString("tipo_nivel"));
                cmb_estatus.setSelectedItem(rs.getString("estatus"));                       
            }
            cn.close();
            
        } catch (SQLException e) {
            
            System.err.println("Error en cargar usuario." + e);
            JOptionPane.showMessageDialog(null, "¡¡Error al cargar!!, Contacte al administrador");
            
        }
        
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

        jLabel_Titulo = new javax.swing.JLabel();
        jButton_cerrar = new javax.swing.JButton();
        txt_nombre = new javax.swing.JTextField();
        txt_mail = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_RegistradorPor = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        cmb_niveles = new javax.swing.JComboBox<>();
        cmb_estatus = new javax.swing.JComboBox<>();
        jButton_Actualizar = new javax.swing.JButton();
        jButton_RestaurarPassword = new javax.swing.JButton();
        jButton_minimizar = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        jLabel_Titulo.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        jLabel_Titulo.setText("Informacion del Usuario");

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

        jButton_cerrar.setBackground(new java.awt.Color(29, 32, 39));
        jButton_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CCC.png"))); // NOI18N
        jButton_cerrar.setBorder(null);
        jButton_cerrar.setBorderPainted(false);
        jButton_cerrar.setContentAreaFilled(false);
        jButton_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_cerrar.setFocusPainted(false);
        jButton_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cerrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 2, -1, 20));

        txt_nombre.setBackground(new java.awt.Color(240, 240, 240));
        txt_nombre.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 16)); // NOI18N
        txt_nombre.setBorder(null);
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 150, 250, -1));

        txt_mail.setBackground(new java.awt.Color(240, 240, 240));
        txt_mail.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 16)); // NOI18N
        txt_mail.setBorder(null);
        getContentPane().add(txt_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 220, 250, -1));

        txt_telefono.setBackground(new java.awt.Color(240, 240, 240));
        txt_telefono.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 16)); // NOI18N
        txt_telefono.setBorder(null);
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 295, 250, -1));

        txt_RegistradorPor.setBackground(new java.awt.Color(240, 240, 240));
        txt_RegistradorPor.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 16)); // NOI18N
        txt_RegistradorPor.setBorder(null);
        txt_RegistradorPor.setEnabled(false);
        getContentPane().add(txt_RegistradorPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 570, 250, -1));

        txt_username.setBackground(new java.awt.Color(240, 240, 240));
        txt_username.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 16)); // NOI18N
        txt_username.setBorder(null);
        getContentPane().add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 430, 250, -1));

        cmb_niveles.setBackground(new java.awt.Color(240, 240, 240));
        cmb_niveles.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 11)); // NOI18N
        cmb_niveles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Coordinador", "Maestro" }));
        cmb_niveles.setBorder(null);
        cmb_niveles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(cmb_niveles, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 365, 250, 30));

        cmb_estatus.setBackground(new java.awt.Color(240, 240, 240));
        cmb_estatus.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 11)); // NOI18N
        cmb_estatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        cmb_estatus.setBorder(null);
        cmb_estatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(cmb_estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 500, 250, 30));

        jButton_Actualizar.setBackground(new java.awt.Color(244, 244, 244));
        jButton_Actualizar.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 11)); // NOI18N
        jButton_Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBTM/btm-IU.png"))); // NOI18N
        jButton_Actualizar.setBorder(null);
        jButton_Actualizar.setBorderPainted(false);
        jButton_Actualizar.setContentAreaFilled(false);
        jButton_Actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Actualizar.setFocusPainted(false);
        jButton_Actualizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBTM/btm-IU.png"))); // NOI18N
        jButton_Actualizar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBTM/btm-UI-over.png"))); // NOI18N
        jButton_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 615, 270, 50));

        jButton_RestaurarPassword.setBackground(new java.awt.Color(244, 244, 244));
        jButton_RestaurarPassword.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 11)); // NOI18N
        jButton_RestaurarPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBTM/btm-IU2.png"))); // NOI18N
        jButton_RestaurarPassword.setBorder(null);
        jButton_RestaurarPassword.setBorderPainted(false);
        jButton_RestaurarPassword.setContentAreaFilled(false);
        jButton_RestaurarPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_RestaurarPassword.setFocusPainted(false);
        jButton_RestaurarPassword.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBTM/btm-IU2.png"))); // NOI18N
        jButton_RestaurarPassword.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBTM/btm-UI2-over.png"))); // NOI18N
        jButton_RestaurarPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RestaurarPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_RestaurarPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 680, 270, 50));

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
        getContentPane().add(jButton_minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 2, -1, 20));

        jLabel_Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gui_iu.png"))); // NOI18N
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ActualizarActionPerformed
        
        int permisos_cmb, estatus_cmb, validacion = 0;
        String nombre, mail, telefono, username, pass, permisos_string = "", estatus_string = "";
        
        mail = txt_mail.getText().trim();
        username = txt_username.getText().trim();
        nombre = txt_nombre.getText().trim();
        telefono = txt_telefono.getText().trim();
        permisos_cmb = cmb_niveles.getSelectedIndex() + 1;
        estatus_cmb = cmb_estatus.getSelectedIndex() + 1;
        
        if (mail.equals("")) {
            txt_mail.setBackground(Color.red);
            validacion++;
        }
        if (username.equals("")) {
            txt_username.setBackground(Color.red);
            validacion++;
        }
        if (nombre.equals("")) {
            txt_nombre.setBackground(Color.red);
            validacion++;
        }
        if (telefono.equals("")) {
            txt_telefono.setBackground(Color.red);
            validacion++;
        }
        
        if (validacion == 0) {
            
            if (permisos_cmb == 1) {
                permisos_string = "Administrador";
            } else if (permisos_cmb == 2) {
                permisos_string = "Coordinador";
            } else if (permisos_cmb == 3) {
                permisos_string = "Maestro";
            }
            
            if (estatus_cmb == 1) {
                estatus_string = "Activo";
            } else if (estatus_cmb == 2) {
                estatus_string = "Inactivo";
            }
            
            try {
                
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                    "select username from usuarios where username = '" + username + "' and not id_usuario = '" + ID + "'");
                
                ResultSet rs = pst.executeQuery();
                
                if (rs.next()) {
                    
                    txt_username.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "Nombre de usuario no disponible");
                    cn.close();
                    
                } else {
                    
                    Connection cn2 = Conexion.conectar();
                    PreparedStatement pst2 = cn2.prepareStatement(
                        "update usuarios set nombre_usuario=?, email=?, telefono=?, username=?, tipo_nivel=?, estatus=? "
                                + "where id_usuario = '" + ID + "'");
                    
                    pst2.setString(1, nombre);
                    pst2.setString(2, mail);
                    pst2.setString(3, telefono);
                    pst2.setString(4, username);
                    pst2.setString(5, permisos_string);
                    pst2.setString(6, estatus_string);
                    
                    pst2.executeUpdate();
                    cn2.close();
                    
                    JOptionPane.showMessageDialog(null, "Modificion exitosa.");
                    this.dispose();
                }
                
                
                
            } catch (SQLException e) {
                System.err.println("Error al actualizar" + e);
            }
            
            
        } else {
            JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos.");
        }
    }//GEN-LAST:event_jButton_ActualizarActionPerformed

    private void jButton_RestaurarPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RestaurarPasswordActionPerformed
        
        RestaurarPassword restaurarPassword = new RestaurarPassword();
        restaurarPassword.setVisible(true);
        
    }//GEN-LAST:event_jButton_RestaurarPasswordActionPerformed

    private void jButton_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cerrarActionPerformed

        this.dispose();
    }//GEN-LAST:event_jButton_cerrarActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        
         FiveCodMoverJFrame.MousePressed(evt);
        
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        
        FiveCodMoverJFrame.MouseDraggedFrame(evt, this);
        
    }//GEN-LAST:event_formMouseDragged

    private void jButton_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_minimizarMouseClicked

        if (evt.getButton()==java.awt.event.MouseEvent.BUTTON1) {
            this.setExtendedState(ICONIFIED);
        }
    }//GEN-LAST:event_jButton_minimizarMouseClicked

    private void jButton_minimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_minimizarActionPerformed

    }//GEN-LAST:event_jButton_minimizarActionPerformed

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
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_estatus;
    private javax.swing.JComboBox<String> cmb_niveles;
    private javax.swing.JButton jButton_Actualizar;
    private javax.swing.JButton jButton_RestaurarPassword;
    private javax.swing.JButton jButton_cerrar;
    private javax.swing.JButton jButton_minimizar;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JTextField txt_RegistradorPor;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
