/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author labc205
 */
public class Usuario extends javax.swing.JInternalFrame {
    int fila = -1;
    private dao.Usuario lista = new dao.Usuario();
    
    //int fila = -1;
    
    /**
     * Creates new form Usuario
     */
    public Usuario() {
        initComponents();
        //this.jTblRegistros.setModel(generarTabla());
    }
    
    public Usuario(dao.Usuario user) {
        initComponents();
        this.lista = user;
        this.jTblRegistros.setModel(generarTabla());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLblUser = new javax.swing.JLabel();
        jLblContra = new javax.swing.JLabel();
        jLblNombres = new javax.swing.JLabel();
        jLblApe = new javax.swing.JLabel();
        jLblEmail = new javax.swing.JLabel();
        jTfUser = new javax.swing.JTextField();
        jPfContra = new javax.swing.JPasswordField();
        jTfNombres = new javax.swing.JTextField();
        jTfApe = new javax.swing.JTextField();
        jTfEmail = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        jBtnNuevo = new javax.swing.JButton();
        jBtnGuardar = new javax.swing.JButton();
        jBtnEditar = new javax.swing.JButton();
        jBtnEliminar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jLblBuscar = new javax.swing.JLabel();
        jTfValor = new javax.swing.JTextField();
        jbtnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblRegistros = new javax.swing.JTable();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(true);
        setTitle("Usuarios");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)), "Datos Generales"));
        jPanel1.setForeground(new java.awt.Color(0, 0, 255));

        jLblUser.setText("Nombre de Usuario:");

        jLblContra.setText("Contrase??a:");

        jLblNombres.setText("Nombres:");

        jLblApe.setText("Apellidos:");

        jLblEmail.setText("E-mail:");

        jTfUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblUser)
                    .addComponent(jLblContra, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLblNombres, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLblApe, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLblEmail, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTfUser)
                    .addComponent(jPfContra, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jTfNombres)
                    .addComponent(jTfApe)
                    .addComponent(jTfEmail))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblUser)
                    .addComponent(jTfUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblContra)
                    .addComponent(jPfContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblNombres)
                    .addComponent(jTfNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblApe)
                    .addComponent(jTfApe, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblEmail)
                    .addComponent(jTfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jToolBar1.setRollover(true);

        jBtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complemento/img/nuevo-producto.png"))); // NOI18N
        jBtnNuevo.setToolTipText("Nuevo");
        jBtnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnNuevo.setFocusable(false);
        jBtnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnNuevo);

        jBtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complemento/img/disquete.png"))); // NOI18N
        jBtnGuardar.setToolTipText("Guardar");
        jBtnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnGuardar.setFocusable(false);
        jBtnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnGuardar);

        jBtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complemento/img/editar.png"))); // NOI18N
        jBtnEditar.setToolTipText("Editar");
        jBtnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnEditar.setDisabledIcon(null);
        jBtnEditar.setEnabled(false);
        jBtnEditar.setFocusable(false);
        jBtnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnEditar);

        jBtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complemento/img/boton-eliminar.png"))); // NOI18N
        jBtnEliminar.setToolTipText("Eliminar");
        jBtnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnEliminar.setEnabled(false);
        jBtnEliminar.setFocusable(false);
        jBtnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnEliminar);

        jSeparator2.setSeparatorSize(new java.awt.Dimension(2, 35));
        jToolBar1.add(jSeparator2);

        jLblBuscar.setText("  Buscar por nombre:   ");
        jToolBar1.add(jLblBuscar);

        jTfValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfValorActionPerformed(evt);
            }
        });
        jToolBar1.add(jTfValor);

        jbtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complemento/img/buscar.png"))); // NOI18N
        jbtnBuscar.setToolTipText("Buscar");
        jbtnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarActionPerformed(evt);
            }
        });
        jToolBar1.add(jbtnBuscar);

        jTblRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTblRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTblRegistrosMousePressed(evt);
            }
        });
        jTblRegistros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTblRegistrosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTblRegistros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTfUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfUserActionPerformed

    private void jBtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNuevoActionPerformed
        // TODO add your handling code here:
        Limpiar();
        this.jBtnGuardar.setEnabled(true);
        this.jBtnEliminar.setEnabled(false);
        this.jBtnEditar.setEnabled(false);
        //this.jTblRegistros.setModel(generarTabla());
    }//GEN-LAST:event_jBtnNuevoActionPerformed

    private void jBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarActionPerformed
        // TODO add your handling code here:
        String id = this.jTfUser.getText();
        String pw = String.valueOf(this.jPfContra.getPassword());
        String nom = this.jTfNombres.getText(); 
        String ape = this.jTfApe.getText();
        String email = this.jTfEmail.getText();
        
        lista.agregar(id, pw, nom, ape, email);
        //this.jTblRegistros.setModel(generarTabla());
        Limpiar();
    }//GEN-LAST:event_jBtnGuardarActionPerformed

    private void jTblRegistrosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblRegistrosMousePressed
        // TODO add your handling code here:
        //int fila;
        
        try {
            fila = this.jTblRegistros.getSelectedRow();
            //String userName = lista.getLista().get(fila).getUserName();
            
             String userName = lista.getLista().
                    get(fila).getUserName();
            String pw = lista.getLista().
                    get(fila).getPw();
            String nom = lista.getLista().
                    get(fila).getNombres();
            String ape = lista.getLista().
                    get(fila).getApellidos();
            String email = lista.getLista().
                    get(fila).getEmail();
            
            this.jTfUser.setText(userName);
            this.jPfContra.setText(pw);
            this.jTfNombres.setText(nom);
            this.jTfApe.setText(ape);
            this.jTfEmail.setText(email);
            
            this.jBtnGuardar.setEnabled(false);
            this.jBtnEditar.setEnabled(true);
            this.jBtnEliminar.setEnabled(true);
            
            this.jTfUser.requestFocus();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al seleccionar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTblRegistrosMousePressed

    private void jTblRegistrosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTblRegistrosKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_UP) {
            ubicarTxt();
        }
    }//GEN-LAST:event_jTblRegistrosKeyReleased

    private void jBtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarActionPerformed
        // TODO add your handling code here:
        String id = this.jTfUser.getText();
        String pw = String.valueOf(this.jPfContra.getPassword());
        String nom = this.jTfNombres.getText(); 
        String ape = this.jTfApe.getText();
        String email = this.jTfEmail.getText();
        
        lista.editar(id, pw, nom, ape, email);
        
        this.jBtnGuardar.setEnabled(true);
        this.jBtnEditar.setEnabled(false);
        this.jBtnEliminar.setEnabled(false);
        
        Limpiar();
    }//GEN-LAST:event_jBtnEditarActionPerformed

    private void jBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarActionPerformed
        // TODO add your handling code here:
        this.lista.eliminarUsuario(this.jTfUser.getText());
        Limpiar();
        this.jBtnGuardar.setEnabled(true);
        this.jBtnEditar.setEnabled(false);
        this.jBtnEliminar.setEnabled(false);
    }//GEN-LAST:event_jBtnEliminarActionPerformed

    private void jTfValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfValorActionPerformed

    private void jbtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarActionPerformed
        // TODO add your handling code here:
        ArrayList<Object> newLista = new ArrayList<>();
        
        String valor = this.jTfValor.getText();
        
        newLista = lista.buscarXNombre(valor);
    }//GEN-LAST:event_jbtnBuscarActionPerformed

    public void Limpiar() {
        this.jTfUser.setText("");
        this.jPfContra.setText("");
        this.jTfApe.setText("");
        this.jTfEmail.setText("");
        this.jTfNombres.setText("");
        this.jTfUser.requestFocus();
        this.jTblRegistros.setModel(generarTabla());

    }
    
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
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnEditar;
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnGuardar;
    private javax.swing.JButton jBtnNuevo;
    private javax.swing.JLabel jLblApe;
    private javax.swing.JLabel jLblBuscar;
    private javax.swing.JLabel jLblContra;
    private javax.swing.JLabel jLblEmail;
    private javax.swing.JLabel jLblNombres;
    private javax.swing.JLabel jLblUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPfContra;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JTable jTblRegistros;
    private javax.swing.JTextField jTfApe;
    private javax.swing.JTextField jTfEmail;
    private javax.swing.JTextField jTfNombres;
    private javax.swing.JTextField jTfUser;
    private javax.swing.JTextField jTfValor;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jbtnBuscar;
    // End of variables declaration//GEN-END:variables

    public dao.Usuario getLista() {
        return lista;
    }

    public void setLista(dao.Usuario lista) {
        this.lista = lista;
    }
    
    private DefaultTableModel generarTabla() {
        DefaultTableModel dtm = new DefaultTableModel();
         
        try {
            String titulos[] = {"ID", "NOMBRE COMPLETO", "EMAIL"};
            dtm.setColumnIdentifiers(titulos);
            
            Object fila[] = new Object[3];
            int i = 0;
            
            while(i < lista.getLista().size()) {
                fila[0] = lista.getLista().get(i).getUserName();
                
                fila[1] = lista.getLista().get(i).getNombres() + 
                        " " + lista.getLista().get(i).getApellidos();
                
                fila[2] = lista.getLista().get(i).getEmail();
                
                dtm.addRow(fila);
                i++;
            }
            
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(),
                    "Error al generar la tabla",
                    JOptionPane.WARNING_MESSAGE);
        }
        return dtm;
    }
    
    private void ubicarTxt() {
        fila = this.jTblRegistros.getSelectedRow();
        //String userName = lista.getLista().get(fila).getUserName();

        String userName = lista.getLista().
                get(fila).getUserName();
        
        String pw = lista.getLista().
                get(fila).getPw();
        
        String nom = lista.getLista().
                get(fila).getNombres();
        
        String ape = lista.getLista().
                get(fila).getApellidos();
        
        String email = lista.getLista().
                get(fila).getEmail();

        this.jTfUser.setText(userName);
        this.jPfContra.setText(pw);
        this.jTfNombres.setText(nom);
        this.jTfApe.setText(ape);
        this.jTfEmail.setText(email);

        this.jBtnGuardar.setEnabled(false);
        this.jBtnEditar.setEnabled(true);
        this.jBtnEliminar.setEnabled(true);

        //this.jTfUser.requestFocus();
    }
}