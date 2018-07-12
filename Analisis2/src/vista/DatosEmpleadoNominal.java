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
        super.agregarCaracteristica("Nombre",0);
        super.agregarCaracteristica("Pago",0);        
        super.agregarCaracteristica("Teléfono",0);
        super.agregarCaracteristica("TiempoEstimado",0);
        super.agregarCaracteristica("Fecha Inicio",0);        
        super.agregarCaracteristica("Descripcion",1);
        super.dibujar();
    }
      
}
