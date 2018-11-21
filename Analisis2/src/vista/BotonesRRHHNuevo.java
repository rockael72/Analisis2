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
import Pagos.FactoryGeneral;
import Pagos.FactoryPagos;

/**
 *
 * @author rocka
 */
public class BotonesRRHHNuevo extends PanelConstructor{
    private DirectorPanel dp;
    private Factory f;
    
    public BotonesRRHHNuevo(JPanel panel) {
        super(panel);
        f = new FactoryPanel();
        dp = new DirectorPanel(f.factoryPanel(DirectorPanel.getPanel1(), "EmpleadoFijo"));
       
        
    }
    
    
      public void construir(){
        super.agregarCaracteristica(super.idioma.getProperty("tipoempleado"),6);
        super.agregarCaracteristica(super.idioma.getProperty("agregar"),3);
     
        ComboBox t = (ComboBox) super.getComponent(0);
        t.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch(t.getSelectedIndex()){
                    case 0 : dp.cambiarPanel(f.factoryPanel(DirectorPanel.getPanel1(), "EmpleadoFijo"));
                    break;
                    case 1 : dp.cambiarPanel(f.factoryPanel(DirectorPanel.getPanel1(), "EmpleadoNominal"));
                    break;
                }              
            }
        }) ;
        
        Button b = (Button) super.getComponent(1);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FactoryGeneralRRHH hr = new FactoryRRHH();
                DirectorRRHH rs;
                switch(t.getSelectedIndex()){
                    case 0 :  rs = new DirectorRRHH(hr.TipoTrabajador("Formal"));
                rs.Insertar(dp.getDatos());
                    break;
                    case 1 : rs = new DirectorRRHH(hr.TipoTrabajador("Informal"));
                rs.Insertar(dp.getDatos());
                    break;
                }
                
                //System.out.println("boton RRR"  + t.getSelectedIndex());
                //System.out.println(dp.getDatos());
                    
            }
        });
        super.dibujar();
    }
      
      public void agregarDirector(){
          
      }
    
}
