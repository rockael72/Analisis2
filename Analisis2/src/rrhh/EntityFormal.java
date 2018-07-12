/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RRHH;

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
public class EntityFormal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Nombre;
    private String Edad;
    private String Telefono;
    private String Puesto;
    private Float Salario;
    private String Jornada;
    private String Descripcion;
    //Id,Nombre,  Edad,Telefono, Puesto, Salario, Jornada, Descripcion

    public String getTelefono() {
        return Telefono;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getJornada() {
        return Jornada;
    }

    public void setJornada(String Jornada) {
        this.Jornada = Jornada;
    }
    
    
    public String getNombre() {
        return Nombre;
    }

    public String getEdad() {
        return Edad;
    }

    public String getPuesto() {
        return Puesto;
    }

    public Float getSalario() {
        return Salario;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    public void setSalario(Float Salario) {
        this.Salario = Salario;
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
        if (!(object instanceof EntityFormal)) {
            return false;
        }
        EntityFormal other = (EntityFormal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RRHH.EntityFormal[ id=" + id + " ]";
    }
    
}
