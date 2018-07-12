/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JTextArea;

/**
 *
 * @author rocka
 */
public class TextArea extends JTextArea implements Texto{
      public TextArea(){
        super();
        super.setSize(150, 50);
        super.setLineWrap(true);
        super.show();
        super.setEditable(true);        
        super.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }
 
    
    public String getText(){
        return super.getText();
    }
  
}
