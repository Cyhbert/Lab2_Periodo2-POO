package Formularios;
import Entidades.Educativo;
import Entidades.Hospitalario;
import Entidades.Polideportivo;


public class frm_Visualizacion extends javax.swing.JFrame {

    //Clases
      Educativo educativo;
      Hospitalario hospitalario;
      Polideportivo polideportivo;
      
      public frm_Visualizacion() {
            initComponents();
            this.startFrame();
      }

      private void startFrame(){
            this.setVisible(true);
            this.setEnabled(true);
            this.setTitle(("Visualización de Construcciones"));
            this.setLocationRelativeTo(null);
            
      }
     
      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            btngTiposEdificios = new javax.swing.ButtonGroup();
            btngAzotea = new javax.swing.ButtonGroup();
            jpContenido = new javax.swing.JPanel();
            subJpTop = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            rdbtnPolideportivo = new javax.swing.JRadioButton();
            rdbtnHospitalario = new javax.swing.JRadioButton();
            rbtnEducativo = new javax.swing.JRadioButton();
            jLabel2 = new javax.swing.JLabel();
            txtPosibleCoste = new javax.swing.JTextField();
            btnRegistrarEdificio = new javax.swing.JButton();
            jPanel1 = new javax.swing.JPanel();
            jLabel3 = new javax.swing.JLabel();
            spnNumPisos = new javax.swing.JSpinner();
            spnNumVentanas = new javax.swing.JSpinner();
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            rbAzoteaSi = new javax.swing.JRadioButton();
            rbAzoteaNo = new javax.swing.JRadioButton();
            jLabel6 = new javax.swing.JLabel();
            rbAticoSi = new javax.swing.JRadioButton();
            rbAticoNo = new javax.swing.JRadioButton();
            spnNumEntradas = new javax.swing.JSpinner();
            spnNumSalidas = new javax.swing.JSpinner();
            jLabel7 = new javax.swing.JLabel();
            jLabel8 = new javax.swing.JLabel();
            jLabel9 = new javax.swing.JLabel();
            txtTipoDiseño = new javax.swing.JTextField();
            btnCalcular = new javax.swing.JButton();
            jPanel2 = new javax.swing.JPanel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setResizable(false);

            jpContenido.setBackground(new java.awt.Color(51, 51, 51));

            jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
            jLabel1.setText("Tipo de Edificio a Visualizar");

            btngTiposEdificios.add(rdbtnPolideportivo);
            rdbtnPolideportivo.setText("Edificio Polideportivo");

            btngTiposEdificios.add(rdbtnHospitalario);
            rdbtnHospitalario.setText("Edificio Hospitalario");

            btngTiposEdificios.add(rbtnEducativo);
            rbtnEducativo.setText("Edificio Educativo");

            jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            jLabel2.setText("Posible Coste:");

            txtPosibleCoste.setEditable(false);
            txtPosibleCoste.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            txtPosibleCoste.setText("$0.0");

