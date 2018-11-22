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
        super.agregarCaracteristica(super.idioma.getProperty("empresa"),0);
        super.agregarCaracteristica(super.idioma.getProperty("usuario"),0);
        super.agregarCaracteristica(super.idioma.getProperty("contraseña"),2);                
        super.dibujar();
    }
    
}
