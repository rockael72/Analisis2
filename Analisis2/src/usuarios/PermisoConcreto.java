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
public abstract class PermisoConcreto implements Permiso {

    public boolean getLectura() {
        return true;
    }

    public boolean getEscritura() {
        return true;
    }

    public boolean getVisible() {
        return true;
    }
}
