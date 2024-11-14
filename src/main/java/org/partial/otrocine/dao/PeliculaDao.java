package org.partial.otrocine.dao;

import org.partial.otrocine.bean.PeliculaBean;
import org.partial.otrocine.modelo.Pelicula;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PeliculaDao extends Conexion {
    private PreparedStatement ps;
    private ResultSet rs;
    private static final String table ="pelicula";

    public ArrayList<Pelicula> getMovies() {
        ArrayList<Pelicula> listProducto = new ArrayList<>();

        String query = "select * from "+table;
        Pelicula cli;
        try {
            ps = super.getConexion().prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                cli = new Pelicula();
                cli.setIdPelicula(rs.getInt(1));
                cli.setNombre(rs.getString(2));
                cli.setSinopsis(rs.getString(3));

                listProducto.add(cli);
            }
        } catch (SQLException ex) {
            System.out.println("ERROR LIST CLIENTES: " + ex.getMessage());
        }finally {
            super.killConexion();
        }
        System.out.println("obteniendo datos");
        return listProducto;
    }

    public boolean eliminarProducto(int pIdCliente) {
        String query = "DELETE FROM "+table+" WHERE id_pelicula=?";
        try {
            ps = super.getConexion().prepareStatement(query);
            ps.setInt(1, pIdCliente);
            ps.execute();
            System.out.println("Eliminado");
            return true;
        } catch (SQLException ex) {
            System.out.println("ERROR DELETE: " + ex.getMessage());
        }finally {
            super.killConexion();
        }
        return false;
    }

    public boolean agregarCliente(Pelicula cli) {
        boolean ingreso = false;
        String query = "insert into "+table+" (nombre,sinopsis) values(?,?)";
        try {
            ps = super.getConexion().prepareStatement(query);
            ps.setString(1, cli.getNombre());
            ps.setString(2, cli.getSinopsis());
            ps.execute();

            System.out.println("INGRESO PELICULA");
            super.getConexion().close();
            return true;

        } catch (SQLException ex) {
            System.out.println("ERROR INSER CLIENTE: " + ex.getMessage());
            ingreso = false;
        }finally {
            super.killConexion();
        }
        return ingreso;
    }


    public boolean update(Pelicula nCliente) {
        boolean actualizado = false;
        String query = "UPDATE "+table+" SET nombre = ?, sinopsis = ? WHERE id_pelicula=?";
        try {
            ps = super.getConexion().prepareStatement(query);
            ps.setString(1, nCliente.getNombre());
            ps.setString(2, nCliente.getSinopsis());

            if (ps.executeUpdate() == 1) {
                actualizado = true;
                System.out.println("ACTUALIZACIÓN cliente");
            }
        } catch (SQLException ex) {
            System.out.println("ERROR ACTUALIZACION cliente: " + ex.getMessage());
            actualizado = false;
        } finally {
            super.killConexion();
        }
        return actualizado;
    }

}
