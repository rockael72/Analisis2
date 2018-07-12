/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Component;
import java.awt.PopupMenu;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author rocka
 */
public abstract class PanelConstructor {
    private IteradorPassword itc;
    private JPanel panel;
    
    public PanelConstructor(JPanel panel) {
       this.panel=panel;
        this.itc= new IteradorPassword();
    }
    
     public void construir(){
         
    }
     
   public void agregarCaracteristica(String nombre, int opcion){
       this.itc.setCaracteristica(nombre, opcion);
   }
    
     public void dibujar(){
         this.panel.removeAll();
         for(int i=0;i<this.itc.size();i++){
             this.panel.add(this.itc.getLabel());
             this.panel.add(this.itc.getComboBox());
         }
         this.panel.repaint();
     }
     
     public Component getComponent(int pos){
        return itc.getComponente(pos);
     }
     
     public Component getComponent2(int pos){
        return itc.getComponente(pos);
     }
    
     public ArrayList<Object> getDatos(){
         return this.itc.getDatos();
     }
 
}
