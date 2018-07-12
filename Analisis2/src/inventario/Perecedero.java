/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;
import conexion.Conexion;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import orm.OrmProducto;
import orm.OrmProductoJpaController;


/**
 *
 * @author anayo
 */
public class Perecedero extends ProductoConstructor{

    public Perecedero() {
    }
    
    @Override
    public ArrayList<List <String> > Buscar(String nombre){
        ArrayList<List <String> > datosProductos = new ArrayList();
        Conexion.crearConexion();
        EntityManager em = Conexion.getConexion().createEntityManager();
        OrmProductoJpaController bp = new OrmProductoJpaController(Conexion.getConexion());
        List<OrmProducto> encontrados = bp.findProducto(nombre);
        
//        List listaStock = new ArrayList();
//        for (Object o : encontrados) {
//            OrmProducto s = (OrmProducto) o;
//            System.out.print(s.toString());
//            listaStock.add(s);
//        }
        int n =0;
        while(n < encontrados.size()){
            List<String> producto = new ArrayList();
                producto.add(encontrados.get(n).getCodigo());
                producto.add(encontrados.get(n).getNombre());
                producto.add(encontrados.get(n).getMarca());
                producto.add(encontrados.get(n).getExistencia());
                producto.add(encontrados.get(n).getFecha());
                producto.add(encontrados.get(n).getDescripcion());
                System.out.println("Datos: "+producto.get(0)+","+producto.get(1)+","+producto.get(2));
                datosProductos.add(producto);
                producto.clear();
                
            }     
        return datosProductos;
    }
}
