/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulos.Pagos;

/**
 *
 * @author USUARIO
 */
public class FactoryPagos implements FactoryGeneral{

    @Override
    public ContructorPagos crearPago(String Tipo) {
        switch (Tipo){
            case "Fijo":
                return new PagosFijos();
            case "Variable":
                return new PagosVariables();
                default:
                    return null;
        }
    }
    
    
}
