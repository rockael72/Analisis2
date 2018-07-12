/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JLabel;

/**
 *
 * @author rocka
 */
public class Label extends JLabel {
 
    
    public Label(String nombre){
        super();
        super.setSize(120, 20);        
        super.setText(nombre);
        super.show();
        
    }
  
    
      
}
