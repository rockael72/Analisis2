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
public class ComboBoxModulo extends ComboBox{
     
    public ComboBoxModulo() {
        super();
        this.item();
        this.evento();
    }
    
    
      public void evento(){
       
    }
    
    public void item(){
        super.addItem("Inventario");
        super.addItem("Ventas"); 
        super.addItem("RRHH"); 
        super.addItem("Usuarios");
        super.addItem("Permisos");
        
    }
}
