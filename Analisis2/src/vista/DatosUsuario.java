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
public class DatosUsuario extends PanelConstructor{
    
    public DatosUsuario(JPanel panel) {
        super(panel);
    }
    
    public void construir(){
        super.agregarCaracteristica("Usuario ",0);
        super.agregarCaracteristica("Password ",2);
        
        
        super.dibujar();
    }
    
}
