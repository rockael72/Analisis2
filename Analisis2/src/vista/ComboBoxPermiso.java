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
public class ComboBoxPermiso extends ComboBox{
     private Idioma idioma;
    public ComboBoxPermiso() {
        super();
        this.idioma=Analisis2.idioma;
        this.item();
        this.evento();
    }
    
    
      public void evento(){
       
    }
    
    public void item(){
        super.addItem(this.idioma.getProperty("administrador"));
        super.addItem(this.idioma.getProperty("restringido")); 
        super.addItem(this.idioma.getProperty("oculto")); 
        
    }
}
