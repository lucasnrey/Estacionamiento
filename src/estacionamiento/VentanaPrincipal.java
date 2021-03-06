/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamiento;


/**
 *
 * @author Lucas
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        Estacionamiento estacionamiento = null;
        //txtCapacidadAutos.setText(String.valueOf(estacionamiento.getCapacidadAutos()));
        //txtCapacidadBicicletas.setText(String.valueOf(estacionamiento.getCapacidadBicis()));
        //txtCapacidadMotos.setText(String.valueOf(estacionamiento.getCapacidadMotos()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIngresarVehiculo = new javax.swing.JButton();
        btnRetirarVehiculo = new javax.swing.JButton();
        btnListarVehiculos = new javax.swing.JButton();
        btnListarIngresos = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCapacidadAutos = new javax.swing.JTextField();
        txtCapacidadMotos = new javax.swing.JTextField();
        txtCapacidadBicicletas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estacionamiento");
        setMinimumSize(new java.awt.Dimension(640, 480));
        setName("framePrincipal"); // NOI18N
        setResizable(false);

        btnIngresarVehiculo.setText("Ingresar Vehiculo");
        btnIngresarVehiculo.setActionCommand("ingresarVehiculo");
        btnIngresarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarVehiculoActionPerformed(evt);
            }
        });

        btnRetirarVehiculo.setText("Retirar Vehiculo");
        btnRetirarVehiculo.setActionCommand("retirarVehiculo");
        btnRetirarVehiculo.setMaximumSize(new java.awt.Dimension(115, 23));
        btnRetirarVehiculo.setMinimumSize(new java.awt.Dimension(115, 23));
        btnRetirarVehiculo.setPreferredSize(new java.awt.Dimension(115, 23));
        btnRetirarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarVehiculoActionPerformed(evt);
            }
        });

        btnListarVehiculos.setText("Listar Vehiculos Estacionados");
        btnListarVehiculos.setActionCommand("listarVehiculos");
        btnListarVehiculos.setMaximumSize(new java.awt.Dimension(160, 23));
        btnListarVehiculos.setMinimumSize(new java.awt.Dimension(160, 23));
        btnListarVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarVehiculosActionPerformed(evt);
            }
        });

        btnListarIngresos.setText("Listar Ingresos");
        btnListarIngresos.setActionCommand("listarIngresos");
        btnListarIngresos.setMaximumSize(new java.awt.Dimension(160, 23));
        btnListarIngresos.setMinimumSize(new java.awt.Dimension(160, 23));
        btnListarIngresos.setPreferredSize(new java.awt.Dimension(171, 23));
        btnListarIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarIngresosActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Capacidad Autos");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Capacidad Motos");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Capacidad Bicicletas");

        txtCapacidadAutos.setEditable(false);
        txtCapacidadAutos.setBackground(new java.awt.Color(224, 224, 224));
        txtCapacidadAutos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCapacidadAutos.setMinimumSize(new java.awt.Dimension(20, 20));
        txtCapacidadAutos.setPreferredSize(new java.awt.Dimension(30, 20));

        txtCapacidadMotos.setEditable(false);
        txtCapacidadMotos.setBackground(new java.awt.Color(224, 224, 224));
        txtCapacidadMotos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCapacidadMotos.setMinimumSize(new java.awt.Dimension(20, 20));
        txtCapacidadMotos.setPreferredSize(new java.awt.Dimension(30, 20));

        txtCapacidadBicicletas.setEditable(false);
        txtCapacidadBicicletas.setBackground(new java.awt.Color(224, 224, 224));
        txtCapacidadBicicletas.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCapacidadBicicletas.setMinimumSize(new java.awt.Dimension(20, 20));
        txtCapacidadBicicletas.setPreferredSize(new java.awt.Dimension(30, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estacionamiento/LogoEstacionamiento.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnIngresarVehiculo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRetirarVehiculo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnListarVehiculos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnListarIngresos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCapacidadMotos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCapacidadAutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCapacidadBicicletas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListarVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresarVehiculo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListarIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRetirarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCapacidadAutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCapacidadMotos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCapacidadBicicletas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btnIngresarVehiculo.getAccessibleContext().setAccessibleName("ingresarVehiculo");
        btnRetirarVehiculo.getAccessibleContext().setAccessibleName("retirarVehiculo");
        btnListarVehiculos.getAccessibleContext().setAccessibleName("listarVehiculos");
        btnListarIngresos.getAccessibleContext().setAccessibleName("listarIngresos");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnIngresarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarVehiculoActionPerformed
        VentanaIngresarVehiculo viv = new VentanaIngresarVehiculo();
        viv.setVisible(true);
    }//GEN-LAST:event_btnIngresarVehiculoActionPerformed

    private void btnRetirarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarVehiculoActionPerformed
        VentanaRetirarVehiculo vrv = new VentanaRetirarVehiculo();
        vrv.setVisible(true);
    }//GEN-LAST:event_btnRetirarVehiculoActionPerformed

    private void btnListarVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarVehiculosActionPerformed
        VentanaVehiculosEstacionados vve = new VentanaVehiculosEstacionados();
        vve.setVisible(true);
    }//GEN-LAST:event_btnListarVehiculosActionPerformed

    private void btnListarIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarIngresosActionPerformed
        VentanaIngresos vin = new VentanaIngresos();
        vin.setVisible(true);
    }//GEN-LAST:event_btnListarIngresosActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresarVehiculo;
    private javax.swing.JButton btnListarIngresos;
    private javax.swing.JButton btnListarVehiculos;
    private javax.swing.JButton btnRetirarVehiculo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtCapacidadAutos;
    private javax.swing.JTextField txtCapacidadBicicletas;
    private javax.swing.JTextField txtCapacidadMotos;
    // End of variables declaration//GEN-END:variables
}
