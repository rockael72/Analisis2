/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

/**
 *
 * @author rocka
 */
public class Usuario {
    private String usuario;
    private String pss;
    private Privilegio privilegio;
    private boolean permiso;
    
    public Usuario(){
    
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPss() { 
        return pss;
    }

    public void setPss(String pss) {
        this.pss = pss;
    }

    public boolean getPrivilegio() {
        return privilegio.privilegio();
    }

    public void setPrivilegio(Privilegio privilegio) {
        this.privilegio = privilegio;
    }
    
    
   
    
    
}
