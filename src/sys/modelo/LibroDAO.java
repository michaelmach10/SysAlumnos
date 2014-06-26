/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sys.modelo;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sys.config.Conexion;

/**
 *
 * @author micha_000
 */
public class LibroDAO {
    int res;
    Connection cx;
    Statement st;
    ResultSet rs;
    String sql;
    
    public ArrayList<Libro> listarLibro(int id){
        ArrayList<Libro> lista = new ArrayList();
        sql = "select * from Libro WHERE id="+id;
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            lista.add(Libro.loadLibro(rs));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
        return lista;
    }
}
