/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.sun.javafx.css.Rule;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.Scrollable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultCaret;

/**
 *
 * @author rocka
 */
public class Tabla extends JTable {
    
    public Tabla(){
               
        String[] columnNames = {"First Name",
                        "Last Name",
                        "Sport",
                        "# of Years",
                        "Vegetarian"};
        Object[][] data = {
    {"Kathy", "Smith",
     "Snowboarding", new Integer(5), new Boolean(false)},
    {"John", "Doe",
     "Rowing", new Integer(3), new Boolean(true)},
    {"Sue", "Black",
     "Knitting", new Integer(2), new Boolean(false)},
    {"Jane", "White",
     "Speed reading", new Integer(20), new Boolean(true)},
    {"Joe", "Brown",
     "Pool", new Integer(10), new Boolean(false)}
                
                
};
        
        //super.setPreferredSize(new Dimension(500,500));
        super.setAlignmentX(0);
        super.setAlignmentY(0);
        super.setSize(DirectorPanel.getPanel1().getSize());
        super.setAutoscrolls(true);
        
        DefaultTableModel dtm= new DefaultTableModel(data, columnNames);
        JTable tabla = new JTable(dtm) ;
        tabla.setPreferredScrollableViewportSize(new Dimension(5000,5000));
        tabla.setPreferredSize(new Dimension(5000,5000));
        
        JScrollPane scrollpane = new JScrollPane(tabla, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollpane.setBounds(0, 0, 365,290);
        scrollpane.setVisible(true);
        this.add(scrollpane);        
 
        super.show();        
        super.repaint();
    }

  



}
