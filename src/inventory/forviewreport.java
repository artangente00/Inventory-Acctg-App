/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


public class forviewreport extends DefaultTableCellRenderer{
public forviewreport(){}
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
       JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
       
       
        Color foreground = Color.BLACK;
       // Color foreground = Color.BLACK;
       Object obj = table.getValueAt(row, 4);
       try{
           double stockonhand = Double.parseDouble(obj.toString());
           if (stockonhand == 0){
               foreground = Color.RED;
           }
       }catch (Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
       label.setForeground(foreground);
       return label;
    }
    
}
