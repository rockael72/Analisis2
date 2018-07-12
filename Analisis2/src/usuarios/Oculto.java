/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

/**
 *
 * @author rocka
 */
public class Oculto extends PermisoConcreto {

    public boolean getLectura() {
        return false;
    }

    public boolean getEscritura() {
        return false;
    }

    public boolean getVisible() {
        return false;
    }
}
