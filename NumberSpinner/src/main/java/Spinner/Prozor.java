package Spinner;

import java.util.Arrays;

public class Prozor extends javax.swing.JFrame  {
public Prozor() {
        initComponents();
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Red = new javax.swing.JTextField();
        Stupac = new javax.swing.JTextField();
        InfoRed = new javax.swing.JLabel();
        InfoStupac = new javax.swing.JLabel();
        CreateTable = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        InfoRed.setText("Red");

        InfoStupac.setText("Stupac");

        CreateTable.setText("Create");
        CreateTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateTableMouseClicked(evt);
            }
        });
        CreateTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateTableActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText(" ");
        jTextArea1.setToolTipText("");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InfoRed, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(InfoStupac, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Stupac, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(Red)))
                    .addComponent(CreateTable, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Red, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InfoRed))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Stupac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InfoStupac))
                        .addGap(18, 18, 18)
                        .addComponent(CreateTable))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateTableActionPerformed
Tablica tablica = new Tablica();
tablica.setA(Integer.parseInt(Red.getText()));
tablica.setB(Integer.parseInt(Stupac.getText()));
int[][] cik = tablica.Krug();
StringBuilder cikl = new StringBuilder();
for (int i = 0; i < cik.length; i++) {
                    for (int j = 0; j < cik[i].length; j++) {
                        cikl.append(cik[i][j]);
                        if (j < cik[i].length - 1) {
                            cikl.append(" ");
                        }
                    }
                    cikl.append("\r\n");
                }
jTextArea1.setText(cikl.toString());

    }//GEN-LAST:event_CreateTableActionPerformed

    private void CreateTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateTableMouseClicked
        
    }//GEN-LAST:event_CreateTableMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateTable;
    private javax.swing.JLabel InfoRed;
    private javax.swing.JLabel InfoStupac;
    private javax.swing.JTextField Red;
    private javax.swing.JTextField Stupac;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

   


}


