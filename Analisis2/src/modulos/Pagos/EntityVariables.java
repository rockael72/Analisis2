/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulos.Pagos;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author USUARIO
 */
@Entity

public class EntityVariables implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int NumeroDePago;
    private String FechaDelPago;
    private String Cliente;
    private float MontoAPagar;
    private String Descripcion;
//id, NumeroDepAgos,FechaDelPago, Cliente, MontAPAgar, 

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    public void setNumeroDePago(int NumeroDePago) {
        this.NumeroDePago = NumeroDePago;
    }

    public void setFechaDelPago(String FechaDelPago) {
        this.FechaDelPago = FechaDelPago;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public void setMontoAPagar(float MontoAPagar) {
        this.MontoAPagar = MontoAPagar;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getNumeroDePago() {
        return NumeroDePago;
    }

    public String getFechaDelPago() {
        return FechaDelPago;
    }

    public String getCliente() {
        return Cliente;
    }

    public float getMontoAPagar() {
        return MontoAPagar;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntityVariables)) {
            return false;
        }
        EntityVariables other = (EntityVariables) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modulos.Pagos.EntityVariables[ id=" + id + " ]";
    }
    
}
