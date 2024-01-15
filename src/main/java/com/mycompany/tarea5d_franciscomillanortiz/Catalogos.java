/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea5d_franciscomillanortiz;

/**
 *
 * @author francisco
 */
public class Catalogos {
    private String titulo;
    private String director;
    private String categoria;
    private int notaCritica;
    private int duracionMinutos;

    public Catalogos(String titulo, String director, String categoria, int notaCritica, int duracionMinutos) {
        this.titulo = titulo;
        this.director = director;
        this.categoria = categoria;
        this.notaCritica = notaCritica;
        this.duracionMinutos = duracionMinutos;
    }

    public Catalogos() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getNotaCritica() {
        return notaCritica;
    }

    public void setNotaCritica(int notaCritica) {
        this.notaCritica = notaCritica;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Catalogos{");
        sb.append("titulo=").append(titulo);
        sb.append(", director=").append(director);
        sb.append(", categoria=").append(categoria);
        sb.append(", notaCritica=").append(notaCritica);
        sb.append(", duracionMinutos=").append(duracionMinutos);
        sb.append('}');
        return sb.toString();
    }
    
    
}
