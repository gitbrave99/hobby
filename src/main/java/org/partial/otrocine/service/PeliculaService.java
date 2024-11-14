package org.partial.otrocine.service;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import org.partial.otrocine.dao.PeliculaDao;
import org.partial.otrocine.modelo.Pelicula;

import java.util.ArrayList;
import java.util.List;

@Named
@RequestScoped
public class PeliculaService {

    private List<Pelicula> peliculas;
    private PeliculaDao peliculaDao;
    private Pelicula pelicula=new Pelicula();

    @PostConstruct
    public void init() {
        this.peliculaDao = new PeliculaDao();
        //cars = new ArrayList<>();
        //cars.add(new Pelicula(1,"hulk","greeen man"));
        this.peliculas=this.peliculaDao.getMovies();
        //this.peliculas.forEach(pelicula -> System.out.println(pelicula.getNombre()));
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public void agregarPelicula() {
        System.out.println("agerando pelicul;a");
        int id=this.peliculaDao.getLastId();
        pelicula.setIdPelicula(id);
        this.peliculaDao.agregarCliente(pelicula);

    }
}
