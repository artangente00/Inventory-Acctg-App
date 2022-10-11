
package inventory;

import java.awt.Color;
import java.awt.Graphics;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Animation;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import org.jdesktop.swingx.autocomplete.ObjectToStringConverter;


public class AddStocks extends javax.swing.JFrame {
    double result;
    double quotient;
    String operation; 
    
    Connection connec = null;
    PreparedStatement stm = null;
    ResultSet rs = null;

    public AddStocks() {
        initComponents();
        this.setLocationRelativeTo(null);
        AutoCompleteDecorator.decorate(location);
        time();
        
        
      
    }
     public void time(){
     Date d = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd"+" "+"hh:mm:ss a");
    
    String dd = sdf.format(d);
    jLabel4.setText(dd);
    
 }
public void save(){
     String code=item.getText();
     String PO= po.getText();
     String descrip= description.getText();   
     String bbalance = qtyreceive.getText();
     String begin = stock.getText();
     String UOM= uom.getText();
     String Priced= price.getText();
     String dprt = (String)department.getSelectedItem();
     String Stored = (String)location.getSelectedItem();
     String time = jLabel4.getText();
     String deliver = delivered.getText();
     String receiptno = receipt.getText();
     String Total = totalamnt.getText();
       
  if (PO.equals(null)) {
            JOptionPane.showMessageDialog(null, "Add A PO Number Please");
} else if (bbalance.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Add quantity");
} else if (Priced.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Add Price");
} else if (deliver.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Add Delivery");
} else if (receiptno.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Add ReceiptNo");
} else if (dprt.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Select Department");
}
else {
    
         try{           
             Class.forName("com.mysql.jdbc.Driver");
             connec=DriverManager.getConnection("jdbc:mysql://localhost/project","root",""); 
             stm=connec.prepareStatement("Insert into stocks (ItemCode,PO,Description,QTYReceive,StockOnhand,UOM,Price,Department,StoredLocation,DateTime,DeliveredBy,ReceiptNo,TotalAmount)values (?,?,?,?,?,?,?,?,?,?,?,?,?)");
             
             stm.setString(1, code);
             stm.setString(2, PO); 
             stm.setString(3, descrip);
             stm.setString(4, bbalance);
             stm.setString(5, begin);
             stm.setString(6, UOM);
             stm.setString(7, Priced);
             stm.setString(8, dprt);
             stm.setString(9, Stored);
             stm.setString(10, time);
             stm.setString(11, deliver);
             stm.setString(12, receiptno);
             stm.setString(13, Total);
            
             int i=stm.executeUpdate();
                if(1<0){
                    JOptionPane.showMessageDialog(null, "Item Not Saved");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Item Saved");
                    clear();
        }
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
         }
    
}
     
    
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        po = new javax.swing.JTextField();
        item = new javax.swing.JTextField();
        description = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        uom = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        department = new javax.swing.JComboBox<>();
        location = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        delivered = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        receipt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        totalamnt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        qtyreceive = new javax.swing.JTextField();
        bbal = new javax.swing.JLabel();
        stock = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("P.O#:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Item Code:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Description:");

        po.setBackground(new java.awt.Color(204, 255, 255));
        po.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        po.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        item.setBackground(new java.awt.Color(204, 255, 255));
        item.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
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

        description.setEditable(false);
        description.setBackground(new java.awt.Color(204, 255, 255));
        description.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("UOM:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Price:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Department:");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Stored Loc.:");

        uom.setEditable(false);
        uom.setBackground(new java.awt.Color(204, 255, 255));
        uom.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        uom.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        price.setBackground(new java.awt.Color(204, 255, 255));
        price.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        price.setText("0");
        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                priceKeyReleased(evt);
            }
        });

        department.setBackground(new java.awt.Color(204, 255, 255));
        department.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "ISD", "ELEC", "MBD", "MNTCE", "HR", "CSUPPLY", "ACCTG", "PLD", "OFM/SFTY", "QA", "RPD", "PRCHSG", "GMO" }));

        location.setBackground(new java.awt.Color(204, 255, 255));
        location.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        location.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A - OFFICE SUPPLIES/JANITORIAL/PPE'S", "B - LABORATRY CHEMICAL(QA)", "C - FILTER CLOTH/FILTER PAPER", "D - IT PERIPHERALS(ISD)", "E - BOLTS & NUT/PIN CUTTER/RIVETS/NAILS/SCREW/WASHER", "F - BEARING, PILLOWS BLOCKS, ADAPTER, SLEEVES", "G - OIL SEAL / PACKING /GASKET / INSULATION/ O-RING", "H - FILTER/HOSE/ FITTING/CONNECTORS", "I - ENGINE PARTS HEAVY, MATERIAL HANDLING, TRANSPO EQUIPMENT", "J - BRONZE, STAINLESS, RUBBER, SPLIT BUSHING / LEAF SPRING", "K - GATE, BUTTERFLY, CHECK,GLOBE,KNIFE,PNEUMATIC VALVES", "L - WELDING RODS", "M - ELECTRICAL SUPPLIES /BREAKER /CONTRACTORS/RELAY/CAPACITORS", "N - ELBOW/REDUCER/TEE/UNION/COUPLING(B.I,G.I,SS)/PVC", "O - CHAIN/ CHAIN COUPLING/GEAR COUPLING / FLANGE COUPLING", "P - MOTORS / PUMPS/ MACHINERIES", "Q - CONVEYOR BELT /V-BELTS/RUBBER STRIP", "R - SPROCKET/MILL TURBINE/PINION/IDLER/ROLLERS/IMPELLER", "S - OEM SPARE PARTS (BMA/FIVESCALE/WESTERN STATE)", "T - FLANGES", "U - SCREENS", "V - PACKAGING MATERIALS", "W - GLASS / PLYWOOD / G.I SHEET / ROPE /LUMBERWOOD", "X - PAINTS", "Y - ROUND BARS / TUBES/SHAFTINGS", "Z - FLAT BARS", "AA - ANGLE BARS", "BB - CORRUGATED BARS / HOLLOW BAR / SQUARE BAR / GRATE", "CC - COLUMNS/ STRUCTURAL /PURLINS / BEAMS", "DD - WIRES (CABLES, CYCLONE, BARB, G.I, ETC)", "EE - CHEMICALS AND ADDITIVES (SALT,LIME,CAUSTIC SODE, ETC)", "FF - FERTILIZERS", "GG - OIL AND LUBRICANTS/DIESEL/BUNKER/GASOLINE/KEROSENE", "HH - ACETYLENE / OXYGEN /LPG/ FIRE EXTINGUISHER", "II - PLATES (MS, AR, SS)", "JJ - FIRE BRICKS", "KK - COAL", "LL - SAND/ GRAVEL/HOLLOW BLOCKS", "MM - BAGASSE", "NN - MOLASSES", "OO - TOOLS(HANDS & POWER)", "PP - TIRES / FLAPS / INNER TUBES / RIMS", "QQ - PIPES (BI,SS,GI,PVC)", "ZZ MISCELLANEOUS" }));
        location.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Add Stock");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventory/save.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventory/back.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventory/edit (1).png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Delivered By:");

        delivered.setBackground(new java.awt.Color(204, 255, 255));
        delivered.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        delivered.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Receipt No.:");

        receipt.setBackground(new java.awt.Color(204, 255, 255));
        receipt.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        receipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiptActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Total Amnt:");

        totalamnt.setEditable(false);
        totalamnt.setBackground(new java.awt.Color(204, 255, 255));
        totalamnt.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        totalamnt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("QtyReceive:");

        qtyreceive.setBackground(new java.awt.Color(204, 255, 255));
        qtyreceive.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        qtyreceive.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        qtyreceive.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                qtyreceiveInputMethodTextChanged(evt);
            }
        });
        qtyreceive.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qtyreceiveKeyReleased(evt);
            }
        });

        bbal.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        bbal.setForeground(new java.awt.Color(255, 255, 255));
        bbal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bbal.setText("StockOnhand:");

        stock.setEditable(false);
        stock.setBackground(new java.awt.Color(204, 255, 255));
        stock.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(430, 599, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(po, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 77, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(qtyreceive)
                                            .addComponent(price, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(uom))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(jLabel13))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(bbal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(totalamnt, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(receipt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(delivered, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(item, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(item, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(delivered, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(po, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtyreceive, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uom, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bbal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(totalamnt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(receipt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void locationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String item=receipt.getText();
    {
        try{
             Class.forName("com.mysql.jdbc.Driver");
             connec=DriverManager.getConnection("jdbc:mysql://localhost/project","root",""); 
             String sql = ("select * from stocks where ReceiptNo = '"+item+"'");
             stm=connec.prepareStatement(sql);
             rs = stm.executeQuery();
             
             if(rs.next()){
                 String it=rs.getString("ReceiptNo");
                 receipt.setText(it);
                 
                 JOptionPane.showMessageDialog(null, "Receipt Already Existed");
             }
             else{
int response = JOptionPane.showConfirmDialog(this, "Do you want to save this Item?","Confirm", JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
             if (response==JOptionPane.YES_OPTION){
                 this.setVisible(true);
                 save();
                 new Matconlist().setVisible(true);
                 dispose();
             } else if(response==JOptionPane.NO_OPTION){
                 return;
             }                 
             }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    }
 public void clear(){
     item.setText(null);
     po.setText(null);
     description.setText(null);
    // qty.setText(null);
     uom.setText(null);
     price.setText(null);
     department.setSelectedItem(null);
     location.setSelectedItem(null);
     delivered.setText(null);
     receipt.setText(null);
     qtyreceive.setText(null);
     totalamnt.setText(null);
   //  status.setText(null);
     stock.setText(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      Menu wdr=new Menu();
       wdr.setVisible(true);
       this.dispose(); 
       wdr.dispose();  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void itemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemKeyReleased
       String code=item.getText();
       {
           try{
               Class.forName("com.mysql.jdbc.Driver");
               Connection connec = DriverManager.getConnection("jdbc:mysql://localhost/project","root",""); 
               String sql="select * from stock where ItemCode='"+code+"'";
               PreparedStatement stm = connec.prepareStatement(sql);
               ResultSet rs = stm.executeQuery();
               
               while(rs.next()){
                   description.setText(rs.getString(2));
                   uom.setText(rs.getString(3));
               }
               
           }catch (Exception e){
               JOptionPane.showMessageDialog(null, e);
           }
       }
    }//GEN-LAST:event_itemKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    new EditAddStocks().setVisible(true);    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void priceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyReleased
    double num1=Double.parseDouble(qtyreceive.getText());
    double num2=Double.parseDouble(price.getText());
    double result= (num1*num2);
    DecimalFormat disFormatter = new DecimalFormat("###0.00");
    String formatteded = disFormatter.format(result/1.12);
    totalamnt.setText(formatteded+ "" );
    
    }//GEN-LAST:event_priceKeyReleased

    private void receiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_receiptActionPerformed

    private void qtyreceiveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyreceiveKeyReleased
    double num1=Double.parseDouble(price.getText());
    double num2=Double.parseDouble(qtyreceive.getText());
    double result= (num1*num2);
    DecimalFormat disFormatter = new DecimalFormat("###0.00");
    String formatteded = disFormatter.format(result);
    totalamnt.setText(formatteded+ "" );
        

    String text1, text2;
    text1 = qtyreceive.getText();
    stock.setText(text1);
    }//GEN-LAST:event_qtyreceiveKeyReleased

    private void qtyreceiveInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_qtyreceiveInputMethodTextChanged

    }//GEN-LAST:event_qtyreceiveInputMethodTextChanged

    private void stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockActionPerformed
//double poqty = Double.parseDouble(qty.getText());
//double receive = Double.parseDouble(qtyreceive.getText());
//
//if (poqty == receive){
//    status.setText("Fully Served");
//    status.setForeground(Color.blue);
//}else if (poqty < receive){
//    status.setText("Not Applicable");
//    status.setForeground(Color.RED);
//}else {
//    status.setText("Partial");
//    status.setForeground(Color.MAGENTA);
//}
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
            java.util.logging.Logger.getLogger(AddStocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStocks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bbal;
    private javax.swing.JTextField delivered;
    private javax.swing.JComboBox<String> department;
    public javax.swing.JTextField description;
    public javax.swing.JTextField item;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> location;
    private javax.swing.JTextField po;
    private javax.swing.JTextField price;
    private javax.swing.JTextField qtyreceive;
    private javax.swing.JTextField receipt;
    private javax.swing.JTextField stock;
    private javax.swing.JTextField totalamnt;
    public javax.swing.JTextField uom;
    // End of variables declaration//GEN-END:variables
}
