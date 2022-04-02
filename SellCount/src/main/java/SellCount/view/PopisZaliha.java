/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SellCount.view;

import SellCount.controller.Obrada;
import SellCount.controller.ObradaArtikl;
import SellCount.model.Artikl;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class PopisZaliha extends javax.swing.JFrame {

    private ObradaArtikl obradaA;

    public PopisZaliha() {
        initComponents();
        ucitajTablicu();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPopis = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblPopis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPopis.setEnabled(false);
        tblPopis.setShowGrid(true);
        jScrollPane1.setViewportView(tblPopis);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPopis;
    // End of variables declaration//GEN-END:variables

    private void ucitajTablicu() {
        DefaultTableModel ms = new DefaultTableModel();
        obradaA = new ObradaArtikl();
        ms.addColumn("Naziv");
        ms.addColumn("Cijena");
        ms.addColumn("Količina");
        ms.addColumn("JM");
        ms.addColumn("Klasifikacija");
        ms.addColumn("EANcode");
        
       
        
        new ObradaArtikl().read().forEach(s ->{
            Vector vec = new Vector();
            vec.add(s.getNaziv());
            vec.add(s.getCijena());
            vec.add(s.getKolicina());
            vec.add(s.getJmjera());
            vec.add(s.getKlasifikacija());
            vec.add(s.getEANcode());
            ms.addRow(vec);
            });
                
        tblPopis.setModel(ms);
        tblPopis.getColumnModel().getColumn(1).setMaxWidth(80);
        tblPopis.getColumnModel().getColumn(0).setMaxWidth(100);
        tblPopis.getColumnModel().getColumn(3).setMaxWidth(50);
        tblPopis.getColumnModel().getColumn(2).setMaxWidth(100);
        tblPopis.getColumnModel().getColumn(4).setMaxWidth(100);
    }
}
