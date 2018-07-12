/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author anayo
 */
public class DirectorInventario {
    private ProductoConstructor p;

    public DirectorInventario(ProductoConstructor p, String dato) {
       this.p = p;
       System.out.println("Director");
       ArrayList<List<String>> resultados = p.Buscar(dato);
       for(int a=0; a< resultados.size(); a++){
           for(int b=0; b<resultados.get(a).size(); b++){
               System.out.println("-> "+resultados.get(a).get(b));
           }
       }
      
    }
}
