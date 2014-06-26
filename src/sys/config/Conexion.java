/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sys.config;

import java.sql.*;
/**
 *
 * @author Michael
 */
public class Conexion {
    public static com.mysql.jdbc.Connection GetConexion() throws ClassNotFoundException, SQLException{
        com.mysql.jdbc.Connection conex = null;
        
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost/bd_alumnos";
        String usuario="root";
        String pass="";
        conex = (com.mysql.jdbc.Connection) DriverManager.getConnection(url, usuario, pass);
        
        return conex;
    }
}
