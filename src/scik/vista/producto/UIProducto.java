package scik.vista.producto;

import java.awt.Color;
import java.awt.Component;

import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableCellRenderer;

import scik.controlador.producto.IProducto;

/**
 * Vista principal de Gestion de Producto
 * <p/>
 * <img src="screenshot/UIProducto.png"/>
 * @author Yuliana Apaza
 * @version 2.0
 * @since 2015-10-05
 */
public class UIProducto extends javax.swing.JFrame
{
    private IProducto interfaz;
    private ListSelectionModel cellSelectionModel;
    
    public UIProducto(IProducto interfaz)
    {
        initComponents();
        this.setVisible(true);
        this.setTitle("Producto");
        setLocationRelativeTo(null);
        
        this.interfaz = interfaz;
        interfaz.cargar(tblRegistros);
        
        cellSelectionModel = tblRegistros.getSelectionModel();
        cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        cellSelectionModel.addListSelectionListener(new ListSelectionListener()
        {
            @Override
            public void valueChanged(ListSelectionEvent e)
            {
                interfaz.actualizarEst(tblRegistros, chActivar);
            }
        });
        
        interfaz.buscarProducto(jTfBuscar, tblRegistros);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistros = new javax.swing.JTable()
        {
            public Component prepareRenderer(TableCellRenderer r, int row, int column)
            {
                Component c = super.prepareRenderer(r, row, column);
                c.setBackground(Color.WHITE);
                if(column == 0 && !isCellSelected(row, column))
                {
                    c.setBackground(new Color(228, 251, 219));
                }
                else if(isCellSelected(row, column))
                {
                    c.setBackground(Color.BLUE);
                }
                return c;
            }
        }
        ;
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        btnInsertar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        chActivar = new javax.swing.JCheckBox();
        btnMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTfBuscar = new javax.swing.JTextField();
        btnReporte = new javax.swing.JButton();
        jBSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/scik/recursos/icono.png")).getImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("PRODUCTO");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tblRegistros.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        tblRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Unidad", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRegistros.setSelectionBackground(new java.awt.Color(0, 102, 204));
        jScrollPane1.setViewportView(tblRegistros);
        if (tblRegistros.getColumnModel().getColumnCount() > 0) {
            tblRegistros.getColumnModel().getColumn(0).setMinWidth(80);
            tblRegistros.getColumnModel().getColumn(0).setPreferredWidth(80);
            tblRegistros.getColumnModel().getColumn(0).setMaxWidth(80);
            tblRegistros.getColumnModel().getColumn(2).setMinWidth(150);
            tblRegistros.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblRegistros.getColumnModel().getColumn(2).setMaxWidth(150);
            tblRegistros.getColumnModel().getColumn(3).setMinWidth(80);
            tblRegistros.getColumnModel().getColumn(3).setPreferredWidth(80);
            tblRegistros.getColumnModel().getColumn(3).setMaxWidth(80);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnInsertar.setBackground(new java.awt.Color(186, 186, 186));
        btnInsertar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnInsertar.setForeground(new java.awt.Color(51, 51, 51));
        btnInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scik/recursos/insertar.png"))); // NOI18N
        btnInsertar.setText("INSERTAR");
        btnInsertar.setBorder(null);
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(186, 186, 186));
        btnModificar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(51, 51, 51));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scik/recursos/modificar.png"))); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.setBorder(null);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(186, 186, 186));
        btnEliminar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(51, 51, 51));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scik/recursos/eliminar.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(null);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        chActivar.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        chActivar.setText("ACTIVAR");
        chActivar.setEnabled(false);
        chActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chActivarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chActivar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chActivar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnMenu.setBackground(new java.awt.Color(186, 186, 186));
        btnMenu.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(51, 51, 51));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scik/recursos/menu.png"))); // NOI18N
        btnMenu.setText("VOLVER");
        btnMenu.setBorder(null);
        btnMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMenu.setPreferredSize(new java.awt.Dimension(80, 70));
        btnMenu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setText("Buscar:");

        jTfBuscar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        btnReporte.setBackground(new java.awt.Color(110, 77, 77));
        btnReporte.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnReporte.setForeground(new java.awt.Color(238, 238, 238));
        btnReporte.setText("Generar Reporte");
        btnReporte.setBorder(null);
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        jBSearch.setBackground(new java.awt.Color(186, 186, 186));
        jBSearch.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jBSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scik/recursos/search.png"))); // NOI18N
        jBSearch.setBorder(null);
        jBSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 38, Short.MAX_VALUE)
                        .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jBSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBSearch, jLabel1, jTfBuscar});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        interfaz.insertar();
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        interfaz.menu();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnModificarActionPerformed
    {//GEN-HEADEREND:event_btnModificarActionPerformed
        interfaz.modificar(tblRegistros);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEliminarActionPerformed
    {//GEN-HEADEREND:event_btnEliminarActionPerformed
        interfaz.eliminar(tblRegistros, chActivar);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void chActivarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_chActivarActionPerformed
    {//GEN-HEADEREND:event_chActivarActionPerformed
        interfaz.activarDesactivar(tblRegistros, chActivar);
    }//GEN-LAST:event_chActivarActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnReporteActionPerformed
    {//GEN-HEADEREND:event_btnReporteActionPerformed
        interfaz.generarReporte();
    }//GEN-LAST:event_btnReporteActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        interfaz.menu();
    }//GEN-LAST:event_formWindowClosing

    private void jBSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSearchActionPerformed
        interfaz.seleccionarFila(jTfBuscar, tblRegistros);
    }//GEN-LAST:event_jBSearchActionPerformed
    
    
    

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnReporte;
    private javax.swing.JCheckBox chActivar;
    private javax.swing.JButton jBSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTfBuscar;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblRegistros;
    // End of variables declaration//GEN-END:variables
}
