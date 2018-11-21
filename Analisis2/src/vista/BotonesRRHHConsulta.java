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
public class BotonesRRHHConsulta extends PanelConstructor {
    
   
    
      private DirectorPanel dp;
    private Factory f;

    public BotonesRRHHConsulta(JPanel panel) {
        
        super(panel);
        f = new FactoryPanel();
        dp = new DirectorPanel(f.factoryPanel(DirectorPanel.getPanel1(), "Consulta"));
        
    }
    
    
      public void construir(){
        super.agregarCaracteristica(super.idioma.getProperty("nombre"),0);
        super.agregarCaracteristica(super.idioma.getProperty("tipoempleado"),6);
        super.agregarCaracteristica(super.idioma.getProperty("buscar"),3);
        super.agregarCaracteristica(super.idioma.getProperty("todos"), 3);
     
       // ComboBox nombre = (ComboBox) super.getComponent(0);
        
        
        Button buscar = (Button) super.getComponent(2);
        buscar.setText(super.idioma.getProperty("buscar"));
        buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
              //  System.out.println(dp.getDatos());
                    
            }
        });
        
         Button todos = (Button) super.getComponent(2);
         todos.setText(super.idioma.getProperty("todos"));
        todos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
              //  System.out.println(dp.getDatos());
                    
            }
        });
        super.dibujar();
    }
      
      public void agregarDirector(){
          
      }
}

