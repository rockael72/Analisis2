/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;


/**
 *
 * @author anayo
 */
public class FactoryInventarioConcreto extends FabricaInventario{
     @Override
     public ProductoConstructor buscarProducto(String tipo){
        switch(tipo){
            case ("perecedero"):
                return new Perecedero();
            case ("NoPerecedero"):
                return new NoPerecedero();
            default:
                return null;
        }
        
    }
}

