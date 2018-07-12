/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RRHH;

import conexion.Conexion;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class TrabajodorFormal extends ConstructorRRHH{

  //  Conexion C = new Conexion();
    public TrabajodorFormal() {
        
    }
    public void imprimirTipo(){
        System.out.println("RRHH.TrabajodorFormal.<init>()");
    }
    public void Insertar(ArrayList<Object> Lista)
    {
        //Id,Nombre,  Edad,Telefono, Puesto, Salario, Jornada, Descripcion
    //    C.CrearConexion();
        EntityFormalJpaController pc = new EntityFormalJpaController(Conexion.getConexion());
        EntityFormal PFormal = new EntityFormal();
        int n = 0;
        
        PFormal.setId(0l);
        PFormal.setNombre((String)Lista.get(n));
        n++;
        PFormal.setEdad((String)Lista.get(n));
        n++;
        PFormal.setTelefono((String)Lista.get(n));
        n++;
        PFormal.setPuesto((String)Lista.get(n));
        n++;
        PFormal.setSalario(Float.parseFloat((String)Lista.get(n)));
        n++;
        PFormal.setJornada((String)Lista.get(n));
        n++;
        PFormal.setDescripcion((String)Lista.get(n));
        pc.create(PFormal);
    }
}
