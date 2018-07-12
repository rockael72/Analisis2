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
public class CreadorProducto implements Fatory{

    public CreadorProducto() {
    }
    
    
    public Producto CrearProducto(String tipo) {
        
        
        switch (tipo){
            case "Pedecedero":
                return new ProductoPedecedero();
            case "No Pedecedero":
                return new NoProductoPedecedero();
        }
        return null;
    }
    
}
