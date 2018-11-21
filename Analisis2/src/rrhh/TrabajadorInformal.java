/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RRHH;

import conexion.Conexion;
import java.util.ArrayList;
import Pagos.EntityFijos;
import Pagos.EntityFijosJpaController;

/**
 *
 * @author USUARIO
 */
public class TrabajadorInformal extends ConstructorRRHH{

    //Conexion C = new Conexion();
    public TrabajadorInformal() {
        
    }
    
    public void imprimirTipo(){
        System.out.println("RRHH.TrabajadorInformal.<init>()");
    }
    public void Insertar (ArrayList<Object> Lista)
    {
        
//          C.CrearConexion();
//            EntityFijosJpaController pc = new EntityFijosJpaController(C.getConex());
//         //   EntityManager em = C.getConex().createEntityManager();
//            EntityFijos PFijo = new EntityFijos();
      //  C.CrearConexion();
        EntityInformalJpaController pc = new EntityInformalJpaController(Conexion.getConexion());
        EntityInformal Informal = new EntityInformal();
         System.out.println("RRHH.TrabajadorInformal.<init>()");
        int n = 0;
        //id, nombre, PAga, Telefono, TiempoEstimado, FechaInicio
        Informal.setId(0l);
        Informal.setNombre((String)Lista.get(n));
        n++;
        Informal.setPaga(Float.parseFloat((String)Lista.get(n)));
        n++;
        Informal.setTelefono((String)Lista.get(n));
        n++;
        Informal.setTiempoEstimado((String)Lista.get(n));
        n++;
        Informal.setFechaDeInicio((String)Lista.get(n));
        n++;
        Informal.setDescripcion((String)Lista.get(n));
        pc.create(Informal);
    }
}
