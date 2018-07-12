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
public class DatosEmpleadoFijo extends PanelConstructor{
    
    public DatosEmpleadoFijo(JPanel panel) {
        super(panel);
    }
    
      public void construir(){        
        super.agregarCaracteristica("Nombre",0);
        super.agregarCaracteristica("Edad",0);                
        super.agregarCaracteristica("Teléfono",0);
        super.agregarCaracteristica("Puesto",0);
        super.agregarCaracteristica("Salario",0);
        super.agregarCaracteristica("Jornada",0);        
        super.agregarCaracteristica("Descripcion",1);
        super.dibujar();
    }
      }
