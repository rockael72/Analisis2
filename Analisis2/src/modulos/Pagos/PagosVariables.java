/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulos.Pagos;

import conexion.Conexion;
import static java.awt.PageAttributes.MediaType.C;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class PagosVariables extends ContructorPagos{

//     Conexion C = new Conexion();
    
    public PagosVariables() {
    }
    
        public void MostrarTipoYLista(ArrayList<Object> Cosas){
            System.out.println("Soy un pago variable");
            int n = 0;
            while (n<Cosas.size())
            {
                System.err.println(Cosas.get(n));
                n++;
            }
        }
    public void Insertar(ArrayList<Object> parametros){
  //      C.CrearConexion();
        EntityVariablesJpaController pc = new EntityVariablesJpaController(Conexion.getConexion());
        EntityVariables PVariables = new EntityVariables();
        //id, NumeroDepAgos,FechaDelPago, Cliente, MontAPAgar, Descripcion
        
        int n=0;
        PVariables.setId(0l);
        PVariables.setNumeroDePago(Integer.parseInt((String)parametros.get(n)));
        n++;
        PVariables.setFechaDelPago((String)parametros.get(n));
        n++;
        PVariables.setCliente((String)parametros.get(n));
        n++;
        PVariables.setMontoAPagar(Float.parseFloat((String)parametros.get(n)));
        n++;
        PVariables.setDescripcion((String)parametros.get(n));
        pc.create(PVariables);
        System.out.println("modulos.Pagos.PagosVariables.Insertar()");
            
    }
}
