/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author rocka
 */
public class DirectorPanel {
    private PanelConstructor fp;
    private static JPanel panel1;
    private static JPanel panel2;
    
    public DirectorPanel(PanelConstructor fp){
        this.fp=fp;
        fp.construir();
    }
    
    public DirectorPanel(){
        
    }
    
    public void cambiarPanel(PanelConstructor fp){
        
        this.fp=fp;
        fp.construir();
    }
    
    public Component getComponent(int pos){
        return this.fp.getComponent(pos);
    }
    
    public Component getComponent2(int pos){
        return this.fp.getComponent2(pos);
    }
    
    public static JPanel getPanel1(){
        return panel1;
    }
    
    public static void setPanel1(JPanel panel){
        panel1=panel;
    }
    
     public static JPanel getPanel2(){
        return panel2;
    }
    
    public static void setPanel2(JPanel panel){
        panel2=panel;
    }
    
    public ArrayList<Object> getDatos(){
        return this.fp.getDatos();
    }
            
}
