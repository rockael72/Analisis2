/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import conexion.Conexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import orm.OrmUsuario;
import orm.OrmUsuarioJpaController;

/**
 *
 * @author rocka
 */
public class BotonesUsuarioNuevo extends PanelConstructor{
    private DirectorPanel dp;
    private Factory f;
    
    public BotonesUsuarioNuevo(JPanel panel) {
        super(panel);
        f = new FactoryPanel();
        dp = new DirectorPanel(f.factoryPanel(DirectorPanel.getPanel1(), "Usuario"));
       
        
    }
    
    
      public void construir(){
        super.agregarCaracteristica("Agregar",3);
     
      
        Button b = (Button) super.getComponent(0);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                System.out.println(dp.getDatos() +"  usr");
                
                OrmUsuario usr = new OrmUsuario();
        usr.setId(0L);
        usr.setUsuario((String)dp.getDatos().get(0));
        usr.setContrasenia((String)dp.getDatos().get(1));
        OrmUsuarioJpaController usrJpa = new OrmUsuarioJpaController(Conexion.getConexion());
        usrJpa.create(usr);
                    
            }
        });
        super.dibujar();
    }
      
      public void agregarDirector(){
          
      }
       
}
