/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;
//port classy.mNeville;

import classy.mNeville;

/**
 *
 * @author ProcesosE
 */
public class Neville4 extends javax.swing.JFrame {
   //mNeville cc;
    /**
     * Creates new form Neville
     */
    public Neville4() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfx0 = new javax.swing.JTextField();
        tfx1 = new javax.swing.JTextField();
        tfx2 = new javax.swing.JTextField();
        tfx3 = new javax.swing.JTextField();
        tffx0 = new javax.swing.JTextField();
        tffx1 = new javax.swing.JTextField();
        tffx2 = new javax.swing.JTextField();
        tffx3 = new javax.swing.JTextField();
        jbCalcular = new javax.swing.JButton();
        jbRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel1.setText("Ingrese valores para X:");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setText("Ingrese valores para F(x):");

        tfx0.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfx0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfx0ActionPerformed(evt);
            }
        });

        jbCalcular.setText("Calcular");
        jbCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalcularActionPerformed(evt);
            }
        });

        jbRegresar.setText("Regresar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbCalcular)
                        .addGap(47, 47, 47)
                        .addComponent(jbRegresar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfx0)
                            .addComponent(tfx1)
                            .addComponent(tfx3)
                            .addComponent(tfx2))
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tffx0)
                            .addComponent(tffx1)
                            .addComponent(tffx2)
                            .addComponent(tffx3))))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfx0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tffx0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tffx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfx2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tffx2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfx3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tffx3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCalcular)
                    .addComponent(jbRegresar))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfx0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfx0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfx0ActionPerformed

    private void jbCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalcularActionPerformed
        // TODO add your handling code here:
     // cc = new mNeville();
      //cc.dosDatos();
      
        String xx0 = tfx0.getText();
        String xx1 = tfx1.getText();
        String xx2 = tfx2.getText();
        String xx3 = tfx3.getText();
        
        String fxx0 = tffx0.getText();
        String fxx1 = tffx1.getText();
        String fxx2 = tffx2.getText();
        String fxx3 = tffx3.getText();
       
        
        float x0 = Float.parseFloat(xx0);
        float x1 = Float.parseFloat(xx1);
        float x2 = Float.parseFloat(xx2);
        float x3 = Float.parseFloat(xx3);
        
        float fx0 = Float.parseFloat(fxx0);
        float fx1 = Float.parseFloat(fxx1);
        float fx2 = Float.parseFloat(fxx2);
        float fx3 = Float.parseFloat(fxx3);
      

    //Para 2  (0,1)
     float a = fx1;
     float b = (-x0) * fx1 ;
     float c = fx0;
     float d = (-x1) * fx0;
     float e = x1 - x0;
     
     
     float f = (a - c) / e;
     float g = (b - d) / e;
     
     System.out.println("El Resultado es:" + f + "x" +" "+"+"+" "+ g);
     //
     
     
     //Para 2 (1,2)
     
     float t1 = fx2;
     float t2 = (-x1) * fx2;
     float t3 = fx1;
     float t4 = (-x2) * fx1;
     float t5 = x2 - x1;
     
     float t6 = (t1 - t3) / t5;
     float t7 = (t2 - t4) / t5;
        
        System.out.println("El Resultado es:" + t6 + "x" +" "+"+"+" "+ t7);
        
     //Para 2 (2,3)
     
     float p1= fx3;
     float p2= (-x2) * fx3;
     float p3= fx2;
     float p4= (-x3) * fx2;
     float p5= x3 - x2;
     
     float p6 = (p1 - p3) / p5;
     float p7 = (p2 - p4) / p5;
     System.out.println("El Resultado es:" + p6 + "x" +" "+"+"+" "+ p7);
     
     //Para 3 (0,1,2)
     
     float aa = t6;
     float bb= (-x0) * t6;
     float cc= t7;
     float dd= (-x0) * t7;
     float ee= f;
     float ff= (-x2) * f;
     float gg= g;
     float hh= (-x2) * g;
     float ii= x2 - x0;
     
     float jj= (aa - ee) / ii;
     float kk= ((bb+cc)-(ff+gg)) / ii;
     float ll= (dd - hh) / ii;
     
        System.out.println("El Resultado es:" + jj + "x²" +" "+"+"+" "+ kk + "x"+" "+"+"+" "+ ll);
        
        
    //Para 3 (1,2,3)
     float aaa = p6;
     float bbb = (-x1) * p6;
     float ccc = p7;
     float ddd = (-x1) * p7;
     float eee = t6;
     float fff = (-x3) * t6;
     float ggg = t7;
     float hhh = (-x3) * t7;
     float iii = x3 - x1;
     
     float jjj = (aaa - eee) / iii;
     float kkk = ((bbb + ccc)-(fff + ggg)) / iii;
     float lll = (ddd - hhh) / ii;
     
     System.out.println("El Resultado es:" + jjj + "x²" +" "+"+"+" "+ kkk + "x"+" "+"+"+" "+ lll);
     
     
     //Para 4 (1,2,3,4)
     
     float j1 = jjj;
     float j2 = (-x0) * jjj;
     float j3 = kkk;
     float j4 = (-x0) * kkk;
     float j5 = lll;
     float j6 = (-x0) * lll;
     float j7 = jj;
     float j8 = (-x3) * jj;
     float j9 = kk;
     float j10 = (-x3) * kk;
     float j11 = ll;
     float j12 = (-x3) * ll;
     float j13 = x3 - x0;
     
     float j14 = (j1 - j7) / j13;
     float j15 = ((j2 + j3)-(j8 + j9)) / j13;
     float j16 = ((j4 + j5)-(j10 + j11)) / j13;
     float j17 = (j6 - j12) / j13;
     System.out.println("El Resultado es:" + j14 + "x³" +" "+"+"+" "+ j15 + "x²"+" "+"+"+" "+ j16 + "x"+" "+"+"+" "+j17);
     
     
     
     
    }//GEN-LAST:event_jbCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Neville4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Neville4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Neville4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Neville4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Neville4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbCalcular;
    private javax.swing.JButton jbRegresar;
    private javax.swing.JTextField tffx0;
    private javax.swing.JTextField tffx1;
    private javax.swing.JTextField tffx2;
    private javax.swing.JTextField tffx3;
    private javax.swing.JTextField tfx0;
    private javax.swing.JTextField tfx1;
    private javax.swing.JTextField tfx2;
    private javax.swing.JTextField tfx3;
    // End of variables declaration//GEN-END:variables
}
