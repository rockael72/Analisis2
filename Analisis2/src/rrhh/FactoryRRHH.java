/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RRHH;

/**
 *
 * @author USUARIO
 */
public class FactoryRRHH implements FactoryGeneralRRHH{

    public FactoryRRHH() {
    }
    

    @Override
    public ConstructorRRHH TipoTrabajador(String Tipo) {
        switch(Tipo){
            case "Formal":
                return new TrabajodorFormal();
                case "Informal":
                        return new TrabajadorInformal();
                        default: 
                            return null;
        }
    }
    
}
