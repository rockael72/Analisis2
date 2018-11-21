/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pagos;

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
public class EntityFijos implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int NumeroDePago;
    private float MontoAPagar;
    private String TipoDePago;
    private String Cliente;
    private String FechaInicial;
    private String ProximoPago;
    private int CantidadDePagos;
    private float MontoTotal;
    private String Descripcion;
    public void setNumeroDePago(int NumeroDePago) {
        this.NumeroDePago = NumeroDePago;
    }

    public void setMontoAPagar(float MontoAPagar) {
        this.MontoAPagar = MontoAPagar;
    }

    public void setTipoDePago(String TipoDePago) {
        this.TipoDePago = TipoDePago;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public void setFechaInicial(String FechaInicial) {
        this.FechaInicial = FechaInicial;
    }

    public void setProximoPago(String ProximoPago) {
        this.ProximoPago = ProximoPago;
    }

    public void setCantidadDePagos(int CantidadDePagos) {
        this.CantidadDePagos = CantidadDePagos;
    }


    public void setMontoTotal(float MontoTotal) {
        this.MontoTotal = MontoTotal;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getNumeroDePago() {
        return NumeroDePago;
    }

    public float getMontoAPagar() {
        return MontoAPagar;
    }

    public String getTipoDePago() {
        return TipoDePago;
    }

    public String getCliente() {
        return Cliente;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public String getFechaInicial() {
        return FechaInicial;
    }

    public String getProximoPago() {
        return ProximoPago;
    }

    public int getCantidadDePagos() {
        return CantidadDePagos;
    }


    public float getMontoTotal() {
        return MontoTotal;
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
        if (!(object instanceof EntityFijos)) {
            return false;
        }
        EntityFijos other = (EntityFijos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modulos.Pagos.EntityFijos[ id=" + id + " ]";
    }
    
}
