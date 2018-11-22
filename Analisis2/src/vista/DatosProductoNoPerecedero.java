/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JPanel;

/**
 *
 * @author rocka
 */
public class DatosProductoNoPerecedero extends PanelConstructor {
    
    public DatosProductoNoPerecedero(JPanel panel) {
        super(panel);
      
    }
    
    public void construir(){
        super.agregarCaracteristica(this.idioma.getProperty("codigo"),0);
        super.agregarCaracteristica(this.idioma.getProperty("nombreproducto"),0);
        super.agregarCaracteristica(this.idioma.getProperty("marca"),0);
        super.agregarCaracteristica(this.idioma.getProperty("existencia"),0);
        super.agregarCaracteristica(this.idioma.getProperty("precio"),0);
        super.agregarCaracteristica(this.idioma.getProperty("descripcion"),1);   
        super.dibujar();
    }
    
}
