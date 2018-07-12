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
public class Consulta extends PanelConstructor{
    
    public Consulta(JPanel panel) {
        super(panel);
    }
    
      public void construir(){
        super.agregarCaracteristica("",5);
        super.getComponent2(0).setBounds(0, 0, 0, 0);
        super.getComponent2(0).resize(DirectorPanel.getPanel1().getSize());
        super.dibujar();
        
    }
      }