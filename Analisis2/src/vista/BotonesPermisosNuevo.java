/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author rocka
 */
public class BotonesPermisosNuevo extends PanelConstructor{
    private DirectorPanel dp;
    private Factory f;
    
    public BotonesPermisosNuevo(JPanel panel) {
        super(panel);
        f = new FactoryPanel();
        dp = new DirectorPanel(f.factoryPanel(DirectorPanel.getPanel1(), "Consulta"));
       
        
    }
    
    
      public void construir(){
          super.agregarCaracteristica("Usuario",0);
        super.agregarCaracteristica("Permiso",7);
        super.agregarCaracteristica("Modulo",8);
        super.agregarCaracteristica("Agregar",3);
     
        ComboBox t = (ComboBox) super.getComponent(1);
        t.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             /*   switch(t.getSelectedIndex()){
                    case 0 : dp.cambiarPanel(f.factoryPanel(DirectorPanel.getPanel1(), "Producto"));
                    break;
                    case 1 : dp.cambiarPanel(f.factoryPanel(DirectorPanel.getPanel1(), "Usuario"));
                    break;
                }              */
            }
        }) ;
        
        Button b = (Button) super.getComponent(3);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               /* System.out.println("boton "  + t.getSelectedIndex());
                System.out.println(dp.getDatos());*/
                    
            }
        });
        super.dibujar();
    }
      
      public void agregarDirector(){
          
      }
    
}

