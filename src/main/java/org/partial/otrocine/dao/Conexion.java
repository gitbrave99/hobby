package org.partial.otrocine.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    private String usuario = "postgres";
    private String clave = "1234";
    private String url = "jdbc:postgresql://localhost:5432/postgres";
    private Connection conex = null;
    private Statement stmt;
    private ResultSet rs;

    public Connection getConexion() {
        try {
            Class.forName("org.postgresql.Driver");
            this.conex = (Connection) DriverManager.getConnection(url, usuario, clave);
            System.out.println("conexion exitosa");

        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("error 2: " + ex);
        }
        return this.conex;
    }

    public void killConexion(){
        this.conex = null;
        this.stmt = null;
        this.rs = null;
    }
}
