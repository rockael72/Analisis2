/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

/**
 *
 * @author USUARIO
 */
public class NoProductoPedecedero extends ProductoGeneral implements Producto{

    public NoProductoPedecedero() {
        System.out.println("Yo no lo soy");
    }

    @Override
    public void Costo(float Costo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
