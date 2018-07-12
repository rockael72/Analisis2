/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author rocka
 */
public class ComboBoxPermiso extends ComboBox{
     
    public ComboBoxPermiso() {
        super();
        this.item();
        this.evento();
    }
    
    
      public void evento(){
       
    }
    
    public void item(){
        super.addItem("Administrador");
        super.addItem("Restringido"); 
        super.addItem("Oculto"); 
        
    }
}
