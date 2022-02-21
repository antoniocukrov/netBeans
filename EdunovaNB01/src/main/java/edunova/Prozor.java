package edunova;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

public class Prozor extends javax.swing.JFrame {

    public Prozor() {
        initComponents();
        setTitle("Naslov iz koda");
        //postaviPozadinskuBoju(btnHelloWorld);
        //postaviPozadinskuBoju(txtUnos);
        
        for (Component c : getContentPane().getComponents()) {
            postaviPozadinskuBoju(c);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHelloWorld = new javax.swing.JButton();
        txtUnos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prva aplikacija u NetBeans");
        setAlwaysOnTop(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        btnHelloWorld.setText("Pozdravi svijet");
        btnHelloWorld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelloWorldActionPerformed(evt);
            }
        });

        txtUnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUnos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHelloWorld, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(566, 566, 566))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(txtUnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHelloWorld)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        JOptionPane.showInputDialog(rootPane, "Hello world");
    }//GEN-LAST:event_formMouseClicked

    private void btnHelloWorldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelloWorldActionPerformed
        JOptionPane.showMessageDialog(rootPane, txtUnos.getText());
    }//GEN-LAST:event_btnHelloWorldActionPerformed
    
    private void txtUnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnosActionPerformed
   
    private void postaviPozadinskuBoju(Component komponenta) {
        komponenta.setBackground(Color.RED);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHelloWorld;
    private javax.swing.JTextField txtUnos;
    // End of variables declaration//GEN-END:variables
}
