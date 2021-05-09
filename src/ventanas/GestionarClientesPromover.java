/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;
/* Esta es la tabla que captura los datos de los estudiantes y captura el evento de Clicked 
para abrir la interfaz de nformacion...*/
import FiveCodMover.FiveCodMoverJFrame;
import java.sql.*;
import clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

 /**
 *
 * @author JensFrans JanfrancoParra@gmail.com-GitHub-JensFrans
 */
public class GestionarClientesPromover extends javax.swing.JFrame {

    String user;
    public static int IDcliente_update = 0;
    DefaultTableModel model = new DefaultTableModel();

    /**
     * Creates new form GestionarClientes
     */
    public GestionarClientesPromover() {
        initComponents();
        user = Login.user;

        setSize(680, 440);
        setResizable(false);
        setTitle("Gestion de alumnos - Sesion de " + user);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        ImageIcon wallpaper = new ImageIcon(getClass().getResource("/images/gui_ga.png"));
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(),
                jLabel_Wallpaper.getHeight(), Image.SCALE_AREA_AVERAGING));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();

        try {

            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select id_alumno, nombre_alumno, ci_alumno, tel_alumno, mencion_alumno, email_alumno, ultima_modificacion from alumnoss");

            ResultSet rs = pst.executeQuery();

            jTable_clientes = new JTable(model);
            jScrollPane1.setViewportView(jTable_clientes);

            model.addColumn(" ID ");
            model.addColumn("Nombre");
            model.addColumn("Cedula de Identidad");
            model.addColumn("Telefono");
            model.addColumn("Mencion");
            model.addColumn("E-m@il");
            model.addColumn("Ultima modificacion por");
            
                        
            jTable_clientes.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable_clientes.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable_clientes.getColumnModel().getColumn(2).setPreferredWidth(120);
            jTable_clientes.getColumnModel().getColumn(3).setPreferredWidth(120);
            jTable_clientes.getColumnModel().getColumn(4).setPreferredWidth(210);
            jTable_clientes.getColumnModel().getColumn(5).setPreferredWidth(100);
            jTable_clientes.getColumnModel().getColumn(6).setPreferredWidth(10);

            while (rs.next()) {

                Object[] fila = new Object[7];
                for (int i = 0; i < 7; i++) {
                    fila[i] = rs.getObject(i + 1);

                }
                model.addRow(fila);

            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar la tabla...");
        }

        jTable_clientes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                int fila_point = jTable_clientes.rowAtPoint(e.getPoint());
                int columna_point = 0;
                
                if (fila_point > -1) {
                    IDcliente_update = (int)model.getValueAt(fila_point, columna_point);
                    PromoverAlumnoProfesional promoverAlumnoProfesional = new PromoverAlumnoProfesional();
                    promoverAlumnoProfesional.setVisible(true);
                    
                }
            }
                
            
        });

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

        jButton_mostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_clientes = new javax.swing.JTable();
        jLabel_footer = new javax.swing.JLabel();
        jButton_cerrar = new javax.swing.JButton();
        jButton_minimizar = new javax.swing.JButton();
        cmb_estatus = new javax.swing.JComboBox<>();
        jLabel_Wallpaper = new javax.swing.JLabel();

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

        jButton_mostrar.setBackground(new java.awt.Color(244, 244, 244));
        jButton_mostrar.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 11)); // NOI18N
        jButton_mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBTM/btm-buscar.png"))); // NOI18N
        jButton_mostrar.setBorder(null);
        jButton_mostrar.setBorderPainted(false);
        jButton_mostrar.setContentAreaFilled(false);
        jButton_mostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_mostrar.setFocusPainted(false);
        jButton_mostrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBTM/btm-buscar.png"))); // NOI18N
        jButton_mostrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBTM/btm-buscar.over.png"))); // NOI18N
        jButton_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_mostrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 55, 35, 35));

        jScrollPane1.setBackground(new java.awt.Color(244, 244, 244));
        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTable_clientes.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 11)); // NOI18N
        jTable_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable_clientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 100, 623, 290));

        jLabel_footer.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 11)); // NOI18N
        jLabel_footer.setText("Creado por Squery © - 2021 ");
        getContentPane().add(jLabel_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

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
        getContentPane().add(jButton_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 1, -1, 20));

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
        jButton_minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_minimizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 1, -1, 20));

        cmb_estatus.setBackground(new java.awt.Color(240, 240, 240));
        cmb_estatus.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 11)); // NOI18N
        cmb_estatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Basica | 1ero | A", "Basica | 1ero | B", "Basica | 1ero | C", "Basica | 2do | A", "Basica | 2do | B", "Basica | 2do | C", "Basica | 3ro | A", "Basica | 3ro | B", "Basica | 3ro | C", "Informatica | 4to |", "Informatica | 5to |", "Informatica | 6to |", "Administracion F. | 4to |", "Administracion F. | 5to |", "Administracion F. | 6to |", "Contabilidad | 4to |", "Contabilidad | 5to |", "Contabilidad | 6to |", "Turismo | 4to |", "Turismo | 5to |", "Turismo | 6to |", "Asistencia Gerencial | 4to |", "Asistencia Gerencial | 5to |", "Asistencia Gerencial | 6to |" }));
        cmb_estatus.setBorder(null);
        cmb_estatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(cmb_estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 62, 150, 23));

        jLabel_Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gui_ga.png"))); // NOI18N
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cerrarActionPerformed

        this.dispose();
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

    private void jButton_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_mostrarActionPerformed

        String seleccion = cmb_estatus.getSelectedItem().toString();
        String query = "";

        model.setRowCount(0);
        model.setColumnCount(0);

        try {
            Connection cn = Conexion.conectar();

            if (seleccion.equalsIgnoreCase("Todos")) {
                query = "select id_alumno, nombre_alumno, ci_alumno, tel_alumno, mencion_alumno, email_alumno, ultima_modificacion from alumnoss";
            } else {
                query = "select id_alumno, nombre_alumno, ci_alumno, tel_alumno, mencion_alumno, email_alumno, ultima_modificacion"
                        + " from alumnoss where mencion_alumno = '" + seleccion + "'";
            }

            PreparedStatement pst = cn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            jTable_clientes = new JTable(model);
            jScrollPane1.setViewportView(jTable_clientes);

            model.addColumn(" ID ");
            model.addColumn("Nombre");
            model.addColumn("Cedula de Identidad");
            model.addColumn("Telefono");
            model.addColumn("Mencion");
            model.addColumn("E-m@il");
            model.addColumn("Ultima modificacion por");

            while (rs.next()) {
                Object [] fila = new Object[7];
                for (int i = 0; i < 7; i++) {
                    fila[i] = rs.getObject(i + 1);
                }

                model.addRow(fila);
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar la tabla equipos registrados" + e);
        }

        ObtenerDatosTabla();

    }//GEN-LAST:event_jButton_mostrarActionPerformed

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
            java.util.logging.Logger.getLogger(GestionarClientesPromover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarClientesPromover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarClientesPromover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarClientesPromover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarClientesPromover().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_estatus;
    private javax.swing.JButton jButton_cerrar;
    private javax.swing.JButton jButton_minimizar;
    private javax.swing.JButton jButton_mostrar;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JLabel jLabel_footer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_clientes;
    // End of variables declaration//GEN-END:variables

    public void ObtenerDatosTabla(){
    jTable_clientes.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e){
    int fila_point = jTable_clientes.rowAtPoint(e.getPoint());
    int columna_point = 0;
    
    if (fila_point > -1) {
    IDcliente_update = (int) model.getValueAt(fila_point, columna_point);
    Informacion_Cliente info = new Informacion_Cliente();
    info.setVisible(true);
    }
    }
    });
    }

}