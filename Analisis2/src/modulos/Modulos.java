/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulos;
import Compras.DirectorCompras;
import Compras.FactoryComprasConcreto;
import conexion.Conexion;
import inventario.DirectorInventario;
import inventario.FabricaInventario;
import inventario.FactoryInventarioConcreto;

import java.util.ArrayList;
import Compras.FactoryCompras;

/**
 *
 * @author anayo
 */
public class Modulos {

    /**
     * @param args the co
     * +7m******8mand line arguments
     */
    public static void main(String[] args) {
        //Producto nuevo = FabricaProductos.crearProducto("perecedero");
        FactoryCompras fc = new FactoryComprasConcreto();
        ArrayList<Object> lista = new ArrayList();
        lista.add("10");
        lista.add("AvenaQ");
        lista.add("Quacker");
        lista.add(40);
        lista.add("29/08/2018");
        lista.add("15");
        lista.add("Avena Molida 1 lb");
        DirectorCompras dc = new DirectorCompras(fc.crearCompra("Perecedero"), lista);
//        
        FabricaInventario fi = new FactoryInventarioConcreto();
        DirectorInventario di = new DirectorInventario(fi.buscarProducto("perecedero"), "pizza");
        
    }

    
}
