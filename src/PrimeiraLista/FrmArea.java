/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimeiraLista;

import javax.swing.JOptionPane;

/**
 *
 * @author Pedro
 */
public class FrmArea extends javax.swing.JFrame {

    /**
     * Creates new form FrmArea
     */
    public FrmArea() {
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

        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtTotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnCalcTriangulo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnCalcRetangulo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnCalcQuadrado = new javax.swing.JButton();
        txtAltura = new javax.swing.JTextField();
        btnCalcCirculo = new javax.swing.JButton();
        txtLado = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtBase = new javax.swing.JTextField();
        btnTriangulo = new javax.swing.JButton();
        btnCirculo = new javax.swing.JButton();
        btnRetangulo = new javax.swing.JButton();
        txtRaio = new javax.swing.JTextField();
        btnQuadrado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setText("Total:");

        jLabel1.setText("Altura:");

        txtTotal.setEnabled(false);

        jLabel3.setText("Base:");

        btnCalcTriangulo.setText("Calc Triângulo");
        btnCalcTriangulo.setEnabled(false);
        btnCalcTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcTrianguloActionPerformed(evt);
            }
        });

        jLabel4.setText("Lado:");

        btnCalcRetangulo.setText("Calc Retângulo");
        btnCalcRetangulo.setEnabled(false);
        btnCalcRetangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcRetanguloActionPerformed(evt);
            }
        });

        jLabel5.setText("Raio:");

        btnCalcQuadrado.setText("Calc Quadrado");
        btnCalcQuadrado.setEnabled(false);
        btnCalcQuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcQuadradoActionPerformed(evt);
            }
        });

        txtAltura.setEnabled(false);

        btnCalcCirculo.setText("Calc Círculo");
        btnCalcCirculo.setEnabled(false);
        btnCalcCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcCirculoActionPerformed(evt);
            }
        });

        txtLado.setEnabled(false);

        txtBase.setEnabled(false);

        btnTriangulo.setText("Triângulo");
        btnTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrianguloActionPerformed(evt);
            }
        });

        btnCirculo.setText("Círculo");
        btnCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCirculoActionPerformed(evt);
            }
        });

        btnRetangulo.setText("Retângulo");
        btnRetangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetanguloActionPerformed(evt);
            }
        });

        txtRaio.setEnabled(false);

        btnQuadrado.setText("Quadrado");
        btnQuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuadradoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(52, 52, 52)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTriangulo)
                        .addGap(18, 18, 18)
                        .addComponent(btnQuadrado)
                        .addGap(18, 18, 18)
                        .addComponent(btnRetangulo)
                        .addGap(18, 18, 18)
                        .addComponent(btnCirculo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLado)
                            .addComponent(txtBase)
                            .addComponent(txtRaio)
                            .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCalcRetangulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCalcTriangulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCalcCirculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCalcQuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTriangulo)
                    .addComponent(btnQuadrado)
                    .addComponent(btnRetangulo)
                    .addComponent(btnCirculo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRaio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcTriangulo)
                    .addComponent(btnCalcQuadrado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcRetangulo)
                    .addComponent(btnCalcCirculo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcTrianguloActionPerformed
        try {
            Area a = new Area();
            a.altura = Double.parseDouble(txtAltura.getText());
            a.base = Double.parseDouble(txtBase.getText());

            txtTotal.setText("" + a.triangulo(a.base, a.altura));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor Inválido!");
        }
    }//GEN-LAST:event_btnCalcTrianguloActionPerformed

    private void btnTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrianguloActionPerformed
        txtAltura.setText("");
        txtRaio.setText("");
        txtLado.setText("");
        txtBase.setText("");
        txtTotal.setText("");

        txtAltura.setEnabled(true);
        txtBase.setEnabled(true);
        btnCalcTriangulo.setEnabled(true);
        
        btnCalcCirculo.setEnabled(false);
        btnCalcQuadrado.setEnabled(false);
        btnCalcRetangulo.setEnabled(false);     
    }//GEN-LAST:event_btnTrianguloActionPerformed

    private void btnQuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuadradoActionPerformed
        txtAltura.setText("");
        txtRaio.setText("");
        txtLado.setText("");
        txtBase.setText("");
        txtTotal.setText("");

        txtAltura.setEnabled(false);
        txtBase.setEnabled(false);
        txtLado.setEnabled(true);
        txtRaio.setEnabled(false);
        
        btnCalcCirculo.setEnabled(false);
        btnCalcQuadrado.setEnabled(true);
        btnCalcRetangulo.setEnabled(false);
        btnCalcTriangulo.setEnabled(false);
    }//GEN-LAST:event_btnQuadradoActionPerformed

    private void btnCalcQuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcQuadradoActionPerformed
        try {
            Area a = new Area();
            a.lado = Double.parseDouble(txtLado.getText());
            
            a.quadrado();
            
            txtTotal.setText("" + a.total);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor Inválido!");
        }
    }//GEN-LAST:event_btnCalcQuadradoActionPerformed

    private void btnRetanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetanguloActionPerformed
        txtAltura.setText("");
        txtRaio.setText("");
        txtLado.setText("");
        txtBase.setText("");
        txtTotal.setText("");

        txtAltura.setEnabled(true);
        txtBase.setEnabled(true);
        txtLado.setEnabled(false);
        txtRaio.setEnabled(false);
        
        btnCalcCirculo.setEnabled(false);
        btnCalcQuadrado.setEnabled(false);
        btnCalcRetangulo.setEnabled(true);
        btnCalcTriangulo.setEnabled(false);
    }//GEN-LAST:event_btnRetanguloActionPerformed

    private void btnCalcRetanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcRetanguloActionPerformed
        try {
            Area a = new Area();
            a.altura = Double.parseDouble(txtAltura.getText());
            a.base = Double.parseDouble(txtBase.getText());

            txtTotal.setText("" + a.retangulo());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor Inválido!");
        }
    }//GEN-LAST:event_btnCalcRetanguloActionPerformed

    private void btnCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCirculoActionPerformed
        txtAltura.setText("");
        txtRaio.setText("");
        txtLado.setText("");
        txtBase.setText("");
        txtTotal.setText("");

        txtAltura.setEnabled(false);
        txtBase.setEnabled(false);
        txtLado.setEnabled(false);
        txtRaio.setEnabled(true);
        
        btnCalcCirculo.setEnabled(true);
        btnCalcQuadrado.setEnabled(false);
        btnCalcRetangulo.setEnabled(false);
        btnCalcTriangulo.setEnabled(false);
    }//GEN-LAST:event_btnCirculoActionPerformed

    private void btnCalcCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcCirculoActionPerformed
        try {
            Area a = new Area();
            a.raio = Double.parseDouble(txtRaio.getText());
            
            a.circulo();
            
            txtTotal.setText("" + a.total);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valores Inválidos!");
        }
    }//GEN-LAST:event_btnCalcCirculoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmArea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcCirculo;
    private javax.swing.JButton btnCalcQuadrado;
    private javax.swing.JButton btnCalcRetangulo;
    private javax.swing.JButton btnCalcTriangulo;
    private javax.swing.JButton btnCirculo;
    private javax.swing.JButton btnQuadrado;
    private javax.swing.JButton btnRetangulo;
    private javax.swing.JButton btnTriangulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtBase;
    private javax.swing.JTextField txtLado;
    private javax.swing.JTextField txtRaio;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}