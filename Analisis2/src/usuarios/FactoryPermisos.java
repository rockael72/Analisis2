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
public class FactoryPermisos implements FabricaPermiso {

    @Override
    public Permiso generarPermiso(String permiso) {
        switch (permiso) {
            case "Administrador":
                return new Administrador();
            case "Restringido":
                return new Restringido();
            case "Oculto":
                return new Oculto();
            default:
                return null;
        }

    }

}
