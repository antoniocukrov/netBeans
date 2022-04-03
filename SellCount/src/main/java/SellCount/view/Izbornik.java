package SellCount.view;

import SellCount.controller.ObradaArtikl;
import SellCount.model.Artikl;
import SellCount.util.SellCountUtil;
import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class Izbornik extends javax.swing.JFrame {

    private SimpleDateFormat df;
    ObradaArtikl obrada;

    public Izbornik() {
        initComponents();
        postavke();
        nacrtajGraf();        
            }
    
    private void nacrtajGraf(){
        List<Artikl> artikli = new ObradaArtikl().read();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        new ObradaArtikl().read().forEach(s ->{
           if(s.getKlasifikacija().getNaziv().matches("Gorivo")){
            dataset.setValue(s.getKolicina(), "Litara", s.getNaziv());
           }
        });
        
       
        JFreeChart jFreeChart = ChartFactory.createBarChart(
                "Razina goriva",
        "",
        "Litara",
        dataset,
        PlotOrientation.VERTICAL,
        false, true, false); 
        
        ChartPanel chartPanel = new ChartPanel(jFreeChart);
        
        pnlGraf.setLayout(new BorderLayout());
        pnlGraf.add(chartPanel, BorderLayout.CENTER);
        pnlGraf.validate();
        
        
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        lVrijeme = new javax.swing.JLabel();
        lTop6 = new javax.swing.JLabel();
        pnlGraf = new javax.swing.JPanel();
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

        pnlGraf.setMaximumSize(new java.awt.Dimension(400, 400));
        pnlGraf.setPreferredSize(new java.awt.Dimension(300, 300));

        javax.swing.GroupLayout pnlGrafLayout = new javax.swing.GroupLayout(pnlGraf);
        pnlGraf.setLayout(pnlGrafLayout);
        pnlGrafLayout.setHorizontalGroup(
            pnlGrafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlGrafLayout.setVerticalGroup(
            pnlGrafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 259, Short.MAX_VALUE)
        );

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
        jZaprimi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jZaprimiActionPerformed(evt);
            }
        });
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
                .addGap(234, 469, Short.MAX_VALUE)
                .addComponent(lTop6)
                .addGap(155, 155, 155))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlGraf, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlGraf, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lTop6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jZaprimiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jZaprimiActionPerformed
        new ZaprimiProzor().setVisible(true);
    }//GEN-LAST:event_jZaprimiActionPerformed

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
    private javax.swing.JPanel pnlGraf;
    // End of variables declaration//GEN-END:variables
}
