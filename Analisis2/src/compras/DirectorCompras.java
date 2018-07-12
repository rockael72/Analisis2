/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compras;

import java.util.ArrayList;

/**
 *
 * @author anayo
 */
public class DirectorCompras {
    private ProductoConstructor p;

    public DirectorCompras(ProductoConstructor p, ArrayList parametros) {
        this.p = p;
       p.InsertarDatos(parametros);
    }
}
