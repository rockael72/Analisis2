/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author rocka
 */
public class ComboBoxCompra extends ComboBox{

    public ComboBoxCompra() {
        super();
        this.item();
        this.evento();
    }
    
    
      public void evento(){
       
    }
    
    public void item(){
        super.addItem("Pedecedero");
        super.addItem("NoPedecedero"); 
     
    }
}
