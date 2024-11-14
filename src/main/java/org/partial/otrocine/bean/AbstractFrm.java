package org.partial.otrocine.bean;

import jakarta.annotation.PostConstruct;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.event.ActionEvent;
import org.partial.otrocine.utils.ESTADO_CRUD;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.FilterMeta;
import org.primefaces.model.LazyDataModel;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class AbstractFrm<T> implements Serializable {
    //metodos abstractos
    public abstract void instanciarRegistro();
    public abstract FacesContext getFC();
    //   public abstract void btnSelecionarRegistroHandler(final Object id);
    public abstract String getIdByObject(T object);
    public abstract T getObjectById(String id);
    public abstract void selecionarFila(SelectEvent<T> event);

    //propiedades
    ESTADO_CRUD estado=ESTADO_CRUD.NINGUNO;
    T registro;
    List<T> registros;
    LazyDataModel<T> modelo;
    //botones
    public void btnCancelarHandler(ActionEvent actionEvent) {
        this.estado=ESTADO_CRUD.NINGUNO;
        this.registro=null;
    }
    public void btnNuevoHandler(ActionEvent actionEvent) {
        instanciarRegistro();
        this.estado=ESTADO_CRUD.CREAR;
    }
    //arranque

    @PostConstruct
    public void init() {
        estado=ESTADO_CRUD.NINGUNO;
    }
    //persistencia
    public void btnGuardarHandler(ActionEvent e) {
        FacesMessage mensaje=new FacesMessage();;


    }

    public void btnModificarHandler(ActionEvent ex) {
        T modificado = null;
        FacesMessage mensaje=new FacesMessage();;

        this.estado = ESTADO_CRUD.NINGUNO;
        this.registro = null;

    }

    public void btneEliminarHandler(ActionEvent ex) {
        FacesMessage mensaje=new FacesMessage();;

    }
    //modelo


    public LazyDataModel<T> getModelo() {
        return modelo;
    }

    public void setModelo(LazyDataModel<T> modelo) {
        this.modelo = modelo;
    }

    //otros


    //getters y setters

    public List<T> getRegistros() {
        return registros;
    }

    public void setRegistros(List<T> registros) {
        this.registros = registros;
    }

    public T getRegistro() {
        return registro;
    }

    public void setRegistro(T registro) {
        this.registro = registro;
    }

    public ESTADO_CRUD getEstado() {
        return estado;
    }

    public void setEstado(ESTADO_CRUD estado) {
        this.estado = estado;
    }

}
