/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sys.modelo;

import com.mxrck.autocompleter.TextAutoCompleter;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sys.config.Conexion;

/**
 *
 * @author micha_000
 */
public class AlumnoDAO {
    int res;
    Connection cx;
    Statement st;
    ResultSet rs;
    String sql;
    //TextAutoCompleter al;
    
           
    /*void listarAlumnos(){
        sql="SELECT * FROM Alumno";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                al.addItem(rs.getString("nombres")+" "+rs.getString("apellidos"));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
    }*/
    public ArrayList<Alumno> listarAlumno(){
        ArrayList<Alumno> lista = new ArrayList();
        sql = "select * from alumno";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                lista.add(Alumno.loadAlumno(rs));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
        return lista;
    }
    
}