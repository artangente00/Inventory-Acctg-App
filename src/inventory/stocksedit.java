
package inventory;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;


public class stocksedit extends javax.swing.JFrame {
    double result;
    double quotient;
    String operation;
    
    Connection connec=null;
    PreparedStatement stm=null;
    ResultSet rs=null;
    
    public stocksedit() {
        initComponents();
        AutoCompleteDecorator.decorate(location);
        this.setLocationRelativeTo(null);
        dt();
    }
 public void dt(){
    Date d = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd"+" "+"hh:mm:ss a");
    
    String dd = sdf.format(d);
    jLabel12.setText(dd);
    }  
public void updatestocks(){
  try{
     String sql="UPDATE stocks SET ItemCode=?,PO=?,Description=?,QTYReceive=?,StockOnhand=?,UOM=?,Price=?,Department=?,StoredLocation=?,DeliveredBy=?,TotalAmount=? WHERE ReceiptNo=?";
     connec=DriverManager.getConnection("jdbc:mysql://localhost/project","root",""); 
     stm=connec.prepareStatement(sql);
     stm.setString(12, receipt.getText());
     stm.setString(1, item.getText());
     stm.setString(2, description.getText());
     stm.setString(3, po.getText());
     stm.setString(4, qty.getText());
     stm.setString(5, stockonhand.getText());
     stm.setString(6, uom.getText());
     stm.setString(7, price.getText());
     stm.setString(8, (String)department.getSelectedItem());
     stm.setString(9, (String)location.getSelectedItem());
     stm.setString(10, delivered.getText());
     stm.setString(11, totalamnt.getText());
    
     
     stm.executeUpdate();
     JOptionPane.showMessageDialog(null, "Item Updated Successfully");     
     clear();
      
 }catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
    }        
}
public void deleteitem(){
    try{
           String sql ="DELETE FROM stocks WHERE ReceiptNo=?";
           connec=DriverManager.getConnection("jdbc:mysql://localhost/project","root",""); 
           stm=connec.prepareStatement(sql);
           stm.setString(1,receipt.getText());
           stm.executeUpdate();
           JOptionPane.showMessageDialog(null, "Items Delete Successfully");
           clear();
    }catch (Exception e){
        JOptionPane.showMessageDialog(null,  e);
    }
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        delivered = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        item = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        po = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        description = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        qty = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        uom = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        receipt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        department = new javax.swing.JComboBox<>();
        location = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        totalamnt = new javax.swing.JTextField();
        stock = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        stockonhand = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Delivered By:");

        delivered.setBackground(new java.awt.Color(204, 255, 255));
        delivered.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        delivered.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Item Code:");

        item.setBackground(new java.awt.Color(204, 255, 255));
        item.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        item.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActionPerformed(evt);
            }
        });
        item.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                itemKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("P.O #:");

        po.setBackground(new java.awt.Color(204, 255, 255));
        po.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        po.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Description:");

        description.setEditable(false);
        description.setBackground(new java.awt.Color(204, 255, 255));
        description.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("QtyReceive:");

        qty.setBackground(new java.awt.Color(204, 255, 255));
        qty.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        qty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qtyKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("UOM:");

        uom.setEditable(false);
        uom.setBackground(new java.awt.Color(204, 255, 255));
        uom.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        uom.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Price:");

        price.setBackground(new java.awt.Color(204, 255, 255));
        price.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        price.setText("0");
        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                priceKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Receipt No.:");

        receipt.setEditable(false);
        receipt.setBackground(new java.awt.Color(204, 255, 255));
        receipt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Department:");

        department.setBackground(new java.awt.Color(204, 255, 255));
        department.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "ISD", "ELEC", "MBD", "MNTCE", "HR", "CSUPPLY", "ACCTG", "PLD", "OFM/SFTY", "QA", "RPD", "PRCHSG", "GMO", " " }));

        location.setBackground(new java.awt.Color(204, 255, 255));
        location.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        location.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A - OFFICE SUPPLIES/JANITORIAL/PPE'S", "B - LABORATRY CHEMICAL(QA)", "C - FILTER CLOTH/FILTER PAPER", "D - IT PERIPHERALS(ISD)", "E - BOLTS & NUT/PIN CUTTER/RIVETS/NAILS/SCREW/WASHER", "F - BEARING, PILLOWS BLOCKS, ADAPTER, SLEEVES", "G - OIL SEAL / PACKING /GASKET / INSULATION/ O-RING", "H - FILTER/HOSE/ FITTING/CONNECTORS", "I - ENGINE PARTS HEAVY, MATERIAL HANDLING, TRANSPO EQUIPMENT", "J - BRONZE, STAINLESS, RUBBER, SPLIT BUSHING / LEAF SPRING", "K - GATE, BUTTERFLY, CHECK,GLOBE,KNIFE,PNEUMATIC VALVES", "L - WELDING RODS", "M - ELECTRICAL SUPPLIES /BREAKER /CONTRACTORS/RELAY/CAPACITORS", "N - ELBOW/REDUCER/TEE/UNION/COUPLING(B.I,G.I,SS)/PVC", "O - CHAIN/ CHAIN COUPLING/GEAR COUPLING / FLANGE COUPLING", "P - MOTORS / PUMPS/ MACHINERIES", "Q - CONVEYOR BELT /V-BELTS/RUBBER STRIP", "R - SPROCKET/MILL TURBINE/PINION/IDLER/ROLLERS/IMPELLER", "S - OEM SPARE PARTS (BMA/FIVESCALE/WESTERN STATE)", "T - FLANGES", "U - SCREENS", "V - PACKAGING MATERIALS", "W - GLASS / PLYWOOD / G.I SHEET / ROPE /LUMBERWOOD", "X - PAINTS", "Y - ROUND BARS / TUBES/SHAFTINGS", "Z - FLAT BARS", "AA - ANGLE BARS", "BB - CORRUGATED BARS / HOLLOW BAR / SQUARE BAR / GRATE", "CC - COLUMNS/ STRUCTURAL /PURLINS / BEAMS", "DD - WIRES (CABLES, CYCLONE, BARB, G.I, ETC)", "EE - CHEMICALS AND ADDITIVES (SALT,LIME,CAUSTIC SODE, ETC)", "FF - FERTILIZERS", "GG - OIL AND LUBRICANTS/DIESEL/BUNKER/GASOLINE/KEROSENE", "HH - ACETYLENE / OXYGEN /LPG/ FIRE EXTINGUISHER", "II - PLATES (MS, AR, SS)", "JJ - FIRE BRICKS", "KK - COAL", "LL - SAND/ GRAVEL/HOLLOW BLOCKS", "MM - BAGASSE", "NN - MOLASSES", "OO - TOOLS(HANDS & POWER)", "PP - TIRES / FLAPS / INNER TUBES / RIMS", "QQ - PIPES (BI,SS,GI,PVC)", "ZZ MISCELLANEOUS" }));
        location.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Stored Loc.:");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventory/back.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventory/save.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventory/delete.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("TotalAmnt:");

        totalamnt.setEditable(false);
        totalamnt.setBackground(new java.awt.Color(204, 255, 255));
        totalamnt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        totalamnt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        stock.setBackground(new java.awt.Color(204, 204, 204));
        stock.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        stock.setForeground(new java.awt.Color(255, 255, 255));
        stock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stock.setText("StockOnhand:");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Edit Stocks");

        stockonhand.setBackground(new java.awt.Color(204, 255, 255));
        stockonhand.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        stockonhand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockonhandActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(po, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(department, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(price, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                                .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(stockonhand, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(receipt)
                                                    .addComponent(totalamnt)))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(uom, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(item, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(delivered, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(154, 154, 154)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delivered, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(po, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uom, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(stockonhand, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalamnt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(receipt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemActionPerformed

    private void itemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemKeyReleased
       
    }//GEN-LAST:event_itemKeyReleased

    private void locationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Menu wdr=new Menu();
       wdr.setVisible(true);
       this.dispose(); 
       wdr.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
int response = JOptionPane.showConfirmDialog(this, "Do you want to Update this Item?","Confirm", JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
             if (response==JOptionPane.YES_OPTION){
                 this.setVisible(true);
                 updatestocks();
             } else if(response==JOptionPane.NO_OPTION){
                 return;
             } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
int response = JOptionPane.showConfirmDialog(this, "Do you really want to Delete this Item?","Confirm", JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
             if (response==JOptionPane.YES_OPTION){
                 this.setVisible(true);
                 deleteitem();
             } else if(response==JOptionPane.NO_OPTION){
                 return;
             } 
    }
public void clear(){
    po.setText(null);
    item.setText(null);
    description.setText(null);
    qty.setText(null);
    uom.setText(null);
    price.setText(null);
    department.setSelectedItem(null);
    location.setSelectedItem(null);
    delivered.setText(null);
    receipt.setText(null);
   // jTextField1.setText(null);
    totalamnt.setText(null);
   // receiveqty.setText(null);
    stock.setText(null);
    //jLabel12.setText(null);
   // jLabel16.setText(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void priceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyReleased
    double num1=Double.parseDouble(qty.getText());
    double num2=Double.parseDouble(price.getText());
    double result= (num1*num2);
    DecimalFormat disFormatter = new DecimalFormat("###0.00");
    String formatteded = disFormatter.format(result);
    totalamnt.setText(formatteded+ "" );
    }//GEN-LAST:event_priceKeyReleased

    private void qtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyKeyReleased
            double num1=Double.parseDouble(price.getText());
            double num2=Double.parseDouble(qty.getText());
            double result= (num1*num2);
            DecimalFormat disFormatter = new DecimalFormat("###0.00");
            String formatteded = disFormatter.format(result);
            totalamnt.setText(formatteded+ "" );
           
            String text1, text2;
            text1 = qty.getText();
            stockonhand.setText(text1);
    }//GEN-LAST:event_qtyKeyReleased

    private void stockonhandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockonhandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockonhandActionPerformed

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
            java.util.logging.Logger.getLogger(stocksedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stocksedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stocksedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stocksedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stocksedit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField delivered;
    public javax.swing.JComboBox<String> department;
    public javax.swing.JTextField description;
    public javax.swing.JTextField item;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JComboBox<String> location;
    public javax.swing.JTextField po;
    public javax.swing.JTextField price;
    public javax.swing.JTextField qty;
    public javax.swing.JTextField receipt;
    public javax.swing.JLabel stock;
    public javax.swing.JTextField stockonhand;
    public javax.swing.JTextField totalamnt;
    public javax.swing.JTextField uom;
    // End of variables declaration//GEN-END:variables
}
//double poqty = Double.parseDouble(qty.getText());
//double receive = Double.parseDouble(receiveqty.getText());
//
//if (poqty == receive){
//    jTextField1.setText("Fully Served");
//    jTextField1.setForeground(Color.BLUE);
//}else if (poqty < receive){
//    jTextField1.setText("Not Applicable");
//    jTextField1.setForeground(Color.RED);
//}else {
//    jTextField1.setText("Partial");
//    jTextField1.setForeground(Color.MAGENTA);
//}
