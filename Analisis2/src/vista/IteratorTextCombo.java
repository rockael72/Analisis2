/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author rocka
 */
public class IteratorTextCombo {
    private ArrayList<Label> label ;
    private ArrayList<TextBox> textBox;
    private ArrayList<Integer> posicionY;
    private int i ;
    private int x;
    private int y;
            
    
    public IteratorTextCombo(){
        
        this.label= new ArrayList<Label>();
        this.textBox = new ArrayList<TextBox>();
        this.posicionY=new ArrayList<Integer>();
        this.i=-1;
        this.x= 40;
        this.y= 20;
    }
    
    
    public void setCaracteristica(String nombre){
        Label l = new Label(nombre);
        TextBox tb= new TextBox();
        if(this.posicionY.isEmpty()){
            l.setLocation(this.x,this.y);
            tb.setLocation(this.x+120,this.y);      
            this.posicionY.add(this.y);
        }else{
            int yTemporal = this.posicionY.get(this.posicionY.size()-1)+30;
            l.setLocation(this.x,yTemporal);
            tb.setLocation(this.x+120,yTemporal);  
            this.posicionY.add(yTemporal);
        }
        this.label.add(l);
        this.textBox.add(tb);
    }
    
    public Label getLabel(){
        this.i++;
        return this.label.get(i);
        
    }
    
    public TextBox getComboBox(){
        return this.textBox.get(i);
    }
    
    public int size(){
        return this.textBox.size();
    }
}
