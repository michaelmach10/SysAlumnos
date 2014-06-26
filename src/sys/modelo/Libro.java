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
public class Libro {
    private int id;
    private String titulo;
    private int autor_id;
    private String anio;
    private int editorial_id;
    private int tema_id;

    public Libro(String titulo, int autor_id, String anio, int editorial_id, int tema_id) {
        this.titulo = titulo;
        this.autor_id = autor_id;
        this.anio = anio;
        this.editorial_id = editorial_id;
        this.tema_id = tema_id;
    }

    public Libro() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAutor_id() {
        return autor_id;
    }

    public void setAutor_id(int autor_id) {
        this.autor_id = autor_id;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public int getEditorial_id() {
        return editorial_id;
    }

    public void setEditorial_id(int editorial_id) {
        this.editorial_id = editorial_id;
    }

    public int getTema_id() {
        return tema_id;
    }

    public void setTema_id(int tema_id) {
        this.tema_id = tema_id;
    }
    
    public static Libro loadLibro(ResultSet rs) throws SQLException{
		Libro libro = new Libro();
                libro.setId(rs.getInt("id"));
		libro.setTitulo(rs.getString("titulo"));
                libro.setAutor_id(rs.getInt("autor_id"));
                libro.setAnio(rs.getString("anio"));
                libro.setEditorial_id(rs.getInt("editorial_id"));
                libro.setTema_id(rs.getInt("tema_id"));
                
		return libro;
    }
}
