/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compras;

import conexion.Conexion;
import java.util.ArrayList;
import orm.OrmProducto;
import orm.OrmProductoJpaController;

/**
 *
 * @author anayo
 */
public class NoPerecedero extends ProductoConstructor{

    public NoPerecedero() {
    }
    
    @Override
    public void InsertarDatos(ArrayList<Object> parametros){
       OrmProducto prod = new OrmProducto();
       prod.setId(0l);
        prod.setCodigo((String) parametros.get(0));
        prod.setNombre((String) parametros.get(1));
        prod.setMarca((String) parametros.get(2));
        prod.setExistencias(Integer.parseInt((String) parametros.get(3)));
        prod.setPrecio(Float.parseFloat((String) parametros.get(5)));
        prod.setDescripcion((String) parametros.get(6));
           
       OrmProductoJpaController prodJpa = new OrmProductoJpaController(Conexion.getConexion());
       prodJpa.create(prod);
    }
}
