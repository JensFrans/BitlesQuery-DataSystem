/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import FiveCodMover.FiveCodMoverJFrame;
import java.sql.*;
import clases.Conexion;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.sun.jndi.cosnaming.CNCtx;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import static ventanas.GestionarClientes.IDcliente_update;

 /**
 *
 * @author JensFrans JanfrancoParra@gmail.com-GitHub-JensFrans
 */
public class Informacion_Cliente extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();

    int IDcliente_update = 0;
    public static int IDequipo = 0;
    String user = "";

    /**
     * Creates new form Informacion_Cliente
     */
    public Informacion_Cliente() {
        initComponents();
        user = Login.user;
        IDcliente_update = GestionarClientes.IDcliente_update;

        setSize(800, 600);
        setResizable(false);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        ImageIcon wallpaper = new ImageIcon(getClass().getResource("/images/gui_ia.png"));
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
                txt_ci_alumno.setText(rs.getString("ci_alumno"));
                txt_mail.setText(rs.getString("email_alumno"));
                txt_telefono.setText(rs.getString("tel_alumno"));
                txt_mencion.setText(rs.getString("mencion_alumno"));
                txt_direccion.setText(rs.getString("dir_alumno"));
                txt_ultimaModificacion.setText(rs.getString("ultima_modificacion"));
                
                
            }
            cn.close();
        } catch (SQLException e) {
            System.err.println("Error en cargar usuario." + e);
            JOptionPane.showMessageDialog(
                    null, "¡¡ERROR al cargar!!, contacte al administrador.");
        }

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select id_materia, tipo_materia, calificacion, status from materias where id_alumno = '"
                    + IDcliente_update + "'");
            ResultSet rs = pst.executeQuery();

            jTable_equipos = new JTable(model);
            jScrollPane_equipos.setViewportView(jTable_equipos);

            model.addColumn("ID Materia");
            model.addColumn("Materia");
            model.addColumn("Calificacion");
            model.addColumn("Estatus");

            while (rs.next()) {
                Object[] fila = new Object[4];

                for (int i = 0; i < 4; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            cn.close();
        } catch (SQLException e) {
            System.err.println("Error en el llenado de la tabla equipos");
        }

        jTable_equipos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTable_equipos.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    IDequipo = (int) model.getValueAt(fila_point, columna_point);
                    InformacionEquipo informacionEquipo = new InformacionEquipo();
                    informacionEquipo.setVisible(true);
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

        jLabel_Titulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane_equipos = new javax.swing.JScrollPane();
        jTable_equipos = new javax.swing.JTable();
        txt_nombre = new javax.swing.JTextField();
        txt_ci_alumno = new javax.swing.JTextField();
        txt_mail = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_mencion = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_ultimaModificacion = new javax.swing.JTextField();
        jButton_Registrar = new javax.swing.JButton();
        jButton_Actualizar = new javax.swing.JButton();
        jButton_ImprimirReporte = new javax.swing.JButton();
        jButton_EliminarRegistro = new javax.swing.JButton();
        jButton_minimizar = new javax.swing.JButton();
        jButton_cerrar = new javax.swing.JButton();
        jCheckBox_confirm = new javax.swing.JCheckBox();
        jLabel_Wallpaper = new javax.swing.JLabel();

        jLabel_Titulo.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        jLabel_Titulo.setText("Informacion del Alumno");

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

        jScrollPane_equipos.setBackground(new java.awt.Color(244, 244, 244));
        jScrollPane_equipos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 233, 237), 3, true));
        jScrollPane_equipos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTable_equipos.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 11)); // NOI18N
        jTable_equipos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable_equipos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane_equipos.setViewportView(jTable_equipos);

        getContentPane().add(jScrollPane_equipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 86, 345, 235));

        txt_nombre.setBackground(new java.awt.Color(240, 240, 240));
        txt_nombre.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 16)); // NOI18N
        txt_nombre.setBorder(null);
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 133, 250, -1));

        txt_ci_alumno.setBackground(new java.awt.Color(240, 240, 240));
        txt_ci_alumno.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 16)); // NOI18N
        txt_ci_alumno.setBorder(null);
        getContentPane().add(txt_ci_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 195, 250, -1));

        txt_mail.setBackground(new java.awt.Color(240, 240, 240));
        txt_mail.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 16)); // NOI18N
        txt_mail.setBorder(null);
        getContentPane().add(txt_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 267, 250, -1));

        txt_telefono.setBackground(new java.awt.Color(240, 240, 240));
        txt_telefono.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 16)); // NOI18N
        txt_telefono.setBorder(null);
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 336, 250, -1));

        txt_mencion.setBackground(new java.awt.Color(240, 240, 240));
        txt_mencion.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 16)); // NOI18N
        txt_mencion.setBorder(null);
        getContentPane().add(txt_mencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 403, 250, -1));

        txt_direccion.setBackground(new java.awt.Color(240, 240, 240));
        txt_direccion.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 16)); // NOI18N
        txt_direccion.setBorder(null);
        getContentPane().add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 468, 250, -1));

        txt_ultimaModificacion.setBackground(new java.awt.Color(240, 240, 240));
        txt_ultimaModificacion.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 16)); // NOI18N
        txt_ultimaModificacion.setBorder(null);
        txt_ultimaModificacion.setEnabled(false);
        getContentPane().add(txt_ultimaModificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 530, 250, -1));

        jButton_Registrar.setBackground(new java.awt.Color(51, 255, 51));
        jButton_Registrar.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 11)); // NOI18N
        jButton_Registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBTM/btm-materia.png"))); // NOI18N
        jButton_Registrar.setBorder(null);
        jButton_Registrar.setBorderPainted(false);
        jButton_Registrar.setContentAreaFilled(false);
        jButton_Registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Registrar.setFocusPainted(false);
        jButton_Registrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBTM/btm-materia.png"))); // NOI18N
        jButton_Registrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBTM/btm-materia-over.png"))); // NOI18N
        jButton_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 350, 350, 50));

        jButton_Actualizar.setBackground(new java.awt.Color(51, 255, 51));
        jButton_Actualizar.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 11)); // NOI18N
        jButton_Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBTM/btm-infa2.png"))); // NOI18N
        jButton_Actualizar.setBorder(null);
        jButton_Actualizar.setBorderPainted(false);
        jButton_Actualizar.setContentAreaFilled(false);
        jButton_Actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Actualizar.setFocusPainted(false);
        jButton_Actualizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBTM/btm-infa2.png"))); // NOI18N
        jButton_Actualizar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBTM/btm-infa2-over.png"))); // NOI18N
        jButton_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 420, 350, 50));

        jButton_ImprimirReporte.setBackground(new java.awt.Color(51, 255, 51));
        jButton_ImprimirReporte.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 11)); // NOI18N
        jButton_ImprimirReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBTM/btm-infa3.png"))); // NOI18N
        jButton_ImprimirReporte.setBorder(null);
        jButton_ImprimirReporte.setBorderPainted(false);
        jButton_ImprimirReporte.setContentAreaFilled(false);
        jButton_ImprimirReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_ImprimirReporte.setFocusPainted(false);
        jButton_ImprimirReporte.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBTM/btm-infa3.png"))); // NOI18N
        jButton_ImprimirReporte.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBTM/btm-infa3-over.png"))); // NOI18N
        jButton_ImprimirReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ImprimirReporteActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_ImprimirReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 485, 170, 65));

        jButton_EliminarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBTM/btm-infa4.png"))); // NOI18N
        jButton_EliminarRegistro.setBorderPainted(false);
        jButton_EliminarRegistro.setContentAreaFilled(false);
        jButton_EliminarRegistro.setFocusPainted(false);
        jButton_EliminarRegistro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_EliminarRegistro.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBTM/btm-infa4.png"))); // NOI18N
        jButton_EliminarRegistro.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBTM/btm-infa4-over.png"))); // NOI18N
        jButton_EliminarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EliminarRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_EliminarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 485, 170, 65));

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
        getContentPane().add(jButton_minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 1, -1, 20));

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
        getContentPane().add(jButton_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(775, 1, -1, 20));

        jCheckBox_confirm.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox_confirm.setText("\"Confirmar eliminacion\"");
        jCheckBox_confirm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jCheckBox_confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 555, 170, -1));

        jLabel_Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gui_ia.png"))); // NOI18N
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegistrarActionPerformed

        RegistrarEquipo registrar_equipo = new RegistrarEquipo();
        registrar_equipo.setVisible(true);

    }//GEN-LAST:event_jButton_RegistrarActionPerformed

    private void jButton_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ActualizarActionPerformed

        int validacion = 0;
        String nombre, mail, telefono, direccion, mencion, ci;

        nombre = txt_nombre.getText().trim();
        mail = txt_mail.getText().trim();
        telefono = txt_telefono.getText().trim();
        direccion = txt_direccion.getText().trim();
        mencion = txt_mencion.getText().trim();
        ci = txt_ci_alumno.getText().trim();

        if (nombre.equals("")) {
            txt_nombre.setBackground(Color.red);
            validacion++;
        }
        if (mail.equals("")) {
            txt_mail.setBackground(Color.red);
            validacion++;
        }
        if (telefono.equals("")) {
            txt_telefono.setBackground(Color.red);
            validacion++;
        }
        if (direccion.equals("")) {
            txt_direccion.setBackground(Color.red);
            validacion++;
        }
        if (mencion.equals("")) {
            txt_mencion.setBackground(Color.red);
            validacion++;
        }
        if (ci.equals("")) {
            txt_ci_alumno.setBackground(Color.red);
            validacion++;
        }

        if (validacion == 0) {

            try {

                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "update alumnoss set nombre_alumno=?, email_alumno=?, tel_alumno=?, dir_alumno=?, ultima_modificacion=?, mencion_alumno=?, ci_alumno=? "
                        + "where id_alumno = '" + IDcliente_update + "'");
                
                pst.setString(1, nombre);
                pst.setString(2, mail);
                pst.setString(3, telefono);
                pst.setString(4, direccion);
                pst.setString(5, user);
                pst.setString(6, mencion);
                pst.setString(7, ci);
                
                
                pst.executeUpdate();
                cn.close();
                
                Limpiar();
                
                txt_nombre.setBackground(Color.GREEN);
                txt_mail.setBackground(Color.GREEN);
                txt_telefono.setBackground(Color.GREEN);
                txt_direccion.setBackground(Color.GREEN);
                txt_ultimaModificacion.setText(user);
                txt_mencion.setBackground(Color.GREEN);
                txt_ci_alumno.setBackground(Color.GREEN);
                
                JOptionPane.showMessageDialog(null, "Actulizacion de datos exitosa.");
                this.dispose();

            } catch (SQLException e) {
                System.err.println("Error en actualizar datos del alumno...");
                JOptionPane.showMessageDialog(null, "¡¡Error al actualizar alumno!!, contacte al administrador.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos.");
        }

    }//GEN-LAST:event_jButton_ActualizarActionPerformed

    private void jButton_ImprimirReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ImprimirReporteActionPerformed
        
        Document documento = new Document();
        
        try {
            
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/" + txt_nombre.getText().trim() + ".pdf"));
            
            com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance("src/images/BannerPDF.jpg");
            header.scaleToFit(600, 900); 
            header.setAlignment(Chunk.ALIGN_CENTER);
            //header.setAbsolutePosition(0.5f, 650f);
            
            
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Informacion del Alumno. \n \n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 14, Font.BOLD, BaseColor.DARK_GRAY));
            
            documento.open();
            documento.add(header);
            documento.add(parrafo);
            
            PdfPTable tablaCliente = new PdfPTable(6);
            tablaCliente.setWidthPercentage(112f);
            float[] anchos = {2.55f,10.55f,5.30f,6.90f,12.90f,9.90f};//7.60f
            tablaCliente.setWidths(anchos);
            
            tablaCliente.addCell("ID");
            tablaCliente.addCell("Nombre");
            tablaCliente.addCell("C. I.");
            tablaCliente.addCell("Telefono");
