/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import analisis2.Analisis2;
import idioma.Idioma;

/**
 *
 * @author rocka
 */
public class ComboBoxModulo extends ComboBox{
     private Idioma idioma;
    public ComboBoxModulo() {
        super();
        this.idioma=Analisis2.idioma;
        this.item();
        this.evento();
    }
    
    
      public void evento(){
       
    }
    
    public void item(){
        super.addItem(this.idioma.getProperty("inventario"));
        super.addItem(this.idioma.getProperty("ventas")); 
        super.addItem(this.idioma.getProperty("rrhh")); 
        super.addItem(this.idioma.getProperty("usuario"));
        super.addItem(this.idioma.getProperty("permisos"));
        
    }
}
