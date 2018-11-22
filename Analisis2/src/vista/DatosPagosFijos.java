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
public class DatosPagosFijos extends PanelConstructor{
    
    public DatosPagosFijos(JPanel panel) {
        super(panel);
    }
    
      public void construir(){      
        super.agregarCaracteristica(this.idioma.getProperty("nopago"),0);
        super.agregarCaracteristica(this.idioma.getProperty("montoapagar"),0);        
        super.agregarCaracteristica(this.idioma.getProperty("tipopago"),0);
        super.agregarCaracteristica(this.idioma.getProperty("cliente"),0);
        super.agregarCaracteristica(this.idioma.getProperty("fechainicio"),0);        
        super.agregarCaracteristica(this.idioma.getProperty("proximopago"),0);
        super.agregarCaracteristica(this.idioma.getProperty("cantidadpago"),0);        
        super.agregarCaracteristica(this.idioma.getProperty("montototal"),0);        
        super.agregarCaracteristica(this.idioma.getProperty("descripcion"),1);
        super.dibujar();
    }
      
}

