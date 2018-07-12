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
public class Inventario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Tipo = "Pedecedero";
        Fatory Nuevo = new CreadorProducto();
        Producto p = Nuevo.CrearProducto(Tipo);
        p.agregar("Leche");
        p.Cantidad(10);
        p.Costo((float) 11.50);
       
        
        
    }
    
}
