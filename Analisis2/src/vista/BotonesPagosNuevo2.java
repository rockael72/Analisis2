/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import RRHH.DirectorRRHH;
import RRHH.FactoryGeneralRRHH;
import RRHH.FactoryRRHH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import Pagos.DirectorPagos;
import Pagos.FactoryGeneral;
import Pagos.FactoryPagos;


/**
 *
 * @author rocka
 */
public class BotonesPagosNuevo2 extends PanelConstructor{
    private DirectorPanel dp;
    private Factory f;
    
    public BotonesPagosNuevo2(JPanel panel) {
        super(panel);
        f = new FactoryPanel();
        dp = new DirectorPanel(f.factoryPanel(DirectorPanel.getPanel1(), "Fijo"));
       
        
    }
    
    
      public void construir(){
        super.agregarCaracteristica(super.idioma.getProperty("tipopago"),9);
        super.agregarCaracteristica(super.idioma.getProperty("agregar"),3);
     
        ComboBox t = (ComboBox) super.getComponent(0);
        t.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch(t.getSelectedIndex()){
                    case 0 : dp.cambiarPanel(f.factoryPanel(DirectorPanel.getPanel1(), "Fijo"));
                    break;
                    case 1 : dp.cambiarPanel(f.factoryPanel(DirectorPanel.getPanel1(), "Variable"));
                    break;
                }              
            }
        }) ;
        
        Button b = (Button) super.getComponent(1);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  FactoryGeneral hr = new FactoryPagos();
                DirectorPagos rs;
                switch(t.getSelectedIndex()){
                    case 0 :  rs = new DirectorPagos(hr.crearPago("Fijo"),dp.getDatos());
                    rs.Insertar(hr.crearPago("Fijo"), dp.getDatos());
                    break;
                    case 1 :  rs = new DirectorPagos(hr.crearPago("Variable"),dp.getDatos());
                    rs.Insertar(hr.crearPago("Variable"), dp.getDatos());
                    break;
                }  
                    
            }
        });
        super.dibujar();
    }
      
      public void agregarDirector(){
          
      }
    
}