
package GUI_Ornekler;

import javax.swing.JOptionPane;

public class MetinKutusunuGezdir extends javax.swing.JFrame {

    /**
     * Creates new form MetinKutusunuGezdir
     */
    public MetinKutusunuGezdir() {
        initComponents();
        pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTgb = new javax.swing.JLabel();
        sagGezdir = new javax.swing.JButton();
        solGezdir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        setMaximumSize(new java.awt.Dimension(300, 300));
        setPreferredSize(new java.awt.Dimension(300, 300));

        labelTgb.setText("Tuğba");

        sagGezdir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sagGezdir.setText(">");
        sagGezdir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sagGezdirActionPerformed(evt);
            }
        });

        solGezdir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        solGezdir.setText("<");
        solGezdir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solGezdirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(solGezdir)
                        .addGap(31, 31, 31)
                        .addComponent(sagGezdir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(labelTgb)))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addComponent(labelTgb)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sagGezdir)
                    .addComponent(solGezdir))
                .addGap(92, 92, 92))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void solGezdirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solGezdirActionPerformed
       
        int labelX = labelTgb.getLocation().x;
        int panelX = this.getSize().width;

        if (labelX > panelX) {
            JOptionPane.showMessageDialog(null, "Max. Ekran sınırına ulaştınız.");
        } else {

            labelTgb.setLocation(labelTgb.getLocation().x - 5, labelTgb.getLocation().y);
        }


    }//GEN-LAST:event_solGezdirActionPerformed

    private void sagGezdirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sagGezdirActionPerformed

        int labelX = labelTgb.getLocation().x;
        int panelX = this.getSize().width;

        if (labelX > panelX) {
            JOptionPane.showMessageDialog(null, "Max. Ekran sınırına ulaştınız.");
        } else {

            labelTgb.setLocation(labelTgb.getLocation().x + 20, labelTgb.getLocation().y);
        }


    }//GEN-LAST:event_sagGezdirActionPerformed

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
            java.util.logging.Logger.getLogger(MetinKutusunuGezdir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MetinKutusunuGezdir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MetinKutusunuGezdir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MetinKutusunuGezdir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MetinKutusunuGezdir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelTgb;
    private javax.swing.JButton sagGezdir;
    private javax.swing.JButton solGezdir;
    // End of variables declaration//GEN-END:variables
}