//            tablaCliente.addCell("Direccion");
            tablaCliente.addCell("Mencion");
            tablaCliente.addCell("E-mail");
           
            
            try {
                
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "select * from alumnoss where id_alumno = '" + IDcliente_update +"'");
                
                ResultSet rs = pst.executeQuery();
                
                if (rs.next()) {
                    do {                        
                        
                        tablaCliente.addCell(rs.getString(1));
                        tablaCliente.addCell(rs.getString(2));
                        tablaCliente.addCell(rs.getString(8));
                        tablaCliente.addCell(rs.getString(4));
//                        tablaCliente.addCell(rs.getString(5));
                        tablaCliente.addCell(rs.getString(7));
                        tablaCliente.addCell(rs.getString(3));
                        
                        
                    } while (rs.next());
                    
                    documento.add(tablaCliente);
                }
                
                Paragraph parrafo2 = new Paragraph();
                parrafo2.setAlignment(Paragraph.ALIGN_CENTER);
                parrafo2.add("\n \n Materias Registradas. \n \n");
                parrafo2.setFont(FontFactory.getFont("Tahoma", 14, Font.BOLD, BaseColor.DARK_GRAY));
                
                documento.add(parrafo2);
                
                PdfPTable tablaMaterias = new PdfPTable(5);
                tablaMaterias.setWidthPercentage(112f);
            float[] anchos2 = {2.55f,10.55f,5.30f,11.90f,12.90f,};//7.60f
            tablaMaterias.setWidths(anchos2);
                
                tablaMaterias.addCell("ID");
                tablaMaterias.addCell("Materia");
                tablaMaterias.addCell("Calificacion");
                tablaMaterias.addCell("Maestro");
                tablaMaterias.addCell("Estatus");
                
                try {

                    Connection cn2 = Conexion.conectar();
                    PreparedStatement pst2 = cn2.prepareStatement(
                            "select id_materia, tipo_materia, calificacion, maestro, status from materias where id_alumno = '" + IDcliente_update + "'");
                    
                    ResultSet rs2 = pst2.executeQuery();
                    
                    if(rs2.next()){
                        do {                            
                            tablaMaterias.addCell(rs2.getString(1));
                            tablaMaterias.addCell(rs2.getString(2));
                            tablaMaterias.addCell(rs2.getString(3));
                            tablaMaterias.addCell(rs2.getString(4));
                            tablaMaterias.addCell(rs2.getString(5));
                            
                        } while (rs2.next());
                        documento.add(tablaMaterias);
                    }

                } catch (SQLException e) {
                    System.err.println("¡¡Error al cargar materias!!");
                }
                
                
                
            } catch (SQLException e) {
                System.err.println("¡¡Error al obtener los datos!!");
            }
            
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado correctamente.");
            
            
        } catch (DocumentException | IOException e) {
            System.err.println("¡¡Erro en pdf o ruta de imagen");
            JOptionPane.showMessageDialog(null, "¡¡Error al generar reporte!!, Contacte al administrador.");
            
        }
        
    }//GEN-LAST:event_jButton_ImprimirReporteActionPerformed

    private void jButton_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_minimizarMouseClicked

        if (evt.getButton()==java.awt.event.MouseEvent.BUTTON1) {
            this.setExtendedState(ICONIFIED);
        }
    }//GEN-LAST:event_jButton_minimizarMouseClicked

    private void jButton_minimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_minimizarActionPerformed

    }//GEN-LAST:event_jButton_minimizarActionPerformed

    private void jButton_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cerrarActionPerformed

        this.dispose();
    }//GEN-LAST:event_jButton_cerrarActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        
        FiveCodMoverJFrame.MousePressed(evt);
        
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        
        FiveCodMoverJFrame.MouseDraggedFrame(evt, this);
        
    }//GEN-LAST:event_formMouseDragged

    private void jButton_EliminarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EliminarRegistroActionPerformed
        
        if (jCheckBox_confirm.isSelected()) {
            
            try {
                
               Connection cn = Conexion.conectar();
               PreparedStatement pst = cn.prepareStatement(
                       "delete from alumnoss where id_alumno ='" + IDcliente_update + "'");
               
               pst.executeUpdate();
               cn.close();
               
            } catch (SQLException e) {
                System.err.println("Error al eliminar el registro - tabla alumnoss - ");
                JOptionPane.showMessageDialog(null, "Error al eliminar el registro A., contacte al administrador...");
            }
            
            try {
            
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "delete from materias where id_alumno ='" + IDcliente_update + "'");
                
                pst.executeUpdate();
                cn.close();
                
            } catch (SQLException e) {
                System.err.println("Error al eliminar el registro - tabla materias-");
                JOptionPane.showMessageDialog(null, "Error al eliminar el registro M., contacte al administrador..");
            }
            JOptionPane.showMessageDialog(null, "Se ha removido un alumno en conjunto con sus asignaturas, correctamente.");
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Por favor, confirme la eliminacion para continuar.");
        }
        
    }//GEN-LAST:event_jButton_EliminarRegistroActionPerformed

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
            java.util.logging.Logger.getLogger(Informacion_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informacion_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informacion_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informacion_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Informacion_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Actualizar;
    private javax.swing.JButton jButton_EliminarRegistro;
    private javax.swing.JButton jButton_ImprimirReporte;
    private javax.swing.JButton jButton_Registrar;
    private javax.swing.JButton jButton_cerrar;
    private javax.swing.JButton jButton_minimizar;
    private javax.swing.JCheckBox jCheckBox_confirm;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JScrollPane jScrollPane_equipos;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable_equipos;
    private javax.swing.JTextField txt_ci_alumno;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_mencion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_ultimaModificacion;
    // End of variables declaration//GEN-END:variables

    public void Limpiar(){
        txt_nombre.setText("");
        txt_mail.setText("");
        txt_telefono.setText("");
        txt_direccion.setText("");  
    }
}
