/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulos.Pagos;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class DirectorPagos {

    private ContructorPagos Pagos; 
    
    public DirectorPagos(ContructorPagos p, ArrayList<Object> parametros) {
        p.MostrarTipoYLista(parametros);
    }
    public void Insertar(ContructorPagos p, ArrayList<Object> parametros){
        p.Insertar(parametros);
    }
    public ArrayList<Object> Mostrar(ContructorPagos p, ArrayList<Object> parametros)
    {
        return p.Mostrar(parametros);
        
    }
    public ArrayList<Object>  Buscar (ContructorPagos p, ArrayList<Object> parametros)
    {
        return p.Buscar(parametros);
        
    }
    
}
