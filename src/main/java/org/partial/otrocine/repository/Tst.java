package org.partial.otrocine.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.partial.otrocine.dao.Conexion;
import org.partial.otrocine.dao.PeliculaDao;
import org.partial.otrocine.modelo.Pelicula;
import org.partial.otrocine.modelo.Test;

import java.util.ArrayList;

public class Tst {

    public static void main(String[] args) {
        PeliculaDao peliculaDao= new PeliculaDao();
        ArrayList<Pelicula> listProducto = peliculaDao.getMovies();
        listProducto.forEach(pelicula -> System.out.println(pelicula.getNombre()));
    }

}
