package SellCount.view;

import SellCount.controller.ObradaArtikl;
import SellCount.model.Artikl;
import SellCount.util.SellCountException;
import java.awt.event.KeyEvent;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ZaprimiProzor extends javax.swing.JFrame {
    private ObradaArtikl obrada;
    DefaultTableModel ms;
    
    public ZaprimiProzor() {
        initComponents();
        obrada = new ObradaArtikl();
        listaSkladiste.setCellRenderer(new PrikazArtikla());
        setTitle("Skladište");
        ucitaj();
        ucitajTablicu();
        
    }
    
    private void ucitaj() {
            DefaultListModel<Artikl> m = new DefaultListModel<>();
            List<Artikl> entiteti;
            entiteti=obrada.read(txtUvjet.getText().trim());
            
            Collections.sort(entiteti,new ArtiklComparator());
            
            for(Artikl s: entiteti){
                m.addElement(s);
            }
        listaSkladiste.setModel(m); 
        }

    private void ucitajTablicu() {
        ms = new DefaultTableModel();
        obrada = new ObradaArtikl();
        ms.addColumn("Naziv");
        ms.addColumn("Količina");
        ms.addColumn("JM");
        ms.addColumn("EANcode");
        tblZaprimi.setModel(ms);
        tblZaprimi.getColumnModel().getColumn(2).setMaxWidth(50);
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        tblZaprimi.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblZaprimi = new javax.swing.JTable();
        txtUvjet = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaSkladiste = new javax.swing.JList<>();
        btnTrazi = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnUnesi = new javax.swing.JButton();
        btnPotvrdi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblZaprimi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblZaprimi);

        txtUvjet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUvjetKeyPressed(evt);
            }
        });

        listaSkladiste.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(listaSkladiste);

        btnTrazi.setText("Traži");
        btnTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Pretraži po imenu");

        btnUnesi.setText("Zaprimi");
        btnUnesi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnesiActionPerformed(evt);
            }
        });

        btnPotvrdi.setText("Potvrđivanje dokumenta");
        btnPotvrdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotvrdiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnUnesi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtUvjet)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTrazi, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPotvrdi, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTrazi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUnesi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPotvrdi, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziActionPerformed
        ucitaj();
    }//GEN-LAST:event_btnTraziActionPerformed

    private void txtUvjetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUvjetKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ucitaj();
        }
    }//GEN-LAST:event_txtUvjetKeyPressed

    private void btnUnesiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnesiActionPerformed
        Vector vec=new Vector();
        vec.add(listaSkladiste.getSelectedValue().getNaziv());
        vec.add(Double.parseDouble(JOptionPane.showInputDialog("Unesi količinu:")));
        vec.add(listaSkladiste.getSelectedValue().getJmjera());
        vec.add(listaSkladiste.getSelectedValue().getEANcode());
        ms.addRow(vec);
        tblZaprimi.setModel(ms);
        
        
        
    }//GEN-LAST:event_btnUnesiActionPerformed

    private void btnPotvrdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotvrdiActionPerformed
       /* if (tblZaprimi.getRowCount()<1) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo unesite artikl koji želite zaprimiti.");
            return;
        }
        
        for(int i=0;i<=tblZaprimi.getRowCount();i++){
        var e=obrada.setEntitet();
        e.setNaziv((String) GetData(tblZaprimi, i, 0));
        e.setKolicina(e.getKolicina() + ((Double) GetData(tblZaprimi, i, 1)));
            try {
                obrada.update();
                
            } catch (SellCountException ex) {
                JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
            }
        }*/
    }//GEN-LAST:event_btnPotvrdiActionPerformed
    
    
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPotvrdi;
    private javax.swing.JButton btnTrazi;
    private javax.swing.JButton btnUnesi;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<Artikl> listaSkladiste;
    private javax.swing.JTable tblZaprimi;
    private javax.swing.JTextField txtUvjet;
    // End of variables declaration//GEN-END:variables

public Object GetData(JTable table, int row_index, int col_index){
  return table.getModel().getValueAt(row_index, col_index);
  }  
    
    
    

}




