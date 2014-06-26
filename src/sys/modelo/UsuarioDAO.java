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
 * @author Michael David
 */
public class UsuarioDAO {
    int res;
    Connection cx;
    Statement st;
    ResultSet rs;
    String sql;
    
    public int validarUsuario(String u, String c){
        sql="SELECT * FROM usuario WHERE user='"+u+"' AND clave='"+c+"'";
        try{
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            if(rs.next()){
                res=1;
            }else{
                res=0;
            }
        }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        return res;
    }
    
    public int verificarUsuario(String us){
        sql="SELECT * FROM usuarios WHERE user='"+us+"'";
        try{
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            if(rs.next()){
                res=1;
            }else{
                res=0;
            }
        }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        return res;
    }
    
    public int registrarUsuario(String user, String clave){
        sql="INSERT INTO Usuario VALUES(null,'"+user+"','"+clave+"')";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            res = st.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }         
    return res;
    }
    
    public ArrayList<Usuario> listarUsuario(){
        ArrayList<Usuario> lista = new ArrayList();
        sql = "select * from usuario";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                lista.add(Usuario.loadUsuario(rs));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
        return lista;
    }
    
    public int eliminarUsuario(int id){
        sql="DELETE FROM Usuario WHERE id='"+id+"'";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            res = st.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        } 
    return res;
    }
    
    public int modificarUsuario(int id, String user, String clave){
    sql="UPDATE Usuario set user='"+user+"', clave='"+clave+"' WHERE id='"+id+"'";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            res = st.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }  
    return res;
    }    
    
    public ArrayList<Usuario> listarUsuario(int id){
        ArrayList<Usuario> lista = new ArrayList();
        sql = "select * from Usuario WHERE id="+id;
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            lista.add(Usuario.loadUsuario(rs));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
        return lista;
    }
}