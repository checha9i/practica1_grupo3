/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_grupo3;

/**
 *
 * @author Javier
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }
  FACTORIAL FC = new FACTORIAL();
  POTENCIAL PT = new POTENCIAL();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlresultado = new javax.swing.JLabel();
        jlnumero2 = new javax.swing.JLabel();
        jtnumero1 = new javax.swing.JTextField();
        jtnumero2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btpotencia = new javax.swing.JButton();
        btfactorial1 = new javax.swing.JButton();
        brraiz = new javax.swing.JButton();
        btpotencia3 = new javax.swing.JButton();
        brraiz2 = new javax.swing.JButton();
        btdividir = new javax.swing.JButton();
        btmultiplicar = new javax.swing.JButton();
        jlnumero3 = new javax.swing.JLabel();
        txresultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora_Grupo_3");

        jlresultado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlresultado.setText("Resultado");

        jlnumero2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlnumero2.setText("Número 2");

        jtnumero1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtnumero1.setToolTipText("");

        jtnumero2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        btpotencia.setText("Potencia 2");
        btpotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpotenciaActionPerformed(evt);
            }
        });

        btfactorial1.setText("Factorial");
        btfactorial1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btfactorial1ActionPerformed(evt);
            }
        });

        brraiz.setText("Raiz 2");
        brraiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brraizActionPerformed(evt);
            }
        });

        btpotencia3.setText("Potencia 3");
        btpotencia3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpotencia3ActionPerformed(evt);
            }
        });

        brraiz2.setText("Raiz 3");
        brraiz2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brraiz2ActionPerformed(evt);
            }
        });

        btdividir.setText("Dividir");
        btdividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdividirActionPerformed(evt);
            }
        });

        btmultiplicar.setText("Multiplicar");
        btmultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmultiplicarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btfactorial1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btpotencia, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btpotencia3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(brraiz2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btmultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(brraiz, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btdividir, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btpotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btfactorial1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brraiz, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btpotencia3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brraiz2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btdividir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btmultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jlnumero3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlnumero3.setText("Número 1");

        txresultado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlnumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtnumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlnumero3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jtnumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlnumero3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtnumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jtnumero2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlnumero2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btpotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpotenciaActionPerformed
      txresultado.setText( Double.toString(PT.Pot(Integer.parseInt(jtnumero1.getText())      )));
    }//GEN-LAST:event_btpotenciaActionPerformed

    private void btfactorial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btfactorial1ActionPerformed
      txresultado.setText( Double.toString(FC.factorial(   Double.parseDouble(jtnumero1.getText())      )));
    }//GEN-LAST:event_btfactorial1ActionPerformed

    private void brraizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brraizActionPerformed
      txresultado.setText( Double.toString(PT.RaizCuadrada( Double.parseDouble(jtnumero1.getText())      )));
    }//GEN-LAST:event_brraizActionPerformed

    private void btpotencia3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpotencia3ActionPerformed
     txresultado.setText( Double.toString(PT.potenciaCUBICA( Double.parseDouble(jtnumero1.getText())      )));
    }//GEN-LAST:event_btpotencia3ActionPerformed

    private void brraiz2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brraiz2ActionPerformed
     txresultado.setText( Double.toString(PT.raizCubica( Double.parseDouble(jtnumero1.getText())      ))); 
    }//GEN-LAST:event_brraiz2ActionPerformed

    private void btdividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdividirActionPerformed
         txresultado.setText( Double.toString(PT.Division(Double.parseDouble(jtnumero1.getText()),Double.parseDouble(jtnumero2.getText())      )));  
    }//GEN-LAST:event_btdividirActionPerformed

    private void btmultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmultiplicarActionPerformed
       txresultado.setText( Double.toString(PT.Multiplicacion(Double.parseDouble(jtnumero1.getText()),Double.parseDouble(jtnumero2.getText())      ))); 
    }//GEN-LAST:event_btmultiplicarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brraiz;
    private javax.swing.JButton brraiz2;
    private javax.swing.JButton btdividir;
    private javax.swing.JButton btfactorial1;
    private javax.swing.JButton btmultiplicar;
    private javax.swing.JButton btpotencia;
    private javax.swing.JButton btpotencia3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlnumero2;
    private javax.swing.JLabel jlnumero3;
    private javax.swing.JLabel jlresultado;
    private javax.swing.JTextField jtnumero1;
    private javax.swing.JTextField jtnumero2;
    private javax.swing.JTextField txresultado;
    // End of variables declaration//GEN-END:variables
}