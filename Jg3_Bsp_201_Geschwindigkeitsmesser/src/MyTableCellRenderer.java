
import java.awt.Color;
import java.awt.Component;
import java.time.format.DateTimeFormatter;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vizug
 */
public class MyTableCellRenderer implements TableCellRenderer {
       @Override
       public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
    JLabel label = new JLabel();
    
           
    Measurement m= (Measurement)value;
    
    label.setOpaque(true);
    label.setBackground(Color.white);
    switch(table.convertColumnIndexToModel(column)){
        case 0:
            label.setText(m.getLdt().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
            break;
        case 1:
            label.setText(m.getLdt().format(DateTimeFormatter.ofPattern("HH:mm")));
            break;
        case 2:
            label.setText(m.getKennzeichen());
            break; 
        case 3:
            label.setText(String.format("%d",m.getGemessen()));
            break; 
        case 4:
            label.setText(String.format("%d",m.getErlaubt()));
            break;
        case 5:
            label.setText(String.format("%.2f",m.getUebertreten()));
            if(m.getUebertreten()>30.0) label.setBackground(Color.red);
            if(m.getUebertreten()<=30.0 && m.getUebertreten()>20.0) label.setBackground(Color.orange);
            if(m.getUebertreten()<=20.0 && m.getUebertreten()>10.0) label.setBackground(Color.yellow);
            if(m.getUebertreten()<=10.0 && m.getUebertreten()>0.0) label.setBackground(Color.blue);
            break;
        
    }
    
    
    
//    if(value instanceof Color){
//        label.setOpaque(true);
//        label.setBackground((Color)value);
//        label.setForeground(Color.yellow);
//    }
    
    return label;
        
}
}
