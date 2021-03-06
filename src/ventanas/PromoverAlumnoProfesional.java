/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import FiveCodMover.FiveCodMoverJFrame;
import java.sql.*;
import clases.Conexion;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import static ventanas.GestionarClientesPromover.IDcliente_update;

 /**
 *
 * @author JensFrans JanfrancoParra@gmail.com-GitHub-JensFrans
 */
public class PromoverAlumnoProfesional extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();

    int IDcliente_update = 0;
    public static int IDequipo = 0;
    String user = "";

    /**
     * Creates new form Informacion_Cliente
     */
    public PromoverAlumnoProfesional() {
        initComponents();
        user = Login.user;
        IDcliente_update = GestionarClientesPromover.IDcliente_update;

        setSize(400, 800);
        setResizable(false);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        ImageIcon wallpaper = new ImageIcon(getClass().getResource("/images/gui-PPP.png"));
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(),
                jLabel_Wallpaper.getHeight(), Image.SCALE_AREA_AVERAGING));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();
/*Aqui comienza la conexion a BD, consulta...*/
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select * from alumnoss where id_alumno = '" + IDcliente_update + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                setTitle("Información del alumno " + rs.getString("nombre_alumno") + " - Sesión de " + user);
                /*jLabel_Titulo.setText("Información del alumno " + rs.getString("nombre_alumno"));*/

                txt_nombre.setText(rs.getString("nombre_alumno"));
//                txt_ci_alumno.setText(rs.getString("ci_alumno"));
                txt_mail.setText(rs.getString("email_alumno"));
                txt_telefono.setText(rs.getString("tel_alumno"));
                txt_mencion.setText(rs.getString("mencion_alumno"));
                
                
            }
            cn.close();
        } catch (SQLException e) {
            System.err.println("Error en cargar usuario." + e);
            JOptionPane.showMessageDialog(null, "¡¡ERROR al cargar!!, contacte al administrador.");
        }


    }

    @Override
    public Image getIconImage() {
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
        jSeparator1 = new javax.swing.JSeparator();
        txt_ci_alumno = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_mail = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_mencion = new javax.swing.JTextField();
        cmb_MencionPromover = new javax.swing.JComboBox<>();
        jButton_minimizar = new javax.swing.JButton();
        jButton_cerrar = new javax.swing.JButton();
        jButton_promover = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        jLabel_Titulo.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        jLabel_Titulo.setText("Informacion del Alumno");

        txt_ci_alumno.setBackground(new java.awt.Color(240, 240, 240));
        txt_ci_alumno.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 16)); // NOI18N
        txt_ci_alumno.setBorder(null);

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

        txt_nombre.setBackground(new java.awt.Color(240, 240, 240));
        txt_nombre.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 16)); // NOI18N
        txt_nombre.setBorder(null);
        txt_nombre.setEnabled(false);
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 158, 250, -1));

        txt_mail.setBackground(new java.awt.Color(240, 240, 240));
        txt_mail.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 16)); // NOI18N
        txt_mail.setBorder(null);
        txt_mail.setEnabled(false);
        getContentPane().add(txt_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 228, 250, -1));

        txt_telefono.setBackground(new java.awt.Color(240, 240, 240));
        txt_telefono.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 16)); // NOI18N
        txt_telefono.setBorder(null);
        txt_telefono.setEnabled(false);
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 302, 250, -1));

        txt_mencion.setBackground(new java.awt.Color(240, 240, 240));
        txt_mencion.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 16)); // NOI18N
        txt_mencion.setBorder(null);
        txt_mencion.setEnabled(false);
        getContentPane().add(txt_mencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 372, 250, -1));

        cmb_MencionPromover.setBackground(new java.awt.Color(240, 240, 240));
        cmb_MencionPromover.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Informatica | 4to |", "Informatica | 5to |", "Informatica | 6to |", "Administracion F. | 4to |", "Administracion F. | 5to |", "Administracion F. | 6to |", "Contabilidad | 4to |", "Contabilidad | 5to |", "Contabilidad | 6to |", "Turismo | 4to |", "Turismo | 5to |", "Turismo | 6to |", "Asistencia Gerencial | 4to |", "Asistencia Gerencial | 5to |", "Asistencia Gerencial | 6to |" }));
        cmb_MencionPromover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmb_MencionPromover.setOpaque(true);
        getContentPane().add(cmb_MencionPromover, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 605, 280, 30));

        jButton_minimizar.setBackground(new java.awt.Color(38, 42, 51));
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
        getContentPane().add(jButton_minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 4, -1, 20));

        jButton_cerrar.setBackground(new java.awt.Color(38, 42, 51));
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
        getContentPane().add(jButton_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 4, -1, 20));

        jButton_promover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBTM/btm-PPP.png"))); // NOI18N
        jButton_promover.setBorderPainted(false);
        jButton_promover.setContentAreaFilled(false);
        jButton_promover.setFocusPainted(false);
        jButton_promover.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_promover.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBTM/btm-PPP.png"))); // NOI18N
        jButton_promover.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBTM/btm-PP-over.png"))); // NOI18N
        jButton_promover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_promoverActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_promover, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 660, 280, 50));

        jLabel_Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gui-PPP.png"))); // NOI18N
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_minimizarMouseClicked

        if (evt.getButton()==java.awt.event.MouseEvent.BUTTON1) {
            this.setExtendedState(ICONIFIED);
        }
    }//GEN-LAST:event_jButton_minimizarMouseClicked

    private void jButton_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cerrarActionPerformed

        this.dispose();
    }//GEN-LAST:event_jButton_cerrarActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        
        FiveCodMoverJFrame.MousePressed(evt);
        
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        
        FiveCodMoverJFrame.MouseDraggedFrame(evt, this);
        
    }//GEN-LAST:event_formMouseDragged

    private void jButton_promoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_promoverActionPerformed
        
        int validacion = 0;
        String mencion_cursada, mencion_promover;
        
        mencion_cursada = txt_mencion.getText();
        mencion_promover = cmb_MencionPromover.getSelectedItem().toString();
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "update alumnoss set mencion_alumno = '" + mencion_promover + "' where id_alumno = '" + IDcliente_update + "'");
            pst.executeUpdate();
            cn.close();
            
            JOptionPane.showMessageDialog(null, "Promocion realizada corrrectamente.");
            
            try {
                Connection cn2 = Conexion.conectar();
                PreparedStatement pst2 = cn2.prepareStatement(
                        "delete from materias where id_alumno = '" + IDcliente_update + "'");
                pst2.executeUpdate();
                cn2.close();
                
                JOptionPane.showMessageDialog(null, "Asignaturas del estudiante removidas.");
                this.dispose();
                
            } catch (SQLException e) {
                System.err.println("Erro al limpiar la tabla materias.");
            }
            
        } catch (SQLException e) {
            System.err.println("Error al realizar la promocion.");
            JOptionPane.showMessageDialog(null, "Error al promocionar el alumno, contacte al administrador.");
        }
        
    }//GEN-LAST:event_jButton_promoverActionPerformed

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
            java.util.logging.Logger.getLogger(PromoverAlumnoProfesional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PromoverAlumnoProfesional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PromoverAlumnoProfesional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PromoverAlumnoProfesional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PromoverAlumnoProfesional().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_MencionPromover;
    private javax.swing.JButton jButton_cerrar;
    private javax.swing.JButton jButton_minimizar;
    private javax.swing.JButton jButton_promover;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txt_ci_alumno;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_mencion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables

    public void Limpiar(){
        txt_nombre.setText("");
        txt_mail.setText("");
        txt_telefono.setText("");
        
    }
}