            btnRegistrarEdificio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            btnRegistrarEdificio.setText("Registrar");
            btnRegistrarEdificio.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnRegistrarEdificioActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout subJpTopLayout = new javax.swing.GroupLayout(subJpTop);
            subJpTop.setLayout(subJpTopLayout);
            subJpTopLayout.setHorizontalGroup(
                  subJpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subJpTopLayout.createSequentialGroup()
                        .addGroup(subJpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(subJpTopLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                              .addGroup(subJpTopLayout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(rdbtnPolideportivo)
                                    .addGap(18, 18, 18)
                                    .addComponent(rdbtnHospitalario)
                                    .addGap(18, 18, 18)
                                    .addComponent(rbtnEducativo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(subJpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(btnRegistrarEdificio)
                              .addComponent(txtPosibleCoste, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(105, 105, 105))
            );
            subJpTopLayout.setVerticalGroup(
                  subJpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(subJpTopLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(subJpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel1)
                              .addComponent(jLabel2)
                              .addComponent(txtPosibleCoste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(subJpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(rdbtnPolideportivo)
                              .addComponent(rdbtnHospitalario)
                              .addComponent(rbtnEducativo)
                              .addComponent(btnRegistrarEdificio))
                        .addContainerGap(22, Short.MAX_VALUE))
            );

            jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            jLabel3.setText("Núm. de pisos");

            spnNumPisos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            spnNumPisos.setModel(new javax.swing.SpinnerNumberModel(1, 1, 50, 1));

            spnNumVentanas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            spnNumVentanas.setModel(new javax.swing.SpinnerNumberModel(1, 1, 50, 1));

            jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            jLabel4.setText("Núm. de Ventanas");

            jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            jLabel5.setText("Azotea");

            btngAzotea.add(rbAzoteaSi);
            rbAzoteaSi.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
            rbAzoteaSi.setText("Sí");

            btngAzotea.add(rbAzoteaNo);
            rbAzoteaNo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
            rbAzoteaNo.setText("No");

            jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            jLabel6.setText("Ático");

            btngAzotea.add(rbAticoSi);
            rbAticoSi.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
            rbAticoSi.setText("Sí");
            rbAticoSi.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        rbAticoSiActionPerformed(evt);
                  }
            });

            btngAzotea.add(rbAticoNo);
            rbAticoNo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
            rbAticoNo.setText("No");

            spnNumEntradas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            spnNumEntradas.setModel(new javax.swing.SpinnerNumberModel(1, 1, 50, 1));

            spnNumSalidas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            spnNumSalidas.setModel(new javax.swing.SpinnerNumberModel(1, 1, 50, 1));

            jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            jLabel7.setText("Núm. de Salidas");

            jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            jLabel8.setText("Núm. de Entradas");

            jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            jLabel9.setText("Tipo de Diseño");

            btnCalcular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            btnCalcular.setText("Calcular");
            btnCalcular.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnCalcularActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                          .addComponent(jLabel3)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                          .addComponent(spnNumPisos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                          .addComponent(jLabel4)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                          .addComponent(spnNumVentanas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(rbAzoteaSi)
                                    .addGap(18, 18, 18)
                                    .addComponent(rbAzoteaNo))
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(29, 29, 29)
                                    .addComponent(rbAticoSi)
                                    .addGap(18, 18, 18)
                                    .addComponent(rbAticoNo)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addComponent(jLabel8)
                                                      .addComponent(jLabel7))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addComponent(spnNumEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(spnNumSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                          .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtTipoDiseño, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(109, 109, 109)
                                    .addComponent(btnCalcular)))
                        .addContainerGap(175, Short.MAX_VALUE))
            );
            jPanel1Layout.setVerticalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                      .addComponent(jLabel3)
                                                      .addComponent(spnNumPisos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                      .addComponent(jLabel4)
                                                      .addComponent(spnNumVentanas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(jLabel7)))
                                          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addComponent(jLabel8)
                                                      .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(spnNumEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(spnNumSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                          .addComponent(jLabel5)
                                          .addComponent(rbAzoteaSi)
                                          .addComponent(rbAzoteaNo)))
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtTipoDiseño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                          .addComponent(jLabel6)
                                          .addComponent(rbAticoSi)
                                          .addComponent(rbAticoNo)))
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addComponent(btnCalcular)))
                        .addContainerGap(98, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                  jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 310, Short.MAX_VALUE)
            );
            jPanel2Layout.setVerticalGroup(
                  jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 0, Short.MAX_VALUE)
            );

            javax.swing.GroupLayout jpContenidoLayout = new javax.swing.GroupLayout(jpContenido);
            jpContenido.setLayout(jpContenidoLayout);
            jpContenidoLayout.setHorizontalGroup(
                  jpContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(subJpTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(jpContenidoLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            );
            jpContenidoLayout.setVerticalGroup(
                  jpContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jpContenidoLayout.createSequentialGroup()
                        .addComponent(subJpTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            );

            getContentPane().add(jpContenido, java.awt.BorderLayout.CENTER);

            pack();
      }// </editor-fold>//GEN-END:initComponents

      private void rbAticoSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAticoSiActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_rbAticoSiActionPerformed

      private void btnRegistrarEdificioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEdificioActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_btnRegistrarEdificioActionPerformed

      private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_btnCalcularActionPerformed

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton btnCalcular;
      private javax.swing.JButton btnRegistrarEdificio;
      private javax.swing.ButtonGroup btngAzotea;
      private javax.swing.ButtonGroup btngTiposEdificios;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JLabel jLabel6;
      private javax.swing.JLabel jLabel7;
      private javax.swing.JLabel jLabel8;
      private javax.swing.JLabel jLabel9;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JPanel jPanel2;
      private javax.swing.JPanel jpContenido;
      private javax.swing.JRadioButton rbAticoNo;
      private javax.swing.JRadioButton rbAticoSi;
      private javax.swing.JRadioButton rbAzoteaNo;
      private javax.swing.JRadioButton rbAzoteaSi;
      private javax.swing.JRadioButton rbtnEducativo;
      private javax.swing.JRadioButton rdbtnHospitalario;
      private javax.swing.JRadioButton rdbtnPolideportivo;
      private javax.swing.JSpinner spnNumEntradas;
      private javax.swing.JSpinner spnNumPisos;
      private javax.swing.JSpinner spnNumSalidas;
      private javax.swing.JSpinner spnNumVentanas;
      private javax.swing.JPanel subJpTop;
      private javax.swing.JTextField txtPosibleCoste;
      private javax.swing.JTextField txtTipoDiseño;
      // End of variables declaration//GEN-END:variables
}
