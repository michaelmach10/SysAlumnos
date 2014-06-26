/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sys.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Michael David
 */
public class Usuario {
    private int id;
    private String user;
    private String clave;

    public Usuario(String user, String clave) {
        this.user = user;
        this.clave = clave;
    }
    
    public Usuario(){}
    
    public String getUsuario() {
        return user;
    }

    public void setUsuario(String user) {
        this.user = user;
    }
    
    public int getId() {
        return id;
    }

    public void setIdUsuario(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    public static Usuario loadUsuario(ResultSet rs) throws SQLException{
		Usuario usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt("id"));
		usuario.setUsuario(rs.getString("user"));
		usuario.setClave(rs.getString("clave"));
		return usuario;
    }
    
}



