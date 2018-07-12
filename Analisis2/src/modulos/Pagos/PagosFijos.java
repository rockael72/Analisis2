/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulos.Pagos;
import javax.persistence.EntityManager;
    import javax.persistence.EntityManagerFactory;
    import javax.persistence.Persistence;
import conexion.Conexion;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class PagosFijos extends ContructorPagos{
    
  //              Conexion C = new Conexion();
            
            
    public PagosFijos() {
    }
        public void MostrarTipoYLista(ArrayList<Object> Cosas){
             System.out.println("Soy un pago fijo");
            int n = 0;
            while (n<Cosas.size())
            {
               
                System.err.println(Cosas.get(n));
                n++;
            }
        }
        
        public void Insertar(ArrayList<Object> parametros){
    //        C.CrearConexion();
            EntityFijosJpaController pc = new EntityFijosJpaController(Conexion.getConexion());
         //   EntityManager em = C.getConex().createEntityManager();
            EntityFijos PFijo = new EntityFijos();
            
            int n=0;
            PFijo.setId(0l);
            PFijo.setNumeroDePago(Integer.parseInt((String)parametros.get(n)));
            n++;
            PFijo.setMontoAPagar(Float.parseFloat((String) parametros.get(n)));
            n++;
            PFijo.setTipoDePago((String)parametros.get(n));
            n++;
            PFijo.setCliente((String)parametros.get(n));
            n++;
            PFijo.setFechaInicial((String)parametros.get(n));
            n++;
            PFijo.setProximoPago((String)parametros.get(n));
            n++;
            PFijo.setCantidadDePagos(Integer.parseInt((String)parametros.get(n)));
            n++;
            PFijo.setMontoTotal(Float.parseFloat((String)parametros.get(n)));
            n++;
            PFijo.setDescripcion((String)parametros.get(n));
            pc.create(PFijo);
          //  Conexion.CrearConexion();
            
           // pc.create(PFijo);
           // em.getTransaction().begin();
            //em.persist(PFijo);
           // em.getTransaction().commit();
          //  em.close();
                        System.out.println("modulos.Pagos.PagosFijos.Insertar(), insersiion lista ");
        }
        
    
}
