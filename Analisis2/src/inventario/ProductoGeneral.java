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
public abstract class ProductoGeneral{
    public void agregar(String Nombre) {
            System.out.println("Agregado: " + Nombre);
    }

    public void Costo(float valor) {
            System.out.println("Precio: " + valor);
    }

    public void Cantidad(int Cantidad) {
        System.out.println("Cantidad: "+ Cantidad);
    }
}
