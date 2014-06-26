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
 * @author micha_000
 */
public class Alumno {
    private int id;
    private String nombres;
    private String apellidos;
    private int mencion_id;
    private String proyecto;
    private int fase_id;
    private String direccion;
    private String correo;
    private String telefono;

    public Alumno(String nombres, String apellidos, int mencion_id, String proyecto, int fase_id, String direccion, String correo, String telefono) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.mencion_id = mencion_id;
        this.proyecto = proyecto;
        this.fase_id = fase_id;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Alumno() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getMencion_id() {
        return mencion_id;
    }

    public void setMencion_id(int mencion_id) {
        this.mencion_id = mencion_id;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public int getFase_id() {
        return fase_id;
    }

    public void setFase_id(int fase_id) {
        this.fase_id = fase_id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public static Alumno loadAlumno(ResultSet rs) throws SQLException{
		Alumno alumno = new Alumno();
                alumno.setId(rs.getInt("id"));
		alumno.setNombres(rs.getString("nombres"));
                alumno.setApellidos(rs.getString("apellidos"));
                alumno.setMencion_id(rs.getInt("mencion_id"));
                alumno.setProyecto(rs.getString("proyecto"));
                alumno.setFase_id(rs.getInt("fase_id"));
                alumno.setDireccion(rs.getString("direccion"));
                alumno.setCorreo(rs.getString("correo"));
                alumno.setTelefono(rs.getString("telefono"));
                
		return alumno;
    }
}
