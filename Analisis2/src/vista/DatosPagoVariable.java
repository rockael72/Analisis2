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
public class DatosPagoVariable extends PanelConstructor{
    
    public DatosPagoVariable(JPanel panel) {
        super(panel);
    }
    
      public void construir(){      
        super.agregarCaracteristica("No pagos",0);
        super.agregarCaracteristica("Fecha Pago",0);        
        super.agregarCaracteristica("Cliente",0);
        super.agregarCaracteristica("Monto a pagar",0);                
        super.agregarCaracteristica("Descripcion",1);
        super.dibujar();
    }
    }  
