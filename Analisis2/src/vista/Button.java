/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author rocka
 */
public class Button extends JButton  {
    
    public Button(String nombre){
        setLayout(null);
        super.setText(nombre);
        super.setBounds(100,150,100,30);
    }


    
}
