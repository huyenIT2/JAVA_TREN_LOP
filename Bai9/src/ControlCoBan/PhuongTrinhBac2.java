/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlCoBan;

import java.text.DecimalFormat;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;

/**
 *
 * @author Vu Duong
 */
public class PhuongTrinhBac2 extends javax.swing.JFrame {
    double a,b,c;
    /**
     * Creates new form PhuongTrinhBac2
     */
    public PhuongTrinhBac2() {
        initComponents();
        xoaTrang();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
public void xoaTrang()
{
    jtxtA.setText("0");
    jtxtB.setText("0");
    jtxtC.setText("0");
    jtxtA.requestFocus();
}
public String giaiPT()
{   String ketQua="";
    double detal=0;
    a=Double.parseDouble(jtxtA.getText());
    b=Double.parseDouble(jtxtB.getText());
    c=Double.parseDouble(jtxtC.getText());
    detal=b*b-4*a*c;
    DecimalFormat df=new DecimalFormat("### ###.##");
    if (detal<0) ketQua="Vo nghiem";
    else if (detal==0) 
    {
        double x=0;
        x=-b/(2*a);
        ketQua="nghiệm kép x="+df.format(x);
                
    }
    else if( detal>0)
    {
        double x1,x2;
        x1=(-(b*b)+4*a*c)/(2*a);
        x2=(-(b*b)-4*a*c)/(2*a);
        ketQua="nghiệm x1="+df.format(x1)+" x2=" +df.format(x2);
    }
   return ketQua;
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnNhapABC = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jtxtA = new javax.swing.JTextField();
        jtxtB = new javax.swing.JTextField();
        jtxtC = new javax.swing.JTextField();
        jtxtKetQua = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jcmdGiai = new javax.swing.JButton();
        jcmdXoaTrang = new javax.swing.JButton();
        jcmdThoat = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnNhapABC.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Giải Phương Trình Bậc 2");
        jpnNhapABC.add(jLabel1);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtA.setText("0");
        jPanel1.add(jtxtA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 167, -1));

        jtxtB.setText("0");
        jPanel1.add(jtxtB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 167, -1));

        jtxtC.setText("0");
        jPanel1.add(jtxtC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 168, -1));

        jtxtKetQua.setText("Kết Quả");
        jPanel1.add(jtxtKetQua, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 240, 40));

        jPanel2.setName(""); // NOI18N

        jcmdGiai.setText("Giải");
        jcmdGiai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmdGiaiActionPerformed(evt);
            }
        });

        jcmdXoaTrang.setText("Xóa Trắng");
        jcmdXoaTrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmdXoaTrangActionPerformed(evt);
            }
        });

        jcmdThoat.setText("Thoát");
        jcmdThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmdThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcmdGiai)
                .addGap(26, 26, 26)
                .addComponent(jcmdXoaTrang)
                .addGap(28, 28, 28)
                .addComponent(jcmdThoat)
                .addGap(55, 55, 55))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcmdGiai)
                    .addComponent(jcmdXoaTrang)
                    .addComponent(jcmdThoat))
                .addContainerGap())
        );

        jLabel2.setText("a:");

        jLabel3.setText("b:");

        jLabel4.setText("c:");

        jLabel5.setText("Kết Quả");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 61, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jpnNhapABC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnNhapABC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcmdGiaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmdGiaiActionPerformed
        // TODO add your handling code here:
        jtxtKetQua.setText(giaiPT());
    }//GEN-LAST:event_jcmdGiaiActionPerformed

    private void jcmdXoaTrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmdXoaTrangActionPerformed
        // TODO add your handling code here:
        xoaTrang();
    }//GEN-LAST:event_jcmdXoaTrangActionPerformed
    private void jcmdThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmdThoatActionPerformed
        int ret=JOptionPane.showConfirmDialog(null,
                "bạn chắc chắn muốn thoát?", "Thoát",
                JOptionPane.YES_NO_OPTION);
        if(ret==JOptionPane.YES_OPTION){
            new GiaoDienChinh_DieuKhienCoBan().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jcmdThoatActionPerformed

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
            java.util.logging.Logger.getLogger(PhuongTrinhBac2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhuongTrinhBac2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhuongTrinhBac2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhuongTrinhBac2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhuongTrinhBac2().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jcmdGiai;
    private javax.swing.JButton jcmdThoat;
    private javax.swing.JButton jcmdXoaTrang;
    private javax.swing.JPanel jpnNhapABC;
    private javax.swing.JTextField jtxtA;
    private javax.swing.JTextField jtxtB;
    private javax.swing.JTextField jtxtC;
    private javax.swing.JTextField jtxtKetQua;
    // End of variables declaration//GEN-END:variables
}
