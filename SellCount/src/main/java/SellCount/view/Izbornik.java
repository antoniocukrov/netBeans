package SellCount.view;

import SellCount.model.Artikl;
import SellCount.util.SellCountUtil;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListModel;

public class Izbornik extends javax.swing.JFrame {

    private SimpleDateFormat df;

    public Izbornik() {
        initComponents();
        postavke();
    }

    private void postavke() {
        setTitle(SellCountUtil.NAZIV_APP);
        df = new SimpleDateFormat("dd.MMMM.yyy. HH:mm:ss");
        Vrijeme v = new Vrijeme();
        v.start();
    }

    private class Vrijeme extends Thread {

        @Override
        public void run() {
            lVrijeme.setText(df.format(new Date()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
            run();
        }
    }
    
    private void getWeather(){
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        lVrijeme = new javax.swing.JLabel();
        lTop6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mDatoteka = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mSkladiste = new javax.swing.JMenu();
        jSkladiste = new javax.swing.JMenuItem();
        jPopis = new javax.swing.JMenuItem();
        mPrimka = new javax.swing.JMenu();
        jZaprimi = new javax.swing.JMenuItem();
        jDokumenti = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        lVrijeme.setText("Time");
        jToolBar1.add(lVrijeme);

        mDatoteka.setText("Datoteka");

        jMenuItem2.setText("Djelatnici");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mDatoteka.add(jMenuItem2);

        jMenuItem1.setText("Izlaz");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mDatoteka.add(jMenuItem1);

        jMenuBar1.add(mDatoteka);

        mSkladiste.setText("Skladište");

        jSkladiste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, 0));
        jSkladiste.setText("Skladište");
        jSkladiste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSkladisteActionPerformed(evt);
            }
        });
        mSkladiste.add(jSkladiste);

        jPopis.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, 0));
        jPopis.setText("Popis zaliha");
        jPopis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPopisActionPerformed(evt);
            }
        });
        mSkladiste.add(jPopis);

        jMenuBar1.add(mSkladiste);

        mPrimka.setText("Primka");

        jZaprimi.setText("Zaprimi");
        mPrimka.add(jZaprimi);

        jDokumenti.setText("Dokumenti");
        jDokumenti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDokumentiActionPerformed(evt);
            }
        });
        mPrimka.add(jDokumenti);

        jMenuBar1.add(mPrimka);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(234, 245, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lTop6)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(lTop6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jDokumentiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDokumentiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDokumentiActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jSkladisteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSkladisteActionPerformed
        new Skladiste().setVisible(true);
    }//GEN-LAST:event_jSkladisteActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new Djelatnici().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jPopisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPopisActionPerformed
        new PopisZaliha().setVisible(true);
    }//GEN-LAST:event_jPopisActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jDokumenti;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jPopis;
    private javax.swing.JMenuItem jSkladiste;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem jZaprimi;
    private javax.swing.JLabel lTop6;
    private javax.swing.JLabel lVrijeme;
    private javax.swing.JMenu mDatoteka;
    private javax.swing.JMenu mPrimka;
    private javax.swing.JMenu mSkladiste;
    // End of variables declaration//GEN-END:variables
}
