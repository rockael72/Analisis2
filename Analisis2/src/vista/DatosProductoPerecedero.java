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
public class DatosProductoPerecedero extends PanelConstructor{
    
    public DatosProductoPerecedero(JPanel panel) {
        super(panel);
    }
    
      public void construir(){
        super.agregarCaracteristica("Codigo",0);
        super.agregarCaracteristica("Nombre",0);
        super.agregarCaracteristica("Marca",0);
        super.agregarCaracteristica("Existencia",0);
        super.agregarCaracteristica("Fecha",0);
        super.agregarCaracteristica("Precio",0);
        super.agregarCaracteristica("Descripcion",1);
        super.dibujar();
    }
}
