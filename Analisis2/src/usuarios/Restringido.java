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
public class Restringido extends PermisoConcreto{
       public boolean getEscritura(){
        return false;
    }
}
