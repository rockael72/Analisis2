/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compras;

/**
 *
 * @author anayo
 */
public class FactoryComprasConcreto implements FactoryCompras{

    @Override
    public ProductoConstructor crearCompra(String tipo) {
         switch(tipo){
            case ("Perecedero"):
                return new Perecedero();
            case ("NoPerecedero"):
                return new NoPerecedero();
            default:
                return null;
        }
    }
    
}
