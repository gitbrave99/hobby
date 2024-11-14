package org.partial.otrocine.modelo;

import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;


public class Pelicula {
    private Integer idPelicula;
    private String nombre;
    private String sinopsis;

    public Pelicula() {

    }

    public Pelicula(String nombre, String sinopsis) {
        this.nombre = nombre;
        this.sinopsis = sinopsis;
    }

    public Pelicula(Integer idPelicula, String nombre, String sinopsis) {
        this.idPelicula = idPelicula;
        this.nombre = nombre;
        this.sinopsis = sinopsis;
    }

    public Integer getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Integer idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
}
