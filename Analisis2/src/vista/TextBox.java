/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JTextField;

/**
 *
 * @author rocka
 */
public class TextBox extends JTextField  implements Texto{
    
    public TextBox(){
        super();
        super.setSize(150, 25);
        super.show();
        super.setEditable(true);
    }
 
    
    public String getText(){
        return super.getText();
    }
    
}
