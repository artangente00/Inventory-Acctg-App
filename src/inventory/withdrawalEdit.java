/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;


public class withdrawalEdit extends javax.swing.JFrame {
    Connection connec = null;
    PreparedStatement stm = null;
    ResultSet rs = null; 
DefaultTableModel model;
    
    public withdrawalEdit() {
        initComponents();
        this.setLocationRelativeTo(null); 
        showtable();
    }
Withdrawalupdate jtRowData = new Withdrawalupdate();
  
public void showtable(){
 String sql="SELECT * FROM withdrawal ORDER BY Date DESC";
 
        try{
        Class.forName("com.mysql.jdbc.Driver");
        connec = DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
        stm= connec.prepareStatement(sql);
        rs=stm.executeQuery();
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        tblModel.setRowCount(0);
        while(rs.next()){
        tblModel.addRow(new String[]{rs.getString(1),rs.getString(17),rs.getString(5),rs.getString(2),rs.getString(3),rs.getString(15),rs.getString(9),rs.getString(6),rs.getString(4),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(10),rs.getString(8),rs.getString(7),rs.getString(11),rs.getString(16)});
       }
    }catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
                
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        itemcode = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ItemCode:");

        itemcode.setBackground(new java.awt.Color(204, 255, 255));
        itemcode.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        itemcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                itemcodeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                itemcodeKeyTyped(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventory/back.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ItemCode", "P.O #:", "Description", "Stock Onhand", "UOM", "Date", "Department", "StoredLocation", "Cost", "WithdrawQty", "RemainingQty", "TotalAmnt", "MRIS", "Purpose", "GLAccount", "Custodian", "ReceiptNo"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Withdrawal Edit");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itemcode, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1314, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(804, 804, 804))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(itemcode, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int index = jTable1.getSelectedRow();
        TableModel model  = jTable1.getModel();
        String ItemCode = model.getValueAt(index, 0).toString();
        String PONumber = model.getValueAt(index, 1).toString();
        String Description = model.getValueAt(index, 2).toString();
        String StockOnhand = model.getValueAt(index, 3).toString();
        String UOM = model.getValueAt(index, 4).toString();
        String Date = model.getValueAt(index, 5).toString();
        String Department = model.getValueAt(index, 6).toString();
        String Storelocation = model.getValueAt(index, 7).toString();
        String unitcost = model.getValueAt(index, 8).toString();
        String withdrawqty = model.getValueAt(index, 9).toString();
        String Remainqty = model.getValueAt(index, 10).toString();
        String withdrawalcost = model.getValueAt(index, 11).toString();
        String mris = model.getValueAt(index, 12).toString();
        String purpose = model.getValueAt(index, 13).toString();
        String glacct = model.getValueAt(index, 14).toString();
        String custodian = model.getValueAt(index, 15).toString();
        String receiptno = model.getValueAt(index, 16).toString();
        jtRowData.setVisible(true);
        jtRowData.pack();
        jtRowData.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        jtRowData.code.setText(ItemCode);
        jtRowData.description.setText(Description);
        jtRowData.onhand.setText(StockOnhand);
        jtRowData.perunit.setText(UOM);
        jtRowData.departments.setText(Department);
        jtRowData.location.setText(Storelocation);
        jtRowData.unitcost.setText(unitcost);
        jtRowData.withdrawqty.setText(withdrawqty);
        jtRowData.totalcost.setText(withdrawalcost);
        jtRowData.mrisno.setText(mris);
        jtRowData.purposes.setText(purpose);
        jtRowData.glaccnt.setSelectedItem(glacct);
        jtRowData.remaining.setText(Remainqty);
        jtRowData.custodians.setText(custodian);
        jtRowData.receipt.setText(receiptno);
        jtRowData.ponumber.setText(PONumber);

        dispose();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu wdr=new Menu();
        wdr.setVisible(true);
        this.dispose();
        wdr.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void itemcodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemcodeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_itemcodeKeyTyped

    private void itemcodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemcodeKeyReleased
        String text = itemcode.getText().trim();

        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connec = DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
            String sql="SELECT * FROM withdrawal where ItemCode like '%"+text+"%';";
            PreparedStatement stm = connec.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            //jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            int i =1;
            while (rs.next()) {
                String ItemCode = rs.getString("ItemCode");
                String PONumber = rs.getString("PONumber");
                String Description = rs.getString("Description");
                String Stockonhand = rs.getString("StockOnhand");
                String uom = rs.getString("UOM");
                String date = rs.getString("Date");
                String department = rs.getString("Department");
                String Storelocation = rs.getString("StoredLocation");
                String unitcost = rs.getString("Cost");
                String Withdrawqty = rs.getString("WithdrawQty");
                String RemainQty = rs.getString("RemainingQty");
                String WithdrawalCost = rs.getString("TotalAmnt");
                String MRIS = rs.getString("MRIS");
                String purpose = rs.getString("Purpose");
                String glacct = rs.getString("GLAccount");
                String custodian = rs.getString("Custodian");
                String receiptno = rs.getString("ReceiptNo");

                model.addRow(new Object[]{ItemCode,PONumber,Description,Stockonhand,uom,date,department,Storelocation,unitcost,Withdrawqty,
                    RemainQty,WithdrawalCost,MRIS,purpose,glacct,custodian,receiptno});
            i++;
        }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_itemcodeKeyReleased

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
            java.util.logging.Logger.getLogger(withdrawalEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(withdrawalEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(withdrawalEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(withdrawalEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new withdrawalEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField itemcode;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
