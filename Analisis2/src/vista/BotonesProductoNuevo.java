/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Compras.DirectorCompras;
import Compras.FactoryCompras;
import Compras.FactoryComprasConcreto;
import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import Pagos.DirectorPagos;
import Pagos.FactoryGeneral;
import Pagos.FactoryPagos;

/**
 *
 * @author rocka
 */
public class BotonesProductoNuevo extends PanelConstructor{
    private DirectorPanel dp;
    private Factory f;
    
    public BotonesProductoNuevo(JPanel panel) {
        super(panel);
        f = new FactoryPanel();
        dp = new DirectorPanel(f.factoryPanel(DirectorPanel.getPanel1(), "ProductoPedecedero"));
       
        
    }
    
    
      public void construir(){
        super.agregarCaracteristica("Tipo",4);
        super.agregarCaracteristica("Agregar",3);
     
        ComboBox t = (ComboBox) super.getComponent(0);
        t.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch(t.getSelectedIndex()){
                    case 0 : dp.cambiarPanel(f.factoryPanel(DirectorPanel.getPanel1(), "ProductoPedecedero"));
                    break;
                    case 1 : dp.cambiarPanel(f.factoryPanel(DirectorPanel.getPanel1(), "ProductoNoPedecedero"));
                    break;
                }              
            }
        }) ;
        
        Button b = (Button) super.getComponent(1);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FactoryCompras hr = new FactoryComprasConcreto();
                DirectorCompras rs;
                switch(t.getSelectedIndex()){
                    case 0 :  rs = new DirectorCompras(hr.crearCompra("Perecedero"),dp.getDatos());
                    
                    break;
                    case 1 :  rs = new DirectorCompras(hr.crearCompra("NoPerecedero"),dp.getDatos());                    
                    break;
                }  
               
                    
            }
        });
        super.dibujar();
    }
      
      public void agregarDirector(){
          
      }
    
}
