
package inventory;

import java.awt.Component;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
import sun.swing.table.DefaultTableCellHeaderRenderer;


public class EditAddStocks extends javax.swing.JFrame {
  
    Connection connec=null;
    PreparedStatement stm=null;
    ResultSet rs=null;
    DefaultTableModel model;
    public EditAddStocks() {
        initComponents();
        this.setLocationRelativeTo(null);
        jTable1.getTableHeader().setDefaultRenderer(new HeadColor());
        jTable1.setRowHeight(25);
        showtable();       
    }
  
stocksedit jtRowData = new stocksedit();


private void showtable(){
  String sql="SELECT * FROM stocks ORDER BY DateTime DESC";  
    try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection connec = DriverManager.getConnection("jdbc:mysql://localhost/project","root","");  
                PreparedStatement stm = connec.prepareStatement(sql);
                ResultSet rs = stm.executeQuery();
                DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        tblModel.setRowCount(0);
        while(rs.next()){
        tblModel.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13)});       }                   
    }catch (Exception e){
        JOptionPane.showMessageDialog(null,e);
    }
}

  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jTable1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ItemCode", "P.O", "Description", "QtyReceive", "Stock Onhand", "UOM", "Price", "Department", "StoredLocation", "DateTime", "DeliveredBy", "ReceiptNo", "Total Amount"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getAccessibleContext().setAccessibleName("");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ItemCode:");

        code.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codeKeyReleased(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventory/back.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Edit Stocks");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(612, 612, 612)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(633, 633, 633))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1588, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Menu wdr=new Menu();
       wdr.setVisible(true);
       this.dispose(); 
       wdr.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int index = jTable1.getSelectedRow();
       TableModel model  = jTable1.getModel();
            String ItemCode = model.getValueAt(index, 0).toString();
            String PO = model.getValueAt(index, 1).toString();
            String Description = model.getValueAt(index, 2).toString();
            String Qtyreceive = model.getValueAt(index, 3).toString();
            String StockOnhand = model.getValueAt(index, 4).toString();
            String uom = model.getValueAt(index, 5).toString();
            String Price = model.getValueAt(index, 6).toString();
            String Department = model.getValueAt(index, 7).toString();
            String Location = model.getValueAt(index, 8).toString();
            String DateTime = model.getValueAt(index, 9).toString();
            String DeliveredBy = model.getValueAt(index, 10).toString();
            String ReceiptNo = model.getValueAt(index, 11).toString();
            String Total = model.getValueAt(index, 12).toString();
            
            
            
            jtRowData.setVisible(true);
            jtRowData.pack();
            jtRowData.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            
            jtRowData.item.setText(ItemCode); 
            jtRowData.po.setText(PO); 
            jtRowData.description.setText(Description); 
            jtRowData.qty.setText(Qtyreceive); 
            jtRowData.stockonhand.setText(StockOnhand); 
            jtRowData.uom.setText(uom); 
            jtRowData.price.setText(Price); 
            jtRowData.department.setSelectedItem(Department);
            jtRowData.location.setSelectedItem(Location);
            jtRowData.jLabel12.setText(DateTime); 
            jtRowData.delivered.setText(DeliveredBy); 
            jtRowData.receipt.setText(ReceiptNo); 
            jtRowData.totalamnt.setText(Total);
            
            dispose();
    }//GEN-LAST:event_jTable1MouseClicked

    private void codeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codeKeyReleased

String text = code.getText().trim();

DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
model.setRowCount(0);
try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection connec = DriverManager.getConnection("jdbc:mysql://localhost/project","root",""); 
                String sql="SELECT * FROM stocks where ItemCode like '%"+text+"%';";  
                PreparedStatement stm = connec.prepareStatement(sql);
                ResultSet rs = stm.executeQuery();
                 int i =1;
            while (rs.next()) {
                 String ItemCode = rs.getString("ItemCode");
                 String PONumber = rs.getString("PO");
                 String Description = rs.getString("Description");
                 String Qtyreceive = rs.getString("QTYReceive");
                 String StockOnhand = rs.getString("StockOnhand");
                 String UOM = rs.getString("UOM");
                 String Price = rs.getString("Price");
                 String Department = rs.getString("Department");
                 String StoredLocation = rs.getString("StoredLocation");
                 String DateTime = rs.getString("DateTime");
                 String DeliveredBy = rs.getString("DeliveredBy");
                 String ReceiptNo = rs.getString("ReceiptNo");
                 String TotalAmount = rs.getString("TotalAmount");

            model.addRow(new Object[]{ItemCode,PONumber,Description,Qtyreceive,StockOnhand,UOM,Price,Department,StoredLocation,DateTime,
            DeliveredBy,ReceiptNo,TotalAmount});
            i++;
            }

     }catch (Exception e){
         JOptionPane.showMessageDialog(null, e);
     }
    }//GEN-LAST:event_codeKeyReleased

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
     
    }//GEN-LAST:event_jTable1KeyReleased

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditAddStocks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField code;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    static public class HeadColor extends DefaultTableCellHeaderRenderer{
        public HeadColor(){
            setOpaque(true);
        }public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
       JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
              setBackground(new java.awt.Color(39, 202, 227));
              setForeground(new java.awt.Color (255, 255, 255));
              setFont(new Font("Arial", Font.BOLD, 13));
              
       return this;
    }
}
}
