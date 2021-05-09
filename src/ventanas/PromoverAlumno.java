/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.Conexion;
import java.sql.*;

import FiveCodMover.FiveCodMoverJFrame;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;


 /**
 *
 * @author JensFrans JanfrancoParra@gmail.com-GitHub-JensFrans
 */
public class PromoverAlumno extends javax.swing.JFrame {

    /**
     * Creates new form PromoverAlumno
     */
    public PromoverAlumno() {
        initComponents();
        
        setSize(400, 267);
        setTitle("Promover Alumno.");
        setLocationRelativeTo(null);
        setResizable(false);
        
        ImageIcon wallpaper = new ImageIcon(getClass().getResource("/images/gui-promover.png"));
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_wallpaper.getWidth(),
                jLabel_wallpaper.getHeight(), Image.SCALE_AREA_AVERAGING));
        
        jLabel_wallpaper.setIcon(icono);
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

        jButton_cerrar = new javax.swing.JButton();
        jButton_promoverBasica = new javax.swing.JButton();
        jButton_promoverProfesional = new javax.swing.JButton();
        jButton_eliminarMencion = new javax.swing.JButton();
        jButton_minimizar = new javax.swing.JButton();
        jLabel_wallpaper = new javax.swing.JLabel();

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

        jButton_cerrar.setBackground(new java.awt.Color(240, 240, 240));
        jButton_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CCC.png"))); // NOI18N
        jButton_cerrar.setBorder(null);
        jButton_cerrar.setBorderPainted(false);
        jButton_cerrar.setContentAreaFilled(false);
        jButton_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cerrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 4, -1, 20));

        jButton_promoverBasica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBTM/btm-PB.png"))); // NOI18N
        jButton_promoverBasica.setBorderPainted(false);
        jButton_promoverBasica.setContentAreaFilled(false);
        jButton_promoverBasica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_promoverBasica.setFocusPainted(false);
        jButton_promoverBasica.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_promoverBasica.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBTM/btm-PB.png"))); // NOI18N
        jButton_promoverBasica.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBTM/btm-PB-over.png"))); // NOI18N
        jButton_promoverBasica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_promoverBasicaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_promoverBasica, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 300, 60));

        jButton_promoverProfesional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBTM/btm-PBP.png"))); // NOI18N
        jButton_promoverProfesional.setBorderPainted(false);
        jButton_promoverProfesional.setContentAreaFilled(false);
        jButton_promoverProfesional.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_promoverProfesional.setFocusPainted(false);
        jButton_promoverProfesional.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_promoverProfesional.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBTM/btm-PBP.png"))); // NOI18N
        jButton_promoverProfesional.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBTM/btm-PBP-over.png"))); // NOI18N
        jButton_promoverProfesional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_promoverProfesionalActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_promoverProfesional, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 115, 300, 60));

        jButton_eliminarMencion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBTM/btm-elimi.png"))); // NOI18N
        jButton_eliminarMencion.setBorderPainted(false);
        jButton_eliminarMencion.setContentAreaFilled(false);
        jButton_eliminarMencion.setFocusPainted(false);
        jButton_eliminarMencion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_eliminarMencion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBTM/btm-elimi.png"))); // NOI18N
        jButton_eliminarMencion.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBTM/btm-elimi-over.png"))); // NOI18N
        jButton_eliminarMencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eliminarMencionActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_eliminarMencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 300, 60));

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
        getContentPane().add(jButton_minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 4, -1, 20));

        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gui-promover.png"))); // NOI18N
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
       FiveCodMoverJFrame.MousePressed(evt); 
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
       FiveCodMoverJFrame.MouseDraggedFrame(evt, this); 
    }//GEN-LAST:event_formMouseDragged

    private void jButton_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_cerrarActionPerformed

    private void jButton_promoverBasicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_promoverBasicaActionPerformed
        PromoverBasica promoverBasica = new PromoverBasica();
        promoverBasica.setVisible(true);
    }//GEN-LAST:event_jButton_promoverBasicaActionPerformed

    private void jButton_promoverProfesionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_promoverProfesionalActionPerformed
        GestionarClientesPromover gestionarClientesPromover = new GestionarClientesPromover();
        gestionarClientesPromover.setVisible(true);
    }//GEN-LAST:event_jButton_promoverProfesionalActionPerformed

    private void jButton_eliminarMencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminarMencionActionPerformed
        EliminarMencion eliminarMencion = new EliminarMencion();
        eliminarMencion.setVisible(true);
    }//GEN-LAST:event_jButton_eliminarMencionActionPerformed

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
            java.util.logging.Logger.getLogger(PromoverAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PromoverAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PromoverAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PromoverAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PromoverAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_cerrar;
    private javax.swing.JButton jButton_eliminarMencion;
    private javax.swing.JButton jButton_minimizar;
    private javax.swing.JButton jButton_promoverBasica;
    private javax.swing.JButton jButton_promoverProfesional;
    private javax.swing.JLabel jLabel_wallpaper;
    // End of variables declaration//GEN-END:variables
}
