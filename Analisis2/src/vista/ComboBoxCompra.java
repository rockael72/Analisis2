/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import analisis2.Analisis2;
import idioma.Idioma;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author rocka
 */
public class ComboBoxCompra extends ComboBox{
    private Idioma idioma;
    public ComboBoxCompra() {
        super();
        this.idioma=Analisis2.idioma;
        this.item();
        this.evento();
    }
    
    
      public void evento(){
       
    }
    
    public void item(){
        super.addItem(this.idioma.getProperty("perecedero"));
        super.addItem(this.idioma.getProperty("noperecedero")); 
     
    }
}
