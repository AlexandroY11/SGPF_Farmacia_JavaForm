package sgpf.views.login;

public class InicioSesion extends javax.swing.JFrame {

    public InicioSesion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo_InicioSesion = new javax.swing.JLabel();
        InicioSesionFondo = new javax.swing.JPanel();
        InicioSesion = new javax.swing.JPanel();
        Usuario_InicioSesion = new javax.swing.JTextField();
        IngresarUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Boton_InicioSesion = new javax.swing.JButton();
        Contrasena = new javax.swing.JPasswordField();
        Icono_InicioSesion = new javax.swing.JLabel();
        BotonRegistrate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Titulo_InicioSesion1 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));

        Titulo_InicioSesion.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Titulo_InicioSesion.setForeground(new java.awt.Color(255, 255, 255));
        Titulo_InicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo_InicioSesion.setText("<html> <div style=\"text-align: center;\"> Sistema de Gestión de Presentaciones Farmacéuticas </div> </html>");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InicioSesionFondo.setBackground(new java.awt.Color(100, 149, 237));
        InicioSesionFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InicioSesion.setBackground(new java.awt.Color(135, 206, 235));

        Usuario_InicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Usuario_InicioSesionActionPerformed(evt);
            }
        });

        IngresarUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        IngresarUsuario.setText("Ingresa el Usuario");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Ingresa la Contraseña");

        Boton_InicioSesion.setBackground(new java.awt.Color(0, 191, 255));
        Boton_InicioSesion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Boton_InicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgpf/resources/icons/icons8-inicio-sesión-48.png"))); // NOI18N
        Boton_InicioSesion.setText("Iniciar Sesion");
        Boton_InicioSesion.setHideActionText(true);
        Boton_InicioSesion.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Boton_InicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_InicioSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InicioSesionLayout = new javax.swing.GroupLayout(InicioSesion);
        InicioSesion.setLayout(InicioSesionLayout);
        InicioSesionLayout.setHorizontalGroup(
            InicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioSesionLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(InicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Contrasena)
                    .addComponent(Boton_InicioSesion)
                    .addComponent(Usuario_InicioSesion)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InicioSesionLayout.createSequentialGroup()
                        .addGroup(InicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(IngresarUsuario))
                        .addGap(357, 357, 357)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        InicioSesionLayout.setVerticalGroup(
            InicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioSesionLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(IngresarUsuario)
                .addGap(18, 18, 18)
                .addComponent(Usuario_InicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(Boton_InicioSesion)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        InicioSesionFondo.add(InicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, 360));

        Icono_InicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgpf/resources/icons/descarga (1).png"))); // NOI18N
        InicioSesionFondo.add(Icono_InicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 187, 180));

        BotonRegistrate.setBackground(new java.awt.Color(0, 191, 255));
        BotonRegistrate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotonRegistrate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgpf/resources/icons/icons8-registrarse-48.png"))); // NOI18N
        BotonRegistrate.setText("Registrate");
        BotonRegistrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrateActionPerformed(evt);
            }
        });
        InicioSesionFondo.add(BotonRegistrate, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        jLabel2.setText("¿No tienes un usuario creado?");
        InicioSesionFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        Titulo_InicioSesion1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Titulo_InicioSesion1.setForeground(new java.awt.Color(255, 255, 255));
        Titulo_InicioSesion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo_InicioSesion1.setText("<html>\n<div style=\"text-align: center;\">\nSistema de Gestión de Presentaciones Farmacéuticas\n</div>\n</html>");
        InicioSesionFondo.add(Titulo_InicioSesion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 273, 88));

        getContentPane().add(InicioSesionFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 410));
        getContentPane().add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 386, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_InicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_InicioSesionActionPerformed
        String correo = Usuario_InicioSesion.getText().trim();
        String contrasena = Contrasena.getText().trim();

        // Validaciones
        if (correo.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "El campo de usuario no puede estar vacío.", 
                "Error", 
                javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (contrasena.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "El campo de contraseña no puede estar vacío.", 
                "Error", 
                javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Crear una instancia de UsuarioDao
        sgpf.daos.UsuarioDao usuarioDao = new sgpf.daos.UsuarioDao();

        // Llamar al método IniciarSesion
        boolean inicioExitoso = usuarioDao.IniciarSesion(correo, contrasena);

        if (inicioExitoso) {
            // Mensaje de bienvenida
            javax.swing.JOptionPane.showMessageDialog(this, 
                "¡Inicio de sesión exitoso! Bienvenido " + correo + ".", 
                "Éxito", 
                javax.swing.JOptionPane.INFORMATION_MESSAGE);

            // Aquí puedes redirigir a la siguiente ventana
            // Ejemplo:
            // MenuPrincipal menu = new MenuPrincipal();
            // menu.setVisible(true);
            // this.dispose();

        } else {
            // Mostrar mensaje de error si las credenciales son incorrectas
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Usuario o contraseña incorrectos. Inténtalo nuevamente.", 
                "Error", 
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Boton_InicioSesionActionPerformed

    private void Usuario_InicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Usuario_InicioSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Usuario_InicioSesionActionPerformed

    private void BotonRegistrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrateActionPerformed
        Registrar registrarVentana = new Registrar();

        // Hacer visible la ventana de registro
        registrarVentana.setVisible(true);

        // Cerrar la ventana actual (suponiendo que sea la ventana de inicio de sesión)
        this.dispose();
    }//GEN-LAST:event_BotonRegistrateActionPerformed

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
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BotonRegistrate;
    public javax.swing.JButton Boton_InicioSesion;
    private javax.swing.JPasswordField Contrasena;
    public javax.swing.JLabel Icono_InicioSesion;
    public javax.swing.JLabel IngresarUsuario;
    public javax.swing.JPanel InicioSesion;
    public javax.swing.JPanel InicioSesionFondo;
    public javax.swing.JLabel Titulo_InicioSesion;
    public javax.swing.JLabel Titulo_InicioSesion1;
    public javax.swing.JTextField Usuario_InicioSesion;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
