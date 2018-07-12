/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Component;
import java.util.ArrayList;

/**
 *
 * @author rocka
 */
public class IteradorPassword {
    private ArrayList<Label> label ;
   // private ArrayList<Component> passwordBox;
    private ArrayList<Object> passwordBox;
    private ArrayList<Integer> posicionY;
    private int i ;
    private int x;
    private int y;
            
    
    public IteradorPassword(){
        
        this.label= new ArrayList<Label>();
        this.passwordBox = new ArrayList<Object>();
        this.posicionY=new ArrayList<Integer>();
        this.i=-1;
        this.x= 40;
        this.y= 20;
    }
    
    private Component getComponent(int opcion){
        switch(opcion){
            case 0: return new TextBox();
            
            case 1: return new TextArea();
            
            case 2: return new PasswordBox();
            
            case 3: return new Button("Aceptar");
            
            case 4: return new ComboBoxCompra();
                                    
            case 5: return new Tabla();
            
            case 6: return new ComboBoxEmpleado();
            
            case 7: return new ComboBoxPermiso();
            
            case 8: return new ComboBoxModulo();
            
            case 9: return new ComboBoxPagos();
            
            default: return null;
        }
    }
    
    public void setCaracteristica(String nombre, int opcion){
        Label l = new Label(nombre);
        Component tb = this.getComponent(opcion);                        
        if(this.posicionY.isEmpty()){
            l.setLocation(this.x,this.y);
            tb.setLocation(this.x+100,this.y);      
            this.posicionY.add(this.y);
        }else{
            int yTemporal = this.posicionY.get(this.posicionY.size()-1)+30;
            l.setLocation(this.x,yTemporal);
            tb.setLocation(this.x+100,yTemporal);  
            this.posicionY.add(yTemporal);
        }
        this.label.add(l);
        this.passwordBox.add(tb);
    }
    
    public Label getLabel(){
        this.i++;
        return this.label.get(i);
        
    }
    
    public Component getComboBox(){
        return (Component)this.passwordBox.get(i);
    }
    
    public int size(){
        return this.passwordBox.size();
    }
    
    public Component getComponente(int pos){
        return (Component)this.passwordBox.get(pos);
    }
    
      public Component getComponente2(int pos){
        return (Component)this.label.get(pos);
    }
    
    public ArrayList<Object> getDatos(){
        ArrayList<Object> temporal = new ArrayList<Object>();
        Texto texto;
        for(int i=0;i<this.passwordBox.size();i++){
            texto = (Texto) this.passwordBox.get(i);
            temporal.add(texto.getText());           
        }
        return temporal;
    }
}
