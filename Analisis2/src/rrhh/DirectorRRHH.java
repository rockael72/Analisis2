        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RRHH;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class DirectorRRHH {
    ConstructorRRHH RRHH;

    public DirectorRRHH(ConstructorRRHH RH) {
        RH.imprimirTipo();
        RRHH= RH;
    }
    public void Insertar (ArrayList<Object> Lista ){
        RRHH.Insertar(Lista);
    }
    
    
}
