/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionlibreria;

/**
 *
 * @author Fernanda
 */
public class libros {
    int Id;
    String Titulo;
    String Descripcion;
    int Unidades_disponibles;

    public libros() {
        this.Id = 0;
        this.Titulo = "";
        this.Descripcion = "";
        this.Unidades_disponibles = 0;
    }
    
    
    

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.Descripcion = descripcion;
    }

    public int getUnidades_disponibles() {
        return Unidades_disponibles;
    }

    public void setUnidades_disponibles(int unidades_disponibles) {
        this.Unidades_disponibles = unidades_disponibles;
    }
    
    
    
}
