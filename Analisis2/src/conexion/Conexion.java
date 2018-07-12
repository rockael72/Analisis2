/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author rocka
 */
public class Conexion {
    private static EntityManagerFactory emf;
        
    private Conexion(){
        
    }
    
    public static void crearConexion(){
        if(emf==null){
            emf = Persistence.createEntityManagerFactory("ProyectoPU");        
        }
    }
    
    public static EntityManagerFactory getConexion(){
        return emf;         
    }
}
