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
        super.agregarCaracteristica("No pago",0);
        super.agregarCaracteristica("Monto pagar",0);        
        super.agregarCaracteristica("TipoPago",0);
        super.agregarCaracteristica("Cliente",0);
        super.agregarCaracteristica("Fecha inicial",0);        
        super.agregarCaracteristica("Proximo pago",0);
        super.agregarCaracteristica("Cantidad Pago",0);        
        super.agregarCaracteristica("Monto total",0);        
        super.agregarCaracteristica("Descripcion",1);
        super.dibujar();
    }
      
}

