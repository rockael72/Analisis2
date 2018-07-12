/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

/**
 *
 * @author rocka-*
 */
public abstract class ComboBox extends JComboBox{
    
     public ComboBox(){
        super();
        super.setSize(150, 25);
        super.show();
        super.setEditable(false);
        
    }
 
     
     public void generar(){
         
     }
    
    public void evento(){
   /*    super.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("esta presionando el boton 2 " + getSelectedItem() ) ;
            }
        }) ;*/
    }
    
   
    
    public void item(){
        
    }
    
}
