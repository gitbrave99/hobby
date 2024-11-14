package org.partial.otrocine.bean;

import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.RequestScoped;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@ViewScoped
public class PeliculaBean  implements Serializable {
    private String nombre;
    private String mensaje;
    private String id; // Atributo ID
    private boolean mostrarDetalles = true; // Controla la visibilidad del formulario de detalles

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void saludar() {
        this.mensaje = "Hola, " + nombre + "!";
        System.out.println("Mostrando mensaje: " + mensaje);
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void toggleDetalles() {
        System.out.println("Toggling details");
        mostrarDetalles = !mostrarDetalles; // Cambia el estado de visibilidad
    }

    public boolean isMostrarDetalles() {
        return mostrarDetalles;
    }
}
