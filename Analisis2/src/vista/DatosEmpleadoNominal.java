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
public class DatosEmpleadoNominal extends PanelConstructor{
    
    public DatosEmpleadoNominal(JPanel panel) {
        super(panel);
    }
    
      public void construir(){      
        super.agregarCaracteristica(this.idioma.getProperty("nombre"),0);
        super.agregarCaracteristica(this.idioma.getProperty("pago"),0);        
        super.agregarCaracteristica(this.idioma.getProperty("telefono"),0);
        super.agregarCaracteristica(this.idioma.getProperty("tiempoestimado"),0);
        super.agregarCaracteristica(this.idioma.getProperty("fechainicio"),0);        
        super.agregarCaracteristica(this.idioma.getProperty("descripcion"),1);
        super.dibujar();
    }
      
}
