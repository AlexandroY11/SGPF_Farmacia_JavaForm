/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sgpf.views.medicamento;

import java.awt.event.ActionEvent;
import java.util.Random;
import sgpf.views.MainForm;

/**
 *
 * @author Brayan Hurtado
 */
public class CrearMedicamento extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public CrearMedicamento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Titulo_InicioSesion = new javax.swing.JLabel();
        Icono_InicioSesion = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        ImagenMedicamento = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        GenerarCodBarras = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        GuardarMedicamento = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        AddFoto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        Titulo_InicioSesion1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(100, 149, 237));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo_InicioSesion.setFont(new java.awt.Font("Arial Black", 1, 28)); // NOI18N
        Titulo_InicioSesion.setForeground(new java.awt.Color(255, 255, 255));
        Titulo_InicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo_InicioSesion.setText("Medicamentos");
        jPanel2.add(Titulo_InicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 273, 40));

        Icono_InicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgpf/resources/icons/Creacion de lotes.png"))); // NOI18N
        jPanel2.add(Icono_InicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 250, 250));

        jPanel4.setBackground(new java.awt.Color(100, 149, 237));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImagenMedicamento.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        ImagenMedicamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenMedicamento.setText("Foto");
        ImagenMedicamento.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.add(ImagenMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 234, 266));

        jLabel3.setText("Click en el cuadro para agregar foto");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre del medicamento");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 188, -1));

        GenerarCodBarras.setBackground(new java.awt.Color(0, 191, 255));
        GenerarCodBarras.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        GenerarCodBarras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgpf/resources/icons/farmaco.png"))); // NOI18N
        GenerarCodBarras.setText("Generar Código Barras");
        GenerarCodBarras.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        GenerarCodBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarCodBarrasActionPerformed(evt);
            }
        });
        jPanel1.add(GenerarCodBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        jTextField6.setEditable(false);
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 230, -1));

        jLabel7.setText("Codigo de Barras");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        GuardarMedicamento.setBackground(new java.awt.Color(0, 191, 255));
        GuardarMedicamento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        GuardarMedicamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgpf/resources/icons/farmaco.png"))); // NOI18N
        GuardarMedicamento.setText("Guardar");
        GuardarMedicamento.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        GuardarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarMedicamentoActionPerformed(evt);
            }
        });
        jPanel1.add(GuardarMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, -1, -1));

        jButton10.setBackground(new java.awt.Color(135, 206, 235));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgpf/resources/icons/cerrar-sesion.png"))); // NOI18N
        jButton10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, -1, -1));

        AddFoto.setText("Añadir Foto");
        AddFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddFotoActionPerformed(evt);
            }
        });
        jPanel1.add(AddFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, -1, -1));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 420, 650));

        jLabel2.setText("Nombre del medicamento");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 188, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 0, 490, -1));

        Titulo_InicioSesion1.setFont(new java.awt.Font("Arial Black", 1, 28)); // NOI18N
        Titulo_InicioSesion1.setForeground(new java.awt.Color(255, 255, 255));
        Titulo_InicioSesion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo_InicioSesion1.setText("Crear ");
        jPanel2.add(Titulo_InicioSesion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 273, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void GuardarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarMedicamentoActionPerformed
        String nombreMedicamento = jTextField3.getText().trim();
        String codigoBarras = jTextField6.getText().trim();
        String rutaFoto = ImagenMedicamento.getText(); // O la variable que contenga la ruta de la imagen

        // Validaciones
        if (nombreMedicamento.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "El nombre del medicamento es obligatorio.", 
                "Error", 
                javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (codigoBarras.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Debe generar un código de barras antes de guardar.", 
                "Error", 
                javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (codigoBarras.length() != 13) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "El código de barras debe tener 13 dígitos.", 
                "Error", 
                javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (ImagenMedicamento.getIcon() == null) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Debe agregar una foto del medicamento.",
                "Error de Validación", 
                javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Si todas las validaciones pasan, puedes continuar con el proceso de guardado
        javax.swing.JOptionPane.showMessageDialog(this, 
            "El medicamento ha sido guardado exitosamente.", 
            "Éxito", 
            javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_GuardarMedicamentoActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        int respuesta = javax.swing.JOptionPane.showConfirmDialog(this,
            "¿Estás seguro de que deseas salir?",
            "Confirmar salida",
            javax.swing.JOptionPane.YES_NO_OPTION,
            javax.swing.JOptionPane.QUESTION_MESSAGE);

        if (respuesta == javax.swing.JOptionPane.YES_OPTION) {
            MainForm mainForm = new MainForm();
            mainForm.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void AddFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddFotoActionPerformed
        // Crear un JFileChooser para seleccionar imágenes
        javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();

        // Establecer un filtro para solo aceptar archivos de imágenes
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter(
            "Imágenes (JPG, PNG, GIF)", "jpg", "png", "gif"));

        // Mostrar el cuadro de diálogo para abrir un archivo
        int seleccion = fileChooser.showOpenDialog(this);

        // Si el usuario selecciona un archivo
        if (seleccion == javax.swing.JFileChooser.APPROVE_OPTION) {
            // Obtener la ruta del archivo seleccionado
            java.io.File archivoSeleccionado = fileChooser.getSelectedFile();
            String rutaArchivo = archivoSeleccionado.getAbsolutePath();

            // Mostrar la imagen en el JLabel
            try {
                // Cargar la imagen desde la ruta
                javax.swing.ImageIcon imagen = new javax.swing.ImageIcon(rutaArchivo);

                // Ajustar la imagen al tamaño del JLabel
                java.awt.Image imagenEscalada = imagen.getImage().getScaledInstance(
                    ImagenMedicamento.getWidth(),
                    ImagenMedicamento.getHeight(),
                    java.awt.Image.SCALE_SMOOTH);

                // Establecer la imagen en el JLabel
                ImagenMedicamento.setIcon(new javax.swing.ImageIcon(imagenEscalada));
                ImagenMedicamento.setText(""); // Limpiar texto del JLabel (si lo tiene)

            } catch (Exception e) {
                javax.swing.JOptionPane.showMessageDialog(this, 
                    "Error al cargar la imagen: " + e.getMessage(),
                    "Error", 
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // El usuario canceló la selección
            javax.swing.JOptionPane.showMessageDialog(this, 
                "No se seleccionó ninguna imagen.",
                "Aviso", 
                javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_AddFotoActionPerformed
    
    private void BotonConsultarMedicamentosActionPerformed(java.awt.event.ActionEvent evt){
        
    }
    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt){
        
    }
    
    private void GenerarCodBarrasActionPerformed(java.awt.event.ActionEvent evt){
        String codigoBarras = generarCodigoBarras(); // Generar el código de barras
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Código de Barras Generado: " + codigoBarras, 
            "Código de Barras", 
            javax.swing.JOptionPane.INFORMATION_MESSAGE);
        jTextField6.setText(codigoBarras);
    }
    
    private String generarCodigoBarras() {
        StringBuilder codigoBarras = new StringBuilder();
        Random random = new Random();

        // Generar un número de 13 dígitos (EAN-13, por ejemplo)
        for (int i = 0; i < 13; i++) {
            int digito = random.nextInt(10); // Números del 0 al 9
            codigoBarras.append(digito);
        }

        return codigoBarras.toString();
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
            java.util.logging.Logger.getLogger(CrearMedicamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearMedicamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearMedicamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearMedicamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearMedicamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddFoto;
    public javax.swing.JButton GenerarCodBarras;
    public javax.swing.JButton GuardarMedicamento;
    public javax.swing.JLabel Icono_InicioSesion;
    public javax.swing.JLabel ImagenMedicamento;
    public javax.swing.JLabel Titulo_InicioSesion;
    public javax.swing.JLabel Titulo_InicioSesion1;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
