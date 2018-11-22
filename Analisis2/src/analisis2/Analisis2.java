/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisis2;

import conexion.Conexion;
import java.awt.Color;
import javax.swing.UIManager;
import proyecto.Login;
import idioma.Idioma;
import proyecto.Proyecto;

/**
 *
 * @author rocka
 */
public class Analisis2 {

    /**
     * @param args the command line arguments
     */
    
    public static Idioma idioma;
    public static void main(String[] args) {
        // TODO code application logic here
       // Conexion.crearConexion();
        
        
        
        idioma= new Idioma("Ingles");
        UIManager.put("nimbusBase", new Color(51, 98, 140));// sombras menu
        UIManager.put("nimbusBlueGrey", new Color(214, 217, 223)); // barras de menu
        UIManager.put("control", new Color(230, 233, 236));//(237,238,240)); // frame
        // 247,248,250

        // "Nimbus"
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }
        Login l = new Login();
        l.setTitle(idioma.getProperty("login"));
        l.setLocationRelativeTo(null);
        l.show();

    }

}

