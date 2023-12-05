package scik.vista;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import scik.controlador.IKardexMenu;

/**
 * Vista principal del Menu
 * <p/>
 * <img src="screenshot/UIKardexMenu.png"/>
 */
public class UIKardexMenu extends javax.swing.JFrame
{
    private IKardexMenu interfaz;

    public UIKardexMenu(IKardexMenu interfaz)
    {
        initComponents();
        this.setVisible(true);
        this.setTitle("Menú");
        setLocationRelativeTo(null);
        
        this.interfaz = interfaz;
        interfaz.cargar(
                        this.txtNombre,
                        this.txtDni,
                        this.lblPermisos,
                        this.btnUsuario,
                        this.btnExistencia,
                        this.btnEntrada,
                        this.btnSalida
        );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAlmacen = new javax.swing.JButton();
        btnUnidad = new javax.swing.JButton();
        btnUsuario = new javax.swing.JButton();
        btnDocumento = new javax.swing.JButton();
        btnProducto = new javax.swing.JButton();
        btnKardex = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnEntrada = new javax.swing.JButton();
        btnSalida = new javax.swing.JButton();
        btnExistencia = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        lblPermisos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itmConfig = new javax.swing.JMenuItem();
        itmCerrar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itmManual = new javax.swing.JMenuItem();
        itmAcerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/scik/recursos/icono.png")).getImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        btnAlmacen.setBackground(new java.awt.Color(110, 110, 110));
        btnAlmacen.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnAlmacen.setForeground(new java.awt.Color(238, 238, 238));
        btnAlmacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scik/recursos/almacen.png"))); // NOI18N
        btnAlmacen.setText("ALMACEN");
        btnAlmacen.setBorder(null);
        btnAlmacen.setIconTextGap(50);
        btnAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlmacenActionPerformed(evt);
            }
        });

        btnUnidad.setBackground(new java.awt.Color(110, 110, 110));
        btnUnidad.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnUnidad.setForeground(new java.awt.Color(238, 238, 238));
        btnUnidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scik/recursos/unidad.png"))); // NOI18N
        btnUnidad.setText("UNIDAD");
        btnUnidad.setBorder(null);
        btnUnidad.setIconTextGap(50);
        btnUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnidadActionPerformed(evt);
            }
        });

        btnUsuario.setBackground(new java.awt.Color(110, 110, 110));
        btnUsuario.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnUsuario.setForeground(new java.awt.Color(238, 238, 238));
        btnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scik/recursos/usuario.png"))); // NOI18N
        btnUsuario.setText("USUARIO");
        btnUsuario.setBorder(null);
        btnUsuario.setIconTextGap(50);
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });

        btnDocumento.setBackground(new java.awt.Color(110, 110, 110));
        btnDocumento.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnDocumento.setForeground(new java.awt.Color(238, 238, 238));
        btnDocumento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scik/recursos/documento.png"))); // NOI18N
        btnDocumento.setText("DOCUMENTO");
        btnDocumento.setBorder(null);
        btnDocumento.setIconTextGap(50);
        btnDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocumentoActionPerformed(evt);
            }
        });

        btnProducto.setBackground(new java.awt.Color(110, 110, 110));
        btnProducto.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnProducto.setForeground(new java.awt.Color(238, 238, 238));
        btnProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scik/recursos/producto.png"))); // NOI18N
        btnProducto.setText("PRODUCTO");
        btnProducto.setBorder(null);
        btnProducto.setIconTextGap(50);
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });

        btnKardex.setBackground(new java.awt.Color(110, 110, 110));
        btnKardex.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnKardex.setForeground(new java.awt.Color(238, 238, 238));
        btnKardex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scik/recursos/kardex.png"))); // NOI18N
        btnKardex.setText("KARDEX");
        btnKardex.setBorder(null);
        btnKardex.setIconTextGap(50);
        btnKardex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKardexActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAlmacen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                    .addComponent(btnUnidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                    .addComponent(btnUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKardex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKardex, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Inventario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Black", 0, 15))); // NOI18N

        btnEntrada.setBackground(new java.awt.Color(186, 186, 186));
        btnEntrada.setFont(new java.awt.Font("Roboto Medium", 0, 10)); // NOI18N
        btnEntrada.setForeground(new java.awt.Color(51, 51, 51));
        btnEntrada.setText("ENTRADA DE PRODUCTOS POR FECHA");
        btnEntrada.setBorder(null);
        btnEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaActionPerformed(evt);
            }
        });

        btnSalida.setBackground(new java.awt.Color(186, 186, 186));
        btnSalida.setFont(new java.awt.Font("Roboto Medium", 0, 10)); // NOI18N
        btnSalida.setForeground(new java.awt.Color(51, 51, 51));
        btnSalida.setText("SALIDA DE PRODUCTOS POR FECHA");
        btnSalida.setBorder(null);
        btnSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaActionPerformed(evt);
            }
        });

        btnExistencia.setBackground(new java.awt.Color(186, 186, 186));
        btnExistencia.setFont(new java.awt.Font("Roboto Medium", 0, 10)); // NOI18N
        btnExistencia.setForeground(new java.awt.Color(51, 51, 51));
        btnExistencia.setText("EXISTENCIA DE PRODUCTOS");
        btnExistencia.setBorder(null);
        btnExistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExistenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEntrada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                    .addComponent(btnExistencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(btnExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jPanel2.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel1.setText("Usuario actual");

        txtNombre.setEditable(false);
        txtNombre.setColumns(20);
        txtNombre.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(102, 102, 102));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtNombre.setRequestFocusEnabled(false);

        txtDni.setEditable(false);
        txtDni.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        txtDni.setForeground(new java.awt.Color(102, 102, 102));
        txtDni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtDni.setPreferredSize(new java.awt.Dimension(200, 29));

        lblPermisos.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        lblPermisos.setForeground(new java.awt.Color(102, 102, 102));
        lblPermisos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPermisos.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDni, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPermisos, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPermisos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scik/recursos/logo.png"))); // NOI18N

        jMenu1.setText("Archivo");

        itmConfig.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        itmConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scik/recursos/configure.png"))); // NOI18N
        itmConfig.setText("Configuración");
        itmConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmConfigActionPerformed(evt);
            }
        });
        jMenu1.add(itmConfig);

        itmCerrar.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        itmCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scik/recursos/exchange.png"))); // NOI18N
        itmCerrar.setText("Cerrar Sesión");
        itmCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCerrarActionPerformed(evt);
            }
        });
        jMenu1.add(itmCerrar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");

        itmManual.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        itmManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scik/recursos/manual.png"))); // NOI18N
        itmManual.setText("Ver manual");
        jMenu2.add(itmManual);

        itmAcerca.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        itmAcerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scik/recursos/acerca.png"))); // NOI18N
        itmAcerca.setText("Acerca de");
        itmAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAcercaActionPerformed(evt);
            }
        });
        jMenu2.add(itmAcerca);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlmacenActionPerformed
        interfaz.almacen();
    }//GEN-LAST:event_btnAlmacenActionPerformed

    private void btnKardexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKardexActionPerformed
        interfaz.kardex();
    }//GEN-LAST:event_btnKardexActionPerformed

    private void btnDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocumentoActionPerformed
        interfaz.documento();
    }//GEN-LAST:event_btnDocumentoActionPerformed

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        interfaz.producto();
    }//GEN-LAST:event_btnProductoActionPerformed

    private void btnUnidadActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnUnidadActionPerformed
    {//GEN-HEADEREND:event_btnUnidadActionPerformed
        interfaz.unidad();
    }//GEN-LAST:event_btnUnidadActionPerformed

    private void btnExistenciaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnExistenciaActionPerformed
    {//GEN-HEADEREND:event_btnExistenciaActionPerformed
        interfaz.existenciaProducto();
    }//GEN-LAST:event_btnExistenciaActionPerformed

    private void btnSalidaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSalidaActionPerformed
    {//GEN-HEADEREND:event_btnSalidaActionPerformed
        interfaz.salida();
    }//GEN-LAST:event_btnSalidaActionPerformed

    private void btnEntradaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEntradaActionPerformed
    {//GEN-HEADEREND:event_btnEntradaActionPerformed
        interfaz.entrada();
    }//GEN-LAST:event_btnEntradaActionPerformed

    private void itmCerrarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_itmCerrarActionPerformed
    {//GEN-HEADEREND:event_itmCerrarActionPerformed
        interfaz.cerrarSesion();
    }//GEN-LAST:event_itmCerrarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        interfaz.cerrarSesion();
    }//GEN-LAST:event_formWindowClosing

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnUsuarioActionPerformed
    {//GEN-HEADEREND:event_btnUsuarioActionPerformed
        interfaz.usuario();
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void itmAcercaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_itmAcercaActionPerformed
    {//GEN-HEADEREND:event_itmAcercaActionPerformed
        ImageIcon icon = new ImageIcon(getClass().getResource("/scik/recursos/icono.png"));
        JOptionPane.showMessageDialog(null, "Sistema de Control de Inventarios tipo Kardex\nSICIK - 2023\n\nAngela B.H.\nJuan R.V.", "Acerca de", JOptionPane.INFORMATION_MESSAGE, icon);
    }//GEN-LAST:event_itmAcercaActionPerformed

    private void itmConfigActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_itmConfigActionPerformed
    {//GEN-HEADEREND:event_itmConfigActionPerformed
        interfaz.configuracion();
    }//GEN-LAST:event_itmConfigActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlmacen;
    private javax.swing.JButton btnDocumento;
    private javax.swing.JButton btnEntrada;
    private javax.swing.JButton btnExistencia;
    private javax.swing.JButton btnKardex;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnSalida;
    private javax.swing.JButton btnUnidad;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JMenuItem itmAcerca;
    private javax.swing.JMenuItem itmCerrar;
    private javax.swing.JMenuItem itmConfig;
    private javax.swing.JMenuItem itmManual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblPermisos;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
