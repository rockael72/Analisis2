/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JPasswordField;

/**
 *
 * @author rocka
 */
public class PasswordBox extends JPasswordField implements Texto{
     public PasswordBox(){
        super();
        super.setSize(150, 25);
        super.show();
        super.setEditable(true);
        
    }
     
     public String getText(){
         return super.getText();
     }
     
}
