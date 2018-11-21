/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JPanel;

/**
 *
 * @author rocka
 */
public class FactoryPanel implements Factory {

    @Override
    public PanelConstructor factoryPanel(JPanel panel1, String nombre) {
        switch(nombre){
            case "Usuario": return new DatosUsuario(panel1);
            case "ProductoPedecedero": return new DatosProductoPerecedero(panel1);
            case "ProductoNoPedecedero": return new DatosProductoNoPerecedero(panel1);
            case "EmpleadoFijo": return new DatosEmpleadoFijo(panel1);
            case "EmpleadoNominal": return new DatosEmpleadoNominal(panel1);
            case "BotonProductoNuevo": return new BotonesProductoNuevo(panel1);
            case "BotonProductoConsulta": return new BotonesProductoConsulta(panel1);
            case "BotonInventarioConsulta": return new BotonesInventarioConsulta(panel1);
            case "BotonRRHHNuevo": return new BotonesRRHHNuevo(panel1);
            case "BotonRRHHConsulta": return new BotonesRRHHConsulta(panel1);
             case "BotonUsuarioNuevo": return new BotonesUsuarioNuevo(panel1);
             case "BotonUsuarioConsulta": return new BotonesUsuarioConsulta(panel1);
             case "BotonPermisoNuevo": return new BotonesPermisosNuevo(panel1);
             case "BotonPagoNuevo": return new BotonesPagosNuevo2(panel1);
             case "Fijo": return new DatosPagosFijos(panel1);
             case "Variable": return new DatosPagoVariable(panel1);
            case "Consulta": return new Consulta(panel1);
            
            default: return null;
        }
    }
    
}
